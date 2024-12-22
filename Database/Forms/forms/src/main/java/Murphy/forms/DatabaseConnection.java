package Murphy.forms;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	private static Connection connection;
	
	@SuppressWarnings("exports")
	public static Connection getConnection() {
        if (connection == null) {
            try {
                String databaseUrl = "jdbc:ucanaccess://C:/Users/camer/Documents/Service-Learning-Database/Database/MurphyFinal.accdb";
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
