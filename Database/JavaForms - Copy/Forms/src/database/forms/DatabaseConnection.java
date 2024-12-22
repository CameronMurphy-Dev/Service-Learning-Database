package database.forms;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	public static Connection connectToDatabase() {
		try {
            // JDBC URL for Microsoft Access
            String url = "jdbc:ucanaccess:C:\\Users\\camer\\Documents\\Service-Learning-Database\\Database\\MurphyFinal.accdb";
            return DriverManager.getConnection(url);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
