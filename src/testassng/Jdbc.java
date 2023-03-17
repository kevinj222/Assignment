package testassng;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class Jdbc 
{
	public static void main(String args[])
	{
	try{  
		 
		Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/train","root","pass@word1");  
		//here sonoo is database name, root is username and password  
		Statement stmt=con.createStatement();  
		ResultSet rs=stmt.executeQuery("select * from pain");  
		while(rs.next())  
		System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getString(5)+"  "+rs.getString(6)+"  "+rs.getInt(7));  
		con.close();  
		}catch(Exception e){ System.out.println(e);}  
		
	} 
}
