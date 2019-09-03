 
package com.UserInterface;

import com.Dao.OgrenciDaoImp;
import com.Dao.SozlesmeDaoImp;
import com.KursTakip.Dto.Ogrenci;
import com.KursTakip.Dto.Sozlesme;
import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.function.Consumer;
import javax.swing.JOptionPane;

 
public class FrmSozlesmeEkle extends javax.swing.JFrame {

    private Ogrenci ogrenci;
    private OgrenciDaoImp ogrenciDb;
    private SozlesmeDaoImp sozlesmeDb;
    private Consumer cons;
    public FrmSozlesmeEkle() {
        initComponents();
        this.setLocationRelativeTo(null);
        dateChooserSozlesmeTarih.setDate(Date.valueOf(LocalDate.now()));
        dateChooserVadeTarhi.setDate(Date.valueOf(LocalDate.now().plusDays(30)));
        ogrenciDb=new OgrenciDaoImp();
        sozlesmeDb=new SozlesmeDaoImp();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnEkle = new javax.swing.JButton();
        txtOgrAd = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dateChooserSozlesmeTarih = new com.toedter.calendar.JDateChooser();
        txtToplamTutar = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        btnIptal = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtPesinat = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        txtKalanTutar = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        txtBorcluAd = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtBorcluTelefon = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtKefilAd = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSozlesmeNot = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        dateChooserVadeTarhi = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255), 5));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEkle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kurs/takip/OK.png"))); // NOI18N
        btnEkle.setText("Ekle");
        btnEkle.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEkleActionPerformed(evt);
            }
        });
        jPanel1.add(btnEkle, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 100, 30));

        txtOgrAd.setEditable(false);
        txtOgrAd.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.add(txtOgrAd, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 230, -1));

        jLabel3.setText("Ogrenci Ad");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel4.setText("Tarih");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        dateChooserSozlesmeTarih.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.add(dateChooserSozlesmeTarih, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 230, -1));

        txtToplamTutar.setForeground(new java.awt.Color(0, 0, 255));
        txtToplamTutar.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtToplamTutar.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtToplamTutar.setText("0");
        jPanel1.add(txtToplamTutar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 230, -1));

        jLabel1.setText("Toplam Tutar");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        btnIptal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kurs/takip/Erase.png"))); // NOI18N
        btnIptal.setText("Iptal");
        btnIptal.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnIptal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIptalActionPerformed(evt);
            }
        });
        jPanel1.add(btnIptal, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, 100, 30));

        jLabel2.setText("Pesinat");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        txtPesinat.setForeground(new java.awt.Color(0, 0, 255));
        txtPesinat.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtPesinat.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPesinat.setText("0");
        txtPesinat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesinatKeyReleased(evt);
            }
        });
        jPanel1.add(txtPesinat, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 230, -1));

        jLabel5.setText("Kalan Tutar");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        txtKalanTutar.setEditable(false);
        txtKalanTutar.setForeground(new java.awt.Color(255, 0, 0));
        txtKalanTutar.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtKalanTutar.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtKalanTutar.setText("0");
        jPanel1.add(txtKalanTutar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 230, -1));

        jLabel6.setText("Borclu Ad");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        txtBorcluAd.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.add(txtBorcluAd, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 230, -1));

        jLabel7.setText("Borclu Telefon");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        txtBorcluTelefon.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.add(txtBorcluTelefon, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 230, -1));

        jLabel8.setText("Kefil Ad");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        txtKefilAd.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.add(txtKefilAd, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 230, -1));

        jLabel9.setText("Vade Tarih");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));

        txtSozlesmeNot.setColumns(20);
        txtSozlesmeNot.setForeground(new java.awt.Color(0, 0, 255));
        txtSozlesmeNot.setRows(5);
        jScrollPane1.setViewportView(txtSozlesmeNot);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 230, 80));

        jLabel10.setText("Sozlesme Not");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        dateChooserVadeTarhi.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.add(dateChooserVadeTarhi, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 230, -1));

        jLabel11.setBackground(new java.awt.Color(0, 204, 0));
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("SOZLESME EKLE");
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel11.setOpaque(true);
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 330, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public Ogrenci getOgrenci() {
        return ogrenci;
    }

    public void setOgrenci(Ogrenci ogrenci) {
        this.ogrenci = ogrenci;
        txtOgrAd.setText(ogrenci.getAd());
    }

    public Consumer getCons() {
        return cons;
    }

    public void setCons(Consumer cons) {
        this.cons = cons;
    }
    
    
    private void btnIptalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIptalActionPerformed
            this.dispose();
    }//GEN-LAST:event_btnIptalActionPerformed
      
    
    private void btnEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEkleActionPerformed
        if(alanlarDoldurmusmu())
        {
         Sozlesme soz= getSozlesmeFromForm();
         //ogrenciDb.update(ogrenci);
         sozlesmeDb.save(soz);
         ogrenciDb.closeSession();
         sozlesmeDb.close();
         cons.accept(ogrenci);
         
         this.dispose();
         
        }
        else
            JOptionPane.showMessageDialog(null, "Bos gecilen alanlar var","Uyarı",JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_btnEkleActionPerformed

    private void txtPesinatKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesinatKeyReleased
          BigDecimal top=(BigDecimal.valueOf(Double.valueOf(txtToplamTutar.getText())));
          BigDecimal pes=(BigDecimal.valueOf(Double.valueOf(txtPesinat.getText())));
          BigDecimal kalan=top.subtract(pes);
          if(kalan.intValue()<0)
          {
              JOptionPane.showMessageDialog(null, "Pesinat toplam tutardan fazla olamaz");
              txtPesinat.setText("0");
              txtKalanTutar.setText(txtToplamTutar.getText());
          }
          else
              txtKalanTutar.setText(kalan.toString());
        
          
    }//GEN-LAST:event_txtPesinatKeyReleased
    private boolean alanlarDoldurmusmu()
    {
        if(txtBorcluAd.getText().equals("")||txtBorcluTelefon.getText().equals("")||
                txtKalanTutar.getText().equals("")||
                txtKefilAd.getText().equals("")||
                txtOgrAd.equals("")||
                txtPesinat.equals("")||
                txtToplamTutar.equals("")
               )
            return false;
        else
            return true;
    }
    private Sozlesme getSozlesmeFromForm()
    {
        Sozlesme sz=new Sozlesme();
        sz.setBorcluAd(txtBorcluAd.getText());
        sz.setBorcluTelefon(txtBorcluTelefon.getText());
        sz.setKalanBorc((BigDecimal.valueOf(Double.valueOf(txtKalanTutar.getText()))));
        sz.setKefilAd(txtKefilAd.getText());
        sz.setOgrenci(ogrenci);
        sz.setPesinat((BigDecimal.valueOf(Double.valueOf(txtPesinat.getText()))));
        sz.setSozlesmeNot(txtSozlesmeNot.getText());
        sz.setSozlesmeVadeTarih(dateChooserVadeTarhi.getDate());
        sz.setTarih(dateChooserSozlesmeTarih.getDate());
        sz.setToplamTutar(BigDecimal.valueOf(Double.valueOf(txtToplamTutar.getText())));
        //ogrenci.setSozlesmes(new HashSet<>());
        ogrenci.getSozlesmes().add(sz);
        return sz;
    }
     
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
            java.util.logging.Logger.getLogger(FrmSozlesmeEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmSozlesmeEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmSozlesmeEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmSozlesmeEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmSozlesmeEkle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEkle;
    private javax.swing.JButton btnIptal;
    private com.toedter.calendar.JDateChooser dateChooserSozlesmeTarih;
    private com.toedter.calendar.JDateChooser dateChooserVadeTarhi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtBorcluAd;
    private javax.swing.JTextField txtBorcluTelefon;
    private javax.swing.JFormattedTextField txtKalanTutar;
    private javax.swing.JTextField txtKefilAd;
    private javax.swing.JTextField txtOgrAd;
    private javax.swing.JFormattedTextField txtPesinat;
    private javax.swing.JTextArea txtSozlesmeNot;
    private javax.swing.JFormattedTextField txtToplamTutar;
    // End of variables declaration//GEN-END:variables
}
