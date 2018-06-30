/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semproject;
import java.sql.*;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.lang.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import static semproject.Server.doc_list;

/**
 *
 * @author Namarata
 */
public class Doctors_Login extends javax.swing.JFrame {

    Statement st;
    Connection con;
    ResultSet rs;
    String password1,username1;
   Socket socket;
    ObjectOutputStream oout;
    ObjectInputStream oin;
    DataOutputStream dout;
    DataInputStream din;
    boolean notexist;
    boolean proceed;
public Doctors_Login() {
    initComponents();
    setSize(1500,750);
    try {
        socket = new Socket("localhost",3303);
        oout = new ObjectOutputStream(socket.getOutputStream());
        oin = new ObjectInputStream(socket.getInputStream());
        dout = new DataOutputStream(socket.getOutputStream());
        din = new DataInputStream(socket.getInputStream());
    } catch (IOException ex) {
        Logger.getLogger(Doctors_Login.class.getName()).log(Level.SEVERE, null, ex);
    }
}  

public boolean getData(String username,char[] pass)
{
    boolean validuser = false;
    proceed = true;
    if(username.equals("") && pass.length !=0)
    {
        JOptionPane.showMessageDialog(this,"Enter UserName");
        proceed = false;
    }
    else if(username.equals("")==false && pass.length==0)
    {
        JOptionPane.showMessageDialog(this,"Enter Password");
        proceed = false;
    }
    else if(username.equals("") && pass.length==0)
    {
        JOptionPane.showMessageDialog(this,"Enter UserName and Password");
        proceed = false;
    }
    else
    {
        String password = new String(pass);
        try {
            dout.writeUTF(username);
            dout.flush();
            dout.writeUTF(password);
            dout.flush();
            validuser = din.readBoolean();
            notexist = din.readBoolean();
        } catch (IOException ex) {
            Logger.getLogger(Doctors_Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        return(validuser);
    
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTUserName = new javax.swing.JTextField();
        jBLogin = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jBSignUp = new javax.swing.JButton();
        jPassword = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/semproject/Webp.net-resizeimage (2).jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(330, 0, 151, 136);

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Swaasth Welcomes You !");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(490, 40, 550, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Username");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(380, 210, 150, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Password");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(380, 260, 150, 30);

        jTUserName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTUserName);
        jTUserName.setBounds(570, 210, 160, 30);

        jBLogin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBLogin.setText("Login");
        jBLogin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBLoginMouseClicked(evt);
            }
        });
        getContentPane().add(jBLogin);
        jBLogin.setBounds(510, 330, 160, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("------OR-------");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(540, 370, 130, 20);

        jBSignUp.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBSignUp.setText("Sign Up");
        jBSignUp.setActionCommand("");
        jBSignUp.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBSignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBSignUpMouseClicked(evt);
            }
        });
        getContentPane().add(jBSignUp);
        jBSignUp.setBounds(510, 400, 160, 30);

        jPassword.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPassword.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        jPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(jPassword);
        jPassword.setBounds(570, 260, 160, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/semproject/a_1420.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 1370, 680);
        jLabel6.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordActionPerformed

    private void jBLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBLoginMouseClicked

    String username = jTUserName.getText();
    char[] pass = jPassword.getPassword();
    boolean successful,notexist=true;

        successful = getData(username,pass);
        if(successful && notexist)
        {
            JOptionPane.showMessageDialog(this, "Login is successful.\nClick OK to proceed.");
            this.setVisible(false);
            new ExistingDoctor(username).setVisible(true);           
        }
        else if(!successful && proceed)
        {
            JOptionPane.showMessageDialog(this, "Either Username or password or both not correct.\nTry again");
            this.setVisible(false);
            new Doctors_Login().setVisible(true);
        }
        else if(!notexist)
        {
            JOptionPane.showMessageDialog(this, username+" is already logged in.");
            
        }
    }//GEN-LAST:event_jBLoginMouseClicked

    private void jBSignUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSignUpMouseClicked

        new Doctor_Registration().setVisible(true); 
        this.setVisible(false);
    }//GEN-LAST:event_jBSignUpMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Doctors_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Doctors_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Doctors_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Doctors_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Doctors_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBLogin;
    private javax.swing.JButton jBSignUp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JTextField jTUserName;
    // End of variables declaration//GEN-END:variables
}
