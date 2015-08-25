package sqlConnection;
import java.sql.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/mydb","root","metadesi");  
			  
			//here mydb is database name, root is username and password  is metadesi
			  
			Statement stmt=con.createStatement();  
			  
			ResultSet rs=stmt.executeQuery("select * from customer");  
			System.out.println("testing");
			  
			while(rs.next())  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4));  
			  
			con.close();  
			  
			}catch(Exception e){ System.out.println(e);}  
			  
	}

}
