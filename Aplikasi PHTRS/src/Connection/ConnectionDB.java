package Connection;

// <editor-fold defaultstate="collapsed" desc="Import">
import java.sql.*;
import javax.swing.JOptionPane;
import com.mysql.jdbc.Connection;
// </editor-fold>

public class ConnectionDB {
    // <editor-fold defaultstate="collapsed" desc="Deklarasi Kelas">
    public Connection connect;
    public Statement statement;
    // </editor-fold>
    public ConnectionDB(){
        String url;
        try {
jdbc:mysql://localhost:3306/karyawan?zeroDateTimeBehavior=convertToNull            Class.forName("com.mysql.jdbc.Driver");
            url = "";
            connect = (Connection) DriverManager.getConnection(url, "root", "");
            statement=connect.createStatement();    
        }catch (Exception Ex){
            JOptionPane.showMessageDialog(null, "Koneksi Gagal!");
        }
    }
    public void connect(){
        String url;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            url = "jdbc:mysql://localhost:3306/karyawan?zeroDateTimeBehavior=convertToNull";
            connect = (Connection) DriverManager.getConnection(url, "root", "");
            statement=connect.createStatement();    
        }catch (Exception Ex){
            JOptionPane.showMessageDialog(null, "Koneksi Gagal!");
        }
    }
}