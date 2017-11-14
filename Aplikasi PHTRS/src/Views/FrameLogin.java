/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

// <editor-fold defaultstate="collapsed" desc="Import">
import java.sql.*;
import javax.swing.JOptionPane;
//import Connection.ConnectionDB;
// </editor-fold>
/**
 *
 * @author Muhammad Asna Faqih
 */
public class FrameLogin extends javax.swing.JFrame {

    /**
     * Creates new form FrameLogin
     */
    
    // <editor-fold defaultstate="collapsed" desc="Deklarasi Kelas">
    public Connection connect;
    public Statement statemen;
    public FrameMenuAdmin mAdmin;
    public FrameMenuPelapor mPelapor;
    public FrameRegister regis;
    public String akses = " ";
    // </editor-fold>
    
    public FrameLogin() {
        initComponents();
        setTitle("Login");
        String url;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            url = "jdbc:mysql://localhost:3306/karyawan?zeroDateTimeBehavior=convertToNull";
            connect = DriverManager.getConnection(url,"root","");
            statemen = connect.createStatement();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Koneksi Gagal !");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HakAksesLoginButton = new javax.swing.ButtonGroup();
        PanelMenuLogin = new javax.swing.JPanel();
        LabelUserID = new javax.swing.JLabel();
        TextFieldUserID = new javax.swing.JTextField();
        LabelPassword = new javax.swing.JLabel();
        FieldPassword = new javax.swing.JPasswordField();
        IdentitsButton = new javax.swing.JButton();
        ButtonLogin = new javax.swing.JButton();
        RadioButtonAdmin = new javax.swing.JRadioButton();
        RadioButtonPelapor = new javax.swing.JRadioButton();
        PanelViewPHTRS = new javax.swing.JPanel();
        LabelJudul = new javax.swing.JLabel();
        LabelPHTRS = new javax.swing.JLabel();
        LabelApplication = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelMenuLogin.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        LabelUserID.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        LabelUserID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelUserID.setText("Masukkan User ID Anda");

        LabelPassword.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        LabelPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelPassword.setText("Masukkan Kata Sandi Anda");

        IdentitsButton.setText("Register");
        IdentitsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdentitsButtonActionPerformed(evt);
            }
        });

        ButtonLogin.setText("Login");
        ButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLoginActionPerformed(evt);
            }
        });

        HakAksesLoginButton.add(RadioButtonAdmin);
        RadioButtonAdmin.setText("Admin");
        RadioButtonAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonAdminActionPerformed(evt);
            }
        });

        HakAksesLoginButton.add(RadioButtonPelapor);
        RadioButtonPelapor.setText("Pelapor");
        RadioButtonPelapor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonPelaporActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelMenuLoginLayout = new javax.swing.GroupLayout(PanelMenuLogin);
        PanelMenuLogin.setLayout(PanelMenuLoginLayout);
        PanelMenuLoginLayout.setHorizontalGroup(
            PanelMenuLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMenuLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelMenuLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelUserID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TextFieldUserID)
                    .addComponent(LabelPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(FieldPassword)
                    .addGroup(PanelMenuLoginLayout.createSequentialGroup()
                        .addComponent(IdentitsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ButtonLogin))
                    .addGroup(PanelMenuLoginLayout.createSequentialGroup()
                        .addComponent(RadioButtonAdmin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RadioButtonPelapor)))
                .addContainerGap())
        );
        PanelMenuLoginLayout.setVerticalGroup(
            PanelMenuLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelMenuLoginLayout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addGroup(PanelMenuLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RadioButtonAdmin)
                    .addComponent(RadioButtonPelapor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelUserID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextFieldUserID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelMenuLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IdentitsButton)
                    .addComponent(ButtonLogin))
                .addGap(38, 38, 38))
        );

        PanelViewPHTRS.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        LabelJudul.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        LabelJudul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelJudul.setText("Sistem Pelacakan dan Perbaikan Lubang Jalan");

        LabelPHTRS.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        LabelPHTRS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelPHTRS.setText("(PHTRS)");

        LabelApplication.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        LabelApplication.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelApplication.setText("Application");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 284, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 188, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PanelViewPHTRSLayout = new javax.swing.GroupLayout(PanelViewPHTRS);
        PanelViewPHTRS.setLayout(PanelViewPHTRSLayout);
        PanelViewPHTRSLayout.setHorizontalGroup(
            PanelViewPHTRSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelViewPHTRSLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelViewPHTRSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LabelJudul, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                    .addComponent(LabelPHTRS, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LabelApplication, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PanelViewPHTRSLayout.setVerticalGroup(
            PanelViewPHTRSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelViewPHTRSLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelJudul)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelPHTRS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelApplication)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelMenuLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PanelViewPHTRS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PanelViewPHTRS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelMenuLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(518, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLoginActionPerformed
        if(RadioButtonAdmin.isSelected()){
            try{
            String sql = "SELECT * FROM karyawan WHERE ID_Karyawan ='"+TextFieldUserID.getText()+"' "
                         +"AND Password_Karyawan = '"+String.valueOf(FieldPassword.getText())+"'";
            ResultSet rss = statemen.executeQuery(sql);
                if(rss.next()){
                    mAdmin = new FrameMenuAdmin();
                    mAdmin.setVisible(true);
                    this.dispose();
                }else{
                    JOptionPane.showMessageDialog(null, "Maaf Anda belom terdaftar didatabase");
                }
            }catch(Exception l){
                JOptionPane.showMessageDialog(null, "Perikasa Koneksi Database Anda");
            }
        }else if(RadioButtonPelapor.isSelected()){
            try{
            String sql = "SELECT * FROM register WHERE User_ID ='"+TextFieldUserID.getText()+"' "
                         +"AND Password = '"+String.valueOf(FieldPassword.getText())+"'";
            ResultSet rss = statemen.executeQuery(sql);
                if(rss.next()){
                    mPelapor = new FrameMenuPelapor();
                    mPelapor.setVisible(true);
                    this.dispose();
                }else{
                    JOptionPane.showMessageDialog(null, "Maaf Anda belom terdaftar didatabase");
                }
            }catch(Exception l){
                JOptionPane.showMessageDialog(null, "Perikasa Koneksi Database Anda");
            }
        }
    }//GEN-LAST:event_ButtonLoginActionPerformed

    private void IdentitsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdentitsButtonActionPerformed
        if(RadioButtonAdmin.isSelected()){
            JOptionPane.showMessageDialog(null, "Maaf Admin tidak dapat melakukan register ke database");
        }else if(RadioButtonPelapor.isSelected()){
            regis = new FrameRegister();
            regis.setVisible(true);
            this.dispose();
        }
        
    }//GEN-LAST:event_IdentitsButtonActionPerformed

    private void RadioButtonAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioButtonAdminActionPerformed

    private void RadioButtonPelaporActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonPelaporActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioButtonPelaporActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonLogin;
    private javax.swing.JPasswordField FieldPassword;
    private javax.swing.ButtonGroup HakAksesLoginButton;
    private javax.swing.JButton IdentitsButton;
    private javax.swing.JLabel LabelApplication;
    private javax.swing.JLabel LabelJudul;
    private javax.swing.JLabel LabelPHTRS;
    private javax.swing.JLabel LabelPassword;
    private javax.swing.JLabel LabelUserID;
    private javax.swing.JPanel PanelMenuLogin;
    private javax.swing.JPanel PanelViewPHTRS;
    private javax.swing.JRadioButton RadioButtonAdmin;
    private javax.swing.JRadioButton RadioButtonPelapor;
    private javax.swing.JTextField TextFieldUserID;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}