/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semproject;

/**
 *
 * @author Namarata
 */

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.function.Supplier;
import static semproject.Doctor.conn;
/**
*
* @author user
*/
public class Server extends Thread{
    static ServerSocket server;
    Socket socket;
    ResultSet rs;
    Connection conn;
    Statement stmt;
    ObjectOutputStream oout;
    ObjectInputStream oin;
    DataOutputStream dout;
    DataInputStream din;
    static  String[] doc_list;
    static String[] pat_list;
    static int counter = 0;
public Server(Socket soc)
{
    socket = soc;
    try {
        oout = new ObjectOutputStream(socket.getOutputStream());
        oin = new ObjectInputStream(socket.getInputStream());
        dout = new DataOutputStream(socket.getOutputStream());
        din = new DataInputStream(socket.getInputStream());
        doc_list = new String[10];
        pat_list = new String[10];
        /*for(int i = 0;i<10;i++)
        {
            doc_list[i]= new String();
            pat_list[i] = new String();
        }*/
                
    } catch (IOException ex) {
        Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
    }

}

@Override
public void run()
{
try {
    Class.forName("com.mysql.jdbc.Driver");
    conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital?zeroDateTimeBehavior=convertToNull","root","");
    stmt = conn.createStatement();
    String username = null,password = null,user,pass;
    boolean validuser = false;
    try {
        username = din.readUTF();
        password = din.readUTF();
    } catch (IOException ex) {
        Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    String selectQuery = "Select UserName,Password from Doctor;";
    int index;
    boolean notexist = true;
    ResultSet rs = stmt.executeQuery(selectQuery);
    while(rs.next())
    {
        user = rs.getString("UserName");
        pass = rs.getString("Password");
    if(user.equals(username) && password.equals(pass))
    {

        validuser = true;
        break;
    }
    }
        /*for(index = 0;index < counter;index++)
        {
            if(username.equals(doc_list[index]))
            {
                notexist = false;
                JOptionPane.showMessageDialog(null, username+" is already logged in.");
                break;
            }
            else
            {
                notexist = true;     
                doc_list[counter++] = username;
                JOptionPane.showMessageDialog(null, username+" added in list.");
                break;
            }
        }*/
    dout.writeBoolean(validuser); 
    dout.flush();
    
    dout.writeBoolean(notexist);
    dout.flush();
    rs.close();
    conn.close();
} catch (ClassNotFoundException ex) {
Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
}       catch (SQLException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    
}

public static void main(String args[])
{
try {
    server = new ServerSocket(3303);
    JOptionPane.showMessageDialog(null, "server is running");
} catch (IOException ex) {
Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
}

while(true)
{
try {
Socket soc = server.accept();
new Server(soc).start();
} catch (IOException ex) {
Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
}
}
}
}