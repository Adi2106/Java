package CallableInterface;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class CS2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{				
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","c##Aditya","aditya");
			CallableStatement st = con.prepareCall("call in_EG(?,?)");
			st.setInt(1, 3);
			st.registerOutParameter(2, Types.LONGVARCHAR);
			st.execute();
			System.out.println("Stored Procedure Executed!!");
			System.out.println(st.getString(2));			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
