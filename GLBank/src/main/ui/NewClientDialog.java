/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.ui;

import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import main.Client;
import main.Database.ConnectionProvider;

/**
 *
 * @author pc
 */
public class NewClientDialog extends javax.swing.JDialog {

  
    public NewClientDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        errorFirstnameLbl.setVisible(false);
        errorLastnameLbl.setVisible(false);
        errorDobLbl.setVisible(false);
        errorMailLbl.setVisible(false);
        errorStreetLbl.setVisible(false);
        errorStreetnumberLbl.setVisible(false);
        errorPostcodeLbl.setVisible(false);
        errorCityLbl.setVisible(false);
        errorUsernameLbl.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtFirstname = new javax.swing.JTextField();
        txtLastname = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtStreet = new javax.swing.JTextField();
        txtStreetnumber = new javax.swing.JTextField();
        txtPostcode = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        errorFirstnameLbl = new javax.swing.JLabel();
        errorLastnameLbl = new javax.swing.JLabel();
        errorDobLbl = new javax.swing.JLabel();
        errorMailLbl = new javax.swing.JLabel();
        errorStreetLbl = new javax.swing.JLabel();
        errorStreetnumberLbl = new javax.swing.JLabel();
        errorPostcodeLbl = new javax.swing.JLabel();
        errorCityLbl = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        errorUsernameLbl = new javax.swing.JLabel();
        txtDob = new org.jdesktop.swingx.JXDatePicker();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Add New Client");

        txtFirstname.setText("First name");

        txtLastname.setText("Last name");

        txtEmail.setText("email");

        txtStreet.setText("Street");

        txtStreetnumber.setText("Street number");

        txtPostcode.setText("Post code");

        txtCity.setText("City");

        jLabel2.setText("Personal details");

        jLabel3.setText("Address");

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        errorFirstnameLbl.setForeground(new java.awt.Color(255, 0, 0));
        errorFirstnameLbl.setText("Invalid username");

        errorLastnameLbl.setForeground(new java.awt.Color(255, 0, 0));
        errorLastnameLbl.setText("Invalid username");

        errorDobLbl.setForeground(new java.awt.Color(255, 0, 0));
        errorDobLbl.setText("Invalid date of birth");

        errorMailLbl.setForeground(new java.awt.Color(255, 0, 0));
        errorMailLbl.setText("Invalid email");

        errorStreetLbl.setForeground(new java.awt.Color(255, 0, 0));
        errorStreetLbl.setText("Invalid street");

        errorStreetnumberLbl.setForeground(new java.awt.Color(255, 0, 0));
        errorStreetnumberLbl.setText("Invalid number");

        errorPostcodeLbl.setForeground(new java.awt.Color(255, 0, 0));
        errorPostcodeLbl.setText("Invalid postcode");

        errorCityLbl.setForeground(new java.awt.Color(255, 0, 0));
        errorCityLbl.setText("Invalid city");

        txtUsername.setText("Username");

        txtPassword.setText("Password");

