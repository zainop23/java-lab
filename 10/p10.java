import java.sql.*;
import java.util.*;

public class p10{
	public static void main(String[] args)throws Exception{
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/lab", "root", "");
		Statement s = c.createStatement();
		Scanner sc = new Scanner(System.in);
		
		// CREATE
		s.execute("create table if not exists zain(id int, name varchar(250))");
		
		//INSERT
		String insertQuery = "insert into zain values (?,?)";
		PreparedStatement pst = c.prepareStatement(insertQuery);
		System.out.print("Enter id: ");
		int id = Integer.parseInt(sc.nextLine());
		System.out.print("Enter name: ");
		String name = sc.nextLine();
		pst.setInt(1, id);
		pst.setString(2, name);
		pst.executeUpdate();
		
		//READ
		ResultSet rs = s.executeQuery("select * from zain");
		while(rs.next()) System.out.println("Id: " + rs.getInt("id") + " Name: " + rs.getString("name"));
		
		//UPDATE
		String updateQuery = "update zain set name=? where id=?";
		System.out.print("Enter new name: ");
		String newName = sc.nextLine();
		pst = c.prepareStatement(updateQuery);
		pst.setString(1, newName);
		pst.setInt(2, 1);
		pst.executeUpdate();
		
		//DELETE
		String deleteQuery = "delete from zain where id=?";
		pst = c.prepareStatement(deleteQuery);
		pst.setInt(1, id);
		pst.executeUpdate();
	}
}