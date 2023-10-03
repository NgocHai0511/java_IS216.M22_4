package ConnectDB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author haita
 */
public class OracleConnection {
    public static Connection getOracleConnection() throws ClassNotFoundException,SQLException{
        String hostname="localhost";
        String sid="orcl";
        String userName="C##DIENNGAM1";
        String password ="DIENNGAM1";
        Class.forName("oracle.jdbc.driver.OracleDriver");
        String connectionURL="jdbc:oracle:thin:@"+hostname+":1521:"+sid;
        Connection conn=DriverManager.getConnection(connectionURL,userName,password);
        return conn;  
    }  
}



