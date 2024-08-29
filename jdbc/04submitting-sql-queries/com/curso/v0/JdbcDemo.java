package com.curso.v0;
import java.sql.*;

/**
 * 
 * @author www.luv2code.com
 *
 */
public class JdbcDemo {

	public static void main(String[] args) {

		String dbUrl = "jdbc:mysql://localhost:3306/demo";
		String user = "jdbcstudent";		
		String pass = "jdbcstudent";

		try ( Connection myConn = DriverManager.getConnection(dbUrl, user, pass);
			Statement myStmt =	myConn.createStatement();
			ResultSet myRs = myStmt.executeQuery("select * from employees")
			) {
			// 4. Process the result set
			while (myRs.next()) {
				System.out.println(myRs.getString("last_name") + ", " + myRs.getString("first_name"));
			}
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
		
	}

}
