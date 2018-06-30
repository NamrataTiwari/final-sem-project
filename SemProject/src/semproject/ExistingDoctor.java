/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semproject;

import javax.swing.JOptionPane;

/**
 *
 * @author Namarata
 */
public class ExistingDoctor extends javax.swing.JFrame {
    
   Doctor doc;
   String username;
   String P_ID;
    public ExistingDoctor(String username) {
        initComponents();
        jTpatientID.setEditable(false);
        setSize(1500,750);
        this.username = username;
        
        this.P_ID = "Enter Patient ID";
        displayData(this.username);
    }
    
    public ExistingDoctor(String username,String P_ID) {
        initComponents();
        jTpatientID.setEditable(false);
        setSize(1500,750);
        this.username = username;
        this.P_ID = P_ID;
        displayData(this.username);
    }
    public ExistingDoctor() {
        initComponents();
        jTpatientID.setEditable(false);
        setSize(1500,750);
        
    }
    
    public void displayData(String username)
    {
        Doctor doctor = Doctor.select(username);
        jLNameDoc.setText(doctor.firstName +" "+ doctor.lastName);
        jLDepartment.setText(doctor.dept);
        jLExperience.setText(doctor.expr);
        jLQualifications.setText(doctor.qual);
        jLTimeOFvisit.setText(doctor.visitHours);
        jLUserName.setText(doctor.username);
        jTpatientID.setText(P_ID);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLNameDoc = new javax.swing.JLabel();
        jLDepartment = new javax.swing.JLabel();
        jLExperience = new javax.swing.JLabel();
        jLQualifications = new javax.swing.JLabel();
        jTpatientID = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLTimeOFvisit = new javax.swing.JLabel();
        jBSearch = new javax.swing.JButton();
        jBRegNewPatient = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLUserName = new javax.swing.JLabel();
        jBLogout = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

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

        jLNameDoc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLNameDoc.setText("Name of Doc");
        jLNameDoc.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLNameDoc.setOpaque(true);
        getContentPane().add(jLNameDoc);
        jLNameDoc.setBounds(480, 320, 210, 40);

        jLDepartment.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLDepartment.setText("Department");
        jLDepartment.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLDepartment.setOpaque(true);
        getContentPane().add(jLDepartment);
        jLDepartment.setBounds(480, 380, 210, 40);

        jLExperience.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLExperience.setText("Experience");
        jLExperience.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLExperience.setOpaque(true);
        getContentPane().add(jLExperience);
        jLExperience.setBounds(480, 450, 210, 40);

        jLQualifications.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLQualifications.setText("Qualifications");
        jLQualifications.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLQualifications.setOpaque(true);
        getContentPane().add(jLQualifications);
        jLQualifications.setBounds(480, 510, 210, 40);

        jTpatientID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTpatientID.setText("(Enter Patient's ID)");
        jTpatientID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTpatientIDMouseClicked(evt);
            }
        });
        jTpatientID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTpatientIDActionPerformed(evt);
            }
        });
        getContentPane().add(jTpatientID);
        jTpatientID.setBounds(550, 150, 190, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Visting Hours :");
        jLabel8.setOpaque(true);
        getContentPane().add(jLabel8);
        jLabel8.setBounds(330, 570, 130, 40);

        jLTimeOFvisit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLTimeOFvisit.setText("Time of visit");
        jLTimeOFvisit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLTimeOFvisit.setOpaque(true);
        getContentPane().add(jLTimeOFvisit);
        jLTimeOFvisit.setBounds(480, 570, 290, 40);

        jBSearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBSearch.setText("Search");
        jBSearch.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSearchActionPerformed(evt);
            }
        });
        getContentPane().add(jBSearch);
        jBSearch.setBounds(750, 150, 70, 30);

        jBRegNewPatient.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBRegNewPatient.setText("Register New Patient");
        jBRegNewPatient.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBRegNewPatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBRegNewPatientMouseClicked(evt);
            }
        });
        jBRegNewPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRegNewPatientActionPerformed(evt);
            }
        });
        getContentPane().add(jBRegNewPatient);
        jBRegNewPatient.setBounds(600, 230, 190, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("-----OR-----");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(650, 190, 70, 30);

        jLUserName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLUserName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLUserName.setText("Username");
        jLUserName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLUserName.setOpaque(true);
        getContentPane().add(jLUserName);
        jLUserName.setBounds(900, 150, 130, 30);

        jBLogout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBLogout.setText("Logout");
        jBLogout.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLogoutActionPerformed(evt);
            }
        });
        getContentPane().add(jBLogout);
        jBLogout.setBounds(500, 640, 100, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Department");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(330, 380, 130, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Name");
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(330, 320, 130, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Experience");
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(330, 450, 130, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Qualifications");
        jLabel7.setOpaque(true);
        getContentPane().add(jLabel7);
        jLabel7.setBounds(330, 510, 130, 40);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(330, 510, 280, 70);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/semproject/a_1420.jpg"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 0, 1390, 710);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTpatientIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTpatientIDActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTpatientIDActionPerformed

    private void jBSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSearchActionPerformed
String ptid = jTpatientID.getText();
        if(ptid.equals(""))
        {
            JOptionPane.showMessageDialog(this,"Enter Patient's ID");
        }
        else
        {
            boolean pid = Patient.select_pid(ptid);
            if(pid)
            {
                 this.setVisible(false);
                 new ExistingPatient(username,ptid).setVisible(true);
           
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Invalid Patient ID");
            }
        }
        
    }//GEN-LAST:event_jBSearchActionPerformed

    private void jTpatientIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTpatientIDMouseClicked

        jTpatientID.setText("");
        jTpatientID.setEditable(true);
    }//GEN-LAST:event_jTpatientIDMouseClicked

    private void jBRegNewPatientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBRegNewPatientMouseClicked

        new PatientRegistration(username).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jBRegNewPatientMouseClicked

    private void jBLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLogoutActionPerformed
       this.setVisible(false);
       new Doctors_Login().setVisible(true);
    }//GEN-LAST:event_jBLogoutActionPerformed

    private void jBRegNewPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRegNewPatientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBRegNewPatientActionPerformed

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
            java.util.logging.Logger.getLogger(ExistingDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExistingDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExistingDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExistingDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExistingDoctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBLogout;
    private javax.swing.JButton jBRegNewPatient;
    private javax.swing.JButton jBSearch;
    private javax.swing.JLabel jLDepartment;
    private javax.swing.JLabel jLExperience;
    private javax.swing.JLabel jLNameDoc;
    private javax.swing.JLabel jLQualifications;
    private javax.swing.JLabel jLTimeOFvisit;
    private javax.swing.JLabel jLUserName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTpatientID;
    // End of variables declaration//GEN-END:variables
}
