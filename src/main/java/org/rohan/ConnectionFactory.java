package org.rohan;

import java.rmi.ConnectIOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ConnectionFactory {
    private static Connection connection = null;
    private ConnectionFactory () {

    }

    public static Connection getConnection() {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("dbConfig");
        String  url = resourceBundle.getString("url"),
                username = resourceBundle.getString("username"),
                password = resourceBundle.getString("password") ;

        try {
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        return connection;
    }

}
