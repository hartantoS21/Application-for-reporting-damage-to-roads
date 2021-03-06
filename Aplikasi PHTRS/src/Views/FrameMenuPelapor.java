/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

/**
 *
 * @author Muhammad Asna Faqih
 */

// <editor-fold defaultstate="collapsed" desc="Import">
import Views.FrameLaporan;
// </editor-fold>

public class FrameMenuPelapor extends javax.swing.JFrame {

    /**
     * Creates new form FrameMenuPelapor
     */
    
    // <editor-fold defaultstate="collapsed" desc="Deklarasi Kelas">
    public FrameLaporan lapor;
    // </editor-fold>
    
    public FrameMenuPelapor() {
        initComponents();
        setTitle("Menu Pelapor");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPelapor = new javax.swing.JPanel();
        LabelPelapor = new javax.swing.JLabel();
        PanelMeenuPelapor = new javax.swing.JPanel();
        ButtonBuatLaporan = new javax.swing.JButton();
        ButtonLihatProgres = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelPelapor.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        LabelPelapor.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        LabelPelapor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelPelapor.setText("Menu Pelapor");

        PanelMeenuPelapor.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        ButtonBuatLaporan.setText("Buat Laporan");
        ButtonBuatLaporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBuatLaporanActionPerformed(evt);
            }
        });

        ButtonLihatProgres.setText("Lihat Progres");
        ButtonLihatProgres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLihatProgresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelMeenuPelaporLayout = new javax.swing.GroupLayout(PanelMeenuPelapor);
        PanelMeenuPelapor.setLayout(PanelMeenuPelaporLayout);
        PanelMeenuPelaporLayout.setHorizontalGroup(
            PanelMeenuPelaporLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelMeenuPelaporLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ButtonBuatLaporan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ButtonLihatProgres)
                .addContainerGap())
        );
        PanelMeenuPelaporLayout.setVerticalGroup(
            PanelMeenuPelaporLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelMeenuPelaporLayout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(PanelMeenuPelaporLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonLihatProgres)
                    .addComponent(ButtonBuatLaporan))
                .addGap(57, 57, 57))
        );

        javax.swing.GroupLayout PanelPelaporLayout = new javax.swing.GroupLayout(PanelPelapor);
        PanelPelapor.setLayout(PanelPelaporLayout);
        PanelPelaporLayout.setHorizontalGroup(
            PanelPelaporLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPelaporLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelPelaporLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LabelPelapor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelMeenuPelapor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PanelPelaporLayout.setVerticalGroup(
            PanelPelaporLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPelaporLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelPelapor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelMeenuPelapor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelPelapor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelPelapor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonBuatLaporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBuatLaporanActionPerformed
        lapor=new FrameLaporan();
        lapor.setVisible(true);
        dispose();
    }//GEN-LAST:event_ButtonBuatLaporanActionPerformed

    private void ButtonLihatProgresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLihatProgresActionPerformed
        
    }//GEN-LAST:event_ButtonLihatProgresActionPerformed

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
            java.util.logging.Logger.getLogger(FrameMenuPelapor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameMenuPelapor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameMenuPelapor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameMenuPelapor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameMenuPelapor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonBuatLaporan;
    private javax.swing.JButton ButtonLihatProgres;
    private javax.swing.JLabel LabelPelapor;
    private javax.swing.JPanel PanelMeenuPelapor;
    private javax.swing.JPanel PanelPelapor;
    // End of variables declaration//GEN-END:variables
}
