/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package booksh.subpanels;

import booksh.DBConnection;
import booksh.Globals;

/**
 *
 * @author shadman
 */
public class OrderInfoPanel extends javax.swing.JPanel {

    /**
     * Creates new form OrderInfoPanel
     */
    int book_id, user_id;
    public OrderInfoPanel() {
        initComponents();
    }

    public void set_data(int user_id, int book_id, String uname, String book, String author) {
        this.book_id = book_id;
        this.user_id = user_id;
        lbl_uname.setText(uname);
        lbl_bookname.setText(book);
        lbl_author.setText(author);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_bookname = new javax.swing.JLabel();
        lb_const_want = new javax.swing.JLabel();
        lbl_uname = new javax.swing.JLabel();
        lbl_author = new javax.swing.JLabel();
        btn_reject = new javax.swing.JLabel();
        btn_approve = new javax.swing.JLabel();
        lb_const_by = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 102, 255));

        lbl_bookname.setFont(new java.awt.Font("Glass Antiqua", 2, 24)); // NOI18N
        lbl_bookname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_bookname.setText("Book Name");

        lb_const_want.setFont(new java.awt.Font("Glass Antiqua", 0, 22)); // NOI18N
        lb_const_want.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_const_want.setText("wants to borrow");

        lbl_uname.setFont(new java.awt.Font("Glass Antiqua", 2, 24)); // NOI18N
        lbl_uname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_uname.setText("Username");

        lbl_author.setFont(new java.awt.Font("Glass Antiqua", 2, 24)); // NOI18N
        lbl_author.setText("Author");

        btn_reject.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-cross-red-50.png"))); // NOI18N
        btn_reject.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_rejectMouseClicked(evt);
            }
        });

        btn_approve.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-check-green-48.png"))); // NOI18N
        btn_approve.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_approveMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_approveMouseEntered(evt);
            }
        });
        btn_approve.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_approveKeyPressed(evt);
            }
        });

        lb_const_by.setFont(new java.awt.Font("Glass Antiqua", 0, 22)); // NOI18N
        lb_const_by.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_const_by.setText("by");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbl_uname, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_const_want, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_bookname, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_const_by, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_author, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110)
                .addComponent(btn_approve, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btn_reject)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbl_bookname, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lb_const_by, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbl_author, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbl_uname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lb_const_want, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_reject)
                            .addComponent(btn_approve))))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_approveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_approveKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_approveKeyPressed

    private void btn_approveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_approveMouseClicked
        // TODO add your handling code here:
        try {
            var con = DBConnection.getConnection();
            String query = "DELETE FROM requests WHERE book_id=? AND user_id=?";
            var pat = con.prepareStatement(query);
            pat.setInt(1, book_id);
            pat.setInt(2, user_id);
            pat.executeUpdate();
            Globals.admin_home.manageoders1.notification_view.load_notifications();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_approveMouseClicked

    private void btn_rejectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_rejectMouseClicked
        // TODO add your handling code here:
        try {
            var con = DBConnection.getConnection();
            String query = "DELETE FROM requests WHERE book_id=? AND user_id=?";
            var pat = con.prepareStatement(query);
            pat.setInt(1, book_id);
            pat.setInt(2, user_id);
            pat.executeUpdate();
            Globals.admin_home.manageoders1.notification_view.load_notifications();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_rejectMouseClicked

    private void btn_approveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_approveMouseEntered
        // TODO add your handling code here:
        btn_approve.setBackground(Co);
    }//GEN-LAST:event_btn_approveMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_approve;
    private javax.swing.JLabel btn_reject;
    private javax.swing.JLabel lb_const_by;
    private javax.swing.JLabel lb_const_want;
    private javax.swing.JLabel lbl_author;
    private javax.swing.JLabel lbl_bookname;
    private javax.swing.JLabel lbl_uname;
    // End of variables declaration//GEN-END:variables
}
