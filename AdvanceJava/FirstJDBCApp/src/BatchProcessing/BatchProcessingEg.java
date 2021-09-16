package BatchProcessing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchProcessingEg {

	public static void main(String[] args) throws SQLException {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","c##Aditya","aditya");
			con.setAutoCommit(false);
			
			String sql="insert into eg values(1,'A')";
			
			Statement st= con.createStatement();
			st.addBatch(sql);
			st.addBatch("insert into eg values(2,'B')");
			st.addBatch("insert into eg values(3,'C')");
			st.addBatch("insert into eg values(4,'D')");
			
			int count[] = st.executeBatch();
			System.out.println("Successfully Inserted "+count.length);
			con.commit();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
