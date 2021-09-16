package PreparedStatements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PSBasic {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String s = "select * from enfecemployee where empi=?";
		int x=5;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","c##Aditya","aditya");
			PreparedStatement ps=con.prepareStatement(s);
			ps.setInt(1, x);
			
			int n = ps.executeUpdate();
			System.out.println("Successfully Executed");
			ResultSet rs = ps.executeQuery();
			if(rs.next())
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
