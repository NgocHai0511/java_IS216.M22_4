/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import javax.swing.table.DefaultTableModel;
import ConnectDB.OracleConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author TIEN NHAN
 */
public class QLLichTrinh extends javax.swing.JFrame {

    Date nght = null;
    DefaultTableModel dtmLT;
    public ArrayList<String> listmaLT = new ArrayList<String>();
    public ArrayList<String> listmaG = new ArrayList<String>();
    public ArrayList<String> listtenG = new ArrayList<String>();
    public ArrayList<String> listmaT = new ArrayList<String>();
    public ArrayList<String> listtenT = new ArrayList<String>();
    public ArrayList<String> listmaG1 = new ArrayList<String>();
    public ArrayList<String> listtenG1 = new ArrayList<String>();
    public ArrayList<String> listmaG2 = new ArrayList<String>();
    public ArrayList<String> listtenG2 = new ArrayList<String>();
    public ArrayList<String> listmaT1 = new ArrayList<String>();
    public ArrayList<String> listtenT1 = new ArrayList<String>();
    /**
     * Creates new form QLLichTrinh
     */
    public QLLichTrinh() {
        initComponents();
        dtmLT = (DefaultTableModel) tbLT.getModel();
        nght = new java.sql.Date(jDateChooser1.getDate().getTime());
        loadGa();
        loadTau();
        LoadtbLT();
        setVisible(true);
        setLocationRelativeTo(null);
    }
    
    public String LaymaLT(){
        String maLT = "";
        try{
            OracleConnection OC = new OracleConnection();
            Connection conn = null;
            conn = OC.getOracleConnection();
            conn.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
            conn.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            String SQL1 = "SELECT MALT FROM LICHTRINH ORDER BY MALT DESC";
            Statement pres1 = conn.createStatement();
            ResultSet rs1 = pres1.executeQuery(SQL1);
            if(rs1.next()==false){
                maLT = "LT01";
            } else{
                int MLThientai = Integer.parseInt(rs1.getString(1).substring(2,rs1.getString(1).length()-1)) + 1;
                
                if (MLThientai < 10){
                    maLT = "LT0" + MLThientai;
                } else 
                    maLT = "LT" + MLThientai; 
            }          
        }catch (Exception e){
            e.printStackTrace();
        }
        return maLT;
    }
    
    public String getTenGa(String maga){
        String tenGa = "";
        OracleConnection OC = new OracleConnection();
        try{
            Connection conn = OC.getOracleConnection();
            String sql = "SELECT TENGA FROM GA WHERE MAGA = ?";
            PreparedStatement pres = conn.prepareStatement(sql);
            pres.setString(1, maga);
            ResultSet rs = pres.executeQuery();
            if(rs.next()){
                tenGa = rs.getString(1);
            } 
        }catch(Exception e){
            e.printStackTrace();
        }
        return tenGa;
    }
    
