/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.ui.panels;

import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;
import main.Accounts;
import main.Database.ConnectionProvider;

/**
 *
 * @author pc
 */
public class JPanelAccounts extends javax.swing.JPanel {
    private int idc;
    private int idemp;
    private List<Accounts> accountsList ;
    private ConnectionProvider cp;
    private int index=1;

   
    public JPanelAccounts(int idc,int idemp) {
        initComponents();
        this.idc =idc;
        this.idemp=idemp;
        cp=new ConnectionProvider();
        accountsList = cp.getAccounts(idc);
        if(accountsList!=null&&accountsList.size()>0)
            showListOfAccounts();
        else{
            comboAccounts.setEnabled(false);
            lblBalance.setText("404: accounts not found");
        }
    }
    
    private void showListOfAccounts(){  
        accountsList =cp.getAccounts(idc);
        if(accountsList!=null && accountsList.size()>0){
            for( Accounts account : accountsList){
                String item = account.getIdAcc()+"/2701";
                comboAccounts.addItem(item);
                }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        comboAccounts = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        lblBalance = new javax.swing.JLabel();
        txtAddMoney = new javax.swing.JTextField();
        txtSubtractMoney = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnSubtract = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnAddNewAcc = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblErrorAdd = new javax.swing.JLabel();
        lblErrorSubtract = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jLabel1.setText("Account id:");

        comboAccounts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                comboAccountsMouseEntered(evt);
            }
        });
        comboAccounts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboAccountsActionPerformed(evt);
            }
        });

        jLabel2.setText("Balance:");

        lblBalance.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblBalance.setText("100M");

        btnAdd.setText("add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnSubtract.setText("subtract");
        btnSubtract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubtractActionPerformed(evt);
            }
        });

        jLabel4.setText("Choose transaction");

        btnAddNewAcc.setText("Add new account");
        btnAddNewAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewAccActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(btnAdd)
                        .addGap(92, 92, 92)
                        .addComponent(btnSubtract))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtAddMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtSubtractMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(comboAccounts, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnAddNewAcc)
                                        .addGap(36, 36, 36)
                                        .addComponent(jLabel5))
                                    .addComponent(lblBalance)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblErrorAdd)
                                .addGap(117, 117, 117)
                                .addComponent(lblErrorSubtract))
                            .addComponent(jLabel3))))
                .addContainerGap(347, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnAddNewAcc)
                    .addComponent(comboAccounts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblBalance))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblErrorAdd)
                    .addComponent(lblErrorSubtract))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSubtractMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSubtract)
                    .addComponent(btnAdd))
                .addContainerGap(88, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void comboAccountsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboAccountsActionPerformed
        int index=comboAccounts.getSelectedIndex();
        if(index>=0){
            lblBalance.setText(""+accountsList.get(index).getBalance());
        }        
    }//GEN-LAST:event_comboAccountsActionPerformed

    private void btnAddNewAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewAccActionPerformed

        long newAccount;
        newAccount=(Math.abs(new Random().nextLong())%1000000000*11);
        cp.createNewAccount(newAccount,idc); 
        //accountsList =cp.getAccounts(idc);
        comboAccounts.removeAllItems();
        showListOfAccounts();
        comboAccounts.setEnabled(true);
        lblErrorAdd.setText("");
        lblErrorSubtract.setText("");
        //add popup with a message
    }//GEN-LAST:event_btnAddNewAccActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
 
        if(accountsList!=null&&accountsList.size()>0){
        long idacc= accountsList.get(comboAccounts.getSelectedIndex()).getIdAcc();
        String input=txtAddMoney.getText();
        if(isInputValid(input)){
            lblErrorAdd.setText("");
            float moneyToAdd=Float.parseFloat(input);
            float balance=Float.parseFloat(lblBalance.getText());
            cp.updateAdd(idemp,idacc,balance,moneyToAdd,lblBalance);
            accountsList = cp.getAccounts(idc);
            JOptionPane.showMessageDialog(this,"Transaction OK");
            txtSubtractMoney.setText("");
        }
        else{
            lblErrorAdd.setText("Enter a number with 2 decimal points");
        }
       
        }else{
            lblErrorAdd.setText("There is no account.");
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnSubtractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubtractActionPerformed
        if(accountsList!=null&&accountsList.size()>0){
        long idacc= accountsList.get(comboAccounts.getSelectedIndex()).getIdAcc();
        String input=txtSubtractMoney.getText();
        if(isInputValid(input)){
            lblErrorSubtract.setText("");
            float moneyToSubtract=Float.parseFloat(input);
            float balance=Float.parseFloat(lblBalance.getText());
            cp.updateSubtract(idemp,idacc,balance, moneyToSubtract,lblBalance, lblErrorSubtract);
            accountsList = cp.getAccounts(idc);
            JOptionPane.showMessageDialog(this,"Transaction OK");
            txtSubtractMoney.setText("");
        }
        else{
            lblErrorSubtract.setText("Enter a number with 2 decimal points");//also add success message
        }
        }
        else
            lblErrorSubtract.setText("There is no account.");
            
    }//GEN-LAST:event_btnSubtractActionPerformed
    
    private boolean isInputValid(String input){
        boolean valid = false;
        if(input!=null&&input.length()>0&&Character.isDigit(input.charAt(0))&&Character.isDigit(input.charAt(input.length()-1))&&Character.isDigit(input.charAt(input.length()-2))){
            for(int i=0;i<input.length()-3;i++){
                if(Character.isDigit(input.charAt(i))&&input.charAt(input.length()-3)=='.')
                    valid=true;
                else
                    valid=false;
            }
        }
        return valid;      
    }
    
    private void comboAccountsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboAccountsMouseEntered
       if(accountsList!=null&&accountsList.size()>0){
           int index=comboAccounts.getSelectedIndex();
           lblBalance.setText(""+accountsList.get(index).getBalance());
       }
       
    }//GEN-LAST:event_comboAccountsMouseEntered
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAddNewAcc;
    private javax.swing.JButton btnSubtract;
    private javax.swing.JComboBox<String> comboAccounts;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblBalance;
    private javax.swing.JLabel lblErrorAdd;
    private javax.swing.JLabel lblErrorSubtract;
    private javax.swing.JTextField txtAddMoney;
    private javax.swing.JTextField txtSubtractMoney;
    // End of variables declaration//GEN-END:variables
}
