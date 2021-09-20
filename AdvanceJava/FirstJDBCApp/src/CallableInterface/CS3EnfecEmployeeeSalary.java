package CallableInterface;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

public class CS3EnfecEmployeeeSalary {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","c##Aditya","aditya");
		CallableStatement cst = con.prepareCall("call enfec(?,?)");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter salary");
		int sal=sc.nextInt();
		cst.setInt(1, sal);
		cst.registerOutParameter(2, Types.LONGVARCHAR);
		cst.execute();
//		System.out.println("Stored Procedure Executed!!");
		System.out.println("Entered Salary Belongs to Enmployee : "+cst.getString(2));
	}

}
