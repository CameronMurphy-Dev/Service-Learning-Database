package Murphy.forms;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	private static Connection connection;
	
	public static Connection getConnection() {
        if (connection == null) {
            try {
                // Specify the path to your Access database file (.accdb or .mdb)
                String databaseUrl = "jdbc:ucanaccess:C:\\Users\\camer\\Documents\\Service-Learning-Database\\Database\\MurphyFinal.accdb";
                connection = DriverManager.getConnection(databaseUrl);
                System.out.println("Database connection successful.");
            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("Database connection failed.");
            }
        }
        return connection; 
    }
}
