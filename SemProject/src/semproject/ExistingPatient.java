/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semproject;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Namarata
 */
public class ExistingPatient extends javax.swing.JFrame {
    
     String Symptoms,Medication1,Medication2,Medication3,Dosage1,Dosage2,Dosage3,Test1,Test2,Test3,MedicalHistory;
     String username,P_ID;
    /**
     * Creates new form ExistingPatient
     */
    public ExistingPatient() {
        initComponents();
        setSize(1500,750);

    }
 public ExistingPatient(String username,String P_ID) {
        initComponents();
        setSize(1500,750);
        this.username = username;
        this.P_ID = P_ID;
        displayData(this.P_ID);
    }
 
 public void displayData(String P_ID)
 {
     Patient pat = (Patient)Patient.select_patient(P_ID);
     jLP_Id.setText(pat.P_ID);
     jLNameOFpatient.setText(pat.FName+pat.LName);
     jLSex.setText(pat.Gender);
     jLAge.setText(pat.Age+" years");
     jLWeight.setText(pat.Weight+" kg");
     jTSymptoms.setText(pat.Symptoms);
     jTMed1.setText(pat.Medication1);
     jTMed2.setText(pat.Medication2);
     jTMed3.setText(pat.Medication3);
     jTtest1.setText(pat.Test1);
     jTtest3.setText(pat.Test2);
     jTtest5.setText(pat.Test3);
     jTDosage1.setText(pat.Dosage1);
     jTDosage2.setText(pat.Dosage2);
     jTDosage3.setText(pat.Dosage3);
     medhis.setText(pat.MedicalHistory);
     
 }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLNameOFpatient = new javax.swing.JLabel();
        jLSex = new javax.swing.JLabel();
        jLAge = new javax.swing.JLabel();
        jLP_Id = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTSymptoms = new javax.swing.JTextArea();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jTMed1 = new javax.swing.JTextField();
        jTDosage2 = new javax.swing.JTextField();
        jTDosage1 = new javax.swing.JTextField();
        jTDosage3 = new javax.swing.JTextField();
        jTMed2 = new javax.swing.JTextField();
        jTMed3 = new javax.swing.JTextField();
        jLWeight = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTtest1 = new javax.swing.JTextField();
        jTtest3 = new javax.swing.JTextField();
        jTtest5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        savedata = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        medhis = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/semproject/Webp.net-resizeimage (2).jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(290, 0, 150, 150);

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Swaasth Welcomes You !");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(450, 40, 550, 40);

        jLNameOFpatient.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLNameOFpatient.setText("Name of Patient");
        jLNameOFpatient.setOpaque(true);
        getContentPane().add(jLNameOFpatient);
        jLNameOFpatient.setBounds(450, 160, 150, 30);

        jLSex.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLSex.setText("Sex");
        jLSex.setOpaque(true);
        getContentPane().add(jLSex);
        jLSex.setBounds(620, 160, 80, 30);

        jLAge.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLAge.setText("Age ");
        jLAge.setOpaque(true);
        getContentPane().add(jLAge);
        jLAge.setBounds(720, 160, 90, 30);

        jLP_Id.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLP_Id.setText("P_ID :");
        jLP_Id.setOpaque(true);
        getContentPane().add(jLP_Id);
        jLP_Id.setBounds(290, 160, 140, 30);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setText("Symptoms");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(290, 200, 160, 35);

        jTSymptoms.setColumns(20);
        jTSymptoms.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jTSymptoms.setRows(5);
        jScrollPane1.setViewportView(jTSymptoms);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(290, 250, 230, 117);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setText("Prescription");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(290, 380, 166, 35);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Medications");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(290, 417, 330, 30);

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Dosage");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(680, 417, 320, 30);

        jTMed1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jTMed1);
        jTMed1.setBounds(290, 450, 330, 23);

        jTDosage2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTDosage2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTDosage2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTDosage2);
        jTDosage2.setBounds(680, 480, 320, 23);

        jTDosage1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jTDosage1);
        jTDosage1.setBounds(680, 450, 320, 23);

        jTDosage3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jTDosage3);
        jTDosage3.setBounds(680, 510, 320, 23);

        jTMed2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jTMed2);
        jTMed2.setBounds(290, 480, 330, 23);

        jTMed3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jTMed3);
        jTMed3.setBounds(290, 510, 330, 23);

        jLWeight.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLWeight.setText("Weight");
        jLWeight.setOpaque(true);
        getContentPane().add(jLWeight);
        jLWeight.setBounds(830, 160, 90, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Tests Suggested :");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(290, 560, 130, 30);

        jTtest1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTtest1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTtest1);
        jTtest1.setBounds(430, 560, 140, 30);
        getContentPane().add(jTtest3);
        jTtest3.setBounds(600, 560, 150, 30);
        getContentPane().add(jTtest5);
        jTtest5.setBounds(790, 560, 140, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Doctor's Profile");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(590, 650, 150, 30);

        savedata.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        savedata.setText("Save Data");
        savedata.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        savedata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savedataActionPerformed(evt);
            }
        });
        getContentPane().add(savedata);
        savedata.setBounds(770, 650, 120, 30);

        medhis.setColumns(20);
        medhis.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        medhis.setRows(5);
        jScrollPane2.setViewportView(medhis);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(660, 250, 210, 120);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Medical History");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(590, 200, 138, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/semproject/a_1420.jpg"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-20, 0, 1420, 710);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTDosage2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTDosage2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTDosage2ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
       // new ExistingDoctor().setVisible(true);
        //this.setVisible(false);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.setVisible(false);
       new ExistingDoctor(username,P_ID).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void savedataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savedataActionPerformed
          Symptoms=jTSymptoms.getText();
        Medication1=jTMed1.getText();
        Medication2=jTMed2.getText();
       Medication3=jTMed3.getText();
         Dosage1=jTDosage1.getText();
         Dosage2=jTDosage2.getText();
        Dosage3=jTDosage3.getText();
         Test1=jTtest1.getText();
        Test2=jTtest3.getText();
       Test3=jTtest5.getText();
       MedicalHistory = medhis.getText();
       JOptionPane.showMessageDialog(null, P_ID);
               
               Patient.insert_exist(P_ID,MedicalHistory,Symptoms,Medication1,Medication2,Medication3,
                        Dosage1,Dosage2,Dosage3,Test1,Test2,Test3);
    }//GEN-LAST:event_savedataActionPerformed

    private void jTtest1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTtest1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTtest1ActionPerformed

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
            java.util.logging.Logger.getLogger(ExistingPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExistingPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExistingPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExistingPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExistingPatient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLAge;
    private javax.swing.JLabel jLNameOFpatient;
    private javax.swing.JLabel jLP_Id;
    private javax.swing.JLabel jLSex;
    private javax.swing.JLabel jLWeight;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTDosage1;
    private javax.swing.JTextField jTDosage2;
    private javax.swing.JTextField jTDosage3;
    private javax.swing.JTextField jTMed1;
    private javax.swing.JTextField jTMed2;
    private javax.swing.JTextField jTMed3;
    private javax.swing.JTextArea jTSymptoms;
    private javax.swing.JTextField jTtest1;
    private javax.swing.JTextField jTtest3;
    private javax.swing.JTextField jTtest5;
    private javax.swing.JTextArea medhis;
    private javax.swing.JButton savedata;
    // End of variables declaration//GEN-END:variables
}
