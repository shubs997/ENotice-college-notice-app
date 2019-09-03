package com.LoginMain;

import java.sql.*;

/**
 *
 * @author Mandar
 */
public class registerDAO {

    /**
     * @param args the command line arguments
     */
    public boolean check(String uname,String lname,String pass,String email,String gender,String dept){
    	
    	String sql="insert into newuser (firstname,lastname,password,email,gender,department) values(?,?,?,?,?,?)";
    	String url="jdbc:mysql://localhost:3306/testapp";
    	String username="root";
    	String password="root";
    	try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);
			PreparedStatement stm =con.prepareStatement(sql);
			stm.setString(1,uname);
			stm.setString(2,lname);
			stm.setString(3,pass);
			stm.setString(4,email);
			stm.setString(5,gender);
			stm.setString(6,dept);
			
			
			int rs= stm.executeUpdate();
			
			if(rs>0) {
				return true;
			}
			//if(rs.next())
				//return true;
			
		}
		catch(Exception ex) {
			//ex.printStackTrace();
			System.out.println("Error:" +ex.getMessage());
		}
 return false;
    }
    
public static void main(String[] args) {
	String uname="shubham";
	String pass="abc";
	
	registerDAO dao= new registerDAO();
	//Boolean var= dao.check(uname,lname,pass,email,gender,dept);
	//System.out.println(var);
}
}   



















//
//
//try{
//	String url="jdbc:mysql://127.0.0.1:3306/university";
//	String uname="root";
//	String pass="root";
//	
//    Class.forName("com.mysql.jdbc.Driver");
//    System.out.println("driver loaded");
//  
//    Connection con=DriverManager.getConnection(url,uname,pass);
//    System.out.println("Connection Established");
//  
//    Statement st = con.createStatement();
//    ResultSet rs = st.executeQuery("select * from student"); //rs contains all of the database contents fetched by query
//    
//    while(rs.next()){
//        System.out.print("sid: "+rs.getInt(1)); //1 specifies column index, can give col name as well
//        System.out.print("|  name: "+rs.getString(2)); //use getString() for varchar datatype
//        System.out.print("|  total_cred: "+ rs.getInt(3));
//        System.out.print("|  depT_name: "+rs.getString(4));
//        System.out.println();
//                
//    }
//    
//}catch(Exception e){
//    System.out.println("error is "+e.getMessage());
//    e.printStackTrace();
//}
