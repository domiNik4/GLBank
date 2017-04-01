/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.ui;

import main.ui.panels.JPanelAccounts;
import main.ui.panels.JPanelInfo;
import main.ui.panels.JPanelAccounts;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import main.Client;
import main.Database.ConnectionProvider;
import main.Employee;
import main.ui.panels.JPanelCards;
import main.ui.panels.JPanelTransactions;

/**
 *
 * @author pc
 */
public class MainForm extends javax.swing.JFrame {
    
    int idemp=0;
    private List<Client>clientsList;
    private ConnectionProvider conn;

    
    public MainForm(int idemp) {
        initComponents();
        this.idemp=idemp;
        this.conn=new ConnectionProvider();
        initForm();
    }
    
    private void initForm(){//several smaller methods
        printEmployeeName();
        showListOfClients();
        initTabs();
        
        
    }
    
    private void printEmployeeName(){
        Employee employee =conn.getEmployee(idemp);
        if(employee!=null){
            String name=employee.getFirstname()+ " " + employee.getLastname();
            lblEmployeeName.setText("Logged in as: "+name);
        }
        
        
    }
    
    private void showListOfClients(){
        clientsList = new ConnectionProvider().getListOfAllClients();
        
        if(clientsList!=null && clientsList.size()>0){
            for(Client client : clientsList){
                String item = client.getFirstname()+" "+client.getLastname()+" "+client.getDob();
                comboListOfAllClients.addItem(item);
                
            }
        }
    }
    
    private void initTabs(){
                
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu2 = new javax.swing.JMenu();
        lblEmployeeName = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        comboListOfAllClients = new javax.swing.JComboBox<>();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jSeparator1 = new javax.swing.JSeparator();
        newClientBtn = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        changePasswordMenuAction = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuExitAction = new javax.swing.JMenuItem();

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblEmployeeName.setText("Logged user: Firstname Lastname");

        jLabel1.setText("Select client:");

        comboListOfAllClients.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose..." }));
        comboListOfAllClients.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                comboListOfAllClientsMouseEntered(evt);
            }
        });
        comboListOfAllClients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboListOfAllClientsActionPerformed(evt);
            }
        });

        newClientBtn.setText("New Client");
        newClientBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newClientBtnActionPerformed(evt);
            }
        });

        jMenu1.setText("Menu");

        changePasswordMenuAction.setText("Change Password");
        changePasswordMenuAction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePasswordMenuActionActionPerformed(evt);
            }
        });
        jMenu1.add(changePasswordMenuAction);

        jMenuItem1.setText("About");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        menuExitAction.setText("Exit");
        menuExitAction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExitActionActionPerformed(evt);
            }
        });
        jMenu1.add(menuExitAction);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(newClientBtn)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 970, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(comboListOfAllClients, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 57, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblEmployeeName)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblEmployeeName)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(comboListOfAllClients, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(newClientBtn)
                .addGap(58, 58, 58)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuExitActionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExitActionActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        System.exit(0);
    }//GEN-LAST:event_menuExitActionActionPerformed

    private void changePasswordMenuActionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePasswordMenuActionActionPerformed
        ChangePasswordDialog pwdDialog = new ChangePasswordDialog(this,false,idemp);
        pwdDialog.setVisible(true);
    }//GEN-LAST:event_changePasswordMenuActionActionPerformed

    private void newClientBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newClientBtnActionPerformed
        // TODO add your handling code here:create client button
        NewClientDialog clientDialog = new NewClientDialog(this,false);
        clientDialog.setVisible(true);
    }//GEN-LAST:event_newClientBtnActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        AboutDialog aboutDialog1 = new AboutDialog(this,false);
        aboutDialog1.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void comboListOfAllClientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboListOfAllClientsActionPerformed
        // TODO add your handling code here:
        int index = comboListOfAllClients.getSelectedIndex()-1;
        jTabbedPane1.removeAll();
        if(index >= 0){
            Client chosenClient = clientsList.get(index);
            Client client = new ConnectionProvider().getClient(chosenClient.getIdc());
            JPanelInfo jpanelInfo = new JPanelInfo(client);
            jpanelInfo.initLabels();
            jTabbedPane1.add("Information", jpanelInfo);
            
            JPanelAccounts jpanelAccounts=new JPanelAccounts(chosenClient.getIdc());
            jTabbedPane1.add("Accounts",jpanelAccounts);
            
            JPanelTransactions jpanelTransactions=new JPanelTransactions();
            jTabbedPane1.add("Transactions",jpanelTransactions);
            
            JPanelCards jpanelCards = new JPanelCards();
            jTabbedPane1.add("Cards",jpanelCards);
        }
    }//GEN-LAST:event_comboListOfAllClientsActionPerformed

    private void comboListOfAllClientsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboListOfAllClientsMouseEntered
        // TODO add your handling code here:
       
        comboListOfAllClients.removeAllItems();
        comboListOfAllClients.addItem("Choose");
        clientsList=conn.getListOfAllClients();
        showListOfClients();
    }//GEN-LAST:event_comboListOfAllClientsMouseEntered

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem changePasswordMenuAction;
    private javax.swing.JComboBox<String> comboListOfAllClients;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblEmployeeName;
    private javax.swing.JMenuItem menuExitAction;
    private javax.swing.JButton newClientBtn;
    // End of variables declaration//GEN-END:variables
}
