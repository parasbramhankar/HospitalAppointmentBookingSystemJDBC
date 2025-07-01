package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionDetails {

    public static Connection establishConnection() throws IOException, SQLException {
        Properties properties=new Properties();
        properties.load(Files.newInputStream(Paths.get("connections.properties")));
        return DriverManager.getConnection(properties.getProperty("url"), properties.getProperty("username"), properties.getProperty("password"));
    }
}
