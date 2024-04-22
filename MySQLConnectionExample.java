// import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
// import java.sql.ResultSet;
import java.sql.SQLException;

public class MySQLConnectionExample {
    public static void main(String[] args) {
        // MySQL connection parameters
        String url = "jdbc:mysql://localhost:3306/  ";
        String username = "root";
        String password = "root";

        // Establishing the connection
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("Connected to the database!");

            // You can execute SQL queries here
            // For example:
            // Statement statement = connection.createStatement();
            // ResultSet resultSet = statement.executeQuery("SELECT * FROM mytable");
            

        } catch (SQLException e) {
            System.err.println("Error connecting to the database: " + e.getMessage());
        }
    }
}
