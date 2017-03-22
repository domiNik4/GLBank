/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.Database;

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
     
}
