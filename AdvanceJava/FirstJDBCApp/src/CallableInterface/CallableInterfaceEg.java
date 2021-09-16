package CallableInterface;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CallableInterfaceEg {

	public static void main(String[] args) throws SQLException 
	{	
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","c##Aditya","aditya");
			CallableStatement st = con.prepareCall("call insert_eg()");
			st.execute();
			System.out.println("Stored Procedure Successfully Inserted!");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
