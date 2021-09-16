package Basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MenuDrivenBookOperations {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","c##Aditya","aditya");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from book");
			while(rs.next())
			{
				System.out.println("Book ID : "+rs.getInt(1)+"\t"+"Book Name : "+rs.getString(2)+"\t"+"Book Price : "+rs.getInt(3)+"\t"+"Book Author : "+rs.getString(4));
				System.out.println("____________________________________________________________________________________________________________________________________");
			}
		
		System.out.println("What Operation you want to Perform?\n1)Insertion\n2)Updation\n3)Deletion");
		String choice=sc.next();
		switch(choice)
		{
			case "1":
			case "Insertion":
			case "insert":
				String s = "insert into book values(?,?,?,?)";
				
				PreparedStatement ps = con.prepareStatement(s);
				System.out.println("Enter Book Id: ");
				int id = sc.nextInt();
				System.out.println("Enter Book Name: ");
				String nm = sc.next();
				System.out.println("Enter Book Price: ");
				int pri = sc.nextInt();
				System.out.println("Enter Book Author: ");
				String aut = sc.nextLine();
				String t = sc.next();
				ps.setInt(1, id);
				ps.setString(2,nm);
				ps.setInt(3,pri);
				ps.setString(4, t);
				
				int n = ps.executeUpdate();
				System.out.println("Insertion Done Successfully");
				rs = st.executeQuery("select * from book");
				while(rs.next())
				{
					System.out.println("Book ID : "+rs.getInt(1)+"\t"+"Book Name : "+rs.getString(2)+"\t"+"Book Price : "+rs.getInt(3)+"\t"+"Book Author: "+rs.getString(4));
					System.out.println("____________________________________________________________________________________________________________________________________");
				}
				break;
			case "2":
			case "Update":
			case "Updation":
				String s1 = "update book set price=? where book_id=?";
				
				PreparedStatement ps1 = con.prepareStatement(s1);
				System.out.println("Enter Book Id: ");
				int uid = sc.nextInt();				
				System.out.println("Enter Updated Book Price: ");
				int upPri = sc.nextInt();
				
				ps1.setInt(1,upPri);
				ps1.setInt(2, uid);				
				int n2 = ps1.executeUpdate();
				System.out.println("Updation Done Successfully");
				rs = st.executeQuery("select * from book");
				while(rs.next())
				{
					System.out.println("Book ID : "+rs.getInt(1)+"\t"+"Book Name : "+rs.getString(2)+"\t"+"Book Price : "+rs.getInt(3)+"\t"+"Book Author : "+rs.getString(4));
					System.out.println("____________________________________________________________________________________________________________________________________");
				}
				break;
			case "3":
			case "Deletion":
			case "Delete":
				String s2 = "delete from book where book_id=?";
				
				PreparedStatement ps2 = con.prepareStatement(s2);
				System.out.println("Enter Book Id: ");
				int idd = sc.nextInt();				
								
				ps2.setInt(1, idd);				
				int n3 = ps2.executeUpdate();
				System.out.println("Deletion Done Successfully");
				rs = st.executeQuery("select * from book");
				while(rs.next())
				{
					System.out.println("Book ID : "+rs.getInt(1)+"\t"+"Book Name : "+rs.getString(2)+"\t"+"Book Price : "+rs.getInt(3)+"\t"+"Book Author : "+rs.getString(4));
					System.out.println("____________________________________________________________________________________________________________________________________");
				}
				break;
			default:
				System.out.print("Invalid Choice");
		}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
