
package GUI;


import ConnectDB.OracleConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;


public class DangNhap_fr extends javax.swing.JFrame {
    public String dangnhap_maKH="";

    public DangNhap_fr () {
        this.setTitle("Đăng Nhập Hệ Thống Bán Vé Tàu Điện Ngầm");
        initComponents();
        setLocationRelativeTo(null);
        this.setVisible(true);
           
    }
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        user_txt = new javax.swing.JTextField();
        Button_DangNhap = new javax.swing.JButton();
        showpass_checkbox = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        pass_txt = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        user_txt.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        user_txt.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        user_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_txtActionPerformed(evt);
            }
        });
        getContentPane().add(user_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, 230, 40));

        Button_DangNhap.setBackground(new java.awt.Color(0, 51, 255));
        Button_DangNhap.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        Button_DangNhap.setForeground(new java.awt.Color(255, 255, 255));
        Button_DangNhap.setText("Đăng nhập");
        Button_DangNhap.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Button_DangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_DangNhapActionPerformed(evt);
            }
        });
        getContentPane().add(Button_DangNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, 350, 40));

        showpass_checkbox.setBackground(new java.awt.Color(0, 255, 255));
        showpass_checkbox.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        showpass_checkbox.setForeground(new java.awt.Color(255, 255, 0));
        showpass_checkbox.setText("hiện mật khẩu");
        showpass_checkbox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        showpass_checkbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpass_checkboxActionPerformed(evt);
            }
        });
        getContentPane().add(showpass_checkbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 240, -1, -1));

        jButton2.setBackground(new java.awt.Color(0, 51, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Đăng kí tài khoản");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 430, 350, 40));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Quên mật khẩu ?");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 220, 30));

        pass_txt.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        pass_txt.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        pass_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pass_txtActionPerformed(evt);
            }
        });
        getContentPane().add(pass_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, 230, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PIC_ICON/nen_dangnhap.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 0, 1220, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void user_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_user_txtActionPerformed

    private void Button_DangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_DangNhapActionPerformed
        if(user_txt.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Tên đăng nhập không được để trống!");
            return;
        }
        if(pass_txt.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Mật khẩu không được để trống!");
            return;
        }
        try {
            Connection conn = OracleConnection.getOracleConnection();
//                        String SQL_check="Select * from taikhoan a join khachhang b on a.tendn=b.tendn "
//                                + "where a.tendn like ? and matkhau like ?";
//                        PreparedStatement pre_check = conn.prepareStatement(SQL_check);
//                        pre_check.setString(1,user_txt.getText()+"%");
//                        pre_check.setString(2,pass_txt.getText()+"%");
//                        ResultSet rs=pre_check.executeQuery();
                                               
            String SQL_check="Select * from taikhoan where tendn ='"+user_txt.getText()+"'"+"and matkhau='"+pass_txt.getText()+"'";
            PreparedStatement pre_check = conn.prepareStatement(SQL_check);
            ResultSet rs=pre_check.executeQuery();
            
            
            
            
            String SQL_lay_maKH="Select * from taikhoan a join khachhang b on a.tendn=b.tendn"
                         + " where a.tendn ='"+user_txt.getText()+"'"+"and matkhau='"+pass_txt.getText()+"'";
            
            PreparedStatement pre_lay_maKH = conn.prepareStatement(SQL_lay_maKH);
            ResultSet rs_2=pre_lay_maKH.executeQuery();            
      
                        
//                        String SQL_check="Select * from taikhoan where tendn ='dnh123' or matkhau = 'dnh123' ";
//                        Statement stat = conn.createStatement();
//                        ResultSet rs=stat.executeQuery(SQL_check);

            if(rs.next()){
                JOptionPane.showMessageDialog(rootPane, "Đăng nhập thành công!");
                switch (rs.getInt("LoaiTK")) {
                    case 2:
                        this.dispose();
                        TrangChu_KhachHang_fr a =new TrangChu_KhachHang_fr();
                        rs_2.next();
                        a.set_MKHHT(rs_2.getString("maKH"));
                        a.getAccount().setText(rs_2.getString("maKH"));
                        break;
                    case 1:
                        this.dispose();
                        new TrangChu_Admin_fr();
                        break;
                    default:
                        JOptionPane.showMessageDialog(rootPane, "Không tìm thấy giao diện phù hợp!");
                        break;
                }       
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "Tên đăng nhập hoặc mật khẩu không đúng!");
                }
            } catch (Exception e) {
                 e.printStackTrace();
            }
    }//GEN-LAST:event_Button_DangNhapActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        dispose();
        new QuenMatKhau_fr();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void showpass_checkboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showpass_checkboxActionPerformed
        if(showpass_checkbox.isSelected())
            pass_txt.setEchoChar((char)0);
        else
            pass_txt.setEchoChar('*');
    }//GEN-LAST:event_showpass_checkboxActionPerformed

    private void pass_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pass_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pass_txtActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
        new DangKiKhachHang_fr();
        
    }//GEN-LAST:event_jButton2ActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangNhap_fr().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_DangNhap;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField pass_txt;
    private javax.swing.JCheckBox showpass_checkbox;
    private javax.swing.JTextField user_txt;
    // End of variables declaration//GEN-END:variables
}
