package PreparedStatements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PSDelete {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String s = "delete from book where book_id=?";
		int id = 1006;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","c##Aditya","aditya");
			PreparedStatement ps=con.prepareStatement(s);
			ps.setInt(1, id);
			
			int n = ps.executeUpdate();
			System.out.println("No of Deletions: "+n);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
