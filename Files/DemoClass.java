import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.*;
public class DemoClass 
{
	
	public static void main(String[] args) throws Exception
	{
		try {
		String url="jdbc:mysql://localhost/college";
		String uname="root";
		String pass="";
		String querry="select name from student where id=1";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(querry);
		
		rs.next();
		String name=rs.getString("name");
		System.out.println(name);	
		
		st.close();
		con.close();
		}
		catch(SQLException e) {
			System.out.println("SQL error");
		}
		catch(Exception e) {
			System.out.println("other errors");
		}
	}

}
