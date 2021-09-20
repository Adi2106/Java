package RowSet;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetMetaData {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","c##Aditya","aditya");
		Statement st= con.createStatement();
		ResultSet rs= st.executeQuery("select * from employees");
		java.sql.ResultSetMetaData rsmd = rs.getMetaData();
		System.out.println("rsmd.getColumnCount() "+rsmd.getColumnCount());
		System.out.println("rsmd.getColumnName(1) "+rsmd.getColumnName(1));
		System.out.println("rsmd.getColumnType(1) "+rsmd.getColumnType(1));
		System.out.println("rsmd.getColumnTypeName(1) "+rsmd.getColumnTypeName(1));
		System.out.println("rsmd.getColumnClassName(1) "+rsmd.getColumnClassName(1));

		System.out.println("rsmd.getColumnDisplaySize "+rsmd.getColumnDisplaySize(1));
		
		
	}

}
