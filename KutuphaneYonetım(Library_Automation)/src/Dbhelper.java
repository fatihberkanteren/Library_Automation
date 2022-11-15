
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Dbhelper {
    Connection conn = null;
    public static Connection kys_db_kullanıcılar(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection
        ("jdbc:sqlite:C:\\Users\\Lenovo\\OneDrive\\Belgeler\\NetBeansProjects\\KutuphaneYonetım\\\\kullanıcılar.sqlite");
            return conn;
        }catch(SQLException | ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Hata : "+ex);
        }
        return null;
    }
    public static Connection kys_db_ogrencıler(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection
        ("jdbc:sqlite:C:\\Users\\Lenovo\\OneDrive\\Belgeler\\NetBeansProjects\\KutuphaneYonetım\\\\öğrenciler.sqlite");
            return conn;
        }catch(SQLException | ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Hata : "+ex);
        }
        return null;
    }
    public static Connection kys_db_kitaplar(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection
        ("jdbc:sqlite:C:\\Users\\Lenovo\\OneDrive\\Belgeler\\NetBeansProjects\\KutuphaneYonetım\\\\kitaplar.sqlite");
            return conn;
        }catch(SQLException | ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Hata : "+ex);
        }
        return null;
    }
}
