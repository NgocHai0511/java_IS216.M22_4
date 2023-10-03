package GUI;

import ConnectDB.OracleConnection;
import static java.awt.image.ImageObserver.HEIGHT;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class KH_XemThongTinVeDaDat_fr extends javax.swing.JFrame {

    static String MKHHT;
    DefaultTableModel table = new DefaultTableModel();
    ArrayList<Vector> List = new ArrayList<>();
    public KH_XemThongTinVeDaDat_fr() {
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public void set_MKHHT(String a){
        MKHHT=a;            
    }
    public void loadthongtin_KH(String maKH){
        try {
            Connection conn = OracleConnection.getOracleConnection();
            String SQL_layTT="select*from khachhang where maKh='"+maKH+"'";
            Statement stat = conn.createStatement();
            ResultSet rs = stat.executeQuery(SQL_layTT);
            if(!rs.next()){
                JOptionPane.showMessageDialog(rootPane, "Không tìm thấy thông tin khách hàng", "Lỗi.", HEIGHT);
                return;
            }
            makh_txt.setText(rs.getString("maKH"));
            tenkh_txt.setText(rs.getString("hoten"));
            sdt_txt.setText(rs.getString("sodt"));
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void loadthongtin_Table(String maKH){
        jTable1.setModel(table);
        String []tieude={"Mã Vé","Ngày đặt vé","Tuyến tàu","Tên tàu","Loại tàu","Thời gian khởi hành","Danh sách ghế đã chọn","Tổng tiền"};
        table.setColumnIdentifiers(tieude);
        
        try {
            Connection conn= OracleConnection.getOracleConnection();
            String SQL="select * from ve a,lichtrinh b\n" +
                            "where a.malt=b.malt and makh='"+maKH+"'\n" +
                                 "order by mave";
            Statement stat = conn.createStatement();          
            ResultSet rs = stat.executeQuery(SQL);
            while(rs.next()){
                Vector rowData = new Vector();
                rowData.add(rs.getString("mave"));
                rowData.add(rs.getDate("ngaydatve"));
                rowData.add(get_Tuyentau(rs.getString("gakh"),rs.getString("gakt")));
                rowData.add(lay_tentau(rs.getString("matau")));
                rowData.add(lay_loaitau(rs.getString("matau")));
                rowData.add(lay_thoigianKH(rs.getString("malt")));
                rowData.add(lay_danhsachghechon(rs.getString("mave")));
                rowData.add(rs.getString("tongtien"));
               List.add(rowData);
               table.addRow(rowData);
            }
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
      
    }
    
    
    
    
    
    
    public String get_TenGa(String maGa){
        String kq="Lỗi tìm tên ga!";
        try {
            Connection conn= OracleConnection.getOracleConnection();
            String SQL="select tenga from ga where maga='"+maGa+"'";
            Statement stat = conn.createStatement();          
            ResultSet rs = stat.executeQuery(SQL);
            rs.next();
            return rs.getString("Tenga");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kq;
    }   
    public String get_Tuyentau(String Ga_KH,String Ga_KT){ 
        return get_TenGa(Ga_KH)+" - "+get_TenGa(Ga_KT);
    }
    public String lay_danhsachghechon(String maVe){
        String kq="Lỗi tìm danh sách ghế!";
        try {
            Connection conn= OracleConnection.getOracleConnection();
            String SQL="select maghe from ctve where mave='"+maVe+"'";
            Statement stat = conn.createStatement();          
            ResultSet rs = stat.executeQuery(SQL);
            kq="";
            while(rs.next())
                kq=kq+rs.getString("maghe")+",";
            return kq;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kq;
    }
    public String lay_tentau(String maTau){
        String kq="Lỗi tìm tên tàu!";
        try {
            Connection conn= OracleConnection.getOracleConnection();
            String SQL="select tentau from tau where matau='"+maTau+"'";
            Statement stat = conn.createStatement();          
            ResultSet rs = stat.executeQuery(SQL);
            rs.next();
            return rs.getString("Tentau");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kq;
    }
    public String lay_loaitau(String maTau){
        String kq="Lỗi tìm loại tàu!";
        try {
            Connection conn= OracleConnection.getOracleConnection();
            String SQL="select loaitau from tau where matau='"+maTau+"'";
            Statement stat = conn.createStatement();          
            ResultSet rs = stat.executeQuery(SQL);
            rs.next();
            rs.getInt("loaitau");
            switch(rs.getInt("loaitau")){
                case 1:
                    return "Bình dân";
                case 2:
                    return "Cao cấp";
                case 3:
                    return "Thương gia";
                default:
                    return "Lỗi tìm loại tàu";         
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kq;
    }
    public String lay_thoigianKH(String maLT){
        String kq="Lỗi tìm thời gian khởi hành!";
        try {
            Connection conn= OracleConnection.getOracleConnection();
            String SQL="select to_char( TgianKH, 'HH24:MI:SS DD/MM/YYYY' )as TGKH from lichtrinh where maLT='"+maLT+"'";
            Statement stat = conn.createStatement();          
            ResultSet rs = stat.executeQuery(SQL);
            rs.next();
            return rs.getString("TGKH");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kq;
    }    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        makh_txt = new javax.swing.JLabel();
        tenkh_txt = new javax.swing.JLabel();
        sdt_txt = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setText("Mã khách hàng:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 29, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 0));
        jLabel2.setText("Tên khách hàng:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 66, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 0));
        jLabel3.setText("Số điện thoại:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 103, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 51));
        jLabel4.setText("Thông tin vé đã đặt");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, 230, -1));

        makh_txt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        makh_txt.setForeground(new java.awt.Color(255, 0, 102));
        makh_txt.setText("jLabel5");
        getContentPane().add(makh_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 29, 227, -1));

        tenkh_txt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tenkh_txt.setForeground(new java.awt.Color(255, 0, 102));
        tenkh_txt.setText("jLabel6");
        getContentPane().add(tenkh_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 66, 227, -1));

        sdt_txt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        sdt_txt.setForeground(new java.awt.Color(255, 0, 102));
        sdt_txt.setText("jLabel7");
        getContentPane().add(sdt_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 103, 227, -1));

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(536, 532, 113, -1));

        jTable1.setBackground(new java.awt.Color(51, 255, 255));
        jTable1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1331, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 224, 1355, -1));

        jButton2.setBackground(new java.awt.Color(255, 51, 51));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setText("Thoát");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(699, 532, 100, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PIC_ICON/nen_all.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      table.setRowCount(0);
      loadthongtin_Table(MKHHT);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        TrangChu_KhachHang_fr a = new TrangChu_KhachHang_fr();
        a.set_MKHHT(MKHHT);
    }//GEN-LAST:event_jButton2ActionPerformed
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KH_XemThongTinVeDaDat_fr().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel makh_txt;
    private javax.swing.JLabel sdt_txt;
    private javax.swing.JLabel tenkh_txt;
    // End of variables declaration//GEN-END:variables
}
