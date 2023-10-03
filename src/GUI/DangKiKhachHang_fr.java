
package GUI;


import ConnectDB.OracleConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author haita
 */
public class DangKiKhachHang_fr extends javax.swing.JFrame {

   
    public DangKiKhachHang_fr() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
        panel_2.setVisible(false);
        reset_button.setVisible(false);
        back_button.setVisible(false);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tenKH_txt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        sdt_txt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tenDN_txt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        pass_txt = new javax.swing.JPasswordField();
        pass2_txt = new javax.swing.JPasswordField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        tieptuc_button = new javax.swing.JButton();
        huydangki_button = new javax.swing.JButton();
        panel_2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        cauhoi_txt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cautraloi_txt = new javax.swing.JTextField();
        xacnhan_button = new javax.swing.JButton();
        back_button = new javax.swing.JButton();
        reset_button = new javax.swing.JButton();

        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 153));

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("Đăng kí khách hàng mới");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel2.setText("Nhập tên khách hàng: ");

        tenKH_txt.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel3.setText("Nhập số điện thoại:");

        sdt_txt.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        sdt_txt.setToolTipText("số điện thoại từ 9 đến 10 chữ số");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel5.setText("Nhập tên đăng nhập:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel6.setText("Nhập mật khẩu:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel7.setText("Nhập lại mật khẩu:");

        tenDN_txt.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 153, 51));
        jLabel9.setText("Tạo tài khoản đăng nhập mới");

        pass_txt.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N

        pass2_txt.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N

        jCheckBox1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jCheckBox1.setText("hiện");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jCheckBox2.setText("hiện");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        tieptuc_button.setBackground(new java.awt.Color(51, 255, 255));
        tieptuc_button.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        tieptuc_button.setText("Tiếp tục");
        tieptuc_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tieptuc_buttonActionPerformed(evt);
            }
        });

        huydangki_button.setBackground(new java.awt.Color(51, 255, 255));
        huydangki_button.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        huydangki_button.setText("Hủy đăng kí");
        huydangki_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                huydangki_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tenKH_txt)
                                            .addComponent(sdt_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(378, 378, 378)
                                        .addComponent(jLabel4))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(tieptuc_button, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(57, 57, 57)
                                                .addComponent(huydangki_button))
                                            .addComponent(tenDN_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                                            .addComponent(pass_txt)
                                            .addComponent(pass2_txt))))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox1)
                                    .addComponent(jCheckBox2)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(151, 151, 151)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addComponent(jLabel1)))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tenKH_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(sdt_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tenDN_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(pass_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(pass2_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tieptuc_button)
                    .addComponent(huydangki_button))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        panel_2.setBackground(new java.awt.Color(255, 204, 204));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel10.setText("Nhập câu hỏi bảo mật:");

        cauhoi_txt.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel11.setText("Nhập câu trả lời:");

        cautraloi_txt.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N

        xacnhan_button.setBackground(new java.awt.Color(51, 255, 255));
        xacnhan_button.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        xacnhan_button.setText("Xác nhận");
        xacnhan_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xacnhan_buttonActionPerformed(evt);
            }
        });

        back_button.setBackground(new java.awt.Color(0, 0, 255));
        back_button.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        back_button.setForeground(new java.awt.Color(255, 51, 0));
        back_button.setText("Đến trang đăng nhập");
        back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_buttonActionPerformed(evt);
            }
        });

        reset_button.setBackground(new java.awt.Color(51, 255, 255));
        reset_button.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        reset_button.setText("Reset");
        reset_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_2Layout = new javax.swing.GroupLayout(panel_2);
        panel_2.setLayout(panel_2Layout);
        panel_2Layout.setHorizontalGroup(
            panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_2Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addGroup(panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_2Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(xacnhan_button)
                        .addGap(62, 62, 62)
                        .addComponent(reset_button, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_2Layout.createSequentialGroup()
                        .addGroup(panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cauhoi_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cautraloi_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(back_button, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(180, 180, 180))
        );
        panel_2Layout.setVerticalGroup(
            panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cauhoi_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cautraloi_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(xacnhan_button)
                    .addComponent(reset_button))
                .addGap(18, 18, 18)
                .addComponent(back_button, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void huydangki_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_huydangki_buttonActionPerformed
        int ret = JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn hủy đăng kí!", "Hủy đăng kí!", JOptionPane.YES_NO_OPTION);
        if (ret == JOptionPane.YES_OPTION){
            this.dispose();
            new DangNhap_fr();
        }
    }//GEN-LAST:event_huydangki_buttonActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if (jCheckBox1.isSelected())
            pass_txt.setEchoChar((char) 0);
        else
            pass_txt.setEchoChar('*');
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        if (jCheckBox2.isSelected())
            pass2_txt.setEchoChar((char) 0);
        else
            pass2_txt.setEchoChar('*');
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void tieptuc_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tieptuc_buttonActionPerformed
        if (tenKH_txt.getText().equals("")
                || tenDN_txt.getText().equals("")
                || sdt_txt.getText().equals("")
                || pass_txt.getText().equals("")
                || pass2_txt.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng điền đầy đủ thông tin", "Thiếu thông tin", HEIGHT);
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
        if(tenDN_txt.getText().length()>20 ){
            JOptionPane.showMessageDialog(rootPane, "Tên đăng nhập quá dài!", "Không hợp lệ!", HEIGHT);   
            return;
        }
        if(pass_txt.getText().length()>20 ){
            JOptionPane.showMessageDialog(rootPane, "Mật khẩu quá dài!", "Không hợp lệ!", HEIGHT);   
            return;
        }
        if (!pass2_txt.getText().equals(pass_txt.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Mật khẩu không khớp!", "Nhập lại mật khẩu!", HEIGHT);
            return;
        }
       
        try {
                Connection conn = OracleConnection.getOracleConnection();
                // String SQL_check ="select*from taikhoan where tendn=?";
                String SQL_check_tdn = "select*from taikhoan where tendn='" + tenDN_txt.getText() + "'";
                PreparedStatement pre = conn.prepareStatement(SQL_check_tdn);
                //pre.setNString(1, tenDN_txt.getText());
                ResultSet rs_1 = pre.executeQuery();
                
                String SQL_check_sdt = "select*from khachhang where sodt=" + sdt_txt.getText() + "";
                PreparedStatement pre_2 = conn.prepareStatement(SQL_check_sdt);
                //pre.setNString(1, sdt_txt.getText());
                ResultSet rs_2 = pre_2.executeQuery();
                if (rs_1.next()) {
                    JOptionPane.showMessageDialog(rootPane, "Tên đăng nhập đã tồn tại!", "Lỗi!", HEIGHT);
                    //tenDN_txt.setText("");
                    return;
                }
                if (rs_2.next()) {
                    JOptionPane.showMessageDialog(rootPane, "Số điện thoại đã có người đăng kí!", "Lỗi!", HEIGHT);
                   // tenDN_txt.setText("");
                   return;
                } 
                
                panel_2.setVisible(true);
                tenKH_txt.setEditable(false);
                tenDN_txt.setEditable(false);
                sdt_txt.setEditable(false);
                pass_txt.setEditable(false);
                pass2_txt.setEditable(false);
                JOptionPane.showMessageDialog(rootPane, "Thiết lập câu hỏi bảo mật cho trường hợp quên mật khẩu!", "Tạo Câu Hỏi Bảo Mật", HEIGHT);
                 

            } catch (Exception e) {
                e.printStackTrace();
        }

    }//GEN-LAST:event_tieptuc_buttonActionPerformed

    private void xacnhan_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xacnhan_buttonActionPerformed
        if (cauhoi_txt.getText().equals("")||cautraloi_txt.getText().equals("")) {
                    JOptionPane.showMessageDialog(rootPane, "Không được để trống!", "Lỗi!", HEIGHT);
                   // tenDN_txt.setText("");
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
        try {
            Connection conn = OracleConnection.getOracleConnection();
            String SQL_addTK ="Insert into taikhoan values(?,?,?,?,2) ";
            PreparedStatement pre_addTK = conn.prepareStatement(SQL_addTK);
            pre_addTK.setString(1, tenDN_txt.getText());
            pre_addTK.setString(2, pass_txt.getText());
            pre_addTK.setString(3, cauhoi_txt.getText());
            pre_addTK.setString(4, cautraloi_txt.getText());
            int kq_addTK= pre_addTK.executeUpdate();
            
            String SQL_addKH ="Insert into khachhang values(?,?,?,?)";
            PreparedStatement pre_addKH = conn.prepareStatement(SQL_addKH);
            pre_addKH.setString(2, tenKH_txt.getText());
            pre_addKH.setString(3, sdt_txt.getText());
            pre_addKH.setString(4, tenDN_txt.getText());
            String maKH;
            
            String SQL_layMaKH = "SELECT MAKH FROM khachhang ORDER BY MAKH DESC";
            Statement pres1 = conn.createStatement();
            ResultSet rs1 = pres1.executeQuery(SQL_layMaKH);
            if(rs1.next()==false){
                maKH = "KH01";
            }
            else{
                int maKHhientai = Integer.parseInt(rs1.getString(1).substring(2,rs1.getString(1).length()-1)) + 1;
                
                if (maKHhientai < 10)
                    maKH = "KH0" + maKHhientai;
                else 
                    maKH = "KH" + maKHhientai; 
            }
            pre_addKH.setString(1, maKH);

            int kq_addKH = pre_addKH.executeUpdate();
            
            if(kq_addTK!=1){
                JOptionPane.showMessageDialog(rootPane, "Đã xảy ra lỗi khi thêm mới tài khoản!", "Lỗi!", HEIGHT);   
             return;
            } 
            if(kq_addKH!=1){
                JOptionPane.showMessageDialog(rootPane, "Đã xảy ra lỗi khi thêm mới khách hàng!", "Lỗi!", HEIGHT);   
                return;
            }
            JOptionPane.showMessageDialog(rootPane, "Đăng kí tài khoản thành công!", "Success!", HEIGHT);
            cauhoi_txt.setEditable(false);
            cauhoi_txt.setEditable(false);
            cautraloi_txt.setEditable(false);
            xacnhan_button.setEnabled(false);
            tieptuc_button.setEnabled(false);
            huydangki_button.setEnabled(false);
            reset_button.setVisible(true);
            back_button.setVisible(true);

        } catch (Exception e) {
            e.printStackTrace();
        }
       
                
                
    }//GEN-LAST:event_xacnhan_buttonActionPerformed

    private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
        this.dispose();
        new DangNhap_fr();
    }//GEN-LAST:event_back_buttonActionPerformed

    private void reset_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_buttonActionPerformed
        this.dispose();
        new DangKiKhachHang_fr();
    }//GEN-LAST:event_reset_buttonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangKiKhachHang_fr().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_button;
    private javax.swing.JTextField cauhoi_txt;
    private javax.swing.JTextField cautraloi_txt;
    private javax.swing.JButton huydangki_button;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
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
    private javax.swing.JPanel panel_2;
    private javax.swing.JPasswordField pass2_txt;
    private javax.swing.JPasswordField pass_txt;
    private javax.swing.JButton reset_button;
    private javax.swing.JTextField sdt_txt;
    private javax.swing.JTextField tenDN_txt;
    private javax.swing.JTextField tenKH_txt;
    private javax.swing.JButton tieptuc_button;
    private javax.swing.JButton xacnhan_button;
    // End of variables declaration//GEN-END:variables
}
