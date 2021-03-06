/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.ui.panels;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import java.util.Random;
import javax.swing.JFrame;
import main.Card;
import main.Database.ConnectionProvider;
import main.ui.EditCardDialog;

/**
 *
 * @author pc
 */
public class JPanelCards extends javax.swing.JPanel {
    private int idc;
    private List<Card> listOfCards;
    private ConnectionProvider cp;
    
    public JPanelCards(int idc) {
        initComponents();
        this.idc=idc;
        this.cp=new ConnectionProvider();
        this.listOfCards=cp.getListOfCards(idc);
        if(listOfCards!=null&&listOfCards.size()>0)
                showListOfCards();
    }
    
    private void showListOfCards(){
       listOfCards = cp.getListOfCards(idc);
        if(listOfCards!=null && listOfCards.size()>0){
            for( Card card : listOfCards){
                String item = ""+card.getCardNumber();
                
                comboCards.addItem(item);
                }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        comboCards = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        btnAddCard = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblAccount = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblPin = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        btnEdit = new javax.swing.JButton();

        jLabel12.setText("jLabel12");

        comboCards.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCardsActionPerformed(evt);
            }
        });

        jLabel2.setText("Choose a card:");

        btnAddCard.setText("Add new card");
        btnAddCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCardActionPerformed(evt);
            }
        });

        jLabel6.setText("Bound to account:");

        jLabel4.setText("PIN code:");

        jLabel5.setText("Status:");

        jLabel7.setText("Valid until:");

        lblAccount.setText("-");

        jLabel9.setText("Forever");

        lblPin.setText("****");

        lblStatus.setText("-");

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblStatus)
                            .addComponent(lblPin)
                            .addComponent(jLabel9)
                            .addComponent(lblAccount)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnEdit)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(comboCards, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(btnAddCard)))
                .addContainerGap(186, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboCards, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btnAddCard))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblAccount))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblPin))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblStatus))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(btnEdit)
                .addGap(40, 40, 40))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void comboCardsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCardsActionPerformed
        int index=comboCards.getSelectedIndex();
        if(index>=0){
            lblAccount.setText(""+listOfCards.get(index).getIdacc());
            lblPin.setText(""+listOfCards.get(index).getPin());
            lblStatus.setText(""+listOfCards.get(index).getBlocked());
        } 
    }//GEN-LAST:event_comboCardsActionPerformed

    private void btnAddCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCardActionPerformed

        Card card=new Card(0,idc,generateNewLong(),0,'N',1234);
        cp.createNewCard(card);
        comboCards.removeAllItems();
        showListOfCards();
        
    }//GEN-LAST:event_btnAddCardActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        int index=comboCards.getSelectedIndex();
        EditCardDialog editDialog = new EditCardDialog((JFrame)this.getRootPane().getParent(),true,listOfCards.get(index));
        editDialog.setVisible(true);
        
        editDialog.addWindowListener(new WindowAdapter(){
            public void windowClosed(WindowEvent e){
                lblAccount.setText(""+listOfCards.get(index).getIdacc());
                lblPin.setText(""+listOfCards.get(index).getPin());
                lblStatus.setText(""+listOfCards.get(index).getBlocked());
           }
        });
    }//GEN-LAST:event_btnEditActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCard;
    private javax.swing.JButton btnEdit;
    private javax.swing.JComboBox<String> comboCards;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblAccount;
    private javax.swing.JLabel lblPin;
    private javax.swing.JLabel lblStatus;
    // End of variables declaration//GEN-END:variables


public long generateNewLong(){
    String newLong = "";
    Random r= new Random();
    for(int i=0; i<16;i++){
        newLong=newLong+(""+(r.nextInt(9)+1));
    }
    return Long.valueOf(newLong);
}




}