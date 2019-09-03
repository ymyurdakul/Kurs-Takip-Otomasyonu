/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.UserInterface;

 
import com.Dao.OgrenciDaoImp;
import com.Dao.SozlesmeDaoImp;
import com.KursTakiipAbstractDao.SozlesmeDao;
 
import com.KursTakip.Dto.Ogrenci;
import com.KursTakip.Dto.Sozlesme;
import com.Settings.MainLookAndFeel;
import com.toedter.calendar.JDateChooser;
import java.awt.Component;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.Consumer;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javafx.application.Application;
import javax.imageio.ImageIO;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.metal.MetalLookAndFeel;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import javax.swing.table.DefaultTableModel;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.SimpleExpression;

/**
 *
 * @author Mustafa
 */
public class FrmOgrenciKayit extends javax.swing.JFrame {
    private DefaultTableModel sorguTableModel;
    private DefaultTableModel sozlesmeTableModel;
    private OgrenciDaoImp ogrenciDb;
    private SozlesmeDaoImp sozlesmeDb;
    private FrmSozlesmeEkle frmSozlesmeEkle;    
    protected List<Ogrenci>bulunanOgrenciler;
    private List<Sozlesme>currentSozlesmeler;
    private Ogrenci currentOgr=null;
   
    public FrmOgrenciKayit() throws UnsupportedLookAndFeelException {
       // UIManager.setLookAndFeel(new NimbusLookAndFeel());
        initComponents();
        ogrenciDb=new OgrenciDaoImp();
        sorguTableModel=new DefaultTableModel(new Object[]{"Numara","Tc","Ad","Soyad"}, 0);
        tblSorgu.setModel(sorguTableModel);
        sozlesmeTableModel=new DefaultTableModel(new Object[]{"Tarih","Tutar","Pesinat","Kalan","Borclu Ad","Borclu Tel","Kefil Ad","Not","VadeTarih"}, 0);
        tblSozlesme.setModel(sozlesmeTableModel);
         this.setLocationRelativeTo(null);
        sozlesmeDb=new SozlesmeDaoImp();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupCinsiyet = new javax.swing.ButtonGroup();
        panelMain = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtOgrenciArananNumara = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtOgrArananAd = new javax.swing.JTextField();
        txtOgrAranansoyad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtOgrArananTc = new javax.swing.JTextField();
        txtOgrAra = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSorgu = new javax.swing.JTable();
        btnGetir = new javax.swing.JButton();
        cmbxKayıtGetir = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        btnKaydet = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnFormTemizle = new javax.swing.JButton();
        jTabbedPaneOgrenciKayıt = new javax.swing.JTabbedPane();
        panelOgrenciKayitTemel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtAd = new javax.swing.JTextField();
        txtSoyad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtDgmYer = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtAreaNotlar = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();
        lblResim = new javax.swing.JLabel();
        addPhoto = new javax.swing.JButton();
        txtNumara = new javax.swing.JFormattedTextField();
        dateChoserDgmTarih = new com.toedter.calendar.JDateChooser();
        dateChooserKayıtTarih = new com.toedter.calendar.JDateChooser();
        jPanel7 = new javax.swing.JPanel();
        rbKadın = new javax.swing.JRadioButton();
        rbErkek = new javax.swing.JRadioButton();
        cmbxKanGrup = new javax.swing.JComboBox<>();
        txtTc = new javax.swing.JFormattedTextField();
        jLabel17 = new javax.swing.JLabel();
        txtReferans = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txtSeriNo = new javax.swing.JTextField();
        txtIlce = new javax.swing.JTextField();
        txtIl = new javax.swing.JTextField();
        txtAilleSiraNo = new javax.swing.JTextField();
        txtCiltNo = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        cmbBxOgrenimSekli = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        txtSınıf = new javax.swing.JFormattedTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtOkul = new javax.swing.JTextField();
        txtServisGuzergah = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        panelOgrenciKayıtDetay = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        txtBabaAdSoyad = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        txtBabaMeslek = new javax.swing.JFormattedTextField();
        txtBabaTc = new javax.swing.JFormattedTextField();
        jLabel42 = new javax.swing.JLabel();
        dateChoserBabaDgmTarih = new com.toedter.calendar.JDateChooser();
        jLabel43 = new javax.swing.JLabel();
        txtBabaTel = new javax.swing.JFormattedTextField();
        jLabel44 = new javax.swing.JLabel();
        cmbBabaEgitim = new javax.swing.JComboBox<>();
        jPanel13 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        txtAnneAdSoyad = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        txtAnneMeslek = new javax.swing.JFormattedTextField();
        txtAnneTc = new javax.swing.JFormattedTextField();
        jLabel48 = new javax.swing.JLabel();
        dateChoserAnneDgmTarih = new com.toedter.calendar.JDateChooser();
        jLabel49 = new javax.swing.JLabel();
        txtAnneTel = new javax.swing.JFormattedTextField();
        jLabel50 = new javax.swing.JLabel();
        cmbAnneEgitim = new javax.swing.JComboBox<>();
        panelSozlesme = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSozlesme = new javax.swing.JTable();
        btnSozlesmeEkle = new javax.swing.JButton();
        btnSozlesmeSil = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        lblToplamKalan = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        btnSil = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ögrenci Kayıt");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        panelMain.setBackground(new java.awt.Color(255, 255, 255));
        panelMain.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 255), 4, true));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ogrenci Arama", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtOgrenciArananNumara.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Numara");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("Ad");

        txtOgrArananAd.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        txtOgrAranansoyad.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Soyad");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("Tc");

        txtOgrArananTc.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        txtOgrAra.setText("Ara");
        txtOgrAra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOgrAraActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 51));
        jLabel5.setText("Hepsi Doldurulmak zorunda değil");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(38, 38, 38)
                        .addComponent(txtOgrenciArananNumara))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(68, 68, 68)
                        .addComponent(txtOgrArananAd))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(48, 48, 48)
                        .addComponent(txtOgrAranansoyad))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(69, 69, 69)
                        .addComponent(txtOgrArananTc))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 27, Short.MAX_VALUE)
                        .addComponent(txtOgrAra))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtOgrenciArananNumara, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOgrArananAd, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOgrAranansoyad, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOgrArananTc, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOgrAra)
                    .addComponent(jLabel5)))
        );

        tblSorgu.setModel(new javax.swing.table.DefaultTableModel(
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
        tblSorgu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSorguMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSorgu);

        btnGetir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kurs/takip/View.png"))); // NOI18N
        btnGetir.setText("Getir");
        btnGetir.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnGetir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetirActionPerformed(evt);
            }
        });

        cmbxKayıtGetir.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "20", "50", "100" }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(cmbxKayıtGetir, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGetir))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbxKayıtGetir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGetir, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2))
        );

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kurs/takip/Copy.png"))); // NOI18N
        jButton1.setText("Belge ve formlar");
        jButton1.setInheritsPopupMenu(true);
        jButton1.setMargin(new java.awt.Insets(0, 0, 0, 0));

        btnKaydet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kurs/takip/Create.png"))); // NOI18N
        btnKaydet.setText("Kaydet");
        btnKaydet.setAlignmentY(0.0F);
        btnKaydet.setAutoscrolls(true);
        btnKaydet.setInheritsPopupMenu(true);
        btnKaydet.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnKaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKaydetActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kurs/takip/Exit.png"))); // NOI18N
        jButton3.setText("Kapat");
        jButton3.setInheritsPopupMenu(true);
        jButton3.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btnFormTemizle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kurs/takip/Clipboard.png"))); // NOI18N
        btnFormTemizle.setText("Yeni");
        btnFormTemizle.setInheritsPopupMenu(true);
        btnFormTemizle.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnFormTemizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFormTemizleActionPerformed(evt);
            }
        });

        jTabbedPaneOgrenciKayıt.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPaneOgrenciKayıt.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ogrenci Kayıt", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        panelOgrenciKayitTemel.setBackground(new java.awt.Color(255, 255, 255));
        panelOgrenciKayitTemel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("AD*");
        panelOgrenciKayitTemel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        txtAd.setForeground(new java.awt.Color(0, 0, 255));
        txtAd.setText(" ");
        panelOgrenciKayitTemel.add(txtAd, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 205, -1));

        txtSoyad.setForeground(new java.awt.Color(0, 0, 255));
        txtSoyad.setText(" ");
        panelOgrenciKayitTemel.add(txtSoyad, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 205, -1));

        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("SOYAD*");
        panelOgrenciKayitTemel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("TC*");
        panelOgrenciKayitTemel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("NUMARA*");
        panelOgrenciKayitTemel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel13.setText("DOGUM TARIH");
        panelOgrenciKayitTemel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        txtDgmYer.setText(" ");
        panelOgrenciKayitTemel.add(txtDgmYer, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 205, -1));

        jLabel10.setText("DOGUM YER");
        panelOgrenciKayitTemel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLabel12.setText("KAYIT TARIH");
        panelOgrenciKayitTemel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jLabel11.setText("CINSIYET");
        panelOgrenciKayitTemel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        jLabel14.setText("KAN GRUBU");
        panelOgrenciKayitTemel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        jLabel16.setText("NOTLAR");
        panelOgrenciKayitTemel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        txtAreaNotlar.setColumns(20);
        txtAreaNotlar.setRows(5);
        txtAreaNotlar.setOpaque(false);
        panelOgrenciKayitTemel.add(txtAreaNotlar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, -1, 120));

        jPanel6.setLayout(new java.awt.BorderLayout());

        lblResim.setIcon(new javax.swing.ImageIcon("D:\\Proje\\images\\A (11).jpg")); // NOI18N
        lblResim.setText("jLabel28");
        jPanel6.add(lblResim, java.awt.BorderLayout.CENTER);

        panelOgrenciKayitTemel.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, 130, 160));

        addPhoto.setText("Ekle/ Değiştir");
        addPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPhotoActionPerformed(evt);
            }
        });
        panelOgrenciKayitTemel.add(addPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 170, 130, -1));

        txtNumara.setForeground(new java.awt.Color(0, 0, 255));
        try {
            txtNumara.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        panelOgrenciKayitTemel.add(txtNumara, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 210, -1));
        panelOgrenciKayitTemel.add(dateChoserDgmTarih, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 137, 203, -1));
        panelOgrenciKayitTemel.add(dateChooserKayıtTarih, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 197, 205, -1));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 204, 255), 1, true));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rbKadın.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupCinsiyet.add(rbKadın);
        rbKadın.setText("KADIN");
        rbKadın.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbKadınActionPerformed(evt);
            }
        });
        jPanel7.add(rbKadın, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        rbErkek.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupCinsiyet.add(rbErkek);
        rbErkek.setSelected(true);
        rbErkek.setText("ERKEK");
        rbErkek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbErkekActionPerformed(evt);
            }
        });
        jPanel7.add(rbErkek, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        panelOgrenciKayitTemel.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 210, 45));

        cmbxKanGrup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A Rh-", "A Rh+", "A Rh-", "AB Rh+", "AB Rh-", "B Rh+", "O Rh+" }));
        panelOgrenciKayitTemel.add(cmbxKanGrup, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 210, -1));

        txtTc.setForeground(new java.awt.Color(0, 0, 255));
        try {
            txtTc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        panelOgrenciKayitTemel.add(txtTc, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 210, -1));

        jLabel17.setText("REFERANS");
        panelOgrenciKayitTemel.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        txtReferans.setText(" ");
        panelOgrenciKayitTemel.add(txtReferans, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 210, 30));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Kimlik Bilgileri", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 10))); // NOI18N

        jLabel23.setText("SERI NO");

        jLabel25.setText("ILCE");

        jLabel26.setText("CILT NO");

        jLabel27.setText("AILE SIRANO");

        txtSeriNo.setText(" ");

        txtIlce.setText(" ");

        txtIl.setText(" ");

        txtAilleSiraNo.setText(" ");

        txtCiltNo.setText(" ");

        jLabel24.setText("IL");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addGap(120, 120, 120)
                        .addComponent(txtIl, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addGap(105, 105, 105)
                        .addComponent(txtIlce, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(84, 84, 84)
                        .addComponent(txtSeriNo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addGap(85, 85, 85)
                        .addComponent(txtCiltNo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addGap(58, 58, 58)
                        .addComponent(txtAilleSiraNo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addComponent(txtIl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtIlce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtSeriNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtCiltNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtAilleSiraNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelOgrenciKayitTemel.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 310, 220));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Okul Bilgileri", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 10))); // NOI18N
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmbBxOgrenimSekli.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sabah", "Ögle", "Tam Gün", "Yarım Gün" }));
        jPanel8.add(cmbBxOgrenimSekli, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 150, -1));

        jLabel15.setText("SINIF");
        jPanel8.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, 10));

        try {
            txtSınıf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-?")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel8.add(txtSınıf, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 150, -1));

        jLabel20.setText("SERVIS GUZERGAH");
        jPanel8.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel21.setText("OKUL");
        jPanel8.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, 10));

        txtOkul.setText(" ");
        jPanel8.add(txtOkul, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 150, -1));

        txtServisGuzergah.setText(" ");
        jPanel8.add(txtServisGuzergah, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 150, -1));

        jLabel22.setText("OGRENIIM SEKLI");
        jPanel8.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        panelOgrenciKayitTemel.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 310, 150));

        jTabbedPaneOgrenciKayıt.addTab("Temel Bilgiler", panelOgrenciKayitTemel);

        panelOgrenciKayıtDetay.setBackground(new java.awt.Color(255, 255, 255));
        panelOgrenciKayıtDetay.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder("Anne Bilgileri"));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel39.setForeground(new java.awt.Color(0, 0, 0));
        jLabel39.setText("AD SOYAD");
        jPanel12.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        txtBabaAdSoyad.setForeground(new java.awt.Color(0, 0, 255));
        txtBabaAdSoyad.setText(" ");
        jPanel12.add(txtBabaAdSoyad, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 205, -1));

        jLabel40.setForeground(new java.awt.Color(0, 0, 0));
        jLabel40.setText("TC");
        jPanel12.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel41.setText("MESLEK");
        jPanel12.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        try {
            txtBabaMeslek.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel12.add(txtBabaMeslek, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 210, -1));

        txtBabaTc.setForeground(new java.awt.Color(0, 0, 255));
        try {
            txtBabaTc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel12.add(txtBabaTc, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 210, -1));

        jLabel42.setText("DOGUM TARIH");
        jPanel12.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));
        jPanel12.add(dateChoserBabaDgmTarih, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 137, 203, -1));

        jLabel43.setText("TELEFON");
        jPanel12.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        try {
            txtBabaTel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel12.add(txtBabaTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 210, -1));

        jLabel44.setForeground(new java.awt.Color(0, 0, 0));
        jLabel44.setText("EGİTİM");
        jPanel12.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        cmbBabaEgitim.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ILKOKUL", "LİSE", "LISANS", "LISANSUSTU" }));
        jPanel12.add(cmbBabaEgitim, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 210, -1));

        panelOgrenciKayıtDetay.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 330, 250));

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder("Anne Bilgileri"));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel45.setForeground(new java.awt.Color(0, 0, 0));
        jLabel45.setText("AD SOYAD");
        jPanel13.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        txtAnneAdSoyad.setForeground(new java.awt.Color(0, 0, 255));
        txtAnneAdSoyad.setText(" ");
        jPanel13.add(txtAnneAdSoyad, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 205, -1));

        jLabel46.setForeground(new java.awt.Color(0, 0, 0));
        jLabel46.setText("TC");
        jPanel13.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel47.setText("MESLEK");
        jPanel13.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        try {
            txtAnneMeslek.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel13.add(txtAnneMeslek, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 210, -1));

        txtAnneTc.setForeground(new java.awt.Color(0, 0, 255));
        try {
            txtAnneTc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel13.add(txtAnneTc, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 210, -1));

        jLabel48.setText("DOGUM TARIH");
        jPanel13.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));
        jPanel13.add(dateChoserAnneDgmTarih, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 137, 203, -1));

        jLabel49.setText("TELEFON");
        jPanel13.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        try {
            txtAnneTel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel13.add(txtAnneTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 210, -1));

        jLabel50.setForeground(new java.awt.Color(0, 0, 0));
        jLabel50.setText("EGİTİM");
        jPanel13.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        cmbAnneEgitim.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ILKOKUL", "LİSE", "LISANS", "LISANSUSTU" }));
        jPanel13.add(cmbAnneEgitim, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 210, -1));

        panelOgrenciKayıtDetay.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 330, 250));

        jTabbedPaneOgrenciKayıt.addTab("Detay Bilgiler", panelOgrenciKayıtDetay);

        panelSozlesme.setBackground(new java.awt.Color(204, 204, 255));

        tblSozlesme.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblSozlesme);

        btnSozlesmeEkle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kurs/takip/Add.png"))); // NOI18N
        btnSozlesmeEkle.setText("Sozlesme Ekle");
        btnSozlesmeEkle.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnSozlesmeEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSozlesmeEkleActionPerformed(evt);
            }
        });

        btnSozlesmeSil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kurs/takip/Erase.png"))); // NOI18N
        btnSozlesmeSil.setText("Sozlesme Sil");
        btnSozlesmeSil.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnSozlesmeSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSozlesmeSilActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel18.setText("TOPLAM KALAN:");

        lblToplamKalan.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblToplamKalan.setForeground(new java.awt.Color(255, 0, 0));
        lblToplamKalan.setText("0");

        jLabel28.setText("TL");

        javax.swing.GroupLayout panelSozlesmeLayout = new javax.swing.GroupLayout(panelSozlesme);
        panelSozlesme.setLayout(panelSozlesmeLayout);
        panelSozlesmeLayout.setHorizontalGroup(
            panelSozlesmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSozlesmeLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelSozlesmeLayout.createSequentialGroup()
                .addComponent(btnSozlesmeSil)
                .addGap(3, 3, 3)
                .addComponent(btnSozlesmeEkle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addGap(73, 73, 73)
                .addComponent(lblToplamKalan)
                .addGap(18, 18, 18)
                .addComponent(jLabel28))
        );
        panelSozlesmeLayout.setVerticalGroup(
            panelSozlesmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSozlesmeLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(panelSozlesmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSozlesmeSil)
                    .addGroup(panelSozlesmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblToplamKalan)
                        .addComponent(jLabel18)
                        .addComponent(jLabel28))
                    .addComponent(btnSozlesmeEkle)))
        );

        jTabbedPaneOgrenciKayıt.addTab("Sozlesmeler", panelSozlesme);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kurs/takip/Update.png"))); // NOI18N
        jButton2.setText("Güncelle");
        jButton2.setMargin(new java.awt.Insets(0, 0, 0, 0));

        btnSil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kurs/takip/Delete.png"))); // NOI18N
        btnSil.setText("Sil");
        btnSil.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMainLayout = new javax.swing.GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFormTemizle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnKaydet)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelMainLayout.createSequentialGroup()
                .addGap(273, 273, 273)
                .addComponent(jTabbedPaneOgrenciKayıt))
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addComponent(jTabbedPaneOgrenciKayıt)
                .addGap(5, 5, 5)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnKaydet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnFormTemizle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSil))
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(1, 1, 1))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(panelMain);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtOgrAraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOgrAraActionPerformed
        List<SimpleExpression>restrictionses=new ArrayList<>();
        if(!txtOgrArananAd.getText().equals(""))
            restrictionses.add(Restrictions.eq("ad", txtOgrArananAd.getText()));
        if(!txtOgrAranansoyad.getText().equals(""))
            restrictionses.add(Restrictions.eq("soyad", txtOgrAranansoyad.getText()));
        if(!txtOgrArananTc.getText().equals(""))
            restrictionses.add(Restrictions.eq("tc", txtOgrArananTc.getText()));
        if(!txtOgrenciArananNumara.getText().equals(""))
            restrictionses.add(Restrictions.eq("numara", Integer.parseInt(txtOgrenciArananNumara.getText())));
        
        if(restrictionses.size()!=0)
        {
           //üzerine sürekli ekleme yapmmaması için sıfırlıyor
            sorguTableModel.setRowCount(0);
           
           
          List<Ogrenci> all= ogrenciDb.sartlıAra(restrictionses);
          if(all.size()==0)
          {
              JOptionPane.showMessageDialog(null, "Hic bir kayıt bulunamadı","Bilgilendirme",JOptionPane.INFORMATION_MESSAGE);
          }
          all.forEach(ogr->{
           
            sorguTableModel.addRow(getFieldsFromOgrenci(ogr));
          });
          bulunanOgrenciler=all;
          
         
        }
        else
            JOptionPane.showMessageDialog(null, "Hic bir alan doldurulmamıs");
         
    }//GEN-LAST:event_txtOgrAraActionPerformed

    
    private void btnGetirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetirActionPerformed
           //üzerine sürekli ekleme yapmmaması için sıfırlıyor
            sorguTableModel.setRowCount(0);
        ogrenciDb
                .getAll()
                .stream()
                .limit(Integer.parseInt(cmbxKayıtGetir.getSelectedItem().toString()))
                .forEach(ogr->{
                sorguTableModel.addRow(getFieldsFromOgrenci(ogr));
                 });
       
       bulunanOgrenciler=  ogrenciDb
                .getAll()
                .stream()
                .limit(Integer.parseInt(cmbxKayıtGetir.getSelectedItem().toString())).collect(Collectors.toList());
       
          
    }//GEN-LAST:event_btnGetirActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void rbErkekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbErkekActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbErkekActionPerformed

    private void rbKadınActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbKadınActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbKadınActionPerformed

    private void btnKaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKaydetActionPerformed
        if(zorunluAlanKontrolEt()==false)
        {
            JOptionPane.showMessageDialog(null, "Zorunlu Alan Bos Gecildi Doldurunuz","Uyarı",JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(ogrenciDb.kayitKontrol(txtTc.getText().trim(),"Tc")==false&&ogrenciDb.kayitKontrol(txtNumara.getText().trim(),"Numara")==false)
        {
            ogrenciDb.save(getOgrenciFromForm());
            JOptionPane.showMessageDialog(null,"KAYIT BASARILI","Bilgilendirme", JOptionPane.INFORMATION_MESSAGE);
            
        }
        else
        {
         JOptionPane.showMessageDialog(null,"BU TC KIMLIK NO VEYA NUMARAYA  AIT BIRISI ZATEN VAR","Uyarı", JOptionPane.WARNING_MESSAGE);
        }
            
    }//GEN-LAST:event_btnKaydetActionPerformed

    private void addPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPhotoActionPerformed
        
        File input = new File("D:\\proje\\a(1).png");
        try {
            BufferedImage image = ImageIO.read(input);
        } catch (IOException ex) {
            Logger.getLogger(FrmOgrenciKayit.class.getName()).log(Level.SEVERE, null, ex);
        }
        

        

    }//GEN-LAST:event_addPhotoActionPerformed

    private void tblSorguMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSorguMouseClicked
        panelTemizle(panelOgrenciKayitTemel);
        panelTemizle(panelOgrenciKayıtDetay);
        panelTemizle(panelSozlesme);
        currentOgr= bulunanOgrenciler.get(tblSorgu.getSelectedRow());
        
        writeOgrenciToForm(currentOgr);
       
    }//GEN-LAST:event_tblSorguMouseClicked

    private void btnFormTemizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFormTemizleActionPerformed
        currentOgr=null;
        panelTemizle(panelOgrenciKayitTemel);
        panelTemizle(panelOgrenciKayıtDetay);
        panelTemizle(panelSozlesme);
        
        
           
    }//GEN-LAST:event_btnFormTemizleActionPerformed
     Consumer cns=ogr->writeOgrenciToForm((Ogrenci)ogr);
    private void btnSozlesmeEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSozlesmeEkleActionPerformed
            
        if(currentOgr==null)
        {
            JOptionPane.showMessageDialog(null, "Once ogrenciyi kaydetmelisiniz...","Uyarı",JOptionPane.WARNING_MESSAGE);
            return;
        }
        frmSozlesmeEkle=new FrmSozlesmeEkle();
            Ogrenci temp=bulunanOgrenciler.get(tblSorgu.getSelectedRow());
            frmSozlesmeEkle.setOgrenci(temp);
            frmSozlesmeEkle.setCons(cns);
            frmSozlesmeEkle.show();
            
            
    }//GEN-LAST:event_btnSozlesmeEkleActionPerformed

    private void btnSozlesmeSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSozlesmeSilActionPerformed
        int row=tblSozlesme.getSelectedRow();
        if(row<0)
        {
            JOptionPane.showMessageDialog(null, "Once listeden sozlesme seciniz");
            return;
        }
        Sozlesme soz=currentSozlesmeler.get(row);
        sozlesmeDb.deleter(soz);
        sozlesmeTableModel.removeRow(row);
    }//GEN-LAST:event_btnSozlesmeSilActionPerformed

    private void btnSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSilActionPerformed
         if (currentOgr==null) {
             JOptionPane.showMessageDialog(null, "Listeden bir ögrenci secin","Uyarı",JOptionPane.ERROR_MESSAGE);
            
        }
        
        else
        {
            if(currentOgr.getSozlesmes().size()>0)
            {
                JOptionPane.showMessageDialog(null, "Ogrenci silinemedi.Secili ogrenciye ait sozlesmeler var.");
                return;
            }
           int res= JOptionPane.showConfirmDialog(null, "Secili ogrenci silinecek onaylıyormusunuz","",JOptionPane.OK_CANCEL_OPTION);
           if(res==JOptionPane.OK_OPTION)
           {
               ogrenciDb.deleter(currentOgr);
               bulunanOgrenciler.remove(currentOgr);
               sorguTableModel.removeRow(tblSorgu.getSelectedRow());
                
               currentOgr=null;
               panelTemizle(panelOgrenciKayitTemel);
               panelTemizle(panelOgrenciKayıtDetay);
           }
           
        }
    }//GEN-LAST:event_btnSilActionPerformed
    private void panelTemizle(JPanel panel)
    {
      lblToplamKalan.setText("0");
        Arrays.asList(panel.getComponents()).stream()
                .forEach(comp->{
                    if(comp.getClass().equals(JTextField.class))
                    {
                        JTextField txt=(JTextField)comp;
                        txt.setText("");
                    }
                    if(comp.getClass().equals(JTextArea.class))
                    {
                        JTextArea txt=(JTextArea)comp;
                        txt.setText("");
                    }
                    if(comp.getClass().equals(JFormattedTextField.class))
                    {
                        JFormattedTextField txt=(JFormattedTextField)comp;
                        txt.setText("");
                    }
                      if(comp.getClass().equals(JDateChooser.class))
                    {
                        JDateChooser date=(JDateChooser)comp;
                        date.setDate(null);
                    }
                    if(comp.getClass().equals(JPanel.class))
                    {
                        JPanel pnl=(JPanel)comp;
                        panelTemizle(pnl);
                    }
                    sozlesmeTableModel.setRowCount(0);
                      
                    
                });
    }
    private void writeOgrenciToForm(Ogrenci ogr)
    {
        sozlesmeTableModel.setRowCount(0);
        txtAd.setText(ogr.getAd());
        txtSoyad.setText(ogr.getSoyad());
        txtTc.setText(ogr.getTc());
        txtNumara.setText(ogr.getNumara().toString());
        dateChoserDgmTarih.setDate(ogr.getDgmTarih());
        txtDgmYer.setText(ogr.getDgmYer());
        dateChooserKayıtTarih.setDate(ogr.getKayitTarih());
        if(ogr.getCinsiyet().equals("Erkek"))
            rbErkek.setSelected(true);
        else
            rbKadın.setSelected(true);
        cmbxKanGrup.setSelectedItem(ogr.getKanGrp());
        txtReferans.setText(ogr.getReferans());
        txtAreaNotlar.setText(ogr.getNotlar());
        txtOkul.setText(ogr.getOkul());
        txtSınıf.setText(ogr.getSinif());
        txtServisGuzergah.setText(ogr.getServisGuzergah());
        cmbBxOgrenimSekli.setSelectedItem(ogr.getOgrenimSekli());
        txtIl.setText(ogr.getIl());
        txtIlce.setText(ogr.getIlce());
        txtSeriNo.setText(ogr.getSeriNo());
        txtCiltNo.setText(ogr.getCiltNo());
        txtAilleSiraNo.setText(ogr.getAileSiraNo());
        txtAnneAdSoyad.setText(ogr.getAnneAdSoyad());
        txtAnneTc.setText(ogr.getAnneTc());
        dateChoserAnneDgmTarih.setDate(ogr.getAnneDgmTarih());
        txtAnneMeslek.setText(ogr.getAnneMeslek());
        cmbAnneEgitim.setSelectedItem(ogr.getAnneEgitim());
        txtAnneTel.setText(ogr.getAnnTelefon());
       
        txtBabaAdSoyad.setText(ogr.getBabaAdSoyad());
        txtBabaTc.setText(ogr.getBabaTc());
        dateChoserBabaDgmTarih.setDate(ogr.getBabaDgmTarih());
        txtBabaMeslek.setText(ogr.getBabaMeslek());
        cmbBabaEgitim.setSelectedItem(ogr.getBabaEgitim());
        txtBabaTel.setText(ogr.getBabaTelefon());
         
        currentSozlesmeler=ogr.getSozlesmes().stream().collect(Collectors.toList());
               currentSozlesmeler.forEach(s->{
                    
            sozlesmeTableModel.addRow(new Object[]{s.getTarih(),s.getToplamTutar(),s.getPesinat(),s.getKalanBorc(),s.getBorcluAd(),s.getBorcluTelefon()
            ,s.getKefilAd(),s.getSozlesmeNot(),s.getSozlesmeVadeTarih()});
            double top=Double.parseDouble(lblToplamKalan.getText());
            top+=s.getKalanBorc().doubleValue();
            lblToplamKalan.setText(Double.toString(top));
            
            
        });
              
         
    }
    private boolean zorunluAlanKontrolEt()
    {
        String tc=txtTc.getText().toString().trim();
        if(txtAd.getText().equals("")||txtSoyad.getText().equals("")||
                txtNumara.getText().equals("")||
           tc.equals(""))
            return false;
        else
            return true;
    }
    private Ogrenci getOgrenciFromForm()
    {
       Integer numara=(txtNumara.getText().trim()).equals("")?null:Integer.parseInt((txtNumara.getText()));
       Ogrenci ogr=new Ogrenci(txtTc.getText().toString().trim());
       ogr.setAd(txtAd.getText());
       ogr.setSoyad(txtSoyad.getText());
       ogr.setDgmYer(txtDgmYer.getText());
       ogr.setKanGrp(cmbxKanGrup.getSelectedItem().toString());
       ogr.setReferans(txtReferans.getText());
       ogr.setNotlar(txtAreaNotlar.getText());
       ogr.setOkul(txtOkul.getText());
       ogr.setSinif(txtSınıf.getText());
       ogr.setServisGuzergah(txtServisGuzergah.getText());
       ogr.setNumara(numara);
       ogr.setDgmTarih(dateChoserDgmTarih.getDate());
       ogr.setKayitTarih(dateChooserKayıtTarih.getDate());
       //Erkek zaten seçili durumunda oldugu için yazılmıştır
       ogr.setCinsiyet(rbKadın.isSelected()?"Kadın":"Erkek");
       ogr.setIl(txtIl.getText());
       ogr.setIlce(txtIlce.getText());
       ogr.setSeriNo(txtSeriNo.getText());
       ogr.setCiltNo(txtCiltNo.getText());
       ogr.setAileSiraNo(txtAilleSiraNo.getText());
       ogr.setOgrenimSekli(cmbBxOgrenimSekli.getSelectedItem().toString());
       
       //Anne Bilgileri
       ogr.setAnneAdSoyad(txtAnneAdSoyad.getText());
       ogr.setAnnTelefon(txtAnneTel.getText());
       ogr.setAnneDgmTarih(dateChoserAnneDgmTarih.getDate());
       ogr.setAnneMeslek(txtAnneMeslek.getText());
       ogr.setAnneTc(txtAnneTc.getText());
       ogr.setAnneEgitim(cmbAnneEgitim.getSelectedItem().toString());
       
       //Baba Bilgileri
       ogr.setBabaAdSoyad(txtBabaAdSoyad.getText());
       ogr.setBabaTelefon(txtBabaTel.getText());
       ogr.setBabaDgmTarih(dateChoserBabaDgmTarih.getDate());
       ogr.setBabaMeslek(txtBabaMeslek.getText());
       ogr.setBabaTc(txtBabaTc.getText());
       ogr.setBabaEgitim(cmbBabaEgitim.getSelectedItem().toString());
       
       
        return ogr;
    }
    private Object[]getFieldsFromOgrenci(Ogrenci ogr)
    {
        return  new Object[]{ogr.getNumara(),ogr.getTc(),ogr.getAd(),ogr.getSoyad()};
    }
    public static void main(String args[]) {
         try { 
        UIManager.setLookAndFeel(MainLookAndFeel.getLookAndView()); 
    } catch(Exception ignored){}

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FrmOgrenciKayit().setVisible(true);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(FrmOgrenciKayit.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addPhoto;
    private javax.swing.JButton btnFormTemizle;
    private javax.swing.JButton btnGetir;
    private javax.swing.ButtonGroup btnGroupCinsiyet;
    private javax.swing.JButton btnKaydet;
    private javax.swing.JButton btnSil;
    private javax.swing.JButton btnSozlesmeEkle;
    private javax.swing.JButton btnSozlesmeSil;
    private javax.swing.JComboBox<String> cmbAnneEgitim;
    private javax.swing.JComboBox<String> cmbBabaEgitim;
    private javax.swing.JComboBox<String> cmbBxOgrenimSekli;
    private javax.swing.JComboBox<String> cmbxKanGrup;
    private javax.swing.JComboBox<String> cmbxKayıtGetir;
    private com.toedter.calendar.JDateChooser dateChooserKayıtTarih;
    private com.toedter.calendar.JDateChooser dateChoserAnneDgmTarih;
    private com.toedter.calendar.JDateChooser dateChoserBabaDgmTarih;
    private com.toedter.calendar.JDateChooser dateChoserDgmTarih;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPaneOgrenciKayıt;
    private javax.swing.JLabel lblResim;
    private javax.swing.JLabel lblToplamKalan;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panelOgrenciKayitTemel;
    private javax.swing.JPanel panelOgrenciKayıtDetay;
    private javax.swing.JPanel panelSozlesme;
    private javax.swing.JRadioButton rbErkek;
    private javax.swing.JRadioButton rbKadın;
    private javax.swing.JTable tblSorgu;
    private javax.swing.JTable tblSozlesme;
    private javax.swing.JTextField txtAd;
    private javax.swing.JTextField txtAilleSiraNo;
    private javax.swing.JTextField txtAnneAdSoyad;
    private javax.swing.JFormattedTextField txtAnneMeslek;
    private javax.swing.JFormattedTextField txtAnneTc;
    private javax.swing.JFormattedTextField txtAnneTel;
    private javax.swing.JTextArea txtAreaNotlar;
    private javax.swing.JTextField txtBabaAdSoyad;
    private javax.swing.JFormattedTextField txtBabaMeslek;
    private javax.swing.JFormattedTextField txtBabaTc;
    private javax.swing.JFormattedTextField txtBabaTel;
    private javax.swing.JTextField txtCiltNo;
    private javax.swing.JTextField txtDgmYer;
    private javax.swing.JTextField txtIl;
    private javax.swing.JTextField txtIlce;
    private javax.swing.JFormattedTextField txtNumara;
    private javax.swing.JButton txtOgrAra;
    private javax.swing.JTextField txtOgrArananAd;
    private javax.swing.JTextField txtOgrArananTc;
    private javax.swing.JTextField txtOgrAranansoyad;
    private javax.swing.JTextField txtOgrenciArananNumara;
    private javax.swing.JTextField txtOkul;
    private javax.swing.JTextField txtReferans;
    private javax.swing.JTextField txtSeriNo;
    private javax.swing.JTextField txtServisGuzergah;
    private javax.swing.JTextField txtSoyad;
    private javax.swing.JFormattedTextField txtSınıf;
    private javax.swing.JFormattedTextField txtTc;
    // End of variables declaration//GEN-END:variables
}   
