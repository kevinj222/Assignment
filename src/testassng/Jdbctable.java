package testassng;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbctable 
{
  public static void main(String[] args) {
    // Set up database connection parameters
    String url = "jdbc:mysql://localhost:3306/train";
    String username = "root";
    String password = "pass@word1";
   
    try {
      // Create a connection to the database
      Connection conn = DriverManager.getConnection(url, username, password);

      // Create a statement object
     Statement stmt = conn.createStatement();

      // Execute the CREATE TABLE statement
      String sql = "CREATE TABLE testing ("
                 + "Name varchar(255),"
                 + "ID varchar(255),"
                 + "phno varchar(255),"
                 + "address VARCHAR(255),"
                 + "Email varchar(255),"
                 + "Location varchar(255),"
                 +	"Salary int"
                 + ")";
      stmt.executeUpdate(sql);

      // Close the statement and connection objects
      stmt.close();
     
     java.sql.Statement stmt1=(java.sql.Statement) conn.createStatement();
      String Sql="INSERT INTO TESTING VALUES('Sasi','245110',7014356423,'Ernakulam','sasirocks123@G.com','Lakoor', 234561)";
      stmt1.executeUpdate(Sql);
      Sql="INSERT INTO TESTING VALUES('Abu','245108',7014356543,'Anthrolli','aburocks123@G.com','Edapally', 874564)";
      stmt1.executeUpdate(Sql);
      Sql="INSERT INTO TESTING VALUES('Sonar','240987',7014367890,'Sonarqbe','sonarocks123@G.com','Trivandrum',934534)";
      stmt1.executeUpdate(Sql);
      Sql="INSERT INTO TESTING VALUES('Aniruth','244356',6578934212,'GMart','G2@G.com','MyG',764534)";
      stmt1.executeUpdate(Sql);
      System.out.println("Employee table created successfully!");
      conn.close();
    } catch (SQLException e) {
      e.printStackTrace();
    }
    
  }
}