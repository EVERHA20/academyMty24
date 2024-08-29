package com.curso.v0;
import java.sql.*;

/**
 * 
 * @author www.luv2code.com
 *
 */
public class JdbcTestV1 {

	public static void main(String[] args) {
		
		System.out.println("***Try With Resource Final***");
		
		try (
			 Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "jdbcstudent" , "jdbcstudent");
			 Statement myStmt =	myConn.createStatement();
			 ResultSet myRs = myStmt.executeQuery("select * from employees")
			) {
			
			System.out.println("Database connection successful!\n");
			
			// 4. Process the result set
			while (myRs.next()) {
				System.out.println(myRs.getString("last_name") + ", " + myRs.getString("email"));
			}
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
		
	}

}
