package com.acme._basic1;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class Hi {

  void sayHello() {
    System.out.println("Hello World!!");
  }

  void notCovered() {
    System.out.println("This method is not covered by unit tests.");
  }
  
  
	public static void getDataByFirstnameAndLastname(Connection con, String firstname, String lastname) {
		Statement statement = null;
		try {
			statement = con.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		String queryString = "select * from test_table where first_name= '"+firstname +"'  And last_name= '"+lastname +"'";
		ResultSet rs = null;
		try {
			rs = statement.executeQuery(queryString);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			if (rs != null) {
				while (rs.next()) {
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
