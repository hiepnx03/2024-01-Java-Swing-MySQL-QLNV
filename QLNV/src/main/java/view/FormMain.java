/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.UserController;
import model.User;

import javax.swing.*;
import java.util.Arrays;

/**
 * @author hiepn
 */
public class FormMain extends javax.swing.JFrame {

    /**
     * Creates new form FormMain
     */
    public FormMain() {
        initComponents();
        setLocationRelativeTo(null);  // hiển thị ở giữa màn hình

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPannelDangXuat = new javax.swing.JTabbedPane();
        jTabbedPaneNhanVien = new javax.swing.JTabbedPane();
        jTabbedPaneViecLam = new javax.swing.JTabbedPane();
        jTabbedPaneLuong = new javax.swing.JTabbedPane();
        jPanelDoiPass = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tbNhapUsername = new javax.swing.JTextField();
        jtbNhapPasswordcu = new javax.swing.JPasswordField();
        jtbNhapLaiPasswordMoi = new javax.swing.JPasswordField();
        jtbNhapPasswordMoi = new javax.swing.JPasswordField();
        btnThayDoiMatKhau = new javax.swing.JButton();
        jPanelinfo = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanelDangXuat = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 153));
        setPreferredSize(new java.awt.Dimension(1920, 1080));

        jPannelDangXuat.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jPannelDangXuat.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jPannelDangXuat.setMinimumSize(new java.awt.Dimension(1800, 158));
        jPannelDangXuat.setPreferredSize(new java.awt.Dimension(1910, 998));

        jTabbedPaneNhanVien.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPannelDangXuat.addTab("Nhân Viên", new javax.swing.ImageIcon(getClass().getResource("/images/nhanvien.png")), jTabbedPaneNhanVien); // NOI18N
        jPannelDangXuat.addTab("Việc Làm", new javax.swing.ImageIcon(getClass().getResource("/images/congviec.png")), jTabbedPaneViecLam); // NOI18N
        jPannelDangXuat.addTab("Lương", new javax.swing.ImageIcon(getClass().getResource("/images/luong.png")), jTabbedPaneLuong); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Nhập Lại Mật Khẩu Mới");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Nhập Mật Khẩu Mới");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("Nhập Mật Khẩu Cũ");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("ĐỔI MẬT KHẨU");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setText("Nhập Tên Tài khoản");

        tbNhapUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbNhapUsernameActionPerformed(evt);
            }
        });

        jtbNhapPasswordcu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbNhapPasswordcuActionPerformed(evt);
            }
        });

        jtbNhapLaiPasswordMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbNhapLaiPasswordMoiActionPerformed(evt);
            }
        });

        jtbNhapPasswordMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbNhapPasswordMoiActionPerformed(evt);
            }
        });

        btnThayDoiMatKhau.setBackground(new java.awt.Color(255, 153, 153));
        btnThayDoiMatKhau.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btnThayDoiMatKhau.setText("Thay Đổi Mật Khẩu");
        btnThayDoiMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThayDoiMatKhauActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jtbNhapPasswordcu)
                            .addComponent(jtbNhapLaiPasswordMoi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
                            .addComponent(jtbNhapPasswordMoi, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tbNhapUsername))
                        .addGap(18, 18, 18)
                        .addComponent(btnThayDoiMatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbNhapUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtbNhapPasswordcu, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtbNhapPasswordMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btnThayDoiMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtbNhapLaiPasswordMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(408, 408, 408))
        );

        javax.swing.GroupLayout jPanelDoiPassLayout = new javax.swing.GroupLayout(jPanelDoiPass);
        jPanelDoiPass.setLayout(jPanelDoiPassLayout);
        jPanelDoiPassLayout.setHorizontalGroup(
            jPanelDoiPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDoiPassLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelDoiPassLayout.setVerticalGroup(
            jPanelDoiPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDoiPassLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPannelDangXuat.addTab("Đổi Mật Khẩu", new javax.swing.ImageIcon(getClass().getResource("/images/doimatkhau.png")), jPanelDoiPass); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NHÓM");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1487, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(414, 414, 414)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(458, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelinfoLayout = new javax.swing.GroupLayout(jPanelinfo);
        jPanelinfo.setLayout(jPanelinfoLayout);
        jPanelinfoLayout.setHorizontalGroup(
            jPanelinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelinfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelinfoLayout.setVerticalGroup(
            jPanelinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelinfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPannelDangXuat.addTab("Thông Tin", new javax.swing.ImageIcon(getClass().getResource("/images/thongtin.png")), jPanelinfo); // NOI18N

        jPanelDangXuat.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanelDangXuatComponentShown(evt);
            }
        });

        javax.swing.GroupLayout jPanelDangXuatLayout = new javax.swing.GroupLayout(jPanelDangXuat);
        jPanelDangXuat.setLayout(jPanelDangXuatLayout);
        jPanelDangXuatLayout.setHorizontalGroup(
            jPanelDangXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1511, Short.MAX_VALUE)
        );
        jPanelDangXuatLayout.setVerticalGroup(
            jPanelDangXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 995, Short.MAX_VALUE)
        );

        jPannelDangXuat.addTab("Đăng Xuất", new javax.swing.ImageIcon(getClass().getResource("/images/dangxuat.png")), jPanelDangXuat); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPannelDangXuat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPannelDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 995, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanelDangXuatComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanelDangXuatComponentShown
        // TODO add your handling code here:
        FormDangNhap formDangNhap = new FormDangNhap();
        formDangNhap.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPanelDangXuatComponentShown

    private void btnThayDoiMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThayDoiMatKhauActionPerformed
        // TODO add your handling code here:
        // Get input values
        String username = tbNhapUsername.getText();
        String currentPassword = new String(jtbNhapPasswordcu.getPassword());
        String newPassword = new String(jtbNhapPasswordMoi.getPassword());
        String confirmNewPassword = new String(jtbNhapLaiPasswordMoi.getPassword());

        // Validate input
        if (username.isEmpty() || currentPassword.isEmpty() || newPassword.isEmpty() || confirmNewPassword.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!newPassword.equals(confirmNewPassword)) {
            JOptionPane.showMessageDialog(this, "Mật khẩu mới và xác nhận mật khẩu mới không khớp.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Authenticate user
        User user = new User(0,username,currentPassword);
        if (!UserController.authenticateUser(user)) {
            JOptionPane.showMessageDialog(this, "Tên đăng nhập hoặc mật khẩu cũ không đúng.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Change password
        if (UserController.changePassword(user, newPassword)) {
            JOptionPane.showMessageDialog(this, "Đổi mật khẩu thành công.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi khi đổi mật khẩu.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnThayDoiMatKhauActionPerformed

    private void tbNhapUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbNhapUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbNhapUsernameActionPerformed

    private void jtbNhapPasswordcuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbNhapPasswordcuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtbNhapPasswordcuActionPerformed

    private void jtbNhapLaiPasswordMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbNhapLaiPasswordMoiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtbNhapLaiPasswordMoiActionPerformed

    private void jtbNhapPasswordMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbNhapPasswordMoiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtbNhapPasswordMoiActionPerformed


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
            java.util.logging.Logger.getLogger(FormMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThayDoiMatKhau;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelDangXuat;
    private javax.swing.JPanel jPanelDoiPass;
    private javax.swing.JPanel jPanelinfo;
    private javax.swing.JTabbedPane jPannelDangXuat;
    private javax.swing.JTabbedPane jTabbedPaneLuong;
    private javax.swing.JTabbedPane jTabbedPaneNhanVien;
    private javax.swing.JTabbedPane jTabbedPaneViecLam;
    private javax.swing.JPasswordField jtbNhapLaiPasswordMoi;
    private javax.swing.JPasswordField jtbNhapPasswordMoi;
    private javax.swing.JPasswordField jtbNhapPasswordcu;
    private javax.swing.JTextField tbNhapUsername;
    // End of variables declaration//GEN-END:variables
}
