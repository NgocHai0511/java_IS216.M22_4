
package GUI;

import ConnectDB.OracleConnection;
import static java.awt.image.ImageObserver.HEIGHT;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class ThongTinCaNhan_KhachHang_fr extends javax.swing.JFrame {

    static String MKHHT;
    public ThongTinCaNhan_KhachHang_fr() {
        initComponents();
        setVisible(true);
        setTitle("Thông tin khách hàng");
        setLocationRelativeTo(null);
    }
    public void set_MKHHT(String a){
        MKHHT=a;            
    }
    public void loadThongTinKH(String maKH) {
        try {
            Connection conn = OracleConnection.getOracleConnection();
            String SQL_layTT="select*from khachhang join taikhoan on khachhang.tendn=taikhoan.tendn where maKh='"+maKH+"'";
            Statement stat = conn.createStatement();
            ResultSet rs = stat.executeQuery(SQL_layTT);
            if(!rs.next()){
                JOptionPane.showMessageDialog(rootPane, "Không tìm thấy thông tin khách hàng", "Lỗi.", HEIGHT);
                return;
            }
            makh_txt.setText(rs.getString("maKH"));
            tenkh_txt.setText(rs.getString("hoten"));
            sdt_txt.setText(rs.getString("sodt"));
            tendn_txt.setText(rs.getString("tendn"));
            pass_txt.setText(rs.getString("matkhau"));
            cauhoi_txt.setText(rs.getString("cauhoi"));
            cautraloi_txt.setText(rs.getString("traloi"));
            
            makh_txt.setEditable(false);
            tenkh_txt.setEditable(false);
            sdt_txt.setEditable(false);
            tendn_txt.setEditable(false);
            pass_txt.setEditable(false);
            cauhoi_txt.setEditable(false);
            cautraloi_txt.setEditable(false);   
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        makh_txt = new javax.swing.JTextField();
        tenkh_txt = new javax.swing.JTextField();
        sdt_txt = new javax.swing.JTextField();
        tendn_txt = new javax.swing.JTextField();
        pass_txt = new javax.swing.JTextField();
        button_edit_1 = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cauhoi_txt = new javax.swing.JTextField();
        cautraloi_txt = new javax.swing.JTextField();
        xacnhan_button = new javax.swing.JButton();
        reset_button = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setForeground(new java.awt.Color(51, 51, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("Mã khách hàng:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 0));
        jLabel2.setText("Tên:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 0));
        jLabel3.setText("Số điện thoại:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 0));
        jLabel4.setText("Tên Đăng Nhập:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 0));
        jLabel5.setText("Mật khẩu:");

        makh_txt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        tenkh_txt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        sdt_txt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        tendn_txt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        pass_txt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        button_edit_1.setBackground(new java.awt.Color(204, 204, 204));
        button_edit_1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        button_edit_1.setText("sửa");
        button_edit_1.setVerifyInputWhenFocusTarget(false);
        button_edit_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_edit_1ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("sửa");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setText("sửa");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setText("sửa");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 153, 0));
        jLabel6.setText("Câu hỏi bảo mật");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 153, 0));
        jLabel7.setText("Câu trả lời:");

        cauhoi_txt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        cautraloi_txt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        xacnhan_button.setBackground(new java.awt.Color(255, 0, 0));
        xacnhan_button.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        xacnhan_button.setForeground(new java.awt.Color(0, 51, 204));
        xacnhan_button.setText("Xác nhận");
        xacnhan_button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        xacnhan_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xacnhan_buttonActionPerformed(evt);
            }
        });

        reset_button.setBackground(new java.awt.Color(255, 0, 0));
        reset_button.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        reset_button.setForeground(new java.awt.Color(0, 51, 204));
        reset_button.setText("Reset");
        reset_button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        reset_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_buttonActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(255, 255, 0));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton6.setText("Thoát");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tendn_txt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(makh_txt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tenkh_txt)
                            .addComponent(sdt_txt)
                            .addComponent(pass_txt))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button_edit_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cauhoi_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cautraloi_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(134, 134, 134))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addGap(121, 121, 121))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(365, 365, 365)
                .addComponent(xacnhan_button, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(reset_button, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(makh_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tenkh_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_edit_1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(sdt_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tendn_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(pass_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cauhoi_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cautraloi_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3)))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(xacnhan_button)
                    .addComponent(reset_button))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton6)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, 1020, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PIC_ICON/nen_all.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 0, 1030, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void reset_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_buttonActionPerformed
        this.dispose();
        new ThongTinCaNhan_KhachHang_fr().loadThongTinKH(MKHHT);
    }//GEN-LAST:event_reset_buttonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(cauhoi_txt.isEditable())
            cauhoi_txt.setEditable(false);
        else
            cauhoi_txt.setEditable(true);

        if(cautraloi_txt.isEditable())
            cautraloi_txt.setEditable(false);
        else
            cautraloi_txt.setEditable(true);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(pass_txt.isEditable())
            pass_txt.setEditable(false);
        else
            pass_txt.setEditable(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        sdt_txt.setEditable(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void button_edit_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_edit_1ActionPerformed
        if(tenkh_txt.isEditable())
            tenkh_txt.setEditable(false);
        else
            tenkh_txt.setEditable(true);
            
    }//GEN-LAST:event_button_edit_1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        int ret = JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn thoát!", "Thoát!", JOptionPane.YES_NO_OPTION);
        if (ret == JOptionPane.YES_OPTION){
            this.dispose();
            TrangChu_KhachHang_fr a=new TrangChu_KhachHang_fr();
            a.getAccount().setText(MKHHT);
            a.set_MKHHT(MKHHT);
            
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void xacnhan_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xacnhan_buttonActionPerformed
       if (tenkh_txt.getText().equals("")
                ||sdt_txt.getText().equals("")
                ||pass_txt.getText().equals("")
                ||cauhoi_txt.getText().equals("")
                ||cautraloi_txt.getText().equals("")) {
                   JOptionPane.showMessageDialog(rootPane, "Vui lòng cập nhập đủ thông tin!", "Thiếu thông tin!", HEIGHT);
                   return;
        }
        if(cauhoi_txt.getText().length()>50 ){
            JOptionPane.showMessageDialog(rootPane, "Câu hỏi quá dài!", "Không hợp lệ!", HEIGHT);   
            return;
        }
        if(cautraloi_txt.getText().length()>50 ){
            JOptionPane.showMessageDialog(rootPane, "Câu trả lời quá dài!", "Không hợp lệ!", HEIGHT);   
            return;
        }
        if(pass_txt.getText().length()>20 ){
            JOptionPane.showMessageDialog(rootPane, "Mật khẩu quá dài!", "Không hợp lệ!", HEIGHT);   
            return;
        }
        if(tenkh_txt.getText().length()>20 ){
            JOptionPane.showMessageDialog(rootPane, "Tên khách hàng quá dài!", "Không hợp lệ!", HEIGHT);   
            return;
        }
        if (!sdt_txt.getText().matches("-?\\d+")) {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập lại số điện thoại!", "Sai định dạng!", HEIGHT);
            sdt_txt.setText("");
            return;
        } 
        if(sdt_txt.getText().length()>10 || sdt_txt.getText().length()<9){
            JOptionPane.showMessageDialog(rootPane, "Số điện thoại có độ dài không hợp lệ!", "Không hợp lệ!", HEIGHT);   
            return;
        }
        
         try {
            Connection conn = OracleConnection.getOracleConnection();
            String SQL_update_KH="select*from khachhang where"
                    + " sodt='"+sdt_txt.getText()+"' and makh!='"+makh_txt.getText()+"'";
            Statement kq_check_dt = conn.createStatement();
            ResultSet kq = kq_check_dt.executeQuery(SQL_update_KH);
            if(kq.next())
                {
                    JOptionPane.showMessageDialog(rootPane, "Số điện thoại đã có người sử dụng!", "Không hợp lệ!", HEIGHT);
                    return;
                }
                 
                
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        try {
            Connection conn = OracleConnection.getOracleConnection();
            String SQL_update_KH="update khachhang"
                    + " set hoten=?, sodt=? where makh=?";
            PreparedStatement pre_update_KH = conn.prepareStatement(SQL_update_KH);
            pre_update_KH.setString(1, tenkh_txt.getText());
            pre_update_KH.setString(2, sdt_txt.getText());
            pre_update_KH.setString(3, makh_txt.getText());
            int kq_update_kh = pre_update_KH.executeUpdate();
          
            
            
            String SQL_update_TK="update taikhoan"
                    + " set matkhau=?, cauhoi=?,traloi=? where tendn=?";
            PreparedStatement pre_update_TK = conn.prepareStatement(SQL_update_TK);
            pre_update_TK.setString(1, pass_txt.getText());
            pre_update_TK.setString(2, cauhoi_txt.getText());
            pre_update_TK.setString(3, cautraloi_txt.getText());
            pre_update_TK.setString(4, tendn_txt.getText());
            int kq_update_tk = pre_update_TK.executeUpdate();
            
            if(kq_update_kh!=1)
                {
                    JOptionPane.showMessageDialog(rootPane, "Xảy ra lỗi khi cập nhập trên bảng khách hàng!", "Lỗi!", HEIGHT);
                    return;
                }
             if(kq_update_tk!=1)
                {
                    JOptionPane.showMessageDialog(rootPane, "Xảy ra lỗi khi cập nhập trên bảng tài khoản!", "Lỗi!", HEIGHT);
                    return;
                }
            JOptionPane.showMessageDialog(rootPane, "Cập nhập thành công!", "Lỗi!", HEIGHT);
            this.dispose();
            new ThongTinCaNhan_KhachHang_fr().loadThongTinKH(MKHHT);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        
        
    }//GEN-LAST:event_xacnhan_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(ThongTinCaNhan_KhachHang_fr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThongTinCaNhan_KhachHang_fr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThongTinCaNhan_KhachHang_fr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThongTinCaNhan_KhachHang_fr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                System.out.println("Nhập mã khách hàng: ");
                String mKH;
                Scanner ScanIn = new Scanner(System.in);
                mKH=ScanIn.next();
                System.out.println("ok");              
                ThongTinCaNhan_KhachHang_fr a= new ThongTinCaNhan_KhachHang_fr();
                a.loadThongTinKH(mKH);
                a.set_MKHHT(mKH);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton button_edit_1;
    private javax.swing.JTextField cauhoi_txt;
    private javax.swing.JTextField cautraloi_txt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField makh_txt;
    private javax.swing.JTextField pass_txt;
    private javax.swing.JButton reset_button;
    private javax.swing.JTextField sdt_txt;
    private javax.swing.JTextField tendn_txt;
    private javax.swing.JTextField tenkh_txt;
    private javax.swing.JButton xacnhan_button;
    // End of variables declaration//GEN-END:variables
  
}
