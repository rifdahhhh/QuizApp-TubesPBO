
package Project;
import java.sql.*;
/**
 *
 * @author rifdahhr
 */
public class db_quizzapp {
    public static Connection koneksi;
    public static Connection konfigDB()throws SQLException {
        try {
            String url = "jdbc:mysql://localhost/db_quizapp";
            String user = "root";
            String pass = "";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            koneksi = DriverManager.getConnection(url, user, pass);
            
        } catch (Exception e) {
        }
        return koneksi;
    }
    
    public static void main(String[] args) throws SQLException {
        Connection C = db_quizzapp.konfigDB();
    }
}
