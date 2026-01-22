import java.sql.*;
import java.util.*;

public class prg10 {
    public static void main(String[] args) throws Exception {

        Connection c = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/lab", "root", "");
        Scanner sc = new Scanner(System.in);

        // CREATE
        String createSQL = "CREATE TABLE IF NOT EXISTS users (id INT PRIMARY KEY, name VARCHAR(50))";
        Statement s = c.createStatement();
        s.execute(createSQL);

        // INSERT (Create)
        String insertSQL = "INSERT INTO users VALUES (?, ?)";
        PreparedStatement pst = c.prepareStatement(insertSQL);
        System.out.print("Enter id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        pst.setInt(1, id);
        pst.setString(2, name);
        pst.executeUpdate();
        System.out.println("Inserted successfully");

        // READ
        ResultSet rs = s.executeQuery("SELECT * FROM users"); 
        while (rs.next()) System.out.println("Read: " + rs.getString("name"));
        // UPDATE
        String updateSQL = "UPDATE users SET name=? WHERE id=?";
        pst = c.prepareStatement(updateSQL);
        System.out.print("Enter new name: ");
        String newName = sc.nextLine();
        pst.setString(1, newName);
        pst.setInt(2, id);
        pst.executeUpdate();
        System.out.println("Updated successfully");

        // DELETE
        String deleteSQL = "DELETE FROM users WHERE id=?";
        pst = c.prepareStatement(deleteSQL);
        pst.setInt(1, id);
        pst.executeUpdate();
        System.out.println("Deleted successfully");

        c.close();
    }
}
