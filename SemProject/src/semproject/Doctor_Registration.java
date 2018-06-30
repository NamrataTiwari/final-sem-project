/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semproject;

import javax.swing.JOptionPane;
import java.lang.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Namarata
 */
public class Doctor_Registration extends javax.swing.JFrame {
   Doctor doc;
     String firstName;
    String day;
     String month;
      String username;
     String lastName;
     String year;
     String dept;
      String expr;
      String qual;
      String achieve;
      String institute;
     String visitHours;
      String password;
      String gender;
      String martial;
    public Doctor_Registration() {
        initComponents();
        this.setSize(1500,750);
        
    }

    public void check()
    {
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        First_Name = new javax.swing.JLabel();
        jTFirstName = new javax.swing.JTextField();
        Last_Name = new javax.swing.JLabel();
        jTLastName = new javax.swing.JTextField();
        jBSubmitDetails = new javax.swing.JButton();
        DOB = new javax.swing.JLabel();
        Qualification = new javax.swing.JLabel();
        jComboQualification = new javax.swing.JComboBox();
        Gender = new javax.swing.JLabel();
        jRadioFemale = new javax.swing.JRadioButton();
        jRadiomale = new javax.swing.JRadioButton();
        jRadioOthers = new javax.swing.JRadioButton();
        Department = new javax.swing.JLabel();
        jComboDept = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jComboExp = new javax.swing.JComboBox();
        Qualifying_Institute = new javax.swing.JLabel();
        jTQualifyingInstitute = new javax.swing.JTextField();
        Marital_Status = new javax.swing.JLabel();
        Achievements = new javax.swing.JLabel();
        Visiting_hrs = new javax.swing.JLabel();
        jTVisitingHours = new javax.swing.JTextField();
        jRadioMarried = new javax.swing.JRadioButton();
        jRadioUnmarried = new javax.swing.JRadioButton();
        Password = new javax.swing.JLabel();
        jTPassword = new javax.swing.JTextField();
        confirm_p = new javax.swing.JLabel();
        jTConfirmPassword = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAreaAchieve = new javax.swing.JTextArea();
        jCBDay = new javax.swing.JComboBox<>();
        jCBMonth = new javax.swing.JComboBox<>();
        jCBYear = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        First_Name.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        First_Name.setText("First Name");
        getContentPane().add(First_Name);
        First_Name.setBounds(90, 170, 120, 30);

        jTFirstName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFirstNameActionPerformed(evt);
            }
        });
        getContentPane().add(jTFirstName);
        jTFirstName.setBounds(200, 178, 190, 30);

        Last_Name.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Last_Name.setText("Last Name");
        getContentPane().add(Last_Name);
        Last_Name.setBounds(510, 170, 104, 30);

        jTLastName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTLastNameActionPerformed(evt);
            }
        });
        getContentPane().add(jTLastName);
        jTLastName.setBounds(610, 180, 170, 30);

        jBSubmitDetails.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBSubmitDetails.setText("Submit Details");
        jBSubmitDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBSubmitDetailsMouseClicked(evt);
            }
        });
        jBSubmitDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSubmitDetailsActionPerformed(evt);
            }
        });
        getContentPane().add(jBSubmitDetails);
        jBSubmitDetails.setBounds(550, 620, 230, 31);

        DOB.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        DOB.setText("DOB :");
        getContentPane().add(DOB);
        DOB.setBounds(910, 160, 70, 50);

        Qualification.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Qualification.setText("Qualification");
        getContentPane().add(Qualification);
        Qualification.setBounds(90, 370, 120, 22);

        jComboQualification.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboQualification.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MBBS", "BMBS", "MBChB", "MBBCh", "MD", "BD", "BPharma", "MPharma" }));
        jComboQualification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboQualificationActionPerformed(evt);
            }
        });
        getContentPane().add(jComboQualification);
        jComboQualification.setBounds(210, 370, 130, 28);

        Gender.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Gender.setText("Gender");
        getContentPane().add(Gender);
        Gender.setBounds(90, 240, 66, 22);

        buttonGroup1.add(jRadioFemale);
        jRadioFemale.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioFemale.setText("Female");
        jRadioFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioFemaleActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioFemale);
        jRadioFemale.setBounds(220, 240, 100, 30);

        buttonGroup1.add(jRadiomale);
        jRadiomale.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadiomale.setText("Male");
        jRadiomale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadiomaleActionPerformed(evt);
            }
        });
        getContentPane().add(jRadiomale);
        jRadiomale.setBounds(220, 270, 100, 30);

        buttonGroup1.add(jRadioOthers);
        jRadioOthers.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioOthers.setText("Others");
        getContentPane().add(jRadioOthers);
        jRadioOthers.setBounds(220, 300, 100, 31);

        Department.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Department.setText("Department");
        getContentPane().add(Department);
        Department.setBounds(850, 240, 140, 30);

        jComboDept.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboDept.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Gynaecology", "Neurology", "Cardiology", "Opthamology", "Orthopedic", "Dental", "Psychiatrist", "ENT(Ear-Nose-Throat)" }));
        jComboDept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboDeptActionPerformed(evt);
            }
        });
        getContentPane().add(jComboDept);
        jComboDept.setBounds(990, 240, 170, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Experience");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(390, 370, 101, 22);

        jComboExp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboExp.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "3 to 5 Years", "6 to 10 years", "above 10", " " }));
        jComboExp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboExpActionPerformed(evt);
            }
        });
        getContentPane().add(jComboExp);
        jComboExp.setBounds(500, 370, 150, 28);

        Qualifying_Institute.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Qualifying_Institute.setText("Qualifying Institute");
        getContentPane().add(Qualifying_Institute);
        Qualifying_Institute.setBounds(760, 450, 176, 30);

        jTQualifyingInstitute.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTQualifyingInstitute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTQualifyingInstituteActionPerformed(evt);
            }
        });
        getContentPane().add(jTQualifyingInstitute);
        jTQualifyingInstitute.setBounds(940, 450, 290, 28);

        Marital_Status.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Marital_Status.setText("Marital Status");
        getContentPane().add(Marital_Status);
        Marital_Status.setBounds(500, 240, 160, 30);

        Achievements.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Achievements.setText("Achievements");
        getContentPane().add(Achievements);
        Achievements.setBounds(90, 450, 140, 22);

        Visiting_hrs.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Visiting_hrs.setText("Visiting Hours :");
        Visiting_hrs.setToolTipText("");
        getContentPane().add(Visiting_hrs);
        Visiting_hrs.setBounds(800, 530, 160, 40);

        jTVisitingHours.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTVisitingHours.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTVisitingHoursActionPerformed(evt);
            }
        });
        getContentPane().add(jTVisitingHours);
        jTVisitingHours.setBounds(940, 540, 300, 28);

        buttonGroup2.add(jRadioMarried);
        jRadioMarried.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioMarried.setText("Married");
        getContentPane().add(jRadioMarried);
        jRadioMarried.setBounds(650, 260, 110, 31);

        buttonGroup2.add(jRadioUnmarried);
        jRadioUnmarried.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioUnmarried.setText("Unmarried");
        getContentPane().add(jRadioUnmarried);
        jRadioUnmarried.setBounds(650, 290, 110, 40);

        Password.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Password.setText("Password");
        getContentPane().add(Password);
        Password.setBounds(90, 540, 104, 24);

        jTPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTPassword);
        jTPassword.setBounds(190, 540, 190, 28);

        confirm_p.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        confirm_p.setText("Confirm Password");
        getContentPane().add(confirm_p);
        confirm_p.setBounds(400, 530, 170, 40);

        jTConfirmPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTConfirmPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTConfirmPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(jTConfirmPassword);
        jTConfirmPassword.setBounds(570, 540, 210, 28);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/semproject/Webp.net-resizeimage (2).jpg"))); // NOI18N
        jLabel2.setText("jLabel1");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(330, 0, 151, 136);

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Swaasth Welcomes You !");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(490, 40, 550, 40);

        jTAreaAchieve.setColumns(20);
        jTAreaAchieve.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTAreaAchieve.setRows(5);
        jScrollPane1.setViewportView(jTAreaAchieve);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(220, 450, 470, 70);

        jCBDay.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCBDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        getContentPane().add(jCBDay);
        jCBDay.setBounds(970, 170, 50, 30);

        jCBMonth.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCBMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }));
        getContentPane().add(jCBMonth);
        jCBMonth.setBounds(1020, 170, 60, 30);

        jCBYear.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCBYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970" }));
        getContentPane().add(jCBYear);
        jCBYear.setBounds(1080, 170, 70, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/semproject/a_1420.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 1380, 760);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFirstNameActionPerformed
        // TODO add your handling code here:

        // firstname=First_namet.getText();
    }//GEN-LAST:event_jTFirstNameActionPerformed

    private void jTLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTLastNameActionPerformed
        // TODO add your handling code here:

        //lastname=Last_namet.getText();
    }//GEN-LAST:event_jTLastNameActionPerformed

    private void jBSubmitDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSubmitDetailsActionPerformed
        if(jTFirstName.getText().equals(""))
        {
             JOptionPane.showMessageDialog(this,"All the fields must be filled");
        }
        else if(jTLastName.getText().equals(""))
        {
             JOptionPane.showMessageDialog(this,"All the fields must be filled");
        }
        
        else if(jRadioFemale.isSelected()==false && jRadiomale.isSelected()==false && jRadioOthers.isSelected()==false )
        {
             JOptionPane.showMessageDialog(this,"Atleast one option must be selected");
        }
        else if(jRadioMarried.isSelected()==false && jRadioUnmarried.isSelected()==false)
        {
             JOptionPane.showMessageDialog(this,"Atleast one option must be selected");
        }
        else if(jCBDay.getSelectedIndex()==-1)
        {
             JOptionPane.showMessageDialog(this,"All the fields must be filled");
        }
        else if(jCBMonth.getSelectedIndex()==-1)
        {
             JOptionPane.showMessageDialog(this,"All the fields must be filled");
        }
        else if(jCBYear.getSelectedIndex()==-1)
        {
             JOptionPane.showMessageDialog(this,"All the fields must be filled");
        }
        else if(jComboDept.getSelectedIndex()==-1)
        {
             JOptionPane.showMessageDialog(this,"All the fields must be filled");
        }
        else if(jComboExp.getSelectedIndex()==-1)
        {
             JOptionPane.showMessageDialog(this,"All the fields must be filled");
        }
        else if(jComboQualification.getSelectedIndex()==-1)
        {
             JOptionPane.showMessageDialog(this,"All the fields must be filled");
        }
        else if(jTAreaAchieve.getText().equals(""))
        {
             JOptionPane.showMessageDialog(this,"All the fields must be filled");
        }
        
        else if(jTQualifyingInstitute.getText().equals(""))
        {
             JOptionPane.showMessageDialog(this,"All the fields must be filled");
        }
        else if(jTVisitingHours.getText().equals(""))
        {
             JOptionPane.showMessageDialog(this,"All the fields must be filled"); 
        }
        
        else if(jTPassword.getText().equals(""))
        {
             JOptionPane.showMessageDialog(this,"All the fields must be filled");            
        }
        else if(jTConfirmPassword.getText().equals(""))
        {
             JOptionPane.showMessageDialog(this,"All the fields must be filled");             
        }
        else if(!jTPassword.getText().equals(jTConfirmPassword.getText()))
        {
            JOptionPane.showMessageDialog(this,"Password and Confirm Password donot match.");
        }
        else
        {            
              
        if(jRadioFemale.isSelected()==true)
            gender = "Female";
        else if(jRadiomale.isSelected()==true)
            gender = "Male";
        else
            gender = "Other";
        if(jRadioMarried.isSelected()==true)
            martial = "Married";
        else
            martial = "Unmarried";
        
         firstName=jTFirstName.getText();
         day=(String)jCBDay.getSelectedItem();
        month=(String)jCBMonth.getSelectedItem();
        username = jTFirstName.getText() + (String)jCBDay.getSelectedItem() + (String)jCBMonth.getSelectedItem();
        lastName = jTLastName.getText();
         year = (String)jCBYear.getSelectedItem();
        dept = (String)jComboDept.getSelectedItem();
         expr = (String)jComboExp.getSelectedItem();
         qual = (String)jComboQualification.getSelectedItem();
         achieve = jTAreaAchieve.getText();
         institute = jTQualifyingInstitute.getText();
         visitHours = jTVisitingHours.getText();
        password = jTPassword.getText();
        
        doc = new Doctor(firstName,lastName,day,month,year,gender,martial,dept,qual,expr,achieve,institute,visitHours,password,username);
        Doctor.insert(doc);
        JOptionPane.showMessageDialog(null,"Successfully Registered!\n Your UserName is "+username);
        new Doctors_Login().setVisible(true); 
        this.setVisible(false);
        }
        
    }//GEN-LAST:event_jBSubmitDetailsActionPerformed

    private void jComboQualificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboQualificationActionPerformed
        // TODO add your handling code here:

        //qualifications=qualification.getSelectedItem().toString();

    }//GEN-LAST:event_jComboQualificationActionPerformed

    private void jRadioFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioFemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioFemaleActionPerformed

    private void jRadiomaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadiomaleActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jRadiomaleActionPerformed

    private void jComboDeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboDeptActionPerformed
        // TODO add your handling code here:

        //dept=department.getSelectedItem().toString();
    }//GEN-LAST:event_jComboDeptActionPerformed

    private void jComboExpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboExpActionPerformed
        // TODO add your handling code here:

        // exp=experience.getSelectedItem().toString();
    }//GEN-LAST:event_jComboExpActionPerformed

    private void jTQualifyingInstituteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTQualifyingInstituteActionPerformed
        // TODO add your handling code here:

        //institute=Qual_Inst.getText();

    }//GEN-LAST:event_jTQualifyingInstituteActionPerformed

    private void jTVisitingHoursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTVisitingHoursActionPerformed
        // TODO add your handling code here:

        //achievements=achievementst.getText();
    }//GEN-LAST:event_jTVisitingHoursActionPerformed

    private void jTConfirmPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTConfirmPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTConfirmPasswordActionPerformed

    private void jBSubmitDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSubmitDetailsMouseClicked
                
    }//GEN-LAST:event_jBSubmitDetailsMouseClicked

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
            java.util.logging.Logger.getLogger(Doctor_Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Doctor_Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Doctor_Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Doctor_Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Doctor_Registration().setVisible(true);
                
            }
        });
       
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Achievements;
    private javax.swing.JLabel DOB;
    private javax.swing.JLabel Department;
    private javax.swing.JLabel First_Name;
    private javax.swing.JLabel Gender;
    private javax.swing.JLabel Last_Name;
    private javax.swing.JLabel Marital_Status;
    private javax.swing.JLabel Password;
    private javax.swing.JLabel Qualification;
    private javax.swing.JLabel Qualifying_Institute;
    private javax.swing.JLabel Visiting_hrs;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel confirm_p;
    private javax.swing.JButton jBSubmitDetails;
    private javax.swing.JComboBox<String> jCBDay;
    private javax.swing.JComboBox<String> jCBMonth;
    private javax.swing.JComboBox<String> jCBYear;
    private javax.swing.JComboBox jComboDept;
    private javax.swing.JComboBox jComboExp;
    private javax.swing.JComboBox jComboQualification;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRadioFemale;
    private javax.swing.JRadioButton jRadioMarried;
    private javax.swing.JRadioButton jRadioOthers;
    private javax.swing.JRadioButton jRadioUnmarried;
    private javax.swing.JRadioButton jRadiomale;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTAreaAchieve;
    private javax.swing.JTextField jTConfirmPassword;
    private javax.swing.JTextField jTFirstName;
    private javax.swing.JTextField jTLastName;
    private javax.swing.JTextField jTPassword;
    private javax.swing.JTextField jTQualifyingInstitute;
    private javax.swing.JTextField jTVisitingHours;
    // End of variables declaration//GEN-END:variables
}
