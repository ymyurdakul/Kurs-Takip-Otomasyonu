 
package com.UserInterface;
 

import com.Settings.MainLookAndFeel;
import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.metal.MetalLookAndFeel;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import javax.swing.plaf.synth.SynthLookAndFeel;

public class FrmAnaSayfa extends javax.swing.JFrame {
     private FrmOgrenciKayit frmKayit;
   
    public FrmAnaSayfa() throws UnsupportedLookAndFeelException, IOException {
           UIManager.setLookAndFeel(MainLookAndFeel.getLookAndView()); 
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        frmKayit=new FrmOgrenciKayit();
         
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblKullanciAdi = new javax.swing.JLabel();
        cmbTema = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        btnYeniOgrenci = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        btnMesaj = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        jButton16 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jButton17 = new javax.swing.JButton();
        btnHakkinda = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(1);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Kullanıcı Adı");

        lblKullanciAdi.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lblKullanciAdi.setForeground(new java.awt.Color(255, 255, 255));
        lblKullanciAdi.setText("Kullanıcı Adı");

        cmbTema.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        cmbTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTemaActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Tema");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addComponent(lblKullanciAdi)
                .addGap(1063, 1063, 1063)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbTema, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(lblKullanciAdi)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbTema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)))
                .addGap(1, 1, 1))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Diger İslemler");
        jLabel2.setAlignmentY(0.0F);
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setOpaque(true);
        jLabel2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 420, 20));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kurs/takip/People.png"))); // NOI18N
        jButton2.setText("Ögrenci İslemleri");
        jButton2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 30));

        btnYeniOgrenci.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kurs/takip/Person.png"))); // NOI18N
        btnYeniOgrenci.setText("Yeni Ögrenci");
        btnYeniOgrenci.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnYeniOgrenci.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnYeniOgrenci.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnYeniOgrenci.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnYeniOgrenci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYeniOgrenciActionPerformed(evt);
            }
        });
        jPanel4.add(btnYeniOgrenci, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 130, 30));

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ögrenci İslemleri");
        jLabel3.setAlignmentY(0.0F);
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel3.setOpaque(true);
        jLabel3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 150, 20));

        jSeparator2.setBackground(new java.awt.Color(255, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(255, 0, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jSeparator2.setPreferredSize(new java.awt.Dimension(5, 0));
        jPanel4.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, -1, 110));

        jSeparator3.setBackground(new java.awt.Color(255, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(255, 0, 0));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jSeparator3.setPreferredSize(new java.awt.Dimension(5, 0));
        jPanel4.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, -1, 110));

        jLabel4.setBackground(new java.awt.Color(51, 51, 51));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("    Yardım");
        jLabel4.setAlignmentY(0.0F);
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel4.setOpaque(true);
        jLabel4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 90, 250, 20));

        jLabel5.setBackground(new java.awt.Color(51, 51, 51));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cıkış");
        jLabel5.setAlignmentY(0.0F);
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel5.setOpaque(true);
        jLabel5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 90, 130, 20));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kurs/takip/Dollar.png"))); // NOI18N
        jButton4.setText("Banka");
        jButton4.setHideActionText(true);
        jButton4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton4.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jPanel4.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 80, 30));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/UserInterface/Money_Safe_1_Icon_32.png"))); // NOI18N
        jButton6.setText("Kasa");
        jButton6.setHideActionText(true);
        jButton6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton6.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jPanel4.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 80, 30));

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kurs/takip/card_32x32.png"))); // NOI18N
        jButton7.setText("Kredi Kartı");
        jButton7.setHideActionText(true);
        jButton7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton7.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jPanel4.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 110, 30));

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kurs/takip/List.png"))); // NOI18N
        jButton10.setText("Faturalar");
        jButton10.setHideActionText(true);
        jButton10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton10.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton10.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jPanel4.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 110, 30));

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kurs/takip/User group.png"))); // NOI18N
        jButton9.setText("Personel");
        jButton9.setHideActionText(true);
        jButton9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton9.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton9.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jPanel4.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 90, 30));

        btnMesaj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kurs/takip/E-mail.png"))); // NOI18N
        btnMesaj.setText("Mesaj");
        btnMesaj.setHideActionText(true);
        btnMesaj.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMesaj.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnMesaj.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnMesaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesajActionPerformed(evt);
            }
        });
        jPanel4.add(btnMesaj, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 90, 30));

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/UserInterface/Money_Safe_1_Icon_32.png"))); // NOI18N
        jButton12.setText("Cari");
        jButton12.setHideActionText(true);
        jButton12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton12.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton12.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jPanel4.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 70, 30));

        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kurs/takip/Female.png"))); // NOI18N
        jButton13.setText("İK");
        jButton13.setHideActionText(true);
        jButton13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton13.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton13.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jPanel4.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, 70, 30));

        jSeparator4.setBackground(new java.awt.Color(255, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(255, 0, 0));
        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jSeparator4.setPreferredSize(new java.awt.Dimension(5, 0));
        jPanel4.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 0, -1, 110));

        jLabel6.setBackground(new java.awt.Color(51, 51, 51));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Raporlar");
        jLabel6.setAlignmentY(0.0F);
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel6.setOpaque(true);
        jLabel6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, 320, 20));

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kurs/takip/Copy.png"))); // NOI18N
        jButton11.setText("Ögrenci");
        jButton11.setHideActionText(true);
        jButton11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton11.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton11.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jPanel4.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 120, 30));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kurs/takip/Copy.png"))); // NOI18N
        jButton8.setText("sınıf");
        jButton8.setHideActionText(true);
        jButton8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton8.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jPanel4.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, 120, 30));

        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kurs/takip/Copy.png"))); // NOI18N
        jButton14.setText("Ödeme");
        jButton14.setHideActionText(true);
        jButton14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton14.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton14.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jPanel4.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, 110, 30));

        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kurs/takip/line_chart_32x32.png"))); // NOI18N
        jButton15.setText("İstatistik");
        jButton15.setHideActionText(true);
        jButton15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton15.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton15.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jPanel4.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 50, 110, 30));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kurs/takip/Exit.png"))); // NOI18N
        jButton1.setAlignmentY(0.0F);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setIconTextGap(0);
        jButton1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 10, 60, 70));

        jSeparator5.setBackground(new java.awt.Color(255, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(255, 0, 0));
        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jSeparator5.setPreferredSize(new java.awt.Dimension(5, 0));
        jPanel4.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 0, -1, 110));

        jButton16.setAlignmentY(0.0F);
        jButton16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton16.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton16.setIconTextGap(0);
        jButton16.setLabel("Diger >>");
        jButton16.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jPanel4.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, 60, 70));

        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kurs/takip/Car key.png"))); // NOI18N
        jButton19.setText("Demirbaş");
        jButton19.setHideActionText(true);
        jButton19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton19.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton19.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jPanel4.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, 110, 30));

        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kurs/takip/Blue tag.png"))); // NOI18N
        jButton20.setText("Sabitler");
        jButton20.setHideActionText(true);
        jButton20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton20.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton20.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jPanel4.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 50, 110, 30));

        jLabel7.setBackground(new java.awt.Color(51, 51, 51));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Demirbas ve Sabitler");
        jLabel7.setAlignmentY(0.0F);
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel7.setOpaque(true);
        jLabel7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 90, 130, 20));

        jSeparator6.setBackground(new java.awt.Color(255, 0, 0));
        jSeparator6.setForeground(new java.awt.Color(255, 0, 0));
        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jSeparator6.setPreferredSize(new java.awt.Dimension(5, 0));
        jPanel4.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 0, -1, 110));

        jButton17.setText("GeriBildirim");
        jButton17.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jPanel4.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 10, 70, 70));

        btnHakkinda.setText("Hakkında");
        btnHakkinda.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnHakkinda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHakkindaActionPerformed(evt);
            }
        });
        jPanel4.add(btnHakkinda, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 10, 70, 70));

        jButton21.setText("Kısayollar");
        jButton21.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jPanel4.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 10, 70, 70));

        jButton22.setText("jButton22");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton22)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 344, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel2);

        jMenuBar1.setBackground(new java.awt.Color(51, 51, 51));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));

        jMenu1.setForeground(new java.awt.Color(255, 255, 255));
        jMenu1.setText("Dosya");
        jMenuBar1.add(jMenu1);

        jMenu2.setForeground(new java.awt.Color(255, 255, 255));
        jMenu2.setText("Düzenle");
        jMenuBar1.add(jMenu2);

        jMenu3.setForeground(new java.awt.Color(255, 255, 255));
        jMenu3.setText("Yedekleme");

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kurs/takip/Upload.png"))); // NOI18N
        jMenuItem2.setText("Yedek Al");
        jMenu3.add(jMenuItem2);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kurs/takip/Load.png"))); // NOI18N
        jMenuItem3.setText("Yedekten Yükle");
        jMenu3.add(jMenuItem3);

        jMenuItem4.setText("Excele Aktar");
        jMenu3.add(jMenuItem4);

        jMenuItem5.setText("Excelden Aktar");
        jMenu3.add(jMenuItem5);

        jMenuBar1.add(jMenu3);

        jMenu4.setForeground(new java.awt.Color(255, 255, 255));
        jMenu4.setText("Ayarlar");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTemaActionPerformed
        switch(cmbTema.getSelectedItem().toString())
        {
            case "1":
        {
            MainLookAndFeel.setLookAndFeel(new MetalLookAndFeel());
            
        }
        break;
        case "2":
        {
             MainLookAndFeel.setLookAndFeel(new NimbusLookAndFeel());
           
        }
               
        
        break;
        case "3":
        {
             MainLookAndFeel.setLookAndFeel(new NimbusLookAndFeel());
           
        }
               
        break;
        }
         try {
            try {
                UIManager.setLookAndFeel(MainLookAndFeel.getLookAndView());
            } catch (IOException ex) {
                Logger.getLogger(FrmAnaSayfa.class.getName()).log(Level.SEVERE, null, ex);
            }
         } catch (UnsupportedLookAndFeelException ex) {
             Logger.getLogger(FrmAnaSayfa.class.getName()).log(Level.SEVERE, null, ex);
         }
        SwingUtilities.updateComponentTreeUI(this);
        
        this.repaint();
    }//GEN-LAST:event_cmbTemaActionPerformed

    private void btnYeniOgrenciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYeniOgrenciActionPerformed
       
        frmKayit.show();
    }//GEN-LAST:event_btnYeniOgrenciActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
         try {
             MainLookAndFeel.save();
         } catch (IOException ex) {
             Logger.getLogger(FrmAnaSayfa.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_formWindowClosing

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       frmKayit.show();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnMesajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesajActionPerformed
             
    }//GEN-LAST:event_btnMesajActionPerformed

    private void btnHakkindaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHakkindaActionPerformed
           FrmHakkında frmHak=new FrmHakkında();
           frmHak.show();
    }//GEN-LAST:event_btnHakkindaActionPerformed

    
    public static void main(String args[]) throws UnsupportedLookAndFeelException {
       
     
       
         
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FrmAnaSayfa().setVisible(true);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(FrmAnaSayfa.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(FrmAnaSayfa.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHakkinda;
    private javax.swing.JButton btnMesaj;
    private javax.swing.JButton btnYeniOgrenci;
    private javax.swing.JComboBox<String> cmbTema;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lblKullanciAdi;
    // End of variables declaration//GEN-END:variables
}
