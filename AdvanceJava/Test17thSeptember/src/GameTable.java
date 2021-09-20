
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class GameTable {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","c##Aditya","aditya");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from game");
			while(rs.next())
			{
				System.out.println("Game ID : "+rs.getInt(1)+"\t"+"Game Name : "+rs.getString(2)+"\t"+"Number Of Players : "+rs.getInt(3));
				System.out.println("_______________________________________________________________________________________________________");
			}		
		System.out.println("What Operation you want to Perform?\n1)Insertion\n2)Updation\n3)Deletion");
		String choice=sc.next();
		switch(choice)
		{
			case "1":
			case "Insertion":
			case "insert":
				String s = "insert into game values(?,?,?)";
				
				PreparedStatement ps = con.prepareStatement(s);
				System.out.println("Enter Game Id: ");
				int id = sc.nextInt();
				System.out.println("Enter Game Name: ");
				String nm = sc.next();
				System.out.println("Enter Number of Players: ");
				int pri = sc.nextInt();				
				ps.setInt(1, id);
				ps.setString(2,nm);
				ps.setInt(3,pri);				
				
				int n = ps.executeUpdate();
				System.out.println("Insertion Done Successfully");
				rs = st.executeQuery("select * from game");
				while(rs.next())
				{
					System.out.println("Game ID : "+rs.getInt(1)+"\t"+"Game Name : "+rs.getString(2)+"\t"+"Number Of Players : "+rs.getInt(3));
					System.out.println("______________________________________________________________________________________________________");
				}
				break;
			case "2":
			case "Update":
			case "Updation":
				String s1 = "update game set no_of_players=? where game_id=?";
				
				PreparedStatement ps1 = con.prepareStatement(s1);
				System.out.println("Enter Game Id: ");
				int uid = sc.nextInt();				
				System.out.println("Enter Updated No. Of Players: ");
				int upPri = sc.nextInt();
				
				ps1.setInt(1,upPri);
				ps1.setInt(2, uid);				
				int n2 = ps1.executeUpdate();
				System.out.println("Updation Done Successfully");
				rs = st.executeQuery("select * from game");
				while(rs.next())
				{
					System.out.println("Game ID : "+rs.getInt(1)+"\t"+"Game Name : "+rs.getString(2)+"\t"+"Number Of Players : "+rs.getInt(3));
					System.out.println("______________________________________________________________________________________________________");
				}
				break;
			case "3":
			case "Deletion":
			case "Delete":
				String s2 = "delete from game where game_id=?";
				
				PreparedStatement ps2 = con.prepareStatement(s2);
				System.out.println("Enter Game Id: ");
				int idd = sc.nextInt();				
								
				ps2.setInt(1, idd);				
				int n3 = ps2.executeUpdate();
				System.out.println("Deletion Done Successfully");
				rs = st.executeQuery("select * from game");
				while(rs.next())
				{
					System.out.println("Game ID : "+rs.getInt(1)+"\t"+"Game Name : "+rs.getString(2)+"\t"+"Number Of Players : "+rs.getInt(3));
					System.out.println("______________________________________________________________________________________________________");
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
