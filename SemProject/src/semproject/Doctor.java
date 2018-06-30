
package semproject;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static semproject.Patient.conn;

public class Doctor {
    String firstName;
    String lastName;
    String day;
    String month;
    String year;
    String gender;
    String martial;
    String dept;
    String qual;
    String expr;
    String achieve;
    String institute;
    String visitHours;
    String password;
    String username;
    static Connection conn;
    static Statement stmt;
    
    
    public Doctor(String firstName,String lastName,String day,String month,String year,
            String gender,String martial,String dept,String qual,String expr,String achieve,
            String institute,String visitHours,String password,String username)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.day = day;
        this.month = month;
        this.year = year;
        this.gender = gender;
        this.martial = martial;
        this.dept = dept;
        this.qual = qual;
        this.expr = expr;
        this.institute = institute;
        this.password = password;
        this.username = username;
        this.achieve = achieve;
        this.visitHours = visitHours;
    }
    
    public static Doctor fromResults(ResultSet doctor)throws SQLException
    {
        return new Doctor(doctor.getString("FName"),
            doctor.getString("LName"),
            doctor.getString("Day"),
            doctor.getString("Month"),
            doctor.getString("Year"),
            doctor.getString("Gender"),
            doctor.getString("MaritialStatus"),
            doctor.getString("Department"),
            doctor.getString("Qualifications"),
            doctor.getString("Experience"),
            doctor.getString("Achievements"),
            doctor.getString("Institute"),
            doctor.getString("VisitHours"),
            doctor.getString("Password"),
            doctor.getString("UserName"));
    }
    
    public static void insert(Doctor doc)
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital?zeroDateTimeBehavior=convertToNull","root","");
            stmt = conn.createStatement();
            String insertQuery = "Insert into Doctor values('"+doc.firstName+"','"+doc.lastName+"','"+doc.day+"',"
                    + "'"+doc.month+"','"+doc.year+"','"+doc.gender+"','"+doc.martial+"','"+doc.dept+"',"
                    + "'"+doc.qual+"','"+doc.expr+"','"+doc.achieve+"','"+doc.institute+"','"+doc.visitHours+"',"
                    + "'"+doc.password+"','"+doc.username+"');";
            stmt.executeUpdate(insertQuery);
            conn.close();
            stmt.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Doctor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Doctor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static Doctor select(String username)
    {
        Doctor doc = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital?zeroDateTimeBehavior=convertToNull","root","");
            stmt = conn.createStatement();
            String selectQuery = "Select * from Doctor where UserName = '"+username+"';";
            ResultSet rs = stmt.executeQuery(selectQuery);
            rs.next();
            doc = (Doctor)fromResults(rs);
            rs.close();
            stmt.close();
            conn.close();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Doctor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Doctor.class.getName()).log(Level.SEVERE, null, ex);
        }
         return(doc);
    }
    
}
