
package GUI;

import ConnectDB.OracleConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author haita
 */
public class QuenMatKhau_fr extends javax.swing.JFrame {

 
    public QuenMatKhau_fr() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        panel2.setVisible(false);
        panel3.setVisible(false);
        lbl_xinchao.setVisible(false);
        tendn_txt.setVisible(false);
        this.setTitle("Quên Mật Khẩu");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cauhoibaomat_lbl = new javax.swing.JLabel();
        cautraloi_txt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        lbl_xinchao = new javax.swing.JLabel();
        tendn_txt = new javax.swing.JLabel();
        panel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        pass_lbl = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        panel1 = new javax.swing.JPanel();
        user_txt = new javax.swing.JTextField();
        tieptuc_button = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        combobox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel2.setBackground(new java.awt.Color(0, 255, 255));
        panel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0)));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 51));
        jLabel3.setText("Trả lời câu hỏi báo mật để lấy lại mật khẩu!");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel4.setText("Nhập câu trả lời:");

        cauhoibaomat_lbl.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        cauhoibaomat_lbl.setForeground(new java.awt.Color(255, 102, 0));
        cauhoibaomat_lbl.setText("Câu hỏi: ");

        cautraloi_txt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButton1.setText("Kiểm tra");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lbl_xinchao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_xinchao.setForeground(new java.awt.Color(0, 0, 255));
        lbl_xinchao.setText("Xin chào: ");

        tendn_txt.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        tendn_txt.setForeground(new java.awt.Color(255, 0, 0));
        tendn_txt.setText("zzzzzzzz");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(lbl_xinchao)
                .addGap(18, 18, 18)
                .addComponent(tendn_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cautraloi_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jButton1))
                    .addComponent(cauhoibaomat_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 26, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_xinchao)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addComponent(tendn_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(2, 2, 2)))
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cauhoibaomat_lbl)
                .addGap(18, 18, 18)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cautraloi_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        getContentPane().add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 213, 770, 200));

        panel3.setBackground(new java.awt.Color(0, 255, 255));
        panel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 51), 2, true));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 51));
        jLabel5.setText("Mật khẩu của bạn là: ");

        pass_lbl.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        pass_lbl.setForeground(new java.awt.Color(255, 0, 0));
        pass_lbl.setText("zzzzzzzzz");

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButton3.setText("Quay lại đăng nhập");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pass_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(jButton3)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pass_lbl))
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        getContentPane().add(panel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 432, 773, -1));

        panel1.setBackground(new java.awt.Color(0, 255, 255));

        user_txt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        user_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_txtActionPerformed(evt);
            }
        });

        tieptuc_button.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        tieptuc_button.setText("Tiếp tục");
        tieptuc_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tieptuc_buttonActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButton2.setText("Thoát");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 51));
        jLabel2.setText("Nhập tên đăng nhập hoặc số điện thoại để lấy lại mật khẩu:");

        combobox.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tên đăng nhập", "Số điện thoại" }));
        combobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboboxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel1Layout.createSequentialGroup()
                            .addGap(256, 256, 256)
                            .addComponent(tieptuc_button)
                            .addGap(31, 31, 31)
                            .addComponent(jButton2))
                        .addGroup(panel1Layout.createSequentialGroup()
                            .addGap(17, 17, 17)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(user_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(146, 146, 146)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(user_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tieptuc_button)
                    .addComponent(jButton2))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        getContentPane().add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 12, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PIC_ICON/nen.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    ResultSet kq;
    private void tieptuc_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tieptuc_buttonActionPerformed
        if(user_txt.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Không được để trống!");
            panel2.setVisible(false);
            panel3.setVisible(false);
        }
        else if(combobox.getSelectedIndex()==1 && !user_txt.getText().matches("-?\\d+") ){
            JOptionPane.showMessageDialog(rootPane, "Số điện thoại không hợp lệ!");
            panel2.setVisible(false);
            panel3.setVisible(false);
        }
        else{
                try{
                    Connection conn = OracleConnection.getOracleConnection();
                    String SQL_check_tendn ="select*from taikhoan where tendn='"+user_txt.getText()+"'";
                    String SQL_check_sdt ="select*from taikhoan a join khachhang b on a.tendn=b.tendn where sodt='"+user_txt.getText()+"'";
                    Statement stat_check = conn.createStatement();
                    ResultSet rs;
                    
                    if(combobox.getSelectedIndex()==0){
                        rs = stat_check.executeQuery(SQL_check_tendn);
                        if(rs.next()){
                            JOptionPane.showMessageDialog(rootPane, "Trả lời câu hỏi bảo mật để lấy lại mật khẩu.", "Hợp lệ", HEIGHT);
                            lbl_xinchao.setVisible(false);
                            tendn_txt.setVisible(false);
                            panel2.setVisible(true);
                            cauhoibaomat_lbl.setText(rs.getString("Cauhoi"));
                            kq=rs;
                        }
                        else{
                            panel2.setVisible(false);
                            panel3.setVisible(false);
                            int ret = JOptionPane.showConfirmDialog(null, "Tên đăng nhập chưa có tài khoản.Bạn có muốn đăng kí tài khoản mới?", "Sai tên đăng nhập", JOptionPane.YES_NO_OPTION);
                            if (ret == JOptionPane.YES_OPTION){
                                this.dispose();
                                new DangKiKhachHang_fr();
                            }
                        }    
                    }
                    else{
                        if(user_txt.getText().length()>10||user_txt.getText().length()<9){
                            JOptionPane.showMessageDialog(rootPane, "Số điện thoại không hợp lệ!");
                            panel2.setVisible(false);
                            panel3.setVisible(false);
                        }
                        rs = stat_check.executeQuery(SQL_check_sdt);                       
                        if(rs.next()){
                             JOptionPane.showMessageDialog(rootPane, "Trả lời câu hỏi bảo mật để lấy lại mật khẩu.", "Hợp lệ", HEIGHT);
                            
                             lbl_xinchao.setVisible(true);
                             tendn_txt.setVisible(true);
                             tendn_txt.setText(rs.getString("tendn"));
                             panel2.setVisible(true);
                             cauhoibaomat_lbl.setText(rs.getString("Cauhoi"));
                             kq=rs;
                        }
                        else{
                            panel2.setVisible(false);
                            panel3.setVisible(false);
                            JOptionPane.showMessageDialog(rootPane, "Không tìm thấy thông tin!");
                        }
                    }

                          
                } 
                catch (Exception e) {
                    e.printStackTrace();
                }
        }
    }//GEN-LAST:event_tieptuc_buttonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        new DangNhap_fr();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void user_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_txtActionPerformed
        if(user_txt.getText().equals(""))
            JOptionPane.showConfirmDialog(rootPane, "Không được để trống!");
    }//GEN-LAST:event_user_txtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            if(cautraloi_txt.getText().equals(kq.getString("TraLoi")))
                {
                    panel3.setVisible(true);
                    pass_lbl.setText(kq.getString("matkhau"));
                }
            
            else if(cautraloi_txt.getText().equals("")){
                panel3.setVisible(false);
                JOptionPane.showMessageDialog(rootPane, "Không được để trống!");
                }
            else{
                panel3.setVisible(false);
                JOptionPane.showMessageDialog(rootPane, "Câu trả lời sai!");               
                }

        } catch (SQLException ex) {
            Logger.getLogger(QuenMatKhau_fr.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
        new DangNhap_fr();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void comboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboboxActionPerformed

  
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuenMatKhau_fr().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cauhoibaomat_lbl;
    private javax.swing.JTextField cautraloi_txt;
    private javax.swing.JComboBox<String> combobox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lbl_xinchao;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panel3;
    private javax.swing.JLabel pass_lbl;
    private javax.swing.JLabel tendn_txt;
    private javax.swing.JButton tieptuc_button;
    private javax.swing.JTextField user_txt;
    // End of variables declaration//GEN-END:variables
}
