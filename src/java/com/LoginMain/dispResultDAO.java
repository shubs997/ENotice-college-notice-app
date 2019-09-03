/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LoginMain;

import model.usersBeans;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Shubham
 */
public class dispResultDAO 
{

    Connection con;
    Statement st;
    ResultSet rs;
    //String fname,lname,pass,email,gender,dept;
     
    public dispResultDAO() {
       
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
           
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/testapp","root","root"); 
            
            st = con.createStatement();
            //rs = st.executeQuery("select * from student"); 
            
//          while(rs.next()){
                
//                String fname=rs.getString(1);
//                String lname=rs.getString(2);
//                String pass=rs.getString(2);
//                String email=rs.getString(2);
//                String gender=rs.getString(2);
//                String dept=rs.getString(2);
                
//                System.out.print("sid: "+rs.getInt(1)); //1 specifies column index, can give col name as well
//                System.out.print("|  name: "+rs.getString(2)); //use getString() for varchar datatype
//                System.out.print("|  total_cred: "+ rs.getInt(3));
//                System.out.print("|  depT_name: "+rs.getString(4));
//                System.out.println();
                        
//            }
            
        }catch(Exception e){
            System.out.println("error is "+e.getMessage());
            e.printStackTrace();
        }
    }
    
  
    public void doRead(String un)
    {
     try {
         
         String sql="select * from newuser where firstname= ?";
         PreparedStatement stm =con.prepareStatement(sql);
         stm.setString(1,un);
         this.rs=stm.executeQuery();
     } 
     catch (SQLException ex) {
         Logger.getLogger(dispResultDAO.class.getName()).log(Level.SEVERE, null, ex);
     }
    }
    
    public String getHTMLTable()
    {
        String table="";
        //String rtstring="";
        
            table+="<table border=1>";
            
     try {
        while(this.rs.next())
        {
             usersBeans ub= new usersBeans();
             ub.setName(this.rs.getString("firstname"));
             ub.setLast(this.rs.getString("lastname"));
             ub.setPass(this.rs.getString("password"));
             ub.setEmailid(this.rs.getString("email"));
             ub.setGend(this.rs.getString("gender"));
             ub.setDept(this.rs.getString("department"));
             
             table+="<tr>";
             String stt1=ub.getName();
             System.out.println("Dao name:" +stt1);
             table+="<td>";
             table+= ub.getName();
             //rtstring+= ub.getName();
             table+="</td>";
             
             table+="<td>";
             table+= ub.getLast();
             table+="</td>";
             
             table+="<td>";
             table+= ub.getPass();
             table+="</td>";
             
             table+="<td>";
             table+= ub.getEmailid();
             table+="</td>";
             
             table+="<td>";
             table+= ub.getGend();
             table+="</td>";
             
             table+="<td>";
             table+= ub.getDept();
             table+="</td>";
             table+="</tr>";
         }
     } catch (SQLException ex) {
         Logger.getLogger(dispResultDAO.class.getName()).log(Level.SEVERE, null, ex);
     }
            
            table+="</table>"; 
                return table;
    }   

    public static void main(String[] args) {
        dispResultDAO dr= new dispResultDAO();
       // dr.doRead();
        String table=dr.getHTMLTable();
        System.out.println(table);
    }

}