    public void loadGa(){
        OracleConnection OC = new OracleConnection();
        Connection conn = null;
        try{
            conn = OC.getOracleConnection();
            String SQL = "SELECT * FROM GA";
            Statement pres = conn.createStatement();
            ResultSet rs = pres.executeQuery(SQL);
            while(rs.next()){
                listmaG.add(rs.getString("maGa"));
                listtenG.add(rs.getString("TenGa"));
            }
            cbgaDi.setModel(new DefaultComboBoxModel(listtenG.toArray()));
            cbgaDen.setModel(new DefaultComboBoxModel(listtenG.toArray()));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public void loadTau(){
        OracleConnection OC = new OracleConnection();
        Connection conn = null;
        try{
            conn = OC.getOracleConnection();
            String SQL = "SELECT * FROM TAU";
            Statement pres = conn.createStatement();
            ResultSet rs = pres.executeQuery(SQL);
            while(rs.next()){
                listmaT.add(rs.getString("MATAU"));
                listtenT.add(rs.getString("TENTAU"));
            }
            cbtenTau.setModel(new DefaultComboBoxModel(listtenT.toArray()));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public void LoadtbLT(){
        dtmLT = (DefaultTableModel) tbLT.getModel();
        OracleConnection OC = new OracleConnection();
        Connection conn = null;
        try{
            conn = OC.getOracleConnection();
            String SQL = "SELECT LICHTRINH.MALT, GAKH, GAKT, TGIANKH, TAU.MATAU, TENTAU FROM LICHTRINH INNER JOIN TAU ON LICHTRINH.MATAU=TAU.MATAU ORDER BY MALT";
            Statement pres = conn.createStatement();
            ResultSet rs = pres.executeQuery(SQL);
            while(rs.next()){
                String malt= rs.getString("MALT");
                listmaLT.add(rs.getString("MALT"));
                String gakh = getTenGa(rs.getString("GAKH"));
                listmaG1.add(rs.getString("GAKH"));
                listtenG1.add(getTenGa(rs.getString("GAKH")));
                String gakt = getTenGa(rs.getString("GAKT"));
                listmaG2.add(rs.getString("GAKT"));
                listtenG2.add(getTenGa(rs.getString("GAKT")));
                String tentau = rs.getString("TENTAU");
                listmaT1.add(rs.getString("MATAU"));
                listtenT1.add(rs.getString("TENTAU"));
                Date ngkh = rs.getDate("TGIANKH");
                Time tgkh = rs.getTime("TGIANKH");
                dtmLT.addRow(new Object[] {malt,gakh,gakt,tentau,ngkh,tgkh});
            }
        }catch (Exception e){
            e.printStackTrace();
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbLT = new javax.swing.JTable();
        txtTraCuu = new javax.swing.JTextField();
        btnTraCuu = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lbmaLT = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        giokh = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cbgaDi = new javax.swing.JComboBox<>();
        cbgaDen = new javax.swing.JComboBox<>();
        cbtenTau = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý lịch trình");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("QUẢN LÝ LỊCH TRÌNH");
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 51), 1, true));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 69, 343, 39));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 102));
        jLabel3.setText("Tìm kiếm: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 154, 81, -1));

        tbLT.setBackground(new java.awt.Color(204, 204, 255));
        tbLT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã lịch trình", "Ga khởi hành", "Ga kết thúc", "Tàu", "Ngày xuất phát", "Thời gian xuất phát"
            }
        ));
        tbLT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbLTMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbLT);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 197, 566, 251));

        txtTraCuu.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        getContentPane().add(txtTraCuu, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 150, 191, -1));

        btnTraCuu.setBackground(new java.awt.Color(153, 255, 255));
        btnTraCuu.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnTraCuu.setForeground(new java.awt.Color(255, 153, 0));
        btnTraCuu.setText("Tra cứu");
        btnTraCuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraCuuActionPerformed(evt);
            }
        });
        getContentPane().add(btnTraCuu, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 150, 109, -1));

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Thông tin lịch trình");
        jLabel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 51), 1, true));

        lbmaLT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbmaLT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel6.setText("Ga khởi hành: ");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel7.setText("Ga kết thúc:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel8.setText("Tàu: ");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel9.setText("Ngày khởi hành: ");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel10.setText("Giờ khởi hành:");

        giokh.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        giokh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                giokhActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel12.setText("HH:MM:SS");

        cbgaDi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        jButton2.setBackground(new java.awt.Color(0, 102, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 51, 0));
        jButton2.setText("Thêm");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 102, 255));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 51, 0));
        jButton3.setText("Reset");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 102, 255));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 51, 0));
        jButton4.setText("Cập nhật");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbmaLT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addGap(57, 57, 57))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbtenTau, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbgaDen, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbgaDi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(giokh, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lbmaLT, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbgaDi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbgaDen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbtenTau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(giokh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2)
                        .addComponent(jButton4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 150, -1, -1));

        jButton1.setBackground(new java.awt.Color(153, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 153, 0));
        jButton1.setText("Reset");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(472, 150, -1, -1));

        jButton5.setBackground(new java.awt.Color(255, 51, 51));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 153));
        jButton5.setText("Thoát");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(546, 477, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PIC_ICON/nen_all.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void giokhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_giokhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_giokhActionPerformed

    private void btnTraCuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraCuuActionPerformed
        // TODO add your handling code here:
        dtmLT = (DefaultTableModel) tbLT.getModel();
        dtmLT.setRowCount(0);
        String tracuu = '%'+txtTraCuu.getText()+'%';
        int kt = 1;
        if(tracuu.equals("")){
            JOptionPane.showMessageDialog(null, "Không có thông tin!", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        OracleConnection OC = new OracleConnection();
        Connection conn = null;
        try{
            conn = OC.getOracleConnection();
            String SQL = "SELECT LICHTRINH.MALT, GAKH, GAKT, TGIANKH, TAU.MATAU, TENTAU FROM LICHTRINH INNER JOIN TAU ON LICHTRINH.MATAU=TAU.MATAU "
                    + "WHERE MALT LIKE ? OR TAU.TENTAU LIKE ? OR TO_CHAR(TGIANKH,'YYYY-MM-DD') LIKE ?";
            PreparedStatement pres = conn.prepareStatement(SQL);
            pres.setString(1, tracuu);
            pres.setString(2, tracuu);
            pres.setString(3, tracuu);
            ResultSet rs = pres.executeQuery();
            while(rs.next()){
                kt = 0;
                String malt= rs.getString("MALT");
                String gakh = getTenGa(rs.getString("GAKH"));
                String gakt = getTenGa(rs.getString("GAKT"));
                String tentau = rs.getString("TENTAU");
                Date ngkh = rs.getDate("TGIANKH");
                Time tgkh = rs.getTime("TGIANKH");
                dtmLT.addRow(new Object[] {malt,gakh,gakt,tentau,ngkh,tgkh});
            }
            if(kt == 1){
                JOptionPane.showMessageDialog(null, "Không tìm thấy thông tin!", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnTraCuuActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dtmLT = (DefaultTableModel) tbLT.getModel();
        txtTraCuu.setText("");
        dtmLT.setRowCount(0);
        LoadtbLT();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tbLTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbLTMouseClicked
        // TODO add your handling code here:
        dtmLT = (DefaultTableModel) tbLT.getModel();
        int indexTB = tbLT.getSelectedRow();
        if(indexTB >= 0 && indexTB < dtmLT.getRowCount()){
            for(int i = 0; i < listmaLT.size(); i++){
                if(dtmLT.getValueAt(indexTB, 0).equals(listmaLT.get(i))){
                    lbmaLT.setText(listmaLT.get(i));
                    cbgaDi.setSelectedItem(listtenG1.get(i));
                    cbgaDen.setSelectedItem(listtenG2.get(i));
                    cbtenTau.setSelectedItem(listtenT1.get(i));
                    jDateChooser1.setDate((java.sql.Date)dtmLT.getValueAt(indexTB, 4));
                    giokh.setText(dtmLT.getValueAt(indexTB, 5).toString());
                }
            }
        }
    }//GEN-LAST:event_tbLTMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        lbmaLT.setText("");
        giokh.setText("");
        jDateChooser1.setDate(nght);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        OracleConnection OC = new OracleConnection();
        Connection conn = null;
        String ngdi = new java.sql.Date (jDateChooser1.getDate().getTime()).toString();
        if(lbmaLT.getText().equals("") == false){
            JOptionPane.showMessageDialog(null, "Bạn cần reset!", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(giokh.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Giờ khởi hành không được để trống!", "ERROR", JOptionPane.ERROR_MESSAGE);
            giokh.setText("");
            return;
        }
        if(jDateChooser1.getDate().compareTo(nght) < 0){
            JOptionPane.showMessageDialog(null, "Ngày khởi hành không được nhỏ hơn hoặc bằng ngày hiện tại!", "ERROR", JOptionPane.ERROR_MESSAGE);
            jDateChooser1.setDate(nght);
            return;
        }
        try{
            conn = OC.getOracleConnection();
            String SQL = "SELECT * FROM LICHTRINH WHERE TO_CHAR(TGIANKH,'YYYY-MM-DD') LIKE ? AND MATAU = ?";
            PreparedStatement pres = conn.prepareStatement(SQL);
            pres.setString(1, '%'+ngdi+'%');
            pres.setString(2, listmaT.get(cbtenTau.getSelectedIndex()));
            ResultSet rs = pres.executeQuery();
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "Trùng lịch trình!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        try{
            Time.valueOf(giokh.getText());
        }catch(Exception e){
            e.printStackTrace();
        }
        if(cbgaDi.getSelectedIndex()==cbgaDen.getSelectedIndex()){
            JOptionPane.showMessageDialog(null, "Ga khởi hành và ga kết thúc không được giống nhau!", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try{
            conn = OC.getOracleConnection();
            String SQL = "INSERT INTO LICHTRINH VALUES (?,?,?,?,TO_DATE(?,'YYYY-MM-DD HH24:MI:SS'))";
            PreparedStatement pres = conn.prepareStatement(SQL);
            pres.setString(1, LaymaLT());
            pres.setString(2,listmaG.get(cbgaDi.getSelectedIndex()));
            pres.setString(3,listmaG.get(cbgaDen.getSelectedIndex()));
            pres.setString(4, listmaT.get(cbtenTau.getSelectedIndex()));
            pres.setString(5, ngdi+' '+giokh.getText());
            int rs = pres.executeUpdate();
            if(rs == 1){
                JOptionPane.showMessageDialog(null, "Thêm thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
                new QLLichTrinh();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        OracleConnection OC = new OracleConnection();
        Connection conn = null;
        String ngdi = new java.sql.Date (jDateChooser1.getDate().getTime()).toString();
        if(lbmaLT.getText().equals("") != false){
            JOptionPane.showMessageDialog(null, "Bạn cần chọn một lịch trình!", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try{
            conn = OC.getOracleConnection();
            String SQL = "SELECT * FROM LICHTRINH INNER JOIN VE ON LICHTRINH.MALT=VE.MALT WHERE LICHTRINH.MALT LIKE ?";
            PreparedStatement pres = conn.prepareStatement(SQL);
            pres.setString(1, '%'+lbmaLT.getText()+'%');
            ResultSet rs = pres.executeQuery();
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "Lịch trình đã có người đặt vé không thể sửa!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        if(giokh.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Giờ khởi hành không được để trống!", "ERROR", JOptionPane.ERROR_MESSAGE);
            giokh.setText("");
            return;
        }
        if(jDateChooser1.getDate().compareTo(nght) < 0){
            JOptionPane.showMessageDialog(null, "Ngày khởi hành không được nhỏ hơn hoặc bằng ngày hiện tại!", "ERROR", JOptionPane.ERROR_MESSAGE);
            jDateChooser1.setDate(nght);
            return;
        }
        try{
            conn = OC.getOracleConnection();
            String SQL = "SELECT * FROM LICHTRINH WHERE TO_CHAR(TGIANKH,'YYYY-MM-DD HH24:MI:SS') LIKE ? AND MATAU = ? AND MALT != '"+lbmaLT.getText()+"'";
            PreparedStatement pres = conn.prepareStatement(SQL);
            pres.setString(1, '%'+ngdi+' '+giokh.getText()+'%');
            pres.setString(2, listmaT.get(cbtenTau.getSelectedIndex()));
            ResultSet rs = pres.executeQuery();
            if(rs.next()){
                System.out.println(rs.getString("MALT"));
                JOptionPane.showMessageDialog(null, "Trùng lịch trình!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        try{
            Time.valueOf(giokh.getText());
        }catch(Exception e){
            e.printStackTrace();
        }
        if(cbgaDi.getSelectedIndex()==cbgaDen.getSelectedIndex()){
            JOptionPane.showMessageDialog(null, "Ga khởi hành và ga kết thúc không được giống nhau!", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try{
            conn = OC.getOracleConnection();
            String SQL = "UPDATE LICHTRINH SET GAKH = ?, GAKT = ?, MATAU = ?, TGIANKH = TO_DATE(?,'YYYY-MM-DD HH24:MI:SS') WHERE MALT LIKE ?";
            PreparedStatement pres = conn.prepareStatement(SQL);         
            pres.setString(1,listmaG.get(cbgaDi.getSelectedIndex()));
            pres.setString(2,listmaG.get(cbgaDen.getSelectedIndex()));
            pres.setString(3, listmaT.get(cbtenTau.getSelectedIndex()));
            pres.setString(4, ngdi+' '+giokh.getText());
            pres.setString(5, '%'+lbmaLT.getText()+'%');
            int rs = pres.executeUpdate();
            if(rs == 1){
                JOptionPane.showMessageDialog(null, "Cập nhật thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
                new QLLichTrinh();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new TrangChu_Admin_fr();
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(QLLichTrinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLLichTrinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLLichTrinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLLichTrinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLLichTrinh().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTraCuu;
    private javax.swing.JComboBox<String> cbgaDen;
    private javax.swing.JComboBox<String> cbgaDi;
    private javax.swing.JComboBox<String> cbtenTau;
    private javax.swing.JTextField giokh;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbmaLT;
    private javax.swing.JTable tbLT;
    private javax.swing.JTextField txtTraCuu;
    // End of variables declaration//GEN-END:variables
}
