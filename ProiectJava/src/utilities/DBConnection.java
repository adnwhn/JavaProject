package utilities;

import java.sql.*;

public class DBConnection {
    private static Connection connection;

    private DBConnection(){}

    public static Connection getInstance() throws SQLException {
        if (connection == null){
            String jdbcURL = "jdbc:mysql://localhost:3306/project";
            String username = "root";
            String password = "password";
            connection = DriverManager.getConnection(jdbcURL, username, password);
        }
        return connection;
    }

}
