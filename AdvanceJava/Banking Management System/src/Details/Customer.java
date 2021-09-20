package Details;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class Customer 
{
	String name,email;
	long mobNo,adhaarNo,AccNo;	
	public Customer(String name, long accNo, long adhaarNo, long mobNo, String email )
	{
		super();
		this.name = name;
		this.AccNo = accNo;
		this.adhaarNo = adhaarNo;
		this.mobNo = mobNo;
		this.email = email;
	}
	public static void main(String[] args) throws SQLException, ClassNotFoundException 
	{
		Scanner sc = new Scanner(System.in);				
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "c##Aditya","aditya");
		System.out.println("Enter you name");
		String name = sc.next();		
		PreparedStatement ps = con.prepareStatement("select * from banking_customer where name=?");		
		ps.setString(1, name);
		ResultSet rs = ps.executeQuery();
		long acn=0;		
		System.out.println();
		System.out.println("$$$Customer Details$$$");
		while(rs.next())
		{
			System.out.println("________________________________");			
			System.out.println("Customer Name:\t" + rs.getString(1));
			acn=rs.getLong(2);
			System.out.println("Account Number:\t" + acn );
			System.out.println("Adhaar Number:\t" + rs.getLong(3));
			System.out.println("Mobile Number:\t" + rs.getLong(4));
			System.out.println("Customer Email:\t" + rs.getString(5));			
			System.out.println("________________________________");
		}	
		System.out.println();
		System.out.println();
		System.out.println("$$$Bank Details$$$");
		PreparedStatement bps = con.prepareStatement("select * from bank_details where accno=?");
		bps.setLong(1, acn);
		ResultSet rss = bps.executeQuery();
		while(rss.next())
		{
			System.out.println("________________________________");						
			System.out.println("Account Number:\t" + rss.getLong(1));
			System.out.println("IFSC:\t" + rss.getString(2));				
			System.out.println("Bank Balance:\t" + rss.getInt(3));
			System.out.println("Account Holder Name:\t" + rss.getString(4));			
			System.out.println("_________________________________");
		}				
	}
}
		


