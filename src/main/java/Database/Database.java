package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Database {
    private final String url ="jdbc:postgresql://localhost:5432/postgres";
    Properties properties = new Properties();

    public Connection connect() throws SQLException {//inicialização
        properties.setProperty("name_root", "postgres");
        properties.setProperty("password_root", "aY5:4I6c");

        try(Connection conn = DriverManager.getConnection(url, properties)){
            System.out.println(conn.getMetaData().getDatabaseProductVersion());
        }catch(SQLException e){
            System.out.println("Problema na con");
        }
        return null;
    }

    //input information
    //consult information
    //delete account
    //update account information
}
