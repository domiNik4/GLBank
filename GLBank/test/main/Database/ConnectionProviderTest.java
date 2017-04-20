/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.Database;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import main.Accounts;
import main.BankTransaction;
import main.Card;
import main.Client;
import main.Employee;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pc
 */
public class ConnectionProviderTest {
    
    public ConnectionProviderTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of isEmployeePasswordValid method, of class ConnectionProvider.
     */
    @Test
    public void testIsEmployeePasswordValid1() {
        System.out.println("isEmployeePasswordValid");
        String username = "SecondUSer";
        String password = "secEet";
        ConnectionProvider instance = new ConnectionProvider();
        boolean expResult = false;
        boolean result = instance.isEmployeePasswordValid(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    public void testIsEmployeePasswordValid2() {
        System.out.println("isEmployeePasswordValid");
        String username = "seconduser";
        String password = "";
        ConnectionProvider instance = new ConnectionProvider();
        boolean expResult = true;
        boolean result = instance.isEmployeePasswordValid(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testIsEmployeePasswordValid3() {
        System.out.println("isEmployeePasswordValid");
        int idemp = 2;
        String password = "secret";
        ConnectionProvider instance = new ConnectionProvider();
        boolean expResult = true;
        boolean result = instance.isEmployeePasswordValid(idemp, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEmployeeId method, of class ConnectionProvider.
     */
    @Test
    public void testGetEmployeeId() {
        System.out.println("getEmployeeId");
        String username = "SecondUser";
        ConnectionProvider instance = new ConnectionProvider();
        int expResult = 2;
        int result = instance.getEmployeeId(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

   
    @Test
    public void testGetEmployee() {
        System.out.println("getEmployee");
        int id = 2;
        ConnectionProvider instance = new ConnectionProvider();
        Employee result = instance.getEmployee(id);
        assertEquals("Employee", result.getFirstname());
        assertEquals("Two", result.getLastname());
        assertEquals(2, result.getIdemp());
        assertEquals("employee.two@glbank.com", result.getEmail());
        assertEquals('c', result.getPosition());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isEmployeePasswordValid method, of class ConnectionProvider.
     */
    @Test
    public void testIsEmployeePasswordValid_String_String() {
        System.out.println("isEmployeePasswordValid");
        String username = "";
        String password = "";
        ConnectionProvider instance = new ConnectionProvider();
        boolean expResult = false;
        boolean result = instance.isEmployeePasswordValid(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isEmployeePasswordValid method, of class ConnectionProvider.
     */
    @Test
    public void testIsEmployeePasswordValid_int_String() {
        System.out.println("isEmployeePasswordValid");
        int idemp = 0;
        String password = "";
        ConnectionProvider instance = new ConnectionProvider();
        boolean expResult = false;
        boolean result = instance.isEmployeePasswordValid(idemp, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDateTime method, of class ConnectionProvider.
     */
    //@Test
    public void testGetDateTime() {
        System.out.println("getDateTime");
        ConnectionProvider instance = new ConnectionProvider();
        String expResult = instance.getDateTime();
        String result = instance.getDateTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of logEmployeeAccess method, of class ConnectionProvider.
     */
    @Test
    public void testLogEmployeeAccess() {
        System.out.println("logEmployeeAccess");
        int id = 1;
        ConnectionProvider instance = new ConnectionProvider();
        instance.logEmployeeAccess(id);
        
    }

    /**
     * Test of changePassword method, of class ConnectionProvider.
     */
    @Test
    public void testChangePassword() {
        System.out.println("changePassword");
        int idemp = 0;
        String newPass = "asdfgh";
        ConnectionProvider instance = new ConnectionProvider();
        instance.changePassword(idemp, newPass);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getListOfAllClients method, of class ConnectionProvider.
     */
    @Test
    public void testGetListOfAllClients() {
        System.out.println("getListOfAllClients");
        ConnectionProvider instance = new ConnectionProvider();
        ArrayList expResult = instance.getListOfAllClients();
        ArrayList result = instance.getListOfAllClients();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of addClientRecord method, of class ConnectionProvider.
     */
    @Test
    public void testAddClientRecord() {
        System.out.println("addClientRecord");
        Client client = null;
        ConnectionProvider instance = new ConnectionProvider();
        instance.addClientRecord(client);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getClient method, of class ConnectionProvider.
     */
    @Test
    public void testGetClient() {
        System.out.println("getClient");
        int idc = 0;
        ConnectionProvider instance = new ConnectionProvider();
        Client expResult = null;
        Client result = instance.getClient(idc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAccounts method, of class ConnectionProvider.
     */
    @Test
    public void testGetAccounts() {
        System.out.println("getAccounts");
        int idc = 0;
        ConnectionProvider instance = new ConnectionProvider();
        List<Accounts> expResult = null;
        List<Accounts> result = instance.getAccounts(idc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateSubtract method, of class ConnectionProvider.
     */
    @Test
    public void testUpdateSubtract() {
        System.out.println("updateSubtract");
        int idemp = 0;
        long idacc = 0L;
        float balance = 0.0F;
        float amountToSubtract = 0.0F;
        JLabel lblBalance = null;
        JLabel lblError = null;
        ConnectionProvider instance = new ConnectionProvider();
        instance.updateSubtract(idemp, idacc, balance, amountToSubtract, lblBalance, lblError);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateAdd method, of class ConnectionProvider.
     */
    @Test
    public void testUpdateAdd() {
        System.out.println("updateAdd");
        int idemp = 0;
        long idacc = 0L;
        float balance = 0.0F;
        float amountToAdd = 0.0F;
        JLabel lblBalance = null;
        ConnectionProvider instance = new ConnectionProvider();
        instance.updateAdd(idemp, idacc, balance, amountToAdd, lblBalance);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addMoneyToAccount method, of class ConnectionProvider.
     */
    @Test
    public void testAddMoneyToAccount() {
        System.out.println("addMoneyToAccount");
        long idacc = 0L;
        float balance = 0.0F;
        float amountToAdd = 0.0F;
        JLabel lblBalance = null;
        Connection conn = null;
        ConnectionProvider instance = new ConnectionProvider();
        instance.addMoneyToAccount(idacc, balance, amountToAdd, lblBalance, conn);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createAddCashTransactionRecord method, of class ConnectionProvider.
     */
    @Test
    public void testCreateAddCashTransactionRecord() {
        System.out.println("createAddCashTransactionRecord");
        int idemp = 0;
        long idacc = 0L;
        float amount = 0.0F;
        Connection conn = null;
        ConnectionProvider instance = new ConnectionProvider();
        instance.createAddCashTransactionRecord(idemp, idacc, amount, conn);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of subtractMoneyFromAccount method, of class ConnectionProvider.
     */
    @Test
    public void testSubtractMoneyFromAccount() {
        System.out.println("subtractMoneyFromAccount");
        long idacc = 0L;
        float balance = 0.0F;
        float amountToSubtract = 0.0F;
        JLabel lblBalance = null;
        JLabel lblError = null;
        Connection conn = null;
        ConnectionProvider instance = new ConnectionProvider();
        instance.subtractMoneyFromAccount(idacc, balance, amountToSubtract, lblBalance, lblError, conn);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createSubtractCashTransactionRecord method, of class ConnectionProvider.
     */
    @Test
    public void testCreateSubtractCashTransactionRecord() {
        System.out.println("createSubtractCashTransactionRecord");
        int idemp = 0;
        long idacc = 0L;
        float amount = 0.0F;
        Connection conn = null;
        ConnectionProvider instance = new ConnectionProvider();
        instance.createSubtractCashTransactionRecord(idemp, idacc, amount, conn);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createNewAccount method, of class ConnectionProvider.
     */
    @Test
    public void testCreateNewAccount() {
        System.out.println("createNewAccount");
        long newAccId = 0L;
        int idc = 0;
        ConnectionProvider instance = new ConnectionProvider();
        instance.createNewAccount(newAccId, idc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doesAccountExist method, of class ConnectionProvider.
     */
    @Test
    public void testDoesAccountExist() {
        System.out.println("doesAccountExist");
        long idacc = 0L;
        ConnectionProvider instance = new ConnectionProvider();
        boolean expResult = false;
        boolean result = instance.doesAccountExist(idacc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateClient method, of class ConnectionProvider.
     */
    @Test
    public void testUpdateClient() {
        System.out.println("updateClient");
        Client client = null;
        ConnectionProvider instance = new ConnectionProvider();
        instance.updateClient(client);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateClientRecord method, of class ConnectionProvider.
     */
    @Test
    public void testUpdateClientRecord() {
        System.out.println("updateClientRecord");
        Client client = null;
        Connection conn = null;
        ConnectionProvider instance = new ConnectionProvider();
        instance.updateClientRecord(client, conn);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateClientDetails method, of class ConnectionProvider.
     */
    @Test
    public void testUpdateClientDetails() {
        System.out.println("updateClientDetails");
        Client client = null;
        Connection conn = null;
        ConnectionProvider instance = new ConnectionProvider();
        instance.updateClientDetails(client, conn);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateClientLogin method, of class ConnectionProvider.
     */
    @Test
    public void testUpdateClientLogin() {
        System.out.println("updateClientLogin");
        Client client = null;
        Connection conn = null;
        ConnectionProvider instance = new ConnectionProvider();
        instance.updateClientLogin(client, conn);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createNewCard method, of class ConnectionProvider.
     */
    @Test
    public void testCreateNewCard() {
        System.out.println("createNewCard");
        Card card = null;
        ConnectionProvider instance = new ConnectionProvider();
        instance.createNewCard(card);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListOfCards method, of class ConnectionProvider.
     */
    @Test
    public void testGetListOfCards() {
        System.out.println("getListOfCards");
        int idc = 0;
        ConnectionProvider instance = new ConnectionProvider();
        List<Card> expResult = null;
        List<Card> result = instance.getListOfCards(idc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editCard method, of class ConnectionProvider.
     */
    @Test
    public void testEditCard() {
        System.out.println("editCard");
        Card card = null;
        ConnectionProvider instance = new ConnectionProvider();
        instance.editCard(card);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of performBankTransaction method, of class ConnectionProvider.
     */
    @Test
    public void testPerformBankTransaction() {
        System.out.println("performBankTransaction");
        Accounts thisAccount = null;
        long offsetAccount = 0L;
        int bankCode = 0;
        float amount = 0.0F;
        Connection conn = null;
        ConnectionProvider instance = new ConnectionProvider();
        instance.performBankTransaction(thisAccount, offsetAccount, bankCode, amount, conn);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of createBankTransactionRecord method, of class ConnectionProvider.
     */
    @Test
    public void testCreateBankTransactionRecord() {
        System.out.println("createBankTransactionRecord");
        float amount = 2.00;
        String description = "asdf";
        long thisAccount = 1234567891;
        long offsetAccount = 1925487845;
        int bankCode = 22222;
        int idemp = 1;
        ConnectionProvider instance = new ConnectionProvider();
        Connection conn = instance.getConnection();//open connection here
        instance.createBankTransactionRecord(amount, description, thisAccount, offsetAccount, bankCode, idemp, conn);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateBankTransaction method, of class ConnectionProvider.
     */
    @Test
    public void testUpdateBankTransaction() {
        System.out.println("updateBankTransaction");
        float amount = 0.0F;
        Accounts thisAccount = null;
        long offsetAccount = 0L;
        int bankCode = 0;
        String description = "";
        int idemp = 0;
        ConnectionProvider instance = new ConnectionProvider();//look at connection too, its private
        instance.updateBankTransaction(amount, thisAccount, offsetAccount, bankCode, description, idemp);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getBankTransactions method, of class ConnectionProvider.
     */
    @Test
    public void testGetBankTransactions() {
        System.out.println("getBankTransactions");
        ConnectionProvider instance = new ConnectionProvider();
        List<BankTransaction> expResult = null;
        List<BankTransaction> result = instance.getBankTransactions();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
 
    
}
