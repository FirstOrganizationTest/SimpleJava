package com.acme._basic1;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.crypto.Cipher;

class Hi {

  void sayHello() {
    System.out.println("Hello World!!");
  }

  void notCovered() {
    System.out.println("This method is not covered by unit tests.");
  }
	
		public void ciphers() {
try {
	Cipher cx = Cipher.getInstance("AES");      // Noncompliant: by default ECB mode is chosen
	Cipher cx1=Cipher.getInstance("AES/ECB/NoPadding");     // Noncompliant: ECB doesn't provide serious message confidentiality

	Cipher cx2=Cipher.getInstance("AES/CBC/PKCS5Padding"); // Noncompliant: Vulnerable to Padding Oracle attacks

	Cipher cx3 = Cipher.getInstance("RSA/None/NoPadding"); // Noncompliant: RSA without OAEP padding scheme is not recommended
}catch (Exception e) {
	
}
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
