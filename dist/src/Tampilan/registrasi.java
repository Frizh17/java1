/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tampilan;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.Point;
import java.io.File;
import java.sql.*;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import koneksi.koneksi;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
/**
 *
 * @author Lenovo
 */
public class registrasi extends javax.swing.JFrame {
    private Connection conn = new koneksi().getkoneksi();
    private DefaultTableModel tabmode;
    public String username;
    public String password;
    
    protected void kosong(){
          txtId.setText("");
          txtUser.setText("");
          txtPass.setText("");
          txtTlp.setText("");
          txtAlamat.setText("");
       
}
   

    /**
     * Creates new form registrasi
     */
    public registrasi() {
        initComponents();
        ImageIcon img = new ImageIcon("src/icon/car.png");
        this.setIconImage(img.getImage());
        initUI();
    }

    private void initUI(){ 
        getContentPane().setBackground(new Color(245, 245, 245));
        
        Dimension windowSize = getSize();
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        Point centerPoint = ge.getCenterPoint();
        int dx = centerPoint.x - windowSize.width / 2;
        int dy = centerPoint.y - windowSize.height / 2;    
        setLocation(dx, dy);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        btnRegis = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAlamat = new javax.swing.JTextArea();
        txtTlp = new javax.swing.JTextField();
        Move_Login = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("REGISTRASI");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setText("FORM REGISTRASI");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 590, 50));

        jPanel3.setBackground(new java.awt.Color(102, 255, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Nama");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 140, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Kata Sandi");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 140, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Alamat");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, -1, -1));

        txtUser.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jPanel3.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 160, 30));

        txtId.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jPanel3.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 160, 30));

        txtPass.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jPanel3.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 160, 30));

        btnRegis.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnRegis.setText("Daftar");
        btnRegis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisActionPerformed(evt);
            }
        });
        jPanel3.add(btnRegis, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, 110, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("No Telp");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, -1, -1));

        txtAlamat.setColumns(20);
        txtAlamat.setRows(5);
        jScrollPane1.setViewportView(txtAlamat);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 160, 80));

        txtTlp.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jPanel3.add(txtTlp, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 160, 30));

        Move_Login.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Move_Login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Move_Login.setText("Kembali ");
        Move_Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Move_LoginMouseClicked(evt);
            }
        });
        jPanel3.add(Move_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 100, 30));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setText("Id");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 140, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 590, 420));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisActionPerformed
        // TODO add your handling code here:
       String sql = "insert into registrasi values (?,?,?,?,?)";
        try {
            PreparedStatement stat =  conn.prepareStatement(sql);
            stat.setString(1, txtId.getText());
            stat.setString(2, txtUser.getText());
            stat.setString(3, txtPass.getText());
            stat.setString(4, txtTlp.getText());
            stat.setString(5, txtAlamat.getText());
            
            
            
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null,"Registrasi Done");
            kosong();
            txtId.requestFocus();
      
                
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Registrasi Gagal"+e);
            
        } 
      
    }//GEN-LAST:event_btnRegisActionPerformed

    private void Move_LoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Move_LoginMouseClicked
        // TODO add your handling code here:
        Login start = new Login();
        start.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Move_LoginMouseClicked

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
            java.util.logging.Logger.getLogger(registrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registrasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Move_Login;
    private javax.swing.JButton btnRegis;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtAlamat;
    private javax.swing.JTextField txtId;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtTlp;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
