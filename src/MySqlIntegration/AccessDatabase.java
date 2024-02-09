package MySqlIntegration;

import sun.awt.X11.XStateProtocol;

import java.sql.*;

public class AccessDatabase {
    public static void main(String[] args) throws SQLException {
        // Url to access the database employees_database
        String url = "jdbc:mysql://127.0.0.1:3306/employees_database";

        // Connecting to the DB using a DriveManager.getConnection and storing in a Connection object
        Connection conn = connectToDB(url);

        // Creating a Statement to execute queries
        Statement statement = conn.createStatement();

        // Executing a simple query
        ResultSet resultSet = statement.executeQuery("SELECT * FROM employees_tbl");

        // We could even use CRUD commands using statement.executeUpdate(sql);
        // Printing all the rows as Strings from a column
        while (resultSet.next()) {
            System.out.println(resultSet.getString("name"));
        }
    }
    public static Connection connectToDB(String url) throws SQLException {
        return DriverManager.getConnection(url, "root", "password123");
}
}

