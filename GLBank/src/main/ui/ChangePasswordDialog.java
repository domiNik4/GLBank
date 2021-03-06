/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.ui;

import java.awt.event.ActionEvent;
import main.Database.ConnectionProvider;

/**
 *
 * @author pc
 */
public class ChangePasswordDialog extends javax.swing.JDialog {
    
    private int idemp;

    /**
     * Creates new form NewJDialog
     */
    public ChangePasswordDialog(java.awt.Frame parent, boolean modal, int idemp) {
        super(parent, modal);
        //errorLbl.setVisible(false);
        initComponents();
        this.idemp=idemp;
       
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        submitNewPasswordBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cancelPasswordBtn = new javax.swing.JButton();
        oldPasswordTxt = new javax.swing.JPasswordField();
        newPasswordTxt = new javax.swing.JPasswordField();
        newPasswordTxt2 = new javax.swing.JPasswordField();
        errorLbl = new javax.swing.JLabel();
        errorLbl2 = new javax.swing.JLabel();
        errorLbl4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Enter new password");

        jLabel2.setText("Re-enter new password");

        jLabel3.setText("Change your password");

        submitNewPasswordBtn.setText("Submit");
        submitNewPasswordBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitNewPasswordBtnActionPerformed(evt);
            }
        });

        jLabel4.setText("Enter old password:");

        cancelPasswordBtn.setText("Cancel");
        cancelPasswordBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelPasswordBtnActionPerformed(evt);
            }
        });

        oldPasswordTxt.setText("jPasswordField1");

        newPasswordTxt.setText("jPasswordField1");

        newPasswordTxt2.setText("jPasswordField1");

        errorLbl.setText("Passwords don't match.");

        errorLbl2.setText("Old password invalid");

        errorLbl4.setText("Old password incorect");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(submitNewPasswordBtn)
                                        .addGap(50, 50, 50)
                                        .addComponent(cancelPasswordBtn))
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1)
                                    .addComponent(oldPasswordTxt)
                                    .addComponent(newPasswordTxt)
                                    .addComponent(newPasswordTxt2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(errorLbl2)
                                    .addComponent(errorLbl4)
                                    .addComponent(errorLbl)))
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(jLabel3)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(oldPasswordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(errorLbl4))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newPasswordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(errorLbl2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newPasswordTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(errorLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitNewPasswordBtn)
                    .addComponent(cancelPasswordBtn))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitNewPasswordBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitNewPasswordBtnActionPerformed
        String oldPass = new String(oldPasswordTxt.getPassword());
        boolean isOldPassValid = new ConnectionProvider().isEmployeePasswordValid(idemp, oldPass); 
        String newPass = new String (newPasswordTxt.getPassword());
        String newPass2 =new String(newPasswordTxt2.getPassword());
        boolean samePasswords =newPass.equals(newPass2);
        if(!samePasswords){
            errorLbl.setText("New passwords don't match");
            errorLbl.setVisible(true);
        }
        else{
            errorLbl.setVisible(false);
        }
        boolean validPassword=isPasswordValid(newPass);
        if(validPassword){
            errorLbl2.setVisible(false);
        }
        else
            errorLbl2.setVisible(true);
        
        if(samePasswords&&validPassword&&isOldPassValid){
            ConnectionProvider conn=new ConnectionProvider();
           conn.changePassword(idemp, newPass);
        }
            
      
    }//GEN-LAST:event_submitNewPasswordBtnActionPerformed

    private boolean isPasswordValid(String newPassword){
        newPassword=newPassword.trim();
        
        if(newPassword.length()<6){
            return false;
        }
        boolean lowercase =false;
        boolean uppercase = false;
        boolean digit=false;
        boolean nonAlphaNum=false;
        for(int i=0;i<newPassword.length();i++){
            if(Character.isLowerCase(newPassword.charAt(i)))
                lowercase=true;
            if(Character.isUpperCase(newPassword.charAt(i)))
                uppercase=true;
            if(Character.isDigit(newPassword.charAt(i)))
                digit=true;
            if(!Character.isLetter(newPassword.charAt(i))&&!Character.isDigit(newPassword.charAt(i)))
                nonAlphaNum=true;
            
        }
        return lowercase && uppercase && digit && nonAlphaNum;
    }
    
   
   
     
    private void cancelPasswordBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelPasswordBtnActionPerformed
        dispose();
    }//GEN-LAST:event_cancelPasswordBtnActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelPasswordBtn;
    private javax.swing.JLabel errorLbl;
    private javax.swing.JLabel errorLbl2;
    private javax.swing.JLabel errorLbl4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField newPasswordTxt;
    private javax.swing.JPasswordField newPasswordTxt2;
    private javax.swing.JPasswordField oldPasswordTxt;
    private javax.swing.JButton submitNewPasswordBtn;
    // End of variables declaration//GEN-END:variables
}
