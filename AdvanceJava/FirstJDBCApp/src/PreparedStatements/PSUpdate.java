package PreparedStatements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PSUpdate {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String s = "update book set bname=? where book_id=?";
		String name = "ABCD";		
		int id = 1006;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","c##Aditya","aditya");
			PreparedStatement ps=con.prepareStatement(s);
			ps.setString(1, name);			
			ps.setInt(2, id);
			int n = ps.executeUpdate();
			System.out.println("No of Insertions: "+n);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
