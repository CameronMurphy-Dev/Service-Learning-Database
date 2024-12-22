package Murphy.forms;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseTest {
	public static void fetchTableData() {
        Connection conn = DatabaseConnection.getConnection();

        if (conn != null) {
            try (Statement stmt = conn.createStatement()) {
                String query = "SELECT * FROM Item"; 
                ResultSet rs = stmt.executeQuery(query);

                // Process the ResultSet
                while (rs.next()) {
                    // Replace "ColumnName" with actual column names from your table
                    String columnData = rs.getString("ItemName");
                    System.out.println("Column Data: " + columnData);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Connection is null. Cannot fetch data.");
        }
	}
}
