
import java.awt.Color;
import java.sql.Connection;
import static java.sql.JDBCType.NULL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Islemler extends javax.swing.JFrame {

    Connection conn, conn1;
    PreparedStatement pst;
    ResultSet rs;
    DefaultTableModel model, model1;
    SimpleDateFormat date;

    public Islemler() {
        initComponents();
        ogrencı_doldur();
        kıtap_doldur();
        pnl_kullanıcıbilgi.setBackground(Color.decode("#2E424D"));
        jPanel2.setBackground(Color.decode("#5B8291"));
        jPanel3.setBackground(Color.decode("#5B8291"));
        jPanel4.setBackground(Color.decode("#5B8291"));
        jPanel5.setBackground(Color.decode("#5B8291"));
        jPanel6.setBackground(Color.decode("#5B8291"));
        jPanel7.setBackground(Color.decode("#5B8291"));
        txt_eklemearea.setBackground(new Color(255, 255, 255, 100));

    }

    public void kıtap_doldur() {
        model = (DefaultTableModel) tbl_book.getModel();
        model.setRowCount(0);
        try {
            ArrayList<Kıtaplar> kitaplar = getKıtaplar();
            for (Kıtaplar k : kitaplar) {
                Object[] row = {k.getID(), k.getKITAPAD(), k.getYAZAR(), k.getSAYFA(), k.getYAYIN(), k.getDURUMU()};
                model.addRow(row);
            }
        } catch (SQLException ex) {

        }
    }

    public void ogrencı_doldur() {
        model1 = (DefaultTableModel) tbl_uye.getModel();
        model1.setRowCount(0);
        try {
            ArrayList<Ogrenciler> ogrencıler = getOgrenciler();
            for (Ogrenciler ogr : ogrencıler) {
                Object[] row = {ogr.getID(), ogr.getTC(), ogr.getAD(), ogr.getSOYAD(), ogr.getALINANKITAP(), ogr.getALINANTARIH()};
                model1.addRow(row);
            }
        } catch (SQLException ex) {

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_kullanıcıbilgi = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbl_kullanıcıadgırıs = new javax.swing.JLabel();
        lbl_tarıh = new javax.swing.JLabel();
        lbl_adgırıs = new javax.swing.JLabel();
        lbl_soyadgırıs1 = new javax.swing.JLabel();
        pnl_panel = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_ogrencıad = new javax.swing.JTextField();
        txt_ogrencıstcno = new javax.swing.JTextField();
        btn_ekle = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txt_ogrencısoyad1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_eklemearea = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        txt_arama = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_uye = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_ekleKıtapAd = new javax.swing.JTextField();
        txt_ekleKıtapYazar = new javax.swing.JTextField();
        txt_ekleKıtapSayfa = new javax.swing.JTextField();
        txt_ekleKıtapYayınevi = new javax.swing.JTextField();
        btn_kıtapEkle = new javax.swing.JButton();
        lbl_eklebıldırım = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        txt_aranan = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_book = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txt_oduncAl_OgrTC = new javax.swing.JTextField();
        txt_oduncAl_ktbad = new javax.swing.JTextField();
        txt_oduncAl_Ograd = new javax.swing.JTextField();
        txt_oduncAL_KTBYZR = new javax.swing.JTextField();
        btn_gerial = new javax.swing.JButton();
        lbl_oduncAl_Bıldırı = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txt_oduncOgrad = new javax.swing.JTextField();
        txt_oduncOgrtc = new javax.swing.JTextField();
        txt_oduncKtbAd = new javax.swing.JTextField();
        txt_oduncKtbYazar = new javax.swing.JTextField();
        btn_oduncVer = new javax.swing.JButton();
        lbl_oduncBıldırı = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\OneDrive\\Belgeler\\NetBeansProjects\\KutuphaneYonetım\\img\\indir.png")); // NOI18N

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("HOŞGELDİNİZ");

        lbl_kullanıcıadgırıs.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_kullanıcıadgırıs.setForeground(new java.awt.Color(255, 255, 255));

        lbl_tarıh.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lbl_tarıh.setForeground(new java.awt.Color(255, 255, 255));

        lbl_adgırıs.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_adgırıs.setForeground(new java.awt.Color(255, 255, 255));

        lbl_soyadgırıs1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_soyadgırıs1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnl_kullanıcıbilgiLayout = new javax.swing.GroupLayout(pnl_kullanıcıbilgi);
        pnl_kullanıcıbilgi.setLayout(pnl_kullanıcıbilgiLayout);
        pnl_kullanıcıbilgiLayout.setHorizontalGroup(
            pnl_kullanıcıbilgiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_kullanıcıbilgiLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(pnl_kullanıcıbilgiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_kullanıcıadgırıs, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_adgırıs, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_tarıh, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_soyadgırıs1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_kullanıcıbilgiLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel7))
                    .addComponent(jLabel6))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        pnl_kullanıcıbilgiLayout.setVerticalGroup(
            pnl_kullanıcıbilgiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_kullanıcıbilgiLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel6)
                .addGap(29, 29, 29)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(lbl_kullanıcıadgırıs, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_adgırıs, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_soyadgırıs1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_tarıh, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Öğrencinin Adı :");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("Öğrencinin Soyadı :");

        txt_ogrencıad.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txt_ogrencıstcno.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        btn_ekle.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btn_ekle.setText("Ekle");
        btn_ekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ekleActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setText("Öğrencinin TC Kimlik No :");

        txt_ogrencısoyad1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txt_eklemearea.setColumns(20);
        txt_eklemearea.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_eklemearea.setForeground(new java.awt.Color(0, 153, 0));
        txt_eklemearea.setRows(5);
        jScrollPane1.setViewportView(txt_eklemearea);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(159, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_ogrencıad, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_ogrencısoyad1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_ogrencıstcno, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(153, 153, 153))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(295, 295, 295)
                .addComponent(btn_ekle, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_ogrencıad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_ogrencısoyad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_ogrencıstcno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(btn_ekle)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pnl_panel.addTab("Yeni Öğrenci Kayıt", jPanel2);

        txt_arama.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_arama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_aramaKeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setText("İsim : ");

        tbl_uye.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tbl_uye.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "TC", "AD", "SOYAD", "ALINAN KİTAP ID", "ALINAN TARİH"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbl_uye);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(txt_arama, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 162, Short.MAX_VALUE))
            .addComponent(jScrollPane2)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_arama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(21, 21, 21)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE))
        );

        pnl_panel.addTab("Kayıtlı Öğrencileri Listele", jPanel3);

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel8.setText("Kitabın Adı :");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel9.setText("Kitabın Yazarı :");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel10.setText("Sayfa Sayısı :");

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel11.setText("Kitabın Yayın Evi:");

        txt_ekleKıtapAd.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_ekleKıtapAd.setText(" ");

        txt_ekleKıtapYazar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_ekleKıtapYazar.setText(" ");

        txt_ekleKıtapSayfa.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_ekleKıtapSayfa.setText(" ");

        txt_ekleKıtapYayınevi.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_ekleKıtapYayınevi.setText(" ");

        btn_kıtapEkle.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btn_kıtapEkle.setText("Ekle");
        btn_kıtapEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kıtapEkleActionPerformed(evt);
            }
        });

        lbl_eklebıldırım.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbl_eklebıldırım.setText(" ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_eklebıldırım, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_ekleKıtapYayınevi, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                            .addComponent(txt_ekleKıtapSayfa, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                            .addComponent(txt_ekleKıtapYazar, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                            .addComponent(txt_ekleKıtapAd)
                            .addComponent(btn_kıtapEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_ekleKıtapAd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_ekleKıtapYazar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txt_ekleKıtapSayfa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txt_ekleKıtapYayınevi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(btn_kıtapEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(lbl_eklebıldırım, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        pnl_panel.addTab("Kitap Ekle", jPanel4);

        txt_aranan.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txt_aranan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_arananKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("Arama İfadesi :");

        tbl_book.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tbl_book.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        tbl_book.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "KİTAP ADI", "YAZAR", "SAYFA SAYISI", "YAYIN", "DURUMU"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tbl_book);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_aranan, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 135, Short.MAX_VALUE))
            .addComponent(jScrollPane3)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_aranan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE))
        );

        pnl_panel.addTab("Kitapları Listele", jPanel5);

        jLabel16.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel16.setText("Öğrencinin Adı : ");

        jLabel17.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel17.setText("Öğrencinin TC No :");

        jLabel18.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel18.setText("Kitabın Adı :");

        jLabel19.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel19.setText("Yazar : ");

        txt_oduncAl_OgrTC.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txt_oduncAl_ktbad.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txt_oduncAl_Ograd.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txt_oduncAL_KTBYZR.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        btn_gerial.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btn_gerial.setText("Onayla");
        btn_gerial.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_gerial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gerialActionPerformed(evt);
            }
        });

        lbl_oduncAl_Bıldırı.setText(" ");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_oduncAl_Bıldırı, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_oduncAL_KTBYZR, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_oduncAl_ktbad, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_oduncAl_OgrTC, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_oduncAl_Ograd, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(btn_gerial, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(290, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_oduncAl_Ograd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txt_oduncAl_OgrTC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txt_oduncAl_ktbad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txt_oduncAL_KTBYZR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(btn_gerial)
                .addGap(69, 69, 69)
                .addComponent(lbl_oduncAl_Bıldırı, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(163, Short.MAX_VALUE))
        );

        pnl_panel.addTab("Kitap Ödünç Al", jPanel7);

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel12.setText("Öğrencinin Adı : ");

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel13.setText("Öğrencinin TC No :");

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel14.setText("Kitabın Adı :");

        jLabel15.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel15.setText("Yazar : ");

        txt_oduncOgrad.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txt_oduncOgrtc.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_oduncOgrtc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_oduncOgrtcActionPerformed(evt);
            }
        });

        txt_oduncKtbAd.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txt_oduncKtbYazar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        btn_oduncVer.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btn_oduncVer.setText("Ödünç Ver");
        btn_oduncVer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_oduncVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_oduncVerActionPerformed(evt);
            }
        });

        lbl_oduncBıldırı.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_oduncBıldırı.setForeground(new java.awt.Color(0, 255, 0));
        lbl_oduncBıldırı.setText(" ");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_oduncBıldırı, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel15)
                        .addComponent(jLabel14)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel12)
                                .addComponent(jLabel13))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_oduncOgrtc)
                                .addComponent(txt_oduncKtbAd)
                                .addComponent(txt_oduncKtbYazar)
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addGap(50, 50, 50)
                                    .addComponent(btn_oduncVer, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txt_oduncOgrad, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(314, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txt_oduncOgrad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txt_oduncOgrtc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txt_oduncKtbAd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txt_oduncKtbYazar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(btn_oduncVer, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addComponent(lbl_oduncBıldırı, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(139, Short.MAX_VALUE))
        );

        pnl_panel.addTab("Kitap Ödünç Ver", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnl_kullanıcıbilgi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnl_panel))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_kullanıcıbilgi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_panel))
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    void lbldoldur(javax.swing.JTextField txt1, String ad, String soyad) {
        lbl_kullanıcıadgırıs.setText("Kullanıcı Adı : " + txt1.getText());
        lbl_adgırıs.setText("Adı : " + ad);
        lbl_soyadgırıs1.setText("Soyadı : " + soyad);
        DateFormat sdf = new SimpleDateFormat("dd/MM/YYYY HH:mm:ss");
        Date tarih = new Date();
        lbl_tarıh.setText("Giriş Tarihi ve Saati : " + sdf.format(tarih));
    }

    @SuppressWarnings("null")
    public ArrayList<Ogrenciler> getOgrenciler() throws SQLException {
        Connection conn = null;
        Statement statement = null;
        ResultSet resultset;
        ArrayList<Ogrenciler> ogrencıler = null;

        try {
            conn = Dbhelper.kys_db_ogrencıler();
            statement = conn.createStatement();
            resultset = statement.executeQuery("SELECT * FROM OGRENCILER");
            ogrencıler = new ArrayList<Ogrenciler>();
            while (resultset.next()) {
                ogrencıler.add(new Ogrenciler(
                        resultset.getInt("ID"),
                        resultset.getString("TC"),
                        resultset.getString("AD"),
                        resultset.getString("SOYAD"),
                        resultset.getString("ALINANKITAP"),
                        resultset.getString("ALINANTARIH")));
            }
        } catch (SQLException ex) {

        } finally {
            statement.close();
            conn.close();
        }
        return ogrencıler;
    }

    @SuppressWarnings("null")
    public ArrayList<Kıtaplar> getKıtaplar() throws SQLException {
        Connection conn = null;
        Dbhelper dbhelper = new Dbhelper();
        Statement statement = null;
        ResultSet resultset;
        ArrayList<Kıtaplar> kitaplar = null;

        try {
            conn = Dbhelper.kys_db_kitaplar();
            statement = conn.createStatement();
            resultset = statement.executeQuery("SELECT * FROM KITAPLAR");
            kitaplar = new ArrayList<Kıtaplar>();
            while (resultset.next()) {
                kitaplar.add(new Kıtaplar(
                        resultset.getInt("ID"),
                        resultset.getString("KITAPAD"),
                        resultset.getString("YAZAR"),
                        resultset.getInt("SAYFA"),
                        resultset.getString("YAYIN"),
                        resultset.getString("DURUMU")));
            }
        } catch (SQLException ex) {

        } finally {
            statement.close();
            conn.close();
        }
        return kitaplar;
    }
    private void btn_ekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ekleActionPerformed
        txt_eklemearea.setText(null);
        try {
            conn = Dbhelper.kys_db_ogrencıler();
            String sql = "INSERT INTO OGRENCILER (AD,SOYAD,TC) VALUES (?,?,?)";
            pst = conn.prepareStatement(sql);
            pst.setString(1, txt_ogrencıad.getText());
            pst.setString(2, txt_ogrencısoyad1.getText());
            pst.setString(3, txt_ogrencıstcno.getText());
            pst.execute();
            ogrencı_doldur();
            txt_eklemearea.append("Öğrenci Başarıyla Eklendi."
                    + "\n\nÖğrencinin Adı : " + txt_ogrencıad.getText()
                    + "\nÖğrencini Soyadı : " + txt_ogrencısoyad1.getText()
                    + "\nÖğrencinin TC Kimlik Numarası : " + txt_ogrencıstcno.getText());

        } catch (SQLException ex) {

        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {

            }
        }
    }//GEN-LAST:event_btn_ekleActionPerformed

    private void txt_aramaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_aramaKeyReleased
        String arananAd = txt_arama.getText();
        TableRowSorter<DefaultTableModel> tableRowSorter
                = new TableRowSorter<DefaultTableModel>(model1);
        tbl_uye.setRowSorter(tableRowSorter);
        tableRowSorter.setRowFilter((RowFilter.regexFilter(arananAd)));
    }//GEN-LAST:event_txt_aramaKeyReleased

    private void txt_arananKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_arananKeyReleased
        String aramaAnahtarı = txt_aranan.getText();
        TableRowSorter<DefaultTableModel> tableRowSorter
                = new TableRowSorter<DefaultTableModel>(model);
        tbl_book.setRowSorter(tableRowSorter);
        tableRowSorter.setRowFilter((RowFilter.regexFilter(aramaAnahtarı)));
    }//GEN-LAST:event_txt_arananKeyReleased

    private void btn_kıtapEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kıtapEkleActionPerformed
        try {
            conn = Dbhelper.kys_db_kitaplar();
            String sql = "INSERT INTO KITAPLAR(KITAPAD,YAZAR,SAYFA,YAYIN) VALUES(?,?,?,?)";
            pst = conn.prepareStatement(sql);
            pst.setString(1, txt_ekleKıtapAd.getText());
            pst.setString(2, txt_ekleKıtapYazar.getText());
            pst.setString(3, txt_ekleKıtapSayfa.getText());
            pst.setString(4, txt_ekleKıtapYayınevi.getText());
            pst.execute();
            kıtap_doldur();
            lbl_eklebıldırım.setText("Kitap Başarıyla Eklendi.");
        } catch (SQLException ex) {
            lbl_eklebıldırım.setText("Hata : " + ex.getMessage());
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {

            }
        }
    }//GEN-LAST:event_btn_kıtapEkleActionPerformed

    private void txt_oduncOgrtcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_oduncOgrtcActionPerformed

    }//GEN-LAST:event_txt_oduncOgrtcActionPerformed

    boolean ogr_kontrol(javax.swing.JTextField txt_ograd, javax.swing.JTextField txt_ogrtc) {
        conn = Dbhelper.kys_db_ogrencıler();
        boolean deger = true;
        try {
            String sql = "SELECT * FROM OGRENCILER WHERE AD = ? AND TC = ?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, txt_ograd.getText());
            pst.setString(2, txt_ogrtc.getText());
            rs = pst.executeQuery();
            while (rs.next()) {
                if (rs.getString(5) == null) {
                    deger = true;
                } else {
                    deger = false;
                }
            }
        } catch (SQLException ex) {
            System.out.println("Hata ogr_kontrol : " + ex.getMessage());
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {

            }
        }
        return deger;
    }

    boolean kıtap_kontrol(javax.swing.JTextField txt_kıtapad, javax.swing.JTextField txt_kıtapyazar) {
        boolean deger = true;
        conn = Dbhelper.kys_db_kitaplar();
        try {
            String sql = "SELECT * FROM KITAPLAR WHERE KITAPAD = ? AND YAZAR = ?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, txt_kıtapad.getText());
            pst.setString(2, txt_kıtapyazar.getText());
            rs = pst.executeQuery();
            while (rs.next()) {
                if (rs.getString(6) == null) {
                    deger = true;
                } else {
                    deger = false;
                }
            }
        } catch (SQLException ex) {
            System.out.println("Hata kıtap_kontrol : " + ex.getMessage());
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {

            }
        }
        return deger;
    }


    private void btn_oduncVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_oduncVerActionPerformed
        if (ogr_kontrol(txt_oduncOgrad, txt_oduncOgrtc) == true) {
            if (kıtap_kontrol(txt_oduncKtbAd, txt_oduncKtbYazar) == true) {
                try {
                    conn = Dbhelper.kys_db_ogrencıler();
                    conn1 = Dbhelper.kys_db_kitaplar();
                    String sql = "UPDATE OGRENCILER SET ALINANKITAP = ?, ALINANTARIH = ? WHERE AD = ? AND TC = ?";
                    pst = conn.prepareStatement(sql);
                    pst.setString(1, txt_oduncKtbAd.getText());
                    DateFormat sdf = new SimpleDateFormat("dd/MM/YYYY HH:mm:ss");
                    Date tarih = new Date();
                    pst.setString(2, String.valueOf(sdf.format(tarih)));
                    pst.setString(3, txt_oduncOgrad.getText());
                    pst.setString(4, txt_oduncOgrtc.getText());
                    pst.execute();
                    String sql1 = "UPDATE KITAPLAR SET DURUMU = ? WHERE KITAPAD = ? AND YAZAR = ?";
                    pst = conn1.prepareStatement(sql1);
                    pst.setString(1, "Kullanımda");
                    pst.setString(2, txt_oduncKtbAd.getText());
                    pst.setString(3, txt_oduncKtbYazar.getText());
                    pst.execute();
                    lbl_oduncBıldırı.setText("İŞLEM BAŞARILI.");
                } catch (SQLException ex) {
                    System.out.println("Hata : " + ex.getMessage());
                } finally {
                    try {
                        conn.close();
                        conn1.close();
                        //kıtap_doldur();
                    } catch (SQLException ex) {

                    }
                }
            }else{
                lbl_oduncBıldırı.setText("İstenilen kitap şuan kullanımda.");
            }

        }else{
            lbl_oduncBıldırı.setText("Kullanıcı adına kitap kayıtlı.");
        }
    }//GEN-LAST:event_btn_oduncVerActionPerformed


    private void btn_gerialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gerialActionPerformed
        try {
            conn = Dbhelper.kys_db_ogrencıler();
            conn1 = Dbhelper.kys_db_kitaplar();
            String sql = "UPDATE OGRENCILER SET ALINANKITAP = ?, ALINANTARIH = ? WHERE AD = ? AND TC = ?";
            pst = conn.prepareStatement(sql);
            Object deger = NULL;
            pst.setObject(1, deger);
            pst.setObject(2, deger);
            pst.setString(3, txt_oduncOgrad.getText());
            pst.setString(4, txt_oduncOgrtc.getText());
            pst.executeUpdate();
            String sql1 = "UPDATE KITAPLAR SET DURUMU = ?  WHERE KITAPAD = ? AND YAZAR = ?";
            pst = conn1.prepareStatement(sql1);
            pst.setObject(1, deger);
            pst.setString(2, txt_oduncKtbAd.getText());
            pst.setString(3, txt_oduncKtbYazar.getText());
            pst.executeUpdate();
            lbl_oduncAl_Bıldırı.setText("İŞLEM BAŞARILI.");
        } catch (SQLException ex) {
            System.out.println("Hata : " + ex.getMessage());
        } finally {
            try {
                conn.close();
                conn1.close();
            } catch (SQLException ex) {

            }
        }
    }//GEN-LAST:event_btn_gerialActionPerformed
    /**/
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
            java.util.logging.Logger.getLogger(Islemler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Islemler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Islemler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Islemler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Islemler().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ekle;
    private javax.swing.JButton btn_gerial;
    private javax.swing.JButton btn_kıtapEkle;
    private javax.swing.JButton btn_oduncVer;
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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbl_adgırıs;
    private javax.swing.JLabel lbl_eklebıldırım;
    private javax.swing.JLabel lbl_kullanıcıadgırıs;
    private javax.swing.JLabel lbl_oduncAl_Bıldırı;
    private javax.swing.JLabel lbl_oduncBıldırı;
    private javax.swing.JLabel lbl_soyadgırıs1;
    private javax.swing.JLabel lbl_tarıh;
    private javax.swing.JPanel pnl_kullanıcıbilgi;
    private javax.swing.JTabbedPane pnl_panel;
    private javax.swing.JTable tbl_book;
    private javax.swing.JTable tbl_uye;
    private javax.swing.JTextField txt_arama;
    private javax.swing.JTextField txt_aranan;
    private javax.swing.JTextField txt_ekleKıtapAd;
    private javax.swing.JTextField txt_ekleKıtapSayfa;
    private javax.swing.JTextField txt_ekleKıtapYayınevi;
    private javax.swing.JTextField txt_ekleKıtapYazar;
    private javax.swing.JTextArea txt_eklemearea;
    private javax.swing.JTextField txt_oduncAL_KTBYZR;
    private javax.swing.JTextField txt_oduncAl_OgrTC;
    private javax.swing.JTextField txt_oduncAl_Ograd;
    private javax.swing.JTextField txt_oduncAl_ktbad;
    private javax.swing.JTextField txt_oduncKtbAd;
    private javax.swing.JTextField txt_oduncKtbYazar;
    private javax.swing.JTextField txt_oduncOgrad;
    private javax.swing.JTextField txt_oduncOgrtc;
    private javax.swing.JTextField txt_ogrencıad;
    private javax.swing.JTextField txt_ogrencısoyad1;
    private javax.swing.JTextField txt_ogrencıstcno;
    // End of variables declaration//GEN-END:variables
}
