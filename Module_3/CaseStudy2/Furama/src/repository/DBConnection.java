package repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String USER_NAME="root";
    private static final String PASSWORD="25021999";
    private static final String HOST="localhost";
    private static final String DATABASE="casestudy2";
    private static final String POST="3306";

    private static Connection connection;
public static Connection getConnection(){
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection= DriverManager.getConnection("jdbc:mysql://"+ HOST + ":" + POST + "/" + DATABASE+"?useSSL=false",USER_NAME,PASSWORD);
    } catch (ClassNotFoundException | SQLException e) {
        e.printStackTrace();
    }
    return connection;
}
public static void close(){
    try {
        if(connection!=null){
            connection.close();
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
}

}
