/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package booksh;
import java.sql.*;
import booksh.DBConnection;
import javax.swing.JOptionPane;

/**
 *
 * @author Adil313
 */
public class SignupPage extends javax.swing.JFrame {

    /**
     * Creates new form FirstPage
     */
    public SignupPage() {
        initComponents();
    }
    
    // insert data in users table
    public void insertSignupDetails() {
        String name = txt_username.getText();
        String pss = new String(txt_password.getPassword());
        String email = txt_email.getText();
        String contact = txt_contact.getText();
	try {
            Connection con = new DBConnection().getConnection();
            String query = "insert into users(name, password, email, contact) values(?,?,?,?)";
            PreparedStatement pat = con.prepareStatement(query);
            pat.setString(1, name);
            pat.setString(2, pss);
            pat.setString(3, email);
            pat.setString(4, contact);

            int updatedRowCount = pat.executeUpdate();

            if (updatedRowCount > 0) {
                JOptionPane.showMessageDialog(this, "Account Created");
            } else {
                JOptionPane.showMessageDialog(this, "Failed to create account");
            }
	} catch (Exception e) {
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

        rSFotoSquareResizeBeanInfo1 = new rojerusan.RSFotoSquareResizeBeanInfo();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        rSLabelImage2 = new rojerusan.RSLabelImage();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_contact = new app.bolivia.swing.JCTextField();
        txt_username = new app.bolivia.swing.JCTextField();
        txt_email = new app.bolivia.swing.JCTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        btn_login = new rojerusan.RSMaterialButtonCircle();
        btn_signup = new rojerusan.RSMaterialButtonCircle();
        txt_password = new javax.swing.JPasswordField();
        btn_close = new rojerusan.RSLabelImage();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        rSDateChooser1 = new rojeru_san.componentes.RSDateChooser();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 1191, -1, -1));

