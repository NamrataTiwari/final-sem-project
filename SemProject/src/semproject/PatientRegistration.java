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

public class PatientRegistration extends javax.swing.JFrame {
String username;
    /**
     * Creates new form PatientRegistration
     */
    public PatientRegistration(String username) {
        initComponents();setSize(1500,750); 
        if(jCBOthers.isSelected()==false)
        {    jTOthers.setText("");
             jTOthers.setVisible(false);
             jTOthers.setEnabled(false);
             
        }
        this.username = username;
    }
        public PatientRegistration() {
        initComponents();setSize(1500,750); 
        if(jCBOthers.isSelected()==false)
        {    jTOthers.setText("");
             jTOthers.setVisible(false);
             jTOthers.setEnabled(false);
             
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        First_Name = new javax.swing.JLabel();
        jTFirstName = new javax.swing.JTextField();
        jTLastName = new javax.swing.JTextField();
        Last_Name = new javax.swing.JLabel();
        DOB = new javax.swing.JLabel();
        Gender = new javax.swing.JLabel();
        jRadioFemale = new javax.swing.JRadioButton();
        jRadioMale = new javax.swing.JRadioButton();
        jRadioOthers = new javax.swing.JRadioButton();
        Marital_Status = new javax.swing.JLabel();
        jRadioMarried = new javax.swing.JRadioButton();
        jRadioUnmarried = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jTWeight = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jCBAllergy = new javax.swing.JCheckBox();
        jCBArthiritis = new javax.swing.JCheckBox();
        jCBAsthama = new javax.swing.JCheckBox();
        jCBBloodClot = new javax.swing.JCheckBox();
        jCBHepatitis = new javax.swing.JCheckBox();
        jCBHypertension = new javax.swing.JCheckBox();
        jCBLiverInfection = new javax.swing.JCheckBox();
        jCBSeizureDisorder = new javax.swing.JCheckBox();
        jCBTemporaryBlindness = new javax.swing.JCheckBox();
        jCBOthers = new javax.swing.JCheckBox();
        jCBLukemia = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTOthers = new javax.swing.JTextArea();
        jBSubmitDetails = new javax.swing.JButton();
        jCBDay = new javax.swing.JComboBox<>();
        jCBMonth = new javax.swing.JComboBox<>();
        jCBYear = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/semproject/Webp.net-resizeimage (2).jpg"))); // NOI18N
        jLabel2.setText("jLabel1");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(330, 0, 151, 136);

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Swaasth Welcomes You !");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(490, 40, 550, 40);

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
        jTFirstName.setBounds(200, 168, 170, 40);

        jTLastName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTLastNameActionPerformed(evt);
            }
        });
        getContentPane().add(jTLastName);
        jTLastName.setBounds(530, 170, 150, 40);

        Last_Name.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Last_Name.setText("Last Name");
        getContentPane().add(Last_Name);
        Last_Name.setBounds(420, 170, 104, 40);

        DOB.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        DOB.setText("DOB :");
        getContentPane().add(DOB);
        DOB.setBounds(730, 170, 70, 40);

        Gender.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Gender.setText("Gender");
        getContentPane().add(Gender);
        Gender.setBounds(90, 240, 66, 22);

        jRadioFemale.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioFemale.setText("Female");
        jRadioFemale.setOpaque(false);
        jRadioFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioFemaleActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioFemale);
        jRadioFemale.setBounds(170, 260, 100, 30);

        jRadioMale.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioMale.setText("Male");
        jRadioMale.setOpaque(false);
        jRadioMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioMaleActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioMale);
        jRadioMale.setBounds(170, 290, 100, 30);

        jRadioOthers.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioOthers.setText("Others");
        jRadioOthers.setOpaque(false);
        getContentPane().add(jRadioOthers);
        jRadioOthers.setBounds(170, 320, 100, 31);

        Marital_Status.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Marital_Status.setText("Marital Status");
        getContentPane().add(Marital_Status);
        Marital_Status.setBounds(410, 230, 160, 30);

        jRadioMarried.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioMarried.setText("Married");
        jRadioMarried.setOpaque(false);
        getContentPane().add(jRadioMarried);
        jRadioMarried.setBounds(470, 260, 110, 31);

        jRadioUnmarried.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioUnmarried.setText("Unmarried");
        jRadioUnmarried.setOpaque(false);
        getContentPane().add(jRadioUnmarried);
        jRadioUnmarried.setBounds(470, 290, 110, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Weight(Kg):");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(680, 220, 120, 40);

        jTWeight.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTWeight);
        jTWeight.setBounds(810, 220, 160, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Patient's Medical History");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(90, 380, 260, 30);

        jCBAllergy.setBackground(new java.awt.Color(153, 153, 153));
        jCBAllergy.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCBAllergy.setText("Allergy");
        getContentPane().add(jCBAllergy);
        jCBAllergy.setBounds(180, 420, 230, 31);

        jCBArthiritis.setBackground(new java.awt.Color(153, 153, 153));
        jCBArthiritis.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCBArthiritis.setText("Arthiritis");
        getContentPane().add(jCBArthiritis);
        jCBArthiritis.setBounds(180, 450, 230, 31);

        jCBAsthama.setBackground(new java.awt.Color(153, 153, 153));
        jCBAsthama.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCBAsthama.setText("Asthama");
        getContentPane().add(jCBAsthama);
        jCBAsthama.setBounds(180, 480, 230, 31);

        jCBBloodClot.setBackground(new java.awt.Color(153, 153, 153));
        jCBBloodClot.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCBBloodClot.setText("Blood Clot");
        getContentPane().add(jCBBloodClot);
        jCBBloodClot.setBounds(180, 510, 230, 31);

        jCBHepatitis.setBackground(new java.awt.Color(153, 153, 153));
        jCBHepatitis.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCBHepatitis.setText("Hepatitis");
        getContentPane().add(jCBHepatitis);
        jCBHepatitis.setBounds(180, 540, 230, 31);

        jCBHypertension.setBackground(new java.awt.Color(153, 153, 153));
        jCBHypertension.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCBHypertension.setText("Hypertension");
        getContentPane().add(jCBHypertension);
        jCBHypertension.setBounds(410, 420, 270, 31);

        jCBLiverInfection.setBackground(new java.awt.Color(153, 153, 153));
        jCBLiverInfection.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCBLiverInfection.setText("Liver Infection");
        getContentPane().add(jCBLiverInfection);
        jCBLiverInfection.setBounds(410, 450, 270, 31);

        jCBSeizureDisorder.setBackground(new java.awt.Color(153, 153, 153));
        jCBSeizureDisorder.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCBSeizureDisorder.setText("Seizure Disorder");
        getContentPane().add(jCBSeizureDisorder);
        jCBSeizureDisorder.setBounds(410, 480, 270, 31);

        jCBTemporaryBlindness.setBackground(new java.awt.Color(153, 153, 153));
        jCBTemporaryBlindness.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCBTemporaryBlindness.setText("Temporary Blindness");
        getContentPane().add(jCBTemporaryBlindness);
        jCBTemporaryBlindness.setBounds(410, 510, 270, 31);

        jCBOthers.setBackground(new java.awt.Color(0, 204, 204));
        jCBOthers.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCBOthers.setText("Others");
        jCBOthers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCBOthersMouseClicked(evt);
            }
        });
        getContentPane().add(jCBOthers);
        jCBOthers.setBounds(180, 570, 127, 40);

        jCBLukemia.setBackground(new java.awt.Color(153, 153, 153));
        jCBLukemia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCBLukemia.setText("Lukemia");
        jCBLukemia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBLukemiaActionPerformed(evt);
            }
        });
        getContentPane().add(jCBLukemia);
        jCBLukemia.setBounds(410, 540, 270, 31);

        jTOthers.setColumns(20);
        jTOthers.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jTOthers.setRows(5);
        jTOthers.setText("(Specify)");
        jTOthers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTOthersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTOthers);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(310, 570, 310, 110);

        jBSubmitDetails.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBSubmitDetails.setText("Submit Details");
        jBSubmitDetails.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBSubmitDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBSubmitDetailsMouseClicked(evt);
            }
        });
        getContentPane().add(jBSubmitDetails);
        jBSubmitDetails.setBounds(680, 610, 150, 40);

        jCBDay.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCBDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        getContentPane().add(jCBDay);
        jCBDay.setBounds(790, 170, 40, 40);

        jCBMonth.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCBMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }));
        getContentPane().add(jCBMonth);
        jCBMonth.setBounds(830, 170, 60, 40);

        jCBYear.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCBYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970" }));
        getContentPane().add(jCBYear);
        jCBYear.setBounds(890, 170, 70, 40);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/semproject/a_1420.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 1360, 730);
        jLabel5.getAccessibleContext().setAccessibleName("");

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

    private void jRadioFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioFemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioFemaleActionPerformed

    private void jRadioMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioMaleActionPerformed

    private void jCBLukemiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBLukemiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBLukemiaActionPerformed

    private void jBSubmitDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSubmitDetailsMouseClicked
        String Gender;        
        String MaritialStatus;
        String MedicalHistory = "";
        
        if(jTFirstName.getText().equals(""))
        {
             JOptionPane.showMessageDialog(this,"All the fields must be filled");
        }
        else if(jTLastName.getText().equals(""))
        {
             JOptionPane.showMessageDialog(this,"All the fields must be filled");
        }
        else if(jTWeight.getText().equals(""))
        {
             JOptionPane.showMessageDialog(this,"All the fields must be filled");
        }
        else if(jRadioFemale.isSelected()==false && jRadioMale.isSelected()==false && jRadioOthers.isSelected()==false )
        {
             JOptionPane.showMessageDialog(this,"Atleast one option must be selected");             
        }
        else if(jRadioMarried.isSelected()==false && jRadioUnmarried.isSelected()==false)
        {
             JOptionPane.showMessageDialog(this,"Atleast one option must be selected");             
        }
        else if(jCBAllergy.isSelected()==false && jCBArthiritis.isSelected()==false && jCBAsthama.isSelected()==false && jCBBloodClot.isSelected()==false 
                && jCBHepatitis.isSelected()==false && jCBHypertension.isSelected()==false && jCBLiverInfection.isSelected()==false && 
                jCBLukemia.isSelected()==false && jCBSeizureDisorder.isSelected()==false && jCBTemporaryBlindness.isSelected()==false && 
                jCBOthers.isSelected()==false)
        {
             JOptionPane.showMessageDialog(this,"Atleast one option must be selected");             
        }
        else if(jCBOthers.isSelected() && jTOthers.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this,"In case of others please specify");
        }
        
        else
        {
                 if(jRadioFemale.isSelected())
                 {
                    Gender="Female"; 
                 }
                else if(jRadioMale.isSelected())
                {
                    Gender="Male";
                }
                else 
                {
                    Gender="Others";
                }

                if(jRadioMarried.isSelected())
                {
                    MaritialStatus="Married";
                }
                else
                {
                     MaritialStatus="Unmarried";
                }

                int i=0;
                    if(jCBAllergy.isSelected())
                    {
                        MedicalHistory= MedicalHistory +"Allergy";
                        
                    }
                    if(jCBArthiritis.isSelected())
                    {
                        MedicalHistory= MedicalHistory +"Arthiritis";
                        
                    }
                    if(jCBAsthama.isSelected())
                    {
                       MedicalHistory= MedicalHistory +"Asthama";
                        
                    }
                    if(jCBBloodClot.isSelected())
                    {
                        MedicalHistory= MedicalHistory +"Asthama";
                        
                    }
                    if(jCBHepatitis.isSelected())
                    {
                        MedicalHistory= MedicalHistory +"Hepatitis";
                        
                    }
                    if(jCBHypertension.isSelected())
                    {
                        MedicalHistory= MedicalHistory +"Hypertension";
                        
                    }
                    if(jCBLiverInfection.isSelected())
                    {
                        MedicalHistory= MedicalHistory +"LiverInfection";
                        
                    }
                    if(jCBLukemia.isSelected())
                    {
                        MedicalHistory= MedicalHistory +"Lukemia";
                        
                    }
                    if( jCBSeizureDisorder.isSelected())
                    {
                        MedicalHistory= MedicalHistory +"SeizureDisorder";
                        
                    }
                    if( jCBTemporaryBlindness.isSelected())
                    {
                        MedicalHistory= MedicalHistory +"TemporaryBlindness";
                        
                    }
                    if(jCBOthers.isSelected())
                    {
                      MedicalHistory= MedicalHistory +jTOthers.getText();
                        

                    }

                            
        String Weight = jTWeight.getText();
        String FName = jTFirstName.getText();
        String LName = jTLastName.getText();
        String Day = (String)jCBDay.getSelectedItem();
        String Month = (String)jCBMonth.getSelectedItem();
        String Year = (String)jCBYear.getSelectedItem();
        int cal = 2018 - Integer.parseInt(Year);
        String Age = Integer.toString(cal);
        String P_ID = FName + Year;

                    if((JOptionPane.showConfirmDialog(this,"Are you sure ?")) == JOptionPane.YES_OPTION)
                    {
                        Patient pat = new Patient(P_ID,FName,LName,Day,Month,Year,Age,Gender,
                                MaritialStatus,Weight,MedicalHistory);
                        Patient.insert_reg(pat);
                        this.setVisible(false);
                        JOptionPane.showMessageDialog(this,"Successfully Registered!\nYour ID is\n"+P_ID);
                         new ExistingDoctor(username,P_ID).setVisible(true);
                    }
        }                
    }//GEN-LAST:event_jBSubmitDetailsMouseClicked

    private void jCBOthersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCBOthersMouseClicked
        // TODO add your handling code here:
        if(jCBOthers.isSelected()==false)
        {    jTOthers.setText("");
             jTOthers.setEnabled(false);
             jTOthers.setVisible(false);
        }
         if(jCBOthers.isSelected())
        {    jTOthers.setText("");
             jTOthers.setVisible(true);
             jTOthers.setEnabled(true);
        }
        
    }//GEN-LAST:event_jCBOthersMouseClicked

    private void jTOthersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTOthersMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTOthersMouseClicked

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
            java.util.logging.Logger.getLogger(PatientRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientRegistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DOB;
    private javax.swing.JLabel First_Name;
    private javax.swing.JLabel Gender;
    private javax.swing.JLabel Last_Name;
    private javax.swing.JLabel Marital_Status;
    private javax.swing.JButton jBSubmitDetails;
    private javax.swing.JCheckBox jCBAllergy;
    private javax.swing.JCheckBox jCBArthiritis;
    private javax.swing.JCheckBox jCBAsthama;
    private javax.swing.JCheckBox jCBBloodClot;
    private javax.swing.JComboBox<String> jCBDay;
    private javax.swing.JCheckBox jCBHepatitis;
    private javax.swing.JCheckBox jCBHypertension;
    private javax.swing.JCheckBox jCBLiverInfection;
    private javax.swing.JCheckBox jCBLukemia;
    private javax.swing.JComboBox<String> jCBMonth;
    private javax.swing.JCheckBox jCBOthers;
    private javax.swing.JCheckBox jCBSeizureDisorder;
    private javax.swing.JCheckBox jCBTemporaryBlindness;
    private javax.swing.JComboBox<String> jCBYear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRadioFemale;
    private javax.swing.JRadioButton jRadioMale;
    private javax.swing.JRadioButton jRadioMarried;
    private javax.swing.JRadioButton jRadioOthers;
    private javax.swing.JRadioButton jRadioUnmarried;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFirstName;
    private javax.swing.JTextField jTLastName;
    private javax.swing.JTextArea jTOthers;
    private javax.swing.JTextField jTWeight;
    // End of variables declaration//GEN-END:variables
}
