/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBHandlers;
/*
    First we need to add mysql drivers
    right click on libraries in file structure
    click on add jar/folder
    go to file where you have all your java drivers
    for net beans C:\Program Files\NetBeans 8.2\ide\modules\ext\mysql-connector-java-5.1.23-bin.jar
    select mysql-connector-java
    open
    jar file will be added to libraries folder
    if error
        download driver from  https://dev.mysql.com/downloads/connector/j/8.0.html
    
*/
import java.sql.*;

/**
 *
 * @author Mandar
 */
public class updateTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection con;
        Statement st;
        ResultSet rs;
        
        try{
            
            //load driver for database
            //Class.forName("com.mysql.jdbc.Driver");
            //add cj if latest version 
            Class.forName("com.mysql.cj.jdbc.Driver");
            //establish the connection
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","root"); //server:port:database, , username, password
            //use following if ssl warning
            //con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/university?autoReconnect=true&useSSL=false","root","root");

            //execute queries we need statement obj
            st = con.createStatement();
            rs = st.executeQuery("select * from instructor"); //rs contains all of the database contents fetched by query
            
            while(rs.next()){
                System.out.print("sid: "+rs.getInt(1)); //1 specifies column index, can give col name as well
                System.out.print("|  name: "+rs.getString(2)); //use getString() for varchar datatype
                System.out.print("|  depT_name: "+rs.getString(3));
                System.out.print("|  total_cred: "+ rs.getInt(4));
                System.out.println();
                        
            }
            
        }catch(Exception e){
            System.out.println("error is "+e.getMessage());
            e.printStackTrace();
        }
    }
    
}
