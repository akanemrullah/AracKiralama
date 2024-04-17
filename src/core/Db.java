package core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Db {

    public static Db instance = null;
    private Connection connection;
    private final String DB_URL = "jdbc:postgresql://localhost:5432/rentacar";
    private final String DB_USERNANME = "postgres";
    private final String DB_PASSWORD = "1234";

    private Db() {
        try {
            this.connection = DriverManager.getConnection(this.DB_URL,this.DB_USERNANME,this.DB_PASSWORD);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public Connection getConnection(){
        return connection;
    }

    public static Connection getInstance(){
        try {
            if (instance == null || instance.connection.isClosed()){
                instance = new Db();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return instance.getConnection();
    }
}
