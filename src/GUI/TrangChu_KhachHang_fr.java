
package GUI;

import javax.swing.JOptionPane;



/**
 *
 * @author TIEN NHAN
 */
public class TrangChu_KhachHang_fr extends javax.swing.JFrame {
    static String MKHHT;
    public TrangChu_KhachHang_fr() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null); 
       
    }
    public javax.swing.JLabel getAccount(){
        return maKH_lbl;
    }
    public void set_MKHHT(String a){
        MKHHT=a;            
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        maKH_lbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setForeground(javax.swing.UIManager.getDefaults().getColor("Actions.Yellow"));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PIC_ICON/subway.png"))); // NOI18N
        jButton1.setText(" Đặt vé tàu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 139, 351, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton2.setForeground(javax.swing.UIManager.getDefaults().getColor("Actions.Yellow"));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PIC_ICON/tickett.png"))); // NOI18N
        jButton2.setText("Sửa thông tin cá nhân");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 313, 351, -1));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton3.setForeground(javax.swing.UIManager.getDefaults().getColor("Actions.Yellow"));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PIC_ICON/logout.png"))); // NOI18N
        jButton3.setText("Đăng xuất");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 412, 351, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 0));
        jLabel2.setText("Xin chào khách hàng: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, -1));

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton4.setForeground(javax.swing.UIManager.getDefaults().getColor("Actions.Yellow"));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PIC_ICON/personall.png"))); // NOI18N
        jButton4.setText("Xem thông tin vé đã đặt");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 225, -1, -1));

        maKH_lbl.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        maKH_lbl.setForeground(new java.awt.Color(0, 0, 255));
        maKH_lbl.setText("jLabel1");
        getContentPane().add(maKH_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 333, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PIC_ICON/nền_trang chủ.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-300, 0, 1090, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public String get_maKH(String a){
        return a;
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int ret = JOptionPane.showConfirmDialog(null, "Bạn có muốn đăng xuất!", "Đăng xuất!", JOptionPane.YES_NO_OPTION);
        if (ret == JOptionPane.YES_OPTION){
            this.dispose();
            new DangNhap_fr();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        DatVe_fr a = new DatVe_fr();
        a.set_MKHHT(MKHHT);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.dispose();
        KH_XemThongTinVeDaDat_fr a= new KH_XemThongTinVeDaDat_fr();
        a.set_MKHHT(MKHHT);
        a.loadthongtin_KH(MKHHT);
        a.loadthongtin_Table(MKHHT);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        ThongTinCaNhan_KhachHang_fr a= new ThongTinCaNhan_KhachHang_fr();
        a.set_MKHHT(MKHHT);
        a.loadThongTinKH(MKHHT);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TrangChu_KhachHang_fr().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel maKH_lbl;
    // End of variables declaration//GEN-END:variables
}
