/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import main.Client;
import main.Employee;

/**
 *
 * @author pc
 */
public class ConnectionProvider {
     
    private static final String USERNAME="root";
    private static final String PASSWORD="";
    private static final String DBNAME="GLBank";
    private static final String URL="jdbc:mysql://localhost/";
    private static final String DRIVER="com.mysql.jdbc.Driver";
    
    
    private Connection getConnection (){
        Connection conn =null;
        try{
            conn = DriverManager.getConnection(URL+DBNAME, USERNAME , PASSWORD);
        }catch(SQLException ex){
            System.out.println("Error:" + ex.toString());
        }
        return conn;
    }
    
    public boolean isEmployeePasswordValid (String username, String password){
        String query="Select idemp, password from loginemployee where login like binary ? and password like binary ?";
        Connection conn =getConnection();
             
        
        if(conn!=null){
            try{
            PreparedStatement ps=conn.prepareStatement(query);
            ps.setString(1,username);
            ps.setString(2,password);
            
            ResultSet rs=ps.executeQuery();
            boolean ret =rs.next();         
            conn.close();
            return ret;

            }catch(SQLException ex){
                System.out.println("Error:" + ex.toString());
            }
        }
        return false;
    }
    
    public boolean isEmployeePasswordValid (int idemp, String password){
        String query="Select idemp, password from loginemployee where idemp like binary ? and password like binary ?";
        Connection conn =getConnection();
             
        
        if(conn!=null){
            try{
            PreparedStatement ps=conn.prepareStatement(query);
            ps.setInt(1,idemp);
            ps.setString(2,password);
            
            ResultSet rs=ps.executeQuery();
            boolean ret =rs.next();         
            conn.close();
            return ret;

            }catch(SQLException ex){
                System.out.println("Error:" + ex.toString());
            }
        }
        return false;
    }
    
    
    
    public int getEmployeeId(String username){
        
        String query="Select idemp, password from loginemployee where login like binary ?";
        Connection conn =getConnection();
        int id=-1;
        
        if(conn!=null){
            try{
            PreparedStatement ps=conn.prepareStatement(query);
            ps.setString(1,username);            
            ResultSet rs=ps.executeQuery();
            
            if(rs.next()){
                id=rs.getInt("idemp");
            }
            conn.close();
            }catch(SQLException ex){
                System.out.println("Error:" + ex.toString());
            }
        }
        
        return id;
    }
    
    public String getDateTime(){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString=sdf.format(date);
        return dateString;
    }
    
    public void logEmployeeAccess(int id){
        String query="INSERT INTO historyloginemployee (idemp, logindate) "+
                "values(?,?)";
        String date=getDateTime(); 
        Connection conn=getConnection();
        
        if(conn!=null){
            try{
                PreparedStatement ps= conn.prepareStatement(query);
                ps.setInt(1, id);
                ps.setString(2,date);
                ps.executeUpdate();
                System.out.println("Query executededed");
                
            }catch(SQLException ex){
                System.out.println("Error "+ ex.toString());               
           
            }
        }  
    }
    
    public Employee getEmployee(int id){
        String query = "SELECT * from employees where idemp like ?";
        Employee employee = null;
        Connection conn=getConnection();
        
        int idemp=0;
        String firstname = null;
        String lastname=null;
        String email=null;
        char position='0';
        
        if(conn!=null){
            try{
                PreparedStatement ps =conn.prepareStatement(query);
                ps.setInt(1,id);
                ResultSet rs=ps.executeQuery();
                
                if(rs.next()){
                    idemp=rs.getInt("idemp");
                    firstname= rs.getString("firstname");
                    lastname=rs.getString("lastname");
                    email=rs.getString("email");
                    position=rs.getString("position").charAt(0);
                    
                }
                conn.close();
            }catch(SQLException ex){
                System.out.println("Error:" + ex.toString());
            }
        }        
        employee = new Employee(idemp,firstname,lastname,email,position);
        return employee;        
    }
    
    public void changePassword(int idemp, String newPass){
        String query = "Update loginemployee set password=? where idemp=?";
        Connection conn=getConnection();
        
        if(conn!=null){
            try{
                PreparedStatement ps= conn.prepareStatement(query);
                ps.setString(1, newPass);
                ps.setInt(2,idemp);
                ps.executeUpdate();
                conn.close();
                
            }catch(SQLException ex){
                System.out.println("Error:" + ex.toString());
            }
        }
       
    }
    
    public ArrayList getListOfAllClients(){
        
        String query = "SELECT * from clients INNER JOIN clientdetails on clients.idc=clientdetails.idc where disable = 'F'";
        Connection conn=getConnection();
        ArrayList clients = new ArrayList();
        
        if (conn!=null){
            try{
                Statement ps =conn.createStatement();
                ResultSet rs= ps.executeQuery(query);
                while(rs.next()){
                    int idc = rs.getInt("clients.idc");
                    String firstname =  rs.getString("firstname");
                    String lastname = rs.getString("lastname");
                    Date dob = rs.getDate("dob");
                    Client client=new Client(idc, lastname, firstname, dob);
                    clients.add(client);
                }
                conn.close();
            }catch(SQLException ex){
                System.out.println("Error:" + ex.toString());
                
            }

        }
        
        return clients;
        
    }
    
   public void addNewClient(String firstname, String lastname, Date dob, String email){
       String query="INSERT INTO clients(firstname,lastname,dob,email)VALUES(?,?,?,?)";
       Connection conn=getConnection();
       SimpleDateFormat df = new SimpleDateFormat("dd");
       SimpleDateFormat mf = new SimpleDateFormat("MM");
       SimpleDateFormat yf = new SimpleDateFormat("yyyy");
       String day=df.format(dob);
       String month=mf.format(dob);
       String year=yf.format(dob);
       String date= year+"-"+month+"-"+day;
       
       if(conn!=null){
           try{
               PreparedStatement ps = conn.prepareStatement(query);
               ps.setString(1,firstname);
               ps.setString(2,lastname);
               ps.setString(3,date);//check this
               ps.setString(4,email);
               ps.executeUpdate();
               conn.close();
           }catch(SQLException ex){
               System.out.println("Error: "+ex.toString());
           }
       }
   }
   
   public void addClientDetails(int idc,String street,String housenumber,String city,String postcode){
       String query="INSERT INTO clientdetails(idc,street,housenumber,city,postcode)VALUES(?,?,?,?,?)";
       Connection conn=getConnection();
       if(conn!=null){
           try{
               PreparedStatement ps=conn.prepareStatement(query);
               ps.setInt(1,idc);
               ps.setString(2,street);
               ps.setInt(3,Integer.valueOf(housenumber));
               ps.setString(4,city);
               ps.setString(5,postcode);
               ps.executeUpdate();
               conn.close();
           }catch(SQLException ex){
               System.out.println("Error: "+ex.toString());
           }
       }
       
   }
   
   public void addClientLogin(){
       String query="INSERT INTO loginclient(idc,login,password) VALUES(?,?,?)";
       Connection conn=getConnection();
       if(conn!=null){
           try{
               PreparedStatement ps=conn.prepareStatement(query);
           }catch(SQLException ex){
               System.out.println("Error: "+ex.toString());
           }
           
           
       }
       
       
   }
   
    
    
    
    
    
    
}
