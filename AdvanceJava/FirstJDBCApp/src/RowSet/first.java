package RowSet;

import java.sql.SQLException;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class first {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			JdbcRowSet rs = RowSetProvider.newFactory().createJdbcRowSet();
			
			rs.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
			rs.setUsername("c##Aditya");
			rs.setPassword("aditya");
			rs.setCommand("select * from enfecemployee");
			rs.execute();
			
			System.out.println("Forward Direction!");
			while(rs.next())
			{
				System.out.println("Id: "+rs.getInt(1)+"\t"+" Name: "+rs.getString(2)+"\t"+" Salary: "+rs.getInt(3));
				System.out.println("``````````````````````````````````````````````````````````````````````");
			}
			
			System.out.println("Reverse Direction!");
			while(rs.previous())
			{
				System.out.println("Id: "+rs.getInt(1)+"\t"+" Name: "+rs.getString(2)+"\t"+" Salary: "+rs.getInt(3));
				System.out.println("``````````````````````````````````````````````````````````````````````");
			}
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
