/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.hospital.hospitalmgmnt.FormsPanels;

/**
 *
 * @author Divyesh Rajput
 */
public class createPatientForm extends javax.swing.JFrame {

    /**
     * Creates new form createPatientForm
     */
    public createPatientForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jNumber = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jGenderBox = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jNumber1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jNumber2 = new javax.swing.JTextField();
        btnCreatePatient = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        jLabel3.setText("Name*");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 212, 73, -1));

        jName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNameActionPerformed(evt);
            }
        });
        getContentPane().add(jName, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 208, 278, -1));

        jLabel4.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        jLabel4.setText("Age");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 252, -1, -1));
        getContentPane().add(jNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 328, 278, -1));

        jLabel6.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        jLabel6.setText("Gender");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 292, 56, -1));

        jGenderBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male\t", "Female\t", "Others" }));
        getContentPane().add(jGenderBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 288, -1, -1));

        jLabel7.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        jLabel7.setText("Phone No.:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 332, 129, -1));
        getContentPane().add(jNumber1, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 248, 278, -1));

        jLabel8.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        jLabel8.setText("Street Address");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 372, 129, -1));
        getContentPane().add(jNumber2, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 368, 278, -1));

        btnCreatePatient.setBackground(new java.awt.Color(0, 204, 51));
        btnCreatePatient.setFont(new java.awt.Font("Felix Titling", 0, 14)); // NOI18N
        btnCreatePatient.setText("Create");
        btnCreatePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreatePatientActionPerformed(evt);
            }
        });
        getContentPane().add(btnCreatePatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 480, 51));

        jLabel9.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        jLabel9.setText("ID");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, 110, 20));

        jRadioButton1.setText("Patient");
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, -1, -1));

        jRadioButton2.setText("Doctor");
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, -1, -1));

        jRadioButton3.setText("Person");
        getContentPane().add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, -1, -1));

        jLabel10.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        jLabel10.setText("Are you a ....?");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 129, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNameActionPerformed

    private void btnCreatePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreatePatientActionPerformed


    }//GEN-LAST:event_btnCreatePatientActionPerformed

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
            java.util.logging.Logger.getLogger(createPatientForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(createPatientForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(createPatientForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(createPatientForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new createPatientForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreatePatient;
    private javax.swing.JComboBox<String> jGenderBox;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jName;
    private javax.swing.JTextField jNumber;
    private javax.swing.JTextField jNumber1;
    private javax.swing.JTextField jNumber2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    // End of variables declaration//GEN-END:variables
}
