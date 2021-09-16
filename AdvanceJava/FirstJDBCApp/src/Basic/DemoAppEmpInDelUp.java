package Basic;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoAppEmpInDelUp {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		try {
			String s = "insert into enfecemployee values (6,'Jonas',5000) ";
//			String s = "delete from enfecemployee where empi=6 ";
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "c##Aditya", "aditya");
			Statement st = con.createStatement(); 
			int n = st.executeUpdate(s);
			ResultSet rs = st.executeQuery("select * from enfecemployee");
			while(rs.next())
			{
				System.out.println("ID: "+ rs.getInt(1) );
				System.out.println("Name: "+ rs.getString(2) );
				System.out.println("Salary: "+ rs.getInt(3) );
			}
			System.out.println("Number of insertions done : "+n);
//			System.out.println("Number of deletions done : "+n);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
