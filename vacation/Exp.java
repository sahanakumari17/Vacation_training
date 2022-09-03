package vacation;
import java.sql.Connection;
import java.util.*;

public class Exp {

	public static void main(String[] args) {
		// TODO Auto-generated method stubtry
		Connection con=null;
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Deliver");
			String url = "jdbc:mysql://localhost:3386/test";
			con = DriveManager.getConnection(url,"root","root");
			System.out.println("connection successful");
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
