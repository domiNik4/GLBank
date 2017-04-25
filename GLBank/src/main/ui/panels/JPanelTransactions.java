/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.ui.panels;

import java.util.List;
import main.Accounts;

import main.Database.ConnectionProvider;
import main.ui.verification.InputVerification;

/**
 *
 * @author pc
 */
public class JPanelTransactions extends javax.swing.JPanel {
    private int idc;
    private int idemp;
    private List<Accounts> listOfAccounts;
    private ConnectionProvider cp;
    

    
    public JPanelTransactions( int idc,int idemp) {
        initComponents();
        oAccErrorLbl.setVisible(false);
        amountErrorLbl.setVisible(false);
        bankCodeErrorLbl.setVisible(false);
        descErrorLbl.setVisible(false);
        this.idc=idc;
        this.idemp=idemp;
        cp=new ConnectionProvider();
        listOfAccounts=cp.getAccounts(idc);
        showListOfAccounts();
        
    }
    
    private void showListOfAccounts(){  
        listOfAccounts =cp.getAccounts(idc);
        if(listOfAccounts!=null && listOfAccounts.size()>0){
            for( Accounts account : listOfAccounts){
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
        txtOffsetAcc = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtBankCode = new javax.swing.JTextField();
        btnPerformTrans = new javax.swing.JButton();
        chkBoxRobot = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descField = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        bankCodeErrorLbl = new javax.swing.JLabel();
        amountErrorLbl = new javax.swing.JLabel();
        descErrorLbl = new javax.swing.JLabel();
        oAccErrorLbl = new javax.swing.JLabel();

        jLabel1.setText("Choose an account:");

        jLabel2.setText("Offset account:");

        txtOffsetAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOffsetAccActionPerformed(evt);
            }
        });

        jLabel3.setText("Bank code:");

        btnPerformTrans.setText("Perform transaction");
        btnPerformTrans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerformTransActionPerformed(evt);
            }
        });

        chkBoxRobot.setText("I'm not a robot");

        jLabel4.setText("Amount:");

        jLabel5.setText("Send money to a different account");

        descField.setColumns(20);
        descField.setRows(5);
        jScrollPane1.setViewportView(descField);

        jLabel6.setText("Description:");

        bankCodeErrorLbl.setForeground(new java.awt.Color(204, 0, 0));
        bankCodeErrorLbl.setText("Bank code not valid");

        amountErrorLbl.setForeground(new java.awt.Color(204, 0, 0));
        amountErrorLbl.setText("Amount must have 2 decimal points.");

        descErrorLbl.setForeground(new java.awt.Color(204, 0, 0));
        descErrorLbl.setText("Add description <140 chars.");

        oAccErrorLbl.setForeground(new java.awt.Color(204, 0, 0));
        oAccErrorLbl.setText("Account not valid");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(btnPerformTrans))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(chkBoxRobot))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(jLabel5))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(comboAccounts, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel6))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txtOffsetAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(oAccErrorLbl))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(amountErrorLbl))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txtBankCode, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(bankCodeErrorLbl))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(descErrorLbl))))))))
                .addGap(95, 282, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(comboAccounts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtOffsetAcc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(oAccErrorLbl))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtBankCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bankCodeErrorLbl))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(amountErrorLbl))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(descErrorLbl)
                                .addGap(34, 34, 34))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkBoxRobot)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPerformTrans)
                .addGap(19, 19, 19))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtOffsetAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOffsetAccActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOffsetAccActionPerformed

    private void btnPerformTransActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerformTransActionPerformed
        int index=comboAccounts.getSelectedIndex();
        Accounts thisAccount=listOfAccounts.get(index);
        long offsetAccount= new Long(txtOffsetAcc.getText());
        int bankCode =new Integer(txtBankCode.getText());
        float amount = new Float(txtAmount.getText());
        String description = descField.getText();
        boolean areYouARobot =!chkBoxRobot.isSelected();
        InputVerification v=new InputVerification();
        v.isDestAccNumberValid(offsetAccount,oAccErrorLbl);
        v.isBankCodeValid(bankCode, bankCodeErrorLbl);
        v.isDescriptionValid(description, descErrorLbl);
        
        if(areYouARobot==false&&v.isDestAccNumberValid(offsetAccount,oAccErrorLbl)&&v.isBankCodeValid(bankCode, bankCodeErrorLbl)&&v.isDescriptionValid(description, descErrorLbl))//verification to be added
            cp.updateBankTransaction(amount, thisAccount, offsetAccount, bankCode, description, idemp);
        
    }//GEN-LAST:event_btnPerformTransActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amountErrorLbl;
    private javax.swing.JLabel bankCodeErrorLbl;
    private javax.swing.JButton btnPerformTrans;
    private javax.swing.JCheckBox chkBoxRobot;
    private javax.swing.JComboBox<String> comboAccounts;
    private javax.swing.JLabel descErrorLbl;
    private javax.swing.JTextArea descField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel oAccErrorLbl;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtBankCode;
    private javax.swing.JTextField txtOffsetAcc;
    // End of variables declaration//GEN-END:variables
}
