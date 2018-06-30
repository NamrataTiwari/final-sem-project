/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semproject;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class Patient {
    
    String P_ID,FName,LName,Day,Month,Year,Age,Gender,MaritialStatus,Weight,MedicalHistory
            ,Symptoms,Medication1,Medication2,Medication3,Dosage1,Dosage2,Dosage3,Test1,Test2,Test3;
    static Statement stmt;
    ResultSet rs;
    static Connection conn;
    
    public static Patient fromResults(ResultSet patient)throws SQLException {
        return new Patient(patient.getString("P_ID"),
                           patient.getString("FName"),
                           patient.getString("LName"),
                           patient.getString("Day"),
                           patient.getString("Month"),
                           patient.getString("Year"),
                           patient.getString("Age"),
                           patient.getString("Gender"),
                           patient.getString("MaritialStatus"),
                           patient.getString("Weight"),
                           patient.getString("MedicalHistory"),
                           patient.getString("Symptoms"),
                           patient.getString("Medication1"),
                           patient.getString("Medication2"),
                           patient.getString("Medication3"),
                           patient.getString("Dosage1"),
                           patient.getString("Dosage2"),
                           patient.getString("Dosage3"),
                           patient.getString("Test1"),
                           patient.getString("Test2"),
                          patient.getString("Test3")); 
    }
    public Patient() 
    {
        
    }
    public Patient(String P_ID,String FName,String LName,String Day,String Month,String Year,
            String Age,String Gender,String MaritialStatus,String Weight,String MedicalHistory,
            String Symptoms,String Medication1,String Medication2,String Medication3,
            String Dosage1,String Dosage2,String Dosage3,String Test1,String Test2,String Test3)
    {
        this.P_ID=P_ID;
        this.FName=FName;
        this.LName=LName;
        this.Day=Day;
        this.Month=Month;
        this.Year=Year;
        this.Age=Age;
        this.Gender=Gender;
        this.MaritialStatus=MaritialStatus;
        this.Weight=Weight;
        this.MedicalHistory=MedicalHistory;
         this.Symptoms=Symptoms;
        this.Medication1=Medication1;
        this.Medication2=Medication2;
        this.Medication3=Medication3;
        this.Dosage1=Dosage1;
        this.Dosage2=Dosage2;
        this.Dosage3=Dosage3;
        this.Test1=Test1;
        this.Test2=Test2;
        this.Test3=Test3;
    }
    
    public Patient(String P_ID,String FName,String LName,String Day,String Month,String Year,
            String Age,String Gender,String MaritialStatus,String Weight,String MedicalHistory)
    {
        this.P_ID=P_ID;
        this.FName=FName;
        this.LName=LName;
        this.Day=Day;
        this.Month=Month;
        this.Year=Year;
        this.Age=Age;
        this.Gender=Gender;
        this.MaritialStatus=MaritialStatus;
        this.Weight=Weight;
        this.MedicalHistory=MedicalHistory;
         this.Symptoms="";
        this.Medication1="";
        this.Medication2="";
        this.Medication3="";
        this.Dosage1="";
        this.Dosage2="";
        this.Dosage3="";
        this.Test1="";
        this.Test2="";
        this.Test3="";
    }
    
    public static void insert_reg(Patient p)
{
    try {
        Class.forName("com.mysql.jdbc.Driver");
        conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital?zeroDateTimeBehavior=convertToNull","root","");
        stmt = conn.createStatement();
        String insertQuery = "Insert into patient values('"+p.P_ID+"','"+p.FName+"',"
                + "'"+p.LName+"','"+p.Day+"','"+p.Month+"', '"+p.Year+"','"+p.Age+"','"+p.Gender+"',"
                + "'"+p.MaritialStatus+"','"+p.Weight+"','"+p.MedicalHistory+"','"+p.Symptoms+"','"+p.Medication1+"',"
                + "'"+p.Medication2+"','"+p.Medication3+"','"+p.Dosage1+"', '"+p.Dosage2+"','"+p.Dosage3+"','"+p.Test1+"',"
                + "'"+p.Test2+"','"+p.Test3+"');";
        stmt.executeUpdate(insertQuery);
        
        conn.close();
        stmt.close();
} catch (ClassNotFoundException | SQLException ex) {
Logger.getLogger(Doctor.class.getName()).log(Level.SEVERE, null, ex);
}
}
    
   public static void insert_exist(String pid,String MedicalHistory,String Symptoms,String Medication1,String Medication2,String Medication3,
                        String Dosage1,String Dosage2,String Dosage3,String Test1,String Test2,String Test3)
{
    try {
        Class.forName("com.mysql.jdbc.Driver");
        conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital?zeroDateTimeBehavior=convertToNull","root","");
        stmt = conn.createStatement();
        String updateQuery1 = "Update patient set MedicalHistory = '"+MedicalHistory+"', Symptoms = '"+Symptoms+"', "
                + "Medication1 = '"+Medication1+"', Medication2 = '"+Medication2+"', Medication3 = '"+Medication3+"' where P_ID LIKE '"+pid+"';";  
        String updateQuery2 = "Update patient set Dosage1 = '"+Dosage1+"',Dosage2='"+Dosage1+"',Dosage3='"+Dosage3+"',"
                + " Test1='"+Test1+"', Test2='"+Test2+"', Test3='"+Test3+"' where P_ID like '"+pid+"';";
       /*String insertQuery = "Update patients set MedicalHistory = '"+MedicalHistory+"',Symptoms = '"+Symptoms+"',"
                        + "Medication1 = '"+Medication1+"',Medication2 = '"+Medication2+"',Medication3 = '"+Medication3+"',"
                        + "Dosage1 = '"+Dosage1+",Dosage2 = '"+Dosage2+"',Dosage3 = '"+Dosage3+"',Test 1 = '"+Test1+"',"
                        + "Test2 = '"+Test2+"',Test3 = '"+Test3+"'  where P_ID like '"+pid+"' ;";
*/
                stmt.executeUpdate(updateQuery1);
                stmt.executeUpdate(updateQuery2);
                
            stmt.close();
                conn.close();
                   

} catch (ClassNotFoundException | SQLException ex) {
Logger.getLogger(Doctor.class.getName()).log(Level.SEVERE, null, ex);
}
}
    
    public static boolean select_pid(String P_ID)
{
boolean pid=false;
try {
Class.forName("com.mysql.jdbc.Driver");

conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital?zeroDateTimeBehavior=convertToNull","root","");
stmt = conn.createStatement();
String selectQuery = "Select * from patient where P_ID like '"+P_ID+"';";
ResultSet rs = stmt.executeQuery(selectQuery);
while(rs.next())
{
if(P_ID.equals(rs.getString("P_ID")))
{
    pid = true;
}
else
{
    pid = false;
}
}
rs.close();
conn.close();
}catch (ClassNotFoundException ex) {
            Logger.getLogger(Patient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Patient.class.getName()).log(Level.SEVERE, null, ex);
        }
return pid;
}

    public static Patient select_patient(String pid)
    {
        Patient pat = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital?zeroDateTimeBehavior=convertToNull","root","");
            stmt = conn.createStatement();
            String selectQuery = "Select * from patient where P_ID like '"+pid+"';";
            try (ResultSet rs = stmt.executeQuery(selectQuery)) {
                while(rs.next())
                {
                    pat = (Patient)fromResults(rs);
                }
            }
            stmt.close();
            conn.close();
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Doctor.class.getName()).log(Level.SEVERE, null, ex);
        }
         return(pat);
    } 

}
