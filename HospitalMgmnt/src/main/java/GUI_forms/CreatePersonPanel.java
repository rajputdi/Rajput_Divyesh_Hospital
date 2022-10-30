/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI_forms;

import com.hospital.hospitalmgmnt.Doctor;
import com.hospital.hospitalmgmnt.DoctorDirectory;
import com.hospital.hospitalmgmnt.Hospital;
import com.hospital.hospitalmgmnt.Person;
import com.hospital.hospitalmgmnt.PersonDirectory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Divyesh Rajput
 */
public class CreatePersonPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreatePersonPanel
     */
    PersonDirectory person;
    DoctorDirectory doctor;
    Person per;
    Doctor dr;
    public CreatePersonPanel(PersonDirectory person) {
        initComponents();
        this.person = person;
        jLabel2.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPrName = new javax.swing.JLabel();
        txtPrName = new javax.swing.JTextField();
        jPrAge = new javax.swing.JLabel();
        txtPr_StrtAdd = new javax.swing.JTextField();
        jPrGender = new javax.swing.JLabel();
        jGenderBox = new javax.swing.JComboBox<>();
        jPrAddress = new javax.swing.JLabel();
        txtPrAge = new javax.swing.JTextField();
        jPrPhone = new javax.swing.JLabel();
        txtPrPhone = new javax.swing.JTextField();
        btnCreatePatient = new javax.swing.JButton();
        jPrPhone1 = new javax.swing.JLabel();
        txtPrEmail = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPrPhone2 = new javax.swing.JLabel();
        txtHouseNo = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 255));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jPrName.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        jPrName.setText("Name*");

        txtPrName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrNameActionPerformed(evt);
            }
        });
        txtPrName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPrNameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrNameKeyTyped(evt);
            }
        });

        jPrAge.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        jPrAge.setText("Age");

        jPrGender.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        jPrGender.setText("Gender");

        jGenderBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male\t", "Female\t", "Others" }));

        jPrAddress.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        jPrAddress.setText("Street Address");

        jPrPhone.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        jPrPhone.setText("Phone");

        btnCreatePatient.setBackground(new java.awt.Color(0, 204, 51));
        btnCreatePatient.setFont(new java.awt.Font("Felix Titling", 0, 14)); // NOI18N
        btnCreatePatient.setText("Create");
        btnCreatePatient.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCreatePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreatePatientActionPerformed(evt);
            }
        });

        jPrPhone1.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        jPrPhone1.setText("Email Address");

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));

        jLabel1.setBackground(new java.awt.Color(153, 153, 255));
        jLabel1.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Create Person");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 91, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPrPhone2.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        jPrPhone2.setText("House No");

        jLabel13.setFont(new java.awt.Font("MingLiU_HKSCS-ExtB", 0, 12)); // NOI18N
        jLabel13.setText("*required fields");

        jLabel2.setBackground(new java.awt.Color(255, 0, 0));
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("* cannot be numeric");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jPrPhone1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtPrEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jPrPhone2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtHouseNo, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jPrPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtPrPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPrAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPrGender, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPrAge, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPrName, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jGenderBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPr_StrtAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPrAge, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPrName, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCreatePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPrName)
                    .addComponent(txtPrName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPrAge)
                    .addComponent(txtPrAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPrGender)
                    .addComponent(jGenderBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPrAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPr_StrtAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPrPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPrEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPrPhone1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtHouseNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPrPhone2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(btnCreatePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtPrNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrNameActionPerformed

    private void btnCreatePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreatePatientActionPerformed
      
     
     if( txtPrName.getText().isEmpty()|| checkForAlphaNum(txtPrName.getText())){
            JOptionPane.showMessageDialog(this, "Person Name cannot be empty or alphanumeric");
            return;
        }
     if(txtPrEmail.getText().isEmpty() || !txtPrEmail.getText().contains("@")|| !txtPrEmail.getText().contains(".com")){
            JOptionPane.showMessageDialog(this, "Email ID cannot be empty or invalid");
            return;
        }
     if(txtPrAge.getText().isEmpty() || checkForAlphaNum(txtPrAge.getText())){
            JOptionPane.showMessageDialog(this, "Age cannot be empty or Invalid Age!!");
            return;
        }
     if (txtPr_StrtAdd.getText().isEmpty()){
         JOptionPane.showMessageDialog(this, "Street Address cannot be empty!!");
            return;
     }
     if( checkForAlphaNum(txtPrPhone.getText()) ){
         
            JOptionPane.showMessageDialog(this, "Contact Number should be numeric only!!!");
     }
     if (txtPrPhone.getText().length()!= 10){
            JOptionPane.showMessageDialog(this, "Contact Number should be numeric and 10 digits only!!!");
            return;
        } 
     if( checkForAlphaNum(txtHouseNo.getText())){
            JOptionPane.showMessageDialog(this, "House Number cannot be alphanumeric!!!");
            return;
        }
        
        
      String pName = txtPrName.getText();
      String pAge = txtPrAge.getText();
      String pGender = jGenderBox.getSelectedItem().toString();
      String pStreet = txtPr_StrtAdd.getText();
      String pPhone= txtPrPhone.getText();
      String pEmail = txtPrEmail.getText();
      String pHouseNo = txtHouseNo.getText();
      
      per = person.createNewPerson();
      per.setPr_name(pName);
      per.setPr_age(pAge);
      per.setPr_gender(pGender);
      per.setPr_streetAddress(pStreet);
      per.setPr_phone(pPhone);
      per.setPr_email(pEmail);
      per.setHouse_no(pHouseNo);
      
      
      JOptionPane.showMessageDialog(this, "New Person added to the directory");
    }//GEN-LAST:event_btnCreatePatientActionPerformed

    private void txtPrNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrNameKeyReleased
        // TODO add your handling code here:
//        if(checkForAlphaNum(txtPrName.getText())){
//            jLabel2.setVisible(true);
//        }
//        else 
//            jLabel2.setVisible(false);
    }//GEN-LAST:event_txtPrNameKeyReleased

    private void txtPrNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrNameKeyTyped
        // TODO add your handling code here:
        if(!checkForAlphaNum(txtPrName.getText())){
            jLabel2.setVisible(true);
        }
        else 
            jLabel2.setVisible(false);
    }//GEN-LAST:event_txtPrNameKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreatePatient;
    private javax.swing.JComboBox<String> jGenderBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jPrAddress;
    private javax.swing.JLabel jPrAge;
    private javax.swing.JLabel jPrGender;
    private javax.swing.JLabel jPrName;
    private javax.swing.JLabel jPrPhone;
    private javax.swing.JLabel jPrPhone1;
    private javax.swing.JLabel jPrPhone2;
    private javax.swing.JTextField txtHouseNo;
    private javax.swing.JTextField txtPrAge;
    private javax.swing.JTextField txtPrEmail;
    private javax.swing.JTextField txtPrName;
    private javax.swing.JTextField txtPrPhone;
    private javax.swing.JTextField txtPr_StrtAdd;
    // End of variables declaration//GEN-END:variables

        private boolean checkForAlphaNum(String empNo){
        for(int i=0;i<empNo.length();i++){
           char c = empNo.charAt(i);
           if((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z'))
                return true;
           }
        return false;
    }
        
        
}
