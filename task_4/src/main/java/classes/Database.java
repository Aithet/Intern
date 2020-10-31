package classes;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database implements Connections {

    private static Connection connection = null;
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            connection = DriverManager.getConnection(urlDatabase, userDatabase, passwordDatabase);
        } catch (Exception e) {
            System.out.println(e);
        }
        return connection;
    }
}

