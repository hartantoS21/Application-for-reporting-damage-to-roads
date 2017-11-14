/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

// <editor-fold defaultstate="collapsed" desc="Import">
import java.sql.*;
import javax.swing.JOptionPane;
import Views.FrameLogin;
// </editor-fold>

/**
 *
 * @author Muhammad Asna Faqih
 */
public class Run {

    /**
     * @param args the command line arguments
     */
    
    // <editor-fold defaultstate="collapsed" desc="Deklarasi Kelas">
    public Connection connect;
    public Statement statemen;
    public ResultSet rss;
    public String sql="";
    public FrameLogin lgn;
    // </editor-fold>
    
    
    public static void main(String[] args) {
        FrameLogin runApp= new FrameLogin();
        runApp.setVisible(true);
    }
    
}
