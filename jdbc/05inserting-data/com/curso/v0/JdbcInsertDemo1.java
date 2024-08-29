package com.curso.v0;
import java.sql.*;

/**
 * 
 * @author www.luv2code.com
 *
 */
public class JdbcInsertDemo1 {

	public static void main(String[] args) throws SQLException {
		
		String dbUrl = "jdbc:mysql://localhost:3306/demo";
		String user = "jdbcstudent";		
		String pass = "jdbcstudent";

		try (Connection myConn = DriverManager.getConnection(dbUrl, user, pass); 
			 Statement myStmt = myConn.createStatement();
			){
			
			System.out.println("Inserting a new employee to database\n");
			
			String cadenaInsert = """
					insert into employees 
					(last_name, first_name, email, department, salary)  
					values 
					('Wright', 'Eric', 'eric.wright@foo.com', 'HR', 33000.00)
					""";
			
			int rowsAffected = myStmt.executeUpdate(cadenaInsert);
			
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
		
	}

}
