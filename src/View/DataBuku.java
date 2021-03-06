/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import Model.*;
/**
 *
 * @author Lapankha
 */
public class DataBuku extends javax.swing.JFrame {

    /**
     * Creates new form DataBuku
     */
    
    DefaultComboBoxModel mdl = new DefaultComboBoxModel();
    
    int baris = 0;
    static Object kolom[] = {"No","Kode Buku", "Nama Buku", "Kategori Buku", "Status"};
    DefaultTableModel tbl = new DefaultTableModel(kolom,baris);
    
    public DataBuku() {
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

        CKategoriBuku = new javax.swing.JComboBox<>();
        BHapus = new javax.swing.JButton();
        TKodeBuku = new javax.swing.JTextField();
        TNamaBuku = new javax.swing.JTextField();
        BTambah = new javax.swing.JButton();
        BSimpan = new javax.swing.JButton();
        BReset = new javax.swing.JButton();
        TCari = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        BCari = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblBuku = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BEdit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        BHapus.setText("Hapus");
        BHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BHapusActionPerformed(evt);
            }
        });

        BTambah.setText("Tambah");
        BTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTambahActionPerformed(evt);
            }
        });

        BSimpan.setText("Simpan");
        BSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSimpanActionPerformed(evt);
            }
        });

        BReset.setText("Reset");
        BReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BResetActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 204));
        jLabel1.setText("DATA BUKU");

        BCari.setText("Cari");
        BCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCariActionPerformed(evt);
            }
        });

        jLabel2.setText("Kategori Buku");

        TblBuku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TblBuku);

        jLabel3.setText("Kode Buku");

        jLabel4.setText("Nama Buku");

        BEdit.setText("Edit");
        BEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CKategoriBuku, 0, 160, Short.MAX_VALUE)
                                    .addComponent(TKodeBuku)
                                    .addComponent(TNamaBuku)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BTambah)
                                .addGap(18, 18, 18)
                                .addComponent(BSimpan)
                                .addGap(18, 18, 18)
                                .addComponent(BReset))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TCari, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BCari)))
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(BHapus))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(CKategoriBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(TKodeBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(TNamaBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BTambah)
                            .addComponent(BSimpan)
                            .addComponent(BReset)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BCari)
                    .addComponent(BEdit)
                    .addComponent(BHapus))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BHapusActionPerformed

        Buku obj1 = new Buku();
        int Pilihbaris = TblBuku.getSelectedRow();
        String kodebuku = tbl.getValueAt(Pilihbaris, 1).toString();

        obj1.HapusDataKategori(kodebuku);
        tbl.removeRow(Pilihbaris);
        JOptionPane.showMessageDialog(this, "Data berhasil dihapus",
            "Pesan konfirmasi", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_BHapusActionPerformed

    private void BTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTambahActionPerformed

        Buku obj1 = new Buku();
        String kategoribuku = CKategoriBuku.getSelectedItem().toString();
        String kodebuku = TKodeBuku.getText();
        String namabuku = TNamaBuku.getText();
        String statusbuku = "Tersedia";
        
        String[] pisahkategori = kategoribuku.split("-");
        String kodekategori = pisahkategori[0];
        String kategori = pisahkategori[1];
        
        if(kodebuku.isEmpty()){
            JOptionPane.showMessageDialog(this, "Kode  buku harus diisi",
                "Pesan Kesalahan", JOptionPane.INFORMATION_MESSAGE);
        }else if(namabuku.isEmpty()){
            JOptionPane.showMessageDialog(this, "Nama buku harus diisi",
                "Pesan Kesalahan", JOptionPane.INFORMATION_MESSAGE);
        }else{
            int No = obj1.TambahBuku(kodekategori, kodebuku, namabuku);
            tbl.addRow(new Object[]{No, kodebuku, namabuku, kategori, statusbuku});
            TblBuku.setModel(tbl);
            TKodeBuku.setText("");
            TNamaBuku.setText("");
        }
    }//GEN-LAST:event_BTambahActionPerformed

    private void BSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSimpanActionPerformed

        Buku obj1 = new Buku();
        String kategoribuku = CKategoriBuku.getSelectedItem().toString();
        String kodebuku = TKodeBuku.getText();
        String namabuku = TNamaBuku.getText();

        String [] pisahkategori = kategoribuku.split("-");
        String kodekategori = pisahkategori[0];
        String kategori = pisahkategori[1];

        obj1.editBuku(kategoribuku, kodebuku, namabuku, kodekategori);
        tbl.getDataVector().removeAllElements();

        String[][] data = obj1.getBuku();
        for(int i=0; i<data.length; i++){
            int no = i + 1;
            tbl.addRow(new Object[]{no, data[i][0], data[i][1], data[0][2], data[i][3]});
        }
        TblBuku.setModel(tbl);

        JOptionPane.showMessageDialog(this, "Data Berhasil diedit",
            "Pesan Konfirmasi", JOptionPane.INFORMATION_MESSAGE);
        TKodeBuku.setEditable(true);
        TKodeBuku.setText("");
        TNamaBuku.setText("");
    }//GEN-LAST:event_BSimpanActionPerformed

    private void BResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BResetActionPerformed

        TKodeBuku.setEditable(true);
        TKodeBuku.setText("");
        TNamaBuku.setText("");
    }//GEN-LAST:event_BResetActionPerformed

    private void BCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCariActionPerformed

        Buku obj1 = new Buku();

        String katakunci = TCari.getText();
        tbl.getDataVector().removeAllElements();

        String [][] data = obj1.CariBuku(katakunci);
        for(int i=0; i<data.length; i++){
            int no = i+1;
            tbl.addRow(new Object[]{no, data[i][0], data[i][1]});
        }
        TblBuku.setModel(tbl);
        TCari.setText("");
    }//GEN-LAST:event_BCariActionPerformed

    private void BEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEditActionPerformed

        Buku obj1 = new Buku();

        int Pilihbaris = TblBuku.getSelectedRow();
        String kodebuku = tbl.getValueAt(Pilihbaris, 1).toString();

        String [][] data = obj1.getDataBuku(kodebuku);
        String kodekategori = data[0][0];
        String kategori = data [0][1];
        String namabuku = data [0][2];

        CKategoriBuku.setSelectedItem(kodekategori+"-"+kategori);

        TKodeBuku.setText(kodebuku);
        TKodeBuku.setEditable(false);
        TNamaBuku.setText(namabuku);
    }//GEN-LAST:event_BEditActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        KategoriBuku obj2 = new KategoriBuku();
        
        String [] ListKategori = obj2.getListKategori();
        for(int i=0; i<ListKategori.length; i++){
            mdl.addElement(ListKategori[i]);
        }
        CKategoriBuku.setModel(mdl);
        
        Buku obj1 = new Buku();
        
        String [][] data =  obj1.getBuku();
        for(int i=0; i<data.length; i++){
            int no = (i+1);
            tbl.addRow(new Object[]{no, data[i][0], data[i][1],data[i][2],data[i][3]});
        }
        TblBuku.setModel(tbl);
    }//GEN-LAST:event_formComponentShown

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
            java.util.logging.Logger.getLogger(DataBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataBuku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BCari;
    private javax.swing.JButton BEdit;
    private javax.swing.JButton BHapus;
    private javax.swing.JButton BReset;
    private javax.swing.JButton BSimpan;
    private javax.swing.JButton BTambah;
    private javax.swing.JComboBox<String> CKategoriBuku;
    private javax.swing.JTextField TCari;
    private javax.swing.JTextField TKodeBuku;
    private javax.swing.JTextField TNamaBuku;
    private javax.swing.JTable TblBuku;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
