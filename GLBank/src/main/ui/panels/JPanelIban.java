/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.ui.panels;

import main.Features.IBANGenerator;

/**
 *
 * @author pc
 */
public class JPanelIban extends javax.swing.JPanel {

    /**
     * Creates new form JPanelIban
     */
    public JPanelIban() {
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

        jLabel1 = new javax.swing.JLabel();
        bankCodeTxt = new javax.swing.JTextField();
        prefixTxt = new javax.swing.JTextField();
        accNumberTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        generateIbanBtn = new javax.swing.JButton();
        ibanLbl = new javax.swing.JLabel();

        jLabel1.setText("IBAN generator");

        jLabel2.setText("Bank Code (4 digits)");

        jLabel3.setText("Prefix (6 digits max)");

        jLabel4.setText("Account number (10 digits max)");

        generateIbanBtn.setText("Generate IBAN");
        generateIbanBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateIbanBtnActionPerformed(evt);
            }
        });

        ibanLbl.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        ibanLbl.setForeground(new java.awt.Color(0, 102, 153));
        ibanLbl.setText("IBAN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(339, 339, 339)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bankCodeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(prefixTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(accNumberTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(314, 314, 314)
                        .addComponent(generateIbanBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(329, 329, 329)
                        .addComponent(ibanLbl)))
                .addContainerGap(141, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bankCodeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prefixTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accNumberTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(generateIbanBtn)
                .addGap(47, 47, 47)
                .addComponent(ibanLbl)
                .addContainerGap(98, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void generateIbanBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateIbanBtnActionPerformed

        String bankCode=bankCodeTxt.getText();
        String prefix=prefixTxt.getText();
        String accountNumber=accNumberTxt.getText();
        
        IBANGenerator ig = new IBANGenerator(bankCode,prefix,accountNumber);
        String iban=ig.generateIBAN();
        if(iban!=null)
            ibanLbl.setText(iban);
        else
            ibanLbl.setText("Ooops. Something went wrong.");
    }//GEN-LAST:event_generateIbanBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accNumberTxt;
    private javax.swing.JTextField bankCodeTxt;
    private javax.swing.JButton generateIbanBtn;
    private javax.swing.JLabel ibanLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField prefixTxt;
    // End of variables declaration//GEN-END:variables
}
