/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import javax.swing.JOptionPane;

/**
 *
 * @author Kholid
 */
public class c_Menu extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public c_Menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FPm = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menu_profile = new javax.swing.JMenuItem();
        Logout = new javax.swing.JMenuItem();
        Keluar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menu_listbarang = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menu_sewakostum = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        menu_konfirmasipesanan = new javax.swing.JMenuItem();

        FPm.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenuBar1.setForeground(new java.awt.Color(6, 26, 64));
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuBar1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 12)); // NOI18N

        jMenu1.setText("Akun");
        jMenu1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jMenu1.setPreferredSize(new java.awt.Dimension(130, 35));

        menu_profile.setText("Profile");
        menu_profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_profileActionPerformed(evt);
            }
        });
        jMenu1.add(menu_profile);

        Logout.setText("Logout");
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });
        jMenu1.add(Logout);

        Keluar.setText("Keluar");
        Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeluarActionPerformed(evt);
            }
        });
        jMenu1.add(Keluar);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Barang");
        jMenu2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jMenu2.setPreferredSize(new java.awt.Dimension(130, 35));

        menu_listbarang.setText("Daftar Kostum");
        menu_listbarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_listbarangActionPerformed(evt);
            }
        });
        jMenu2.add(menu_listbarang);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Layanan");
        jMenu3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jMenu3.setPreferredSize(new java.awt.Dimension(130, 35));

        menu_sewakostum.setText("Sewa Kostum");
        menu_sewakostum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_sewakostumActionPerformed(evt);
            }
        });
        jMenu3.add(menu_sewakostum);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Transaksi");
        jMenu4.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jMenu4.setPreferredSize(new java.awt.Dimension(130, 35));

        menu_konfirmasipesanan.setText("Riyawat Pesanan");
        menu_konfirmasipesanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_konfirmasipesananActionPerformed(evt);
            }
        });
        jMenu4.add(menu_konfirmasipesanan);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 464, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeluarActionPerformed
        // TODO add your handling code here:
        int keluar = JOptionPane.showConfirmDialog(this, 
                "Tekan OK untuk keluar", 
                "KELUAR", 
                JOptionPane.WARNING_MESSAGE, JOptionPane.OK_CANCEL_OPTION);
        if (keluar == JOptionPane.OK_OPTION)
        { JOptionPane.showMessageDialog(this, "Terima Kasih sudah Menggunakan Program ini");
            dispose();}
        else{}
    }//GEN-LAST:event_KeluarActionPerformed

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        // TODO add your handling code here:
        int logout = JOptionPane.showConfirmDialog(this, 
                "Tekan OK untuk Logout", 
                "Logout", 
                JOptionPane.WARNING_MESSAGE, JOptionPane.OK_CANCEL_OPTION);
        if (logout == JOptionPane.OK_OPTION){
        a_Login lg = new a_Login();
        lg.setVisible(true);
        lg.pack();
        lg.setLocationRelativeTo(null);
        lg.setDefaultCloseOperation(a_Login.EXIT_ON_CLOSE);
        dispose();
        }
        else{}
    }//GEN-LAST:event_LogoutActionPerformed

    private void menu_profileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_profileActionPerformed
        // TODO add your handling code here:
        d_Profile d = new d_Profile();
        d.setVisible(true);
        d.pack();
        d.setLocationRelativeTo(null);
        d.setDefaultCloseOperation(d_Profile.EXIT_ON_CLOSE);
        
        dispose();
    }//GEN-LAST:event_menu_profileActionPerformed

    private void menu_listbarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_listbarangActionPerformed
        // TODO add your handling code here:
        e_DaftarKostum e = new e_DaftarKostum();
        e.setVisible(true);
        e.pack();
        e.setLocationRelativeTo(null);
        e.setDefaultCloseOperation(e_DaftarKostum.EXIT_ON_CLOSE);
        
        dispose();
    }//GEN-LAST:event_menu_listbarangActionPerformed

    private void menu_sewakostumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_sewakostumActionPerformed
        // TODO add your handling code here:
        f_SewaKostum f = new f_SewaKostum();
        f.setVisible(true);
        f.pack();
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(f_SewaKostum.EXIT_ON_CLOSE);
        
        dispose();
    }//GEN-LAST:event_menu_sewakostumActionPerformed

    private void menu_konfirmasipesananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_konfirmasipesananActionPerformed
        // TODO add your handling code here:
        g_RiwayatPesanan g = new g_RiwayatPesanan();
        g.setVisible(true);
        g.pack();
        g.setLocationRelativeTo(null);
        g.setDefaultCloseOperation(g_RiwayatPesanan.EXIT_ON_CLOSE);
        
        dispose();
    }//GEN-LAST:event_menu_konfirmasipesananActionPerformed

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
            java.util.logging.Logger.getLogger(c_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(c_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(c_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(c_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new c_Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FPm;
    private javax.swing.JMenuItem Keluar;
    private javax.swing.JMenuItem Logout;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menu_konfirmasipesanan;
    private javax.swing.JMenuItem menu_listbarang;
    private javax.swing.JMenuItem menu_profile;
    private javax.swing.JMenuItem menu_sewakostum;
    // End of variables declaration//GEN-END:variables
}