        jLabel4.setFont(new java.awt.Font("AppleMyungjo", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(212, 226, 244));
        jLabel4.setText("Welcome");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, 280, 90));

        jLabel5.setFont(new java.awt.Font("Glass Antiqua", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(212, 226, 244));
        jLabel5.setText("to");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 250, 100, 50));

        jLabel12.setFont(new java.awt.Font("Glass Antiqua", 0, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(212, 226, 244));
        jLabel12.setText("Smart Library");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 350, -1, -1));

        rSLabelImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Library_statistics.jpeg"))); // NOI18N
        jPanel2.add(rSLabelImage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 840));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 830));

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Courier New", 1, 25)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Sign Up Page");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, -1, -1));

        jLabel7.setFont(new java.awt.Font("Andale Mono", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Create New Account");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, -1, -1));

        jLabel8.setFont(new java.awt.Font("Andale Mono", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Contact");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, -1, -1));

        txt_contact.setBackground(new java.awt.Color(51, 102, 255));
        txt_contact.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txt_contact.setForeground(new java.awt.Color(255, 255, 255));
        txt_contact.setFont(new java.awt.Font("Glass Antiqua", 0, 20)); // NOI18N
        txt_contact.setPhColor(new java.awt.Color(51, 102, 255));
        txt_contact.setPlaceholder("Enter Username");
        txt_contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_contactActionPerformed(evt);
            }
        });
        jPanel1.add(txt_contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 240, -1));

        txt_username.setBackground(new java.awt.Color(51, 102, 255));
        txt_username.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txt_username.setForeground(new java.awt.Color(255, 255, 255));
        txt_username.setFont(new java.awt.Font("Glass Antiqua", 0, 20)); // NOI18N
        txt_username.setPhColor(new java.awt.Color(51, 102, 255));
        txt_username.setPlaceholder("Enter Username");
        txt_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usernameActionPerformed(evt);
            }
        });
        jPanel1.add(txt_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 240, -1));

        txt_email.setBackground(new java.awt.Color(51, 102, 255));
        txt_email.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txt_email.setForeground(new java.awt.Color(255, 255, 255));
        txt_email.setFont(new java.awt.Font("Glass Antiqua", 0, 20)); // NOI18N
        txt_email.setPhColor(new java.awt.Color(51, 102, 255));
        txt_email.setPlaceholder("Enter Username");
        txt_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emailActionPerformed(evt);
            }
        });
        jPanel1.add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 240, 30));

        jLabel9.setFont(new java.awt.Font("Andale Mono", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Google_Mobile_50px.png"))); // NOI18N
        jLabel9.setText("Username");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, 50, 50));

        jLabel10.setFont(new java.awt.Font("Andale Mono", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Password");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, -1, -1));

        jLabel11.setFont(new java.awt.Font("Andale Mono", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Email");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, -1, 20));

        jLabel15.setFont(new java.awt.Font("Andale Mono", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Username");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, -1, -1));

        jLabel16.setFont(new java.awt.Font("Andale Mono", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Account_50px.png"))); // NOI18N
        jLabel16.setText("Username");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 50, 50));

        jLabel17.setFont(new java.awt.Font("Andale Mono", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Secure_50px.png"))); // NOI18N
        jLabel17.setText("Username");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 50, 50));

        jLabel18.setFont(new java.awt.Font("Andale Mono", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Secured_Letter_50px.png"))); // NOI18N
        jLabel18.setText("Username");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 50, 50));

        btn_login.setBackground(new java.awt.Color(0, 0, 255));
        btn_login.setText("Already have an account");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        jPanel1.add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 740, 320, 70));

        btn_signup.setBackground(new java.awt.Color(255, 51, 102));
        btn_signup.setText("SignUp");
        btn_signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signupActionPerformed(evt);
            }
        });
        jPanel1.add(btn_signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 660, 320, 70));

        txt_password.setBackground(new java.awt.Color(51, 102, 255));
        txt_password.setFont(new java.awt.Font("Glass Antiqua", 0, 20)); // NOI18N
        txt_password.setForeground(new java.awt.Color(255, 255, 255));
        txt_password.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel1.add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 240, 40));

        btn_close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-close-50.png"))); // NOI18N
        btn_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_closeMouseClicked(evt);
            }
        });
        jPanel1.add(btn_close, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 50, 50));

        jLabel19.setFont(new java.awt.Font("Andale Mono", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Account_50px.png"))); // NOI18N
        jLabel19.setText("Username");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 490, 50, 50));

        jLabel20.setFont(new java.awt.Font("Andale Mono", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Date of Birth");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 470, -1, -1));

        rSDateChooser1.setBackground(new java.awt.Color(51, 102, 255));
        jPanel1.add(rSDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 500, -1, -1));

        jLabel21.setFont(new java.awt.Font("Andale Mono", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Account_50px.png"))); // NOI18N
        jLabel21.setText("Username");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 570, 50, 50));

        jLabel22.setFont(new java.awt.Font("Andale Mono", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Gender");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 550, -1, -1));

        jRadioButton1.setBackground(new java.awt.Color(51, 102, 255));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Glass Antiqua", 0, 18)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Male");
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 600, -1, -1));

        jRadioButton2.setBackground(new java.awt.Color(51, 102, 255));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Glass Antiqua", 0, 18)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Female");
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 600, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 0, 540, 850));

        setSize(new java.awt.Dimension(1523, 856));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_contactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_contactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_contactActionPerformed

    private void txt_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usernameActionPerformed

    private void txt_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emailActionPerformed

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new booksh.LoginPage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_loginActionPerformed

    private void btn_signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_signupActionPerformed
        // TODO add your handling code here:
        insertSignupDetails();
    }//GEN-LAST:event_btn_signupActionPerformed

    private void btn_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_closeMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btn_closeMouseClicked

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
            java.util.logging.Logger.getLogger(SignupPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignupPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignupPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignupPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignupPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSLabelImage btn_close;
    private rojerusan.RSMaterialButtonCircle btn_login;
    private rojerusan.RSMaterialButtonCircle btn_signup;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private rojeru_san.componentes.RSDateChooser rSDateChooser1;
    private rojerusan.RSFotoSquareResizeBeanInfo rSFotoSquareResizeBeanInfo1;
    private rojerusan.RSLabelImage rSLabelImage2;
    private app.bolivia.swing.JCTextField txt_contact;
    private app.bolivia.swing.JCTextField txt_email;
    private javax.swing.JPasswordField txt_password;
    private app.bolivia.swing.JCTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
