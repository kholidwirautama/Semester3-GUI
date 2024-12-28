/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Konfigurasi.koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Kholid
 */
public class f_SewaKostum extends c_Menu {

    /**
     * Creates new form g1_SewaKostum
     */
    public f_SewaKostum() {
        initComponents();
        
        merk_pesanan.setEditable(false);
        hargasewa_pesanan.setEditable(false);
        kembalian_pesanan.setEditable(false);
        
        kostum_pesanan.removeAllItems();

        try {
            
            Connection conn = koneksi.getConnection();

            // Execute the query to fetch costume names
            String query = "SELECT nm_kostum FROM barang";
            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();

            
            while (rs.next()) {
                kostum_pesanan.addItem(rs.getString("nm_kostum"));
            }

            
            stmt.close();
            rs.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
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

        jComboBox1 = new javax.swing.JComboBox<>();
        BGProfil = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BuatPesanan = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nama_pelanggan = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nohp_pelanggan = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        alamat_pelanggan = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        kostum_pesanan = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        merk_pesanan = new javax.swing.JTextField();
        hargasewa_pesanan = new javax.swing.JTextField();
        bayar_pesanan = new javax.swing.JTextField();
        hitung_pesanan = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        kembalian_pesanan = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tanggal_pesanan = new com.toedter.calendar.JDateChooser();
        btn_konfirmasi = new javax.swing.JButton();
        hapus_datapelanggan = new javax.swing.JButton();
        hapus_buatpesanan = new javax.swing.JButton();
        hapus_semua = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BGProfil.setBackground(new java.awt.Color(1, 22, 39));
        BGProfil.setPreferredSize(new java.awt.Dimension(650, 500));

        jLabel1.setBackground(new java.awt.Color(253, 255, 252));
        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(253, 255, 252));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SEWA KOSTUM");

        BuatPesanan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 34)));
        BuatPesanan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Data Pelanggan");

        jLabel3.setText("Nama:");

        jLabel4.setText("No. Hp:");

        jLabel5.setText("Alamat:");

        alamat_pelanggan.setColumns(20);
        alamat_pelanggan.setRows(5);
        jScrollPane1.setViewportView(alamat_pelanggan);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(nama_pelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nohp_pelanggan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addGap(276, 276, 276))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nama_pelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nohp_pelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        BuatPesanan.addTab("Data Pelanggan", jPanel1);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Buat Pesanan");

        jLabel9.setText("Kostum:");

        kostum_pesanan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Doctor", "Item 3", "Item 4" }));
        kostum_pesanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kostum_pesananActionPerformed(evt);
            }
        });

        jLabel10.setText("Merk:");

        jLabel11.setText("Harga Sewa /3 Hari:");

        jLabel7.setText("Uang dibayar:");

        hitung_pesanan.setText("Hitung");
        hitung_pesanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitung_pesananActionPerformed(evt);
            }
        });

        jLabel8.setText("Kembalian:");

        jLabel12.setText("Tanggal Mulai Sewa:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(kembalian_pesanan, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bayar_pesanan, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hitung_pesanan))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(kostum_pesanan, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(merk_pesanan, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(hargasewa_pesanan, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tanggal_pesanan, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 46, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kostum_pesanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(merk_pesanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hargasewa_pesanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tanggal_pesanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(bayar_pesanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hitung_pesanan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(kembalian_pesanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        BuatPesanan.addTab("Buat Pesanan", jPanel2);

        btn_konfirmasi.setText("Konfirmasi & Selesai");
        btn_konfirmasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_konfirmasiActionPerformed(evt);
            }
        });

        hapus_datapelanggan.setText("Hapus \"Data Pelanggan\"");
        hapus_datapelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapus_datapelangganActionPerformed(evt);
            }
        });

        hapus_buatpesanan.setText("Hapus \"Buat Pesanan\"");
        hapus_buatpesanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapus_buatpesananActionPerformed(evt);
            }
        });

        hapus_semua.setText("Hapus Semua");
        hapus_semua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapus_semuaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BGProfilLayout = new javax.swing.GroupLayout(BGProfil);
        BGProfil.setLayout(BGProfilLayout);
        BGProfilLayout.setHorizontalGroup(
            BGProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGProfilLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BGProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BuatPesanan))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BGProfilLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(BGProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(hapus_semua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hapus_buatpesanan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hapus_datapelanggan))
                .addGap(35, 35, 35)
                .addComponent(btn_konfirmasi, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152))
        );
        BGProfilLayout.setVerticalGroup(
            BGProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGProfilLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BuatPesanan, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(BGProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(BGProfilLayout.createSequentialGroup()
                        .addComponent(hapus_datapelanggan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hapus_buatpesanan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hapus_semua))
                    .addComponent(btn_konfirmasi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BGProfil, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BGProfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kostum_pesananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kostum_pesananActionPerformed
        // TODO add your handling code here:
        if (kostum_pesanan.getSelectedItem() == null) {
            return;
        }

        try {
            // Connect to the database
            Connection conn = koneksi.getConnection();

            // Execute the query to fetch costume information
            String query = "SELECT mr_kostum, hargasewa FROM barang WHERE nm_kostum=?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, kostum_pesanan.getSelectedItem().toString());
            ResultSet rs = stmt.executeQuery();

            // Populate the combo box with costume names
            if (rs.next()) {
                // Fill the merk_pesanan and hargasewa_pesanan fields based on the selected costume
                merk_pesanan.setText(rs.getString("mr_kostum"));
                hargasewa_pesanan.setText(rs.getString("hargasewa"));
            }

            // Close the database connection
            stmt.close();
            rs.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_kostum_pesananActionPerformed

    private void hapus_datapelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapus_datapelangganActionPerformed
        // TODO add your handling code here:
        nama_pelanggan.setText("");
        nohp_pelanggan.setText("");
        alamat_pelanggan.setText("");
    }//GEN-LAST:event_hapus_datapelangganActionPerformed

    private void hapus_buatpesananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapus_buatpesananActionPerformed
        // TODO add your handling code here:
        kostum_pesanan.setSelectedItem(null);
        merk_pesanan.setText("");
        hargasewa_pesanan.setText("");
        tanggal_pesanan.setDate(null);
        bayar_pesanan.setText("");
        kembalian_pesanan.setText("");
    }//GEN-LAST:event_hapus_buatpesananActionPerformed

    private void hapus_semuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapus_semuaActionPerformed
        // TODO add your handling code here:
        nama_pelanggan.setText("");
        nohp_pelanggan.setText("");
        alamat_pelanggan.setText("");
        
        kostum_pesanan.setSelectedItem(null);
        merk_pesanan.setText("");
        hargasewa_pesanan.setText("");
        tanggal_pesanan.setDate(null);
        bayar_pesanan.setText("");
        kembalian_pesanan.setText("");
    }//GEN-LAST:event_hapus_semuaActionPerformed

    private void btn_konfirmasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_konfirmasiActionPerformed
        // TODO add your handling code here:
        if (validateInput()) {
        try {
            Connection conn = koneksi.getConnection();
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO riwayatpesanan (nama_pelanggan, nohp_pelanggan, alamat_pelanggan, kostum_pesanan, merk_kostum_pesanan, tanggal_pesanan, harga_total_pesanan) VALUES (?, ?, ?, ?, ?, ?, ?)");
            stmt.setString(1, nama_pelanggan.getText());
            stmt.setString(2, nohp_pelanggan.getText());
            stmt.setString(3, alamat_pelanggan.getText());
            stmt.setString(4, kostum_pesanan.getSelectedItem().toString());
            stmt.setString(5, merk_pesanan.getText());
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String formattedDate = dateFormat.format(tanggal_pesanan.getDate());
            stmt.setString(6, formattedDate);
            stmt.setString(7, hargasewa_pesanan.getText());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data berhasil disimpan", "Pesan", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    }//GEN-LAST:event_btn_konfirmasiActionPerformed

    private boolean validateInput() {
    if (nama_pelanggan.getText().isEmpty() || nohp_pelanggan.getText().isEmpty() || alamat_pelanggan.getText().isEmpty() ||
        kostum_pesanan.getSelectedItem() == null || merk_pesanan.getText().isEmpty() || hargasewa_pesanan.getText().isEmpty() ||
        tanggal_pesanan.getDate() == null) {
        JOptionPane.showMessageDialog(this, "Data kurang lengkap", "Peringatan", JOptionPane.WARNING_MESSAGE);
        return false;
    }
    return true;
}
    
    private void hitung_pesananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitung_pesananActionPerformed
        // TODO add your handling code here:
        String bayarText = bayar_pesanan.getText();
        String hargasewaText = hargasewa_pesanan.getText();

        // Check if the input is valid (not empty)
        if (bayarText.isEmpty() || hargasewaText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Masukkan jumlah uang yang dibayar terlebih dahulu", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            // Parse the input values to double
            double bayar = Double.parseDouble(bayarText);
            double hargasewa = Double.parseDouble(hargasewaText);

            // Perform the calculation
            double kembalian = bayar - hargasewa;

            // Display the result in kembalian_pesanan
            kembalian_pesanan.setText(String.valueOf(kembalian));

            // Show a JOptionPane with the calculated change
            JOptionPane.showMessageDialog(this, "Kembalian: " + kembalian, "Informasi", JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException e) {
            // Handle the case where the input values are not valid numbers
            JOptionPane.showMessageDialog(this, "Masukkan jumlah uang yang valid", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_hitung_pesananActionPerformed


    
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
            java.util.logging.Logger.getLogger(f_SewaKostum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(f_SewaKostum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(f_SewaKostum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(f_SewaKostum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new f_SewaKostum().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BGProfil;
    private javax.swing.JTabbedPane BuatPesanan;
    private javax.swing.JTextArea alamat_pelanggan;
    private javax.swing.JTextField bayar_pesanan;
    private javax.swing.JButton btn_konfirmasi;
    private javax.swing.JButton hapus_buatpesanan;
    private javax.swing.JButton hapus_datapelanggan;
    private javax.swing.JButton hapus_semua;
    private javax.swing.JTextField hargasewa_pesanan;
    private javax.swing.JButton hitung_pesanan;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kembalian_pesanan;
    private javax.swing.JComboBox<String> kostum_pesanan;
    private javax.swing.JTextField merk_pesanan;
    private javax.swing.JTextField nama_pelanggan;
    private javax.swing.JTextField nohp_pelanggan;
    private com.toedter.calendar.JDateChooser tanggal_pesanan;
    // End of variables declaration//GEN-END:variables
}
