import java.sql.*;

public class prg10 {
    public static void main(String[] args) throws Exception {
        // Updated for XAMPP: empty password
        try (Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "");
             Statement s = c.createStatement()) {

            s.execute("CREATE TABLE IF NOT EXISTS users (id INT, name VARCHAR(50))");
            s.executeUpdate("INSERT INTO users VALUES (1, 'Alice')");
            System.out.println("Inserted Alice");

            ResultSet rs = s.executeQuery("SELECT * FROM users");
            while (rs.next()) System.out.println("Read: " + rs.getString("name"));

            s.executeUpdate("UPDATE users SET name = 'Bob' WHERE id = 1");
            System.out.println("Updated Alice to Bob");

            s.executeUpdate("DELETE FROM users WHERE id = 1");
            System.out.println("Deleted Bob");
        }
    }
}