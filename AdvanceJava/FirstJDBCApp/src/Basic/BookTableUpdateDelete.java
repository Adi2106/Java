package Basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class BookTableUpdateDelete {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","c##Aditya","aditya");
			Statement st = con.createStatement();
			System.out.println("Enter the Book Id you want to update");
			int id = sc.nextInt();
			System.out.println("Enter the updated price");
			int up = sc.nextInt();
			String s = "update book set price="+up+ "where book_id="+id;
			int n = st.executeUpdate(s);
			System.out.println("Number of Updates: " + n);
			
			ResultSet rs= st.executeQuery("select * from book");
			System.out.println(con.getClass().getName());
			System.out.println(st.getClass().getName());
			System.out.println(rs.getClass().getName());
			while(rs.next())
			{
				System.out.println("____________________________________________________________________________________________________________________________________");
				
				System.out.println("Book ID : "+rs.getInt(1)+"\t"+"Book Name : "+rs.getString(2)+"\t"+"Book Price : "+rs.getInt(3)+"\t"+"Book Price : "+rs.getString(4));				
				
				System.out.println("____________________________________________________________________________________________________________________________________");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
