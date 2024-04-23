import java.sql.Connection;
import java.sql.DriverManager;

// this class is used to create a JDBC connection with MySQL Database.

// this is testing.

public class JDBCsqlConnectionTest {
    
    // JDBC and database properties.
    private static final String DB_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_URL ="jdbc:mysql://localhost:3306/team18project";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "root";
    public static void main(String args[]){
    Connection conn = null;
    try{
        //Register the JDBC driver
        Class.forName(DB_DRIVER);
        //Open the connection
        conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
        if(conn != null) {
            System.out.println("Successfully connected.");
        }
        else {
            System.out.println("Failed to connect.");
        }
    }
    catch(Exception e){
        e.printStackTrace();
    }
    }
    // locate the jar file on your computer using classpath command to connect to the database.
}