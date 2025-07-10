package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/cafe_db";
    private static final String USER = "root";         // ✅ your MySQL username
    private static final String PASS = "070809";       // ✅ your MySQL password

    public static Connection getConnection() throws SQLException {
        try {
            // ✅ Register the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace(); // optional: log or rethrow
        }

        return DriverManager.getConnection(URL, USER, PASS);
    }
}
5
