package PreparedStatements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PSInsert {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String s = "insert into book values(?,?,?,?)";
		int id = 1006;
		String name = "ABC";
		int price = 213;
		Object c = 1007;
		String a="XYZ";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","c##Aditya","aditya");
			PreparedStatement ps=con.prepareStatement(s);
			ps.setObject(1, c);
			ps.setString(2, name);
			ps.setInt(3, price);
			ps.setString(4, a);
			int n = ps.executeUpdate();
			System.out.println("No of Insertions: "+n);
			ResultSet rs = ps.executeQuery("select * from book");
			while(rs.next())
			{
				System.out.println("Book ID : "+rs.getObject(1)+"\t"+"Book Name : "+rs.getString(2)+"\t"+"Book Price : "+rs.getInt(3)+"\t"+"Book Author : "+rs.getString(4));
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
