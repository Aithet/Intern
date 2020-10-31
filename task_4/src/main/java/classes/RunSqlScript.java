package classes;

import java.sql.Connection;

public class RunSqlScript extends Database {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection con = getConnection()) {

                System.out.println("Connection to DB succesfull!");
            }
        } catch (Exception ex) {
            System.out.println("Connection failed...");

            System.out.println(ex);
        }
    }
}
