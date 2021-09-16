package Basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BookTable {

	public static void main(String[] args) throws SQLException 
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "c##Aditya","aditya");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("create table Book(book_id number(4), bname varchar2(40), price number(5), author varchar2(25) )");
			
			
			String s1 = "insert into Book values(1001,'Jungle Book',250,'Ruskin Bond') ";
			String s2 = "insert into Book values(1002,'Harry Potter 1',450,'J K Rowling') ";
			String s3 = "insert into Book values(1003,'Design Analysis of Algorithms',1350,'Coreman') ";
			String s4 = "insert into Book values(1004,'Java',1150,'Xavier Pinto') ";
			String s5 = "insert into Book values(1005,'Mathematics',2050,'RS Agarwal') ";
			rs= st.executeQuery(s1);
			rs= st.executeQuery(s2);
			rs= st.executeQuery(s3);
			rs= st.executeQuery(s4);
			rs= st.executeQuery(s5);
			rs= st.executeQuery("select * from Book");
			while(rs.next())
			{
				System.out.println("________________________________");
				
				System.out.println("Book Id: " + rs.getInt(1));
				System.out.println("Book Name: " + rs.getString(2));
				System.out.println("Book Price: " + rs.getInt(3));
				System.out.println("Book Author: " + rs.getString(4));
				
				System.out.println("________________________________");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
