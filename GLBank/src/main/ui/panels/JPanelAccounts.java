/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.ui.panels;

import java.util.List;
import java.util.Random;
import main.Accounts;
import main.Client;
import main.Database.ConnectionProvider;

/**
 *
 * @author pc
 */
public class JPanelAccounts extends javax.swing.JPanel {
    private int idc;
    private List<Accounts> accountsList ;
    private ConnectionProvider cp;
    private int index=1;

    /**
     * Creates new form JPanelTransactions
     */
    public JPanelAccounts(int idc) {
        initComponents();
        this.idc =idc;
        cp=new ConnectionProvider();
        accountsList = cp.getAccounts(idc);
        showListOfAccounts();
    }
    
    private void showListOfAccounts(){      
                       
        if(accountsList!=null && accountsList.size()>0){
            for( Accounts account : accountsList){
                String item = account.getIdAcc()+"/2701";
                comboAccounts.addItem(item);
                }
                lblBalance.setText(""+accountsList.get(comboAccounts.getSelectedIndex()).getBalance());
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

        jLabel1 = new javax.swing.JLabel();
        comboAccounts = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        lblBalance = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnAddNewAcc = new javax.swing.JButton();

        jLabel1.setText("Account id:");

        comboAccounts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                comboAccountsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                comboAccountsMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                comboAccountsMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                comboAccountsMouseReleased(evt);
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

        jTextField1.setText("jTextField1");

        jTextField2.setText("jTextField2");

        jButton1.setText("add");

        jButton2.setText("subtract");

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
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(296, 296, 296)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(comboAccounts, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(lblBalance)
                        .addGap(172, 172, 172)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnAddNewAcc)
                        .addGap(174, 174, 174)
                        .addComponent(jButton1)
                        .addGap(101, 101, 101)
                        .addComponent(jButton2)))
                .addContainerGap(156, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboAccounts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField2)
                            .addComponent(jTextField1)
                            .addComponent(lblBalance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton1)
                                .addComponent(jButton2))
                            .addComponent(btnAddNewAcc)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel4)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void comboAccountsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboAccountsActionPerformed

        lblBalance.setText(""+accountsList.get(comboAccounts.getSelectedIndex()).getBalance());//stop causing error, bitch!!!!
    }//GEN-LAST:event_comboAccountsActionPerformed

    private void btnAddNewAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewAccActionPerformed
        // TODO add your handling code here:
        ConnectionProvider cp = new ConnectionProvider();
        long newAccount;
        newAccount=(Math.abs(new Random().nextLong())%1000000000*11);
        cp.createNewAccount(newAccount,idc);
       
    }//GEN-LAST:event_btnAddNewAccActionPerformed

    private void comboAccountsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboAccountsMouseEntered
            
    }//GEN-LAST:event_comboAccountsMouseEntered

    private void comboAccountsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboAccountsMouseExited
 
    }//GEN-LAST:event_comboAccountsMouseExited

    private void comboAccountsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboAccountsMousePressed
        // TODO add your handling code here:
        comboAccounts.removeAllItems();
        accountsList = cp.getAccounts(idc);
        showListOfAccounts();
    }//GEN-LAST:event_comboAccountsMousePressed

    private void comboAccountsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboAccountsMouseReleased

    }//GEN-LAST:event_comboAccountsMouseReleased
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddNewAcc;
    private javax.swing.JComboBox<String> comboAccounts;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lblBalance;
    // End of variables declaration//GEN-END:variables
}