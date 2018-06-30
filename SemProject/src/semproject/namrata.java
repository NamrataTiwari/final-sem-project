/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Namarata
 */

    
import java.sql.*;
import java.sql.Connection;
import javax.swing.JOptionPane;
//import static priya.con;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Namarata
 */
 class priya1 {
    static Connection con;
   static Statement st;
    static ResultSet rs;
    static String r;
    priya1() throws ClassNotFoundException, SQLException{}
        
    static void fun() throws SQLException, ClassNotFoundException{
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/priya?zeroDateTimeBehavior=convertToNul","root",null);
         JOptionPane.showMessageDialog(null,"connection established");
    
        st=con.createStatement();
        String query="select * from namo;";
        rs=st.executeQuery(query);
        while(rs.next()){
          r= rs.getString("name");
           JOptionPane.showMessageDialog(null,r);
        }
        
    }
  
    
}
public class namrata{
    public static void main(String[] args) throws ClassNotFoundException, SQLException  {
        priya1.fun();
        
    }



}