        errorUsernameLbl.setForeground(new java.awt.Color(255, 0, 0));
        errorUsernameLbl.setText("InvalidUsername");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(errorMailLbl)
                            .addComponent(errorDobLbl)
                            .addComponent(errorLastnameLbl)
                            .addComponent(errorFirstnameLbl)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtUsername, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                                        .addComponent(txtFirstname, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtLastname, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(txtDob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(69, 69, 69)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btnCreate)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(errorStreetLbl)
                                                .addComponent(txtStreet)
                                                .addComponent(txtStreetnumber, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                                .addComponent(txtPostcode)
                                                .addComponent(txtCity)
                                                .addComponent(errorStreetnumberLbl)
                                                .addComponent(errorPostcodeLbl)
                                                .addComponent(errorCityLbl)
                                                .addComponent(txtPassword)))
                                        .addGap(18, 18, 18)
                                        .addComponent(btnCancel))))
                            .addComponent(errorUsernameLbl)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(jLabel1)))
                .addContainerGap(179, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(errorFirstnameLbl)
                    .addComponent(errorStreetLbl))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStreetnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(errorLastnameLbl)
                    .addComponent(errorStreetnumberLbl))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPostcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(errorDobLbl)
                    .addComponent(errorPostcodeLbl))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(errorMailLbl)
                    .addComponent(errorCityLbl))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorUsernameLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreate)
                    .addComponent(btnCancel))
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed

        String firstname=txtFirstname.getText();
        String lastname=txtLastname.getText();
        Date dob = txtDob.getDate();
        String email = txtEmail.getText();
        String street = txtStreet.getText();
        int streetNo = Integer.parseInt(txtStreetnumber.getText());
        String postCode = txtPostcode.getText();
        String city =txtCity.getText();
        String username=txtUsername.getText();
        String password=txtPassword.getText();  
        verifyFirstname();
        verifyLastname();
        verifyDob();
        verifyEmail();
        verifyStreet();
        verifyStreetNumber();
        verifyPostcode();
        verifyCity();
        verifyUsername();
        if(verifyInputFields()){
             Client newClient = new Client(0, lastname,firstname,email, street, streetNo, postCode,city, username,password,false, false, dob);
             new ConnectionProvider().addClientRecord(newClient);
             this.dispose();
        }
        
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed
    
    private boolean verifyInputFields(){
          boolean areValid =verifyFirstname()&&verifyLastname()&&verifyDob()&&verifyEmail()&&verifyStreet()&&verifyStreetNumber()&&verifyPostcode()&&verifyCity()&&verifyUsername();
           return areValid;
    }
    
    private boolean verifyFirstname(){
        String firstname = txtFirstname.getText();
        boolean valid=false;
        if(firstname!=null&&firstname.length()<=20){
            for(int i=0;i<firstname.length();i++){
                if(Character.isLetter(firstname.charAt(i)))
                        valid=true;
                    
            }
        }
        if(valid==false)
            errorFirstnameLbl.setVisible(true);
        return valid;
    }
    
    private boolean verifyLastname(){
        String lastname = txtLastname.getText();
        boolean valid=true;
        if(lastname!=null&&lastname.length()<=20){
            for(int i=0;i<lastname.length();i++){
                if(!Character.isLetter(lastname.charAt(i)))
                        valid=false;
                    
            }
        }
        if(valid==false){
            errorLastnameLbl.setVisible(true);
        }
        return valid;
        
    }
    
    private boolean verifyDob(){
        boolean valid=false;
        SimpleDateFormat df = new SimpleDateFormat("dd/mm/yyyy");
        SimpleDateFormat yr = new SimpleDateFormat("yyyy");
 
        
        Date dob= txtDob.getDate();
        String dateOfBirth=df.format(dob);
        int year=Integer.parseInt(yr.format(dob));
     
        if(dateOfBirth!=null&&year<2001)
            valid=true;
        if (valid==false)
                errorDobLbl.setVisible(true);
        return valid;
    }
    
    private boolean verifyEmail(){
        String email=txtEmail.getText();

        boolean valid=false;
        
        if(email!=null&&email.length()>5 /*altered for testing purposes*/)
            valid=true;
        
        if (valid==false)
            errorMailLbl.setVisible(true);
        return valid;
    }
    
    private boolean verifyStreet(){
        String street = txtStreet.getText();
        boolean valid=false;
        if(street!=null&&street.length()<=30){
            for(int i=0;i<street.length();i++){
                if(Character.isLetter(street.charAt(i)))
                        valid=true;
                    
            }
        }
        if(valid==false)
            errorStreetLbl.setVisible(true);
        
        return valid;
    }
    
    private boolean verifyStreetNumber(){
        String streetnumber =txtStreetnumber.getText();
        boolean valid =false;
        if(streetnumber!=null){
            for(int i=0;i<streetnumber.length();i++){
                if(Character.isDigit(streetnumber.charAt(i)))
                    valid=true;
                
            }
        }
        if(valid==false){
            errorStreetnumberLbl.setVisible(true);
        }
        return valid;
    }
    
    private boolean verifyPostcode(){
        String postCode = txtPostcode.getText();
        boolean valid=false;
        if(postCode!=null&&postCode.length()==5){
            for(int i=0;i<postCode.length();i++){
                if(Character.isDigit(postCode.charAt(i)))
                        valid=true;
                    
            }
        }
        if(valid==false){
            errorPostcodeLbl.setVisible(true);
        }
        return valid;
    }
    
    private boolean verifyCity(){
        String city = txtCity.getText();
        boolean valid=false;
        if(city!=null&&city.length()<=20){
            for(int i=0;i<city.length();i++){
                if(Character.isLetter(city.charAt(i)))
                        valid=true;
            }
        }
         if(valid==false){
            errorCityLbl.setVisible(true);
        }
        return valid;
    }
    
    private boolean verifyUsername(){
        String username = txtUsername.getText();
        boolean valid=true;
        if(username!=null&&username.length()<=20){
            for(int i=0;i<username.length();i++){
                if(!Character.isLetter(username.charAt(i)))
                        valid=false;
            }
        }
        if(valid==false){
            errorUsernameLbl.setVisible(true);
        }
        return valid;
    }
    
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(NewClientDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewClientDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewClientDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewClientDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NewClientDialog dialog = new NewClientDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCreate;
    private javax.swing.JLabel errorCityLbl;
    private javax.swing.JLabel errorDobLbl;
    private javax.swing.JLabel errorFirstnameLbl;
    private javax.swing.JLabel errorLastnameLbl;
    private javax.swing.JLabel errorMailLbl;
    private javax.swing.JLabel errorPostcodeLbl;
    private javax.swing.JLabel errorStreetLbl;
    private javax.swing.JLabel errorStreetnumberLbl;
    private javax.swing.JLabel errorUsernameLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
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
