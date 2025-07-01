package org.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionService {

    Connection establishConnection() throws IOException, SQLException {
        Properties properties=new Properties();
        properties.load(new FileInputStream("connections.properties"));
        return DriverManager.getConnection(properties.getProperty("url"), properties.getProperty("username"), properties.getProperty("password"));
    }
}
