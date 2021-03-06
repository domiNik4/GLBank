/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.ui;


//import java.sql.Date;

import main.Client;
import main.Database.ConnectionProvider;
import main.ui.verification.InputVerification;

/**
 *
 * @author pc
 */
public class EditInfoDialog extends javax.swing.JDialog {
    private Client client;

    /**
     * Creates new form EditInfoDialog
     * @param parent
     */
    public EditInfoDialog(java.awt.Frame parent, boolean modal,Client client) {
        super(parent, modal);
        initComponents();
        this.client=client;
        initTextfields();
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtFirstname = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtLastname = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtStreetnumber = new javax.swing.JTextField();
        txtStreet = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txtPostcode = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        submitBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        txtDob = new org.jdesktop.swingx.JXDatePicker();
        errorFirstname = new javax.swing.JLabel();
        errorStreet = new javax.swing.JLabel();
        errorLastname = new javax.swing.JLabel();
        errorStreetNo = new javax.swing.JLabel();
        errorCity = new javax.swing.JLabel();
        errorDob = new javax.swing.JLabel();
        errorPostcode = new javax.swing.JLabel();
        errorMail = new javax.swing.JLabel();
        errorUsername = new javax.swing.JLabel();
        errorPassword = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setText("Edit Client Info");

        jLabel3.setText("ID:");

        lblId.setText("lblId");

        jLabel5.setText("Personal Information");

        jLabel6.setText("Name:");

        txtFirstname.setText("jTextField1");

        jLabel7.setText("Last name");

        txtLastname.setText("jTextField2");

        jLabel8.setText("DOB:");

        jLabel9.setText("Email:");

        txtEmail.setText("jTextField4");

        jLabel10.setText("Address");

        jLabel11.setText("Street");

        jLabel12.setText("City");

        jLabel13.setText("Postcode");

        jLabel14.setText("Street no.");

        txtStreetnumber.setText("jTextField5");

        txtStreet.setText("jTextField6");

        txtCity.setText("jTextField7");

        txtPostcode.setText("jTextField8");

        jLabel15.setText("Account details");

        jLabel16.setText("Username:");

        txtUsername.setText("jTextField9");

        jLabel17.setText("Password:");

        txtPassword.setText("jTextField10");

        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        errorFirstname.setForeground(new java.awt.Color(204, 0, 0));
        errorFirstname.setText("Invalid name");

        errorStreet.setForeground(new java.awt.Color(204, 0, 0));
        errorStreet.setText("Invalid street");

        errorLastname.setForeground(new java.awt.Color(204, 0, 0));
        errorLastname.setText("Invalid last name");

        errorStreetNo.setForeground(new java.awt.Color(204, 0, 0));
        errorStreetNo.setText("Enter numbers");

        errorCity.setForeground(new java.awt.Color(204, 0, 0));
        errorCity.setText("Invalid city");

        errorDob.setForeground(new java.awt.Color(204, 0, 0));
        errorDob.setText("Invalid date");

        errorPostcode.setForeground(new java.awt.Color(204, 0, 0));
        errorPostcode.setText("Enter numbers");

        errorMail.setForeground(new java.awt.Color(204, 0, 0));
        errorMail.setText("Invalid email");

        errorUsername.setForeground(new java.awt.Color(204, 0, 0));
        errorUsername.setText("Invalid username");

        errorPassword.setForeground(new java.awt.Color(204, 0, 0));
        errorPassword.setText("Enter a password.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(146, 146, 146)
                .addComponent(jLabel15)
                .addGap(106, 106, 106))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(332, 332, 332)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(lblId))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(220, 220, 220)
                                        .addComponent(submitBtn))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel9))
                                        .addGap(25, 25, 25)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(errorFirstname)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(txtFirstname)
                                                    .addComponent(txtLastname)
                                                    .addComponent(txtEmail)
                                                    .addComponent(txtDob, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel14)
                                                    .addComponent(jLabel11)
                                                    .addComponent(jLabel12)
                                                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)))
                                            .addComponent(errorLastname)
                                            .addComponent(errorDob)
                                            .addComponent(errorMail))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cancelBtn)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtStreetnumber, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                                            .addComponent(txtStreet)
                                            .addComponent(txtCity))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel16)
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(errorUsername)
                                                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel17)
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(errorPassword)
                                                    .addComponent(txtPassword)))))
                                    .addComponent(errorStreet)
                                    .addComponent(errorStreetNo)
                                    .addComponent(txtPostcode, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(errorCity)
                                    .addComponent(errorPostcode))))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblId))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txtFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(txtStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16)
                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(errorFirstname)
                            .addComponent(errorUsername))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtLastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(txtStreetnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(errorLastname)
                                    .addComponent(errorStreetNo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel12)
                                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(errorPassword))))
                    .addComponent(errorStreet))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(errorCity)
                    .addComponent(errorDob))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPostcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(errorPostcode)
                    .addComponent(errorMail))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitBtn)
                    .addComponent(cancelBtn))
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void initTextfields(){
        lblId.setText(""+client.getIdc());
        txtFirstname.setText(client.getFirstname());
        txtLastname.setText(client.getLastname());
        txtDob.setDate(client.getDob());
        txtEmail.setText(client.getEmail());
        txtStreet.setText(client.getStreet());
        txtStreetnumber.setText(""+client.getHousenumber());
        txtCity.setText(client.getCity());
        txtPostcode.setText(client.getPostcode());
        txtUsername.setText(client.getUsername());
        txtPassword.setText(client.getPassword());
        errorCity.setVisible(false);
        errorDob.setVisible(false);
        errorFirstname.setVisible(false);
        errorLastname.setVisible(false);
        errorMail.setVisible(false);
        errorPassword.setVisible(false);
        errorPostcode.setVisible(false);
        errorStreet.setVisible(false);
        errorStreetNo.setVisible(false);
        errorUsername.setVisible(false);
    }
    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
         InputVerification iv = new InputVerification();
         
            iv.isNameValid(txtFirstname.getText(),errorFirstname);
           iv.isNameValid(txtLastname.getText(),errorLastname);
           iv.isEmailValid(txtEmail.getText(),errorMail);
           iv.isDobValid(txtDob.getDate(), errorDob);
           iv.isCityValid(txtCity.getText(), errorCity);
           iv.isStreetValid(txtStreet.getText(),errorStreet);
           iv.isStreetNumberValid(""+txtStreetnumber.getText(),errorStreetNo);
           iv.isPostcodeValid(txtPostcode.getText(), errorPostcode);
           iv.isUsernameValid(txtUsername.getText(), errorUsername);
           iv.isPasswordValid(txtPassword.getText(),errorPassword);
         
        if(iv.isNameValid(txtFirstname.getText(),errorFirstname)&&
           iv.isNameValid(txtLastname.getText(),errorLastname)&&
           iv.isEmailValid(txtEmail.getText(),errorMail)&&
           iv.isDobValid(txtDob.getDate(), errorDob)&&
           iv.isCityValid(txtCity.getText(), errorCity)&&
           iv.isStreetValid(txtStreet.getText(),errorStreet)&&
           iv.isStreetNumberValid(""+txtStreetnumber.getText(),errorStreetNo)&&
           iv.isPostcodeValid(txtPostcode.getText(), errorPostcode)&&
           iv.isUsernameValid(txtUsername.getText(), errorUsername)&&
           iv.isPasswordValid(txtPassword.getText(),errorPassword)){
            client.setFirstname(txtFirstname.getText());
            client.setLastname(txtLastname.getText());
            client.setDob(txtDob.getDate());
            client.setEmail(txtEmail.getText());
            client.setStreet(txtStreet.getText());
            client.setHousenumber(Integer.parseInt(txtStreetnumber.getText()));
            client.setPostcode(txtPostcode.getText());
            client.setCity(txtCity.getText());
            client.setUsername(txtUsername.getText());
            client.setPassword(txtPassword.getText());        
                new ConnectionProvider().updateClient(client); 
                this.dispose();
        }
    }//GEN-LAST:event_submitBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        dispose();
    }//GEN-LAST:event_cancelBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelBtn;
    private javax.swing.JLabel errorCity;
    private javax.swing.JLabel errorDob;
    private javax.swing.JLabel errorFirstname;
    private javax.swing.JLabel errorLastname;
    private javax.swing.JLabel errorMail;
    private javax.swing.JLabel errorPassword;
    private javax.swing.JLabel errorPostcode;
    private javax.swing.JLabel errorStreet;
    private javax.swing.JLabel errorStreetNo;
    private javax.swing.JLabel errorUsername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblId;
    private javax.swing.JButton submitBtn;
    private javax.swing.JTextField txtCity;
    private org.jdesktop.swingx.JXDatePicker txtDob;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstname;
    private javax.swing.JTextField txtLastname;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPostcode;
    private javax.swing.JTextField txtStreet;
    private javax.swing.JTextField txtStreetnumber;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
