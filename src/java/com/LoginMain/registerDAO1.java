/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LoginMain;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Shubham
 */
@WebServlet(name = "registerDAO1", urlPatterns = {"/registerDAO1"}) public class registerDAO1 extends HttpServlet 
{
  
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String firstname=request.getAttribute("name").toString();
        String lastname=request.getAttribute("last").toString();
        String email=request.getAttribute("emailid").toString();
        String gender=request.getAttribute("gend").toString();
        String department=request.getAttribute("dep").toString();
        
        
        String sql="insert into newuser (firstname,lastname,email,gender,department) values(?,?,?,?,?)";
    	String url="jdbc:mysql://localhost:3306/testapp";
    	String username="root";
    	String password="root";
        
        try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
                        System.out.println("Driver loaded");
			Connection con = DriverManager.getConnection(url, username, password);
			PreparedStatement stm =con.prepareStatement(sql);
			stm.setString(1,firstname);
			stm.setString(2,lastname);
                        stm.setString(3,email);
                        stm.setString(4,gender);
                        stm.setString(5,department);
                        
                        
			
			int inserted= stm.executeUpdate();
                        
                    PrintWriter out= response.getWriter();
                    out.println(inserted+ "row/s affected");
			//if(rs.next())
				//return true;
			
		}
		catch(Exception ex) {
			//ex.printStackTrace();
			System.out.println("Error:" +ex.getMessage());
		}
    }


}
