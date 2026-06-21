import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	public static Connection getConnection() {
		Connection conn = null;

		try {
            Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/studentdb";
			String user = "root";
			String password = "Sudiksha_25";

			conn = DriverManager.getConnection(url, user, password);
			System.out.println("Database Connected Successfully!");

		} catch (Exception e) {
			System.out.println("Connection Failed: " + e.getMessage());
		}

		return conn;
	}
}

