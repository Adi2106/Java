package Basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoAppEmp {

	public static void main(String[] args) throws SQLException  {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","c##Aditya","aditya");
			
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from employees fetch first 10 rows only");
			System.out.println(" Employee Details ");
			while(rs.next())
			{
				System.out.println("_______________________________");
				System.out.println("Employee ID : " + rs.getInt(1));
				System.out.println("First Name : " + rs.getString(2));
				System.out.println("Last Name : " + rs.getString(3));
				
				
				System.out.println("_______________________________");
				
			}
			
	
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
