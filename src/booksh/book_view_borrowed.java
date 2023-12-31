/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package booksh;

import javax.swing.JOptionPane;

/**
 *
 * @author shadman
 */
public class book_view_borrowed extends javax.swing.JPanel {

    /**
     * Creates new form book_view_booklist
     * @param book
     */
    Book book;
    public book_view_borrowed(Book book) {
        initComponents();
        hide_info();
        this.book = book;
        lb_bookname.setText(book.name);
        lb_author.setText(book.author+" ");
        lb_genre.setText(book.genre);
        lb_year.setText(String.valueOf(book.year));
        lb_rating.setText(String.valueOf(book.rating));
        lb_price.setText(String.valueOf(book.price));
        img_cover.setIcon(book.cover);
        pnl_contrast.setBackground(new java.awt.Color(102, 102, 255, 200));
    }

    private void hide_info() {
        pnl_contrast.setVisible(false);
//        ic_boroow.setVisible(false);
//        ic_buy.setVisible(false);
//        ic_wishlist.setVisible(false);
//
//        jLabel3.setVisible(false);
//        jLabel5.setVisible(false);
//        jLabel6.setVisible(false);
//        jLabel7.setVisible(false);
//        
//        lb_author.setVisible(false);
//        lb_bookname.setVisible(false);
//        lb_genre.setVisible(false);
//        lb_price.setVisible(false);
//        lb_rating.setVisible(false);
//        lb_year.setVisible(false);
    }

    private void unhide_info() {
        pnl_contrast.setVisible(true);
//        ic_boroow.setVisible(true);
//        ic_buy.setVisible(true);
//        ic_wishlist.setVisible(true);
//
//        jLabel3.setVisible(true);
//        jLabel5.setVisible(true);
//        jLabel6.setVisible(true);
//        jLabel7.setVisible(true);
//
//        lb_author.setVisible(true);
//        lb_bookname.setVisible(true);
//        lb_genre.setVisible(true);
//        lb_price.setVisible(true);
//        lb_rating.setVisible(true);
//        lb_year.setVisible(true);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_contrast = new javax.swing.JPanel();
        lb_bookname = new javax.swing.JLabel();
        lb_author = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lb_rating = new javax.swing.JLabel();
        lb_price = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lb_year = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lb_genre = new javax.swing.JLabel();
        btn_return = new javax.swing.JButton();
        img_cover = new rojerusan.RSLabelImage();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(51, 51, 51));
        setFont(new java.awt.Font("Glass Antiqua", 0, 18)); // NOI18N
        setMinimumSize(new java.awt.Dimension(280, 420));
        setPreferredSize(new java.awt.Dimension(280, 420));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_contrast.setBackground(new java.awt.Color(102, 102, 255));
        pnl_contrast.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_bookname.setFont(new java.awt.Font("Glass Antiqua", 1, 36)); // NOI18N
        lb_bookname.setForeground(new java.awt.Color(255, 255, 255));
        lb_bookname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_bookname.setText("Book Name");
        pnl_contrast.add(lb_bookname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 230, 50));

        lb_author.setFont(new java.awt.Font("Glass Antiqua", 2, 24)); // NOI18N
        lb_author.setForeground(new java.awt.Color(255, 255, 255));
        lb_author.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lb_author.setText("Author Name ");
        pnl_contrast.add(lb_author, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 210, 60));

        jLabel5.setFont(new java.awt.Font("Glass Antiqua", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(251, 251, 251));
        jLabel5.setText("Published");
        pnl_contrast.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 90, 30));

        lb_rating.setFont(new java.awt.Font("Glass Antiqua", 0, 18)); // NOI18N
        lb_rating.setForeground(new java.awt.Color(251, 251, 251));
        lb_rating.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lb_rating.setText("4.2");
        pnl_contrast.add(lb_rating, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 120, 20));

        lb_price.setBackground(new java.awt.Color(255, 255, 255));
        lb_price.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lb_price.setForeground(new java.awt.Color(251, 251, 251));
        lb_price.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lb_price.setText("250");
        pnl_contrast.add(lb_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 120, 30));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(251, 251, 251));
        jLabel6.setText("Price");
        pnl_contrast.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 50, 30));

        lb_year.setFont(new java.awt.Font("Glass Antiqua", 0, 18)); // NOI18N
        lb_year.setForeground(new java.awt.Color(251, 251, 251));
        lb_year.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lb_year.setText("2017");
        pnl_contrast.add(lb_year, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 110, 20));

        jLabel7.setFont(new java.awt.Font("Glass Antiqua", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(251, 251, 251));
        jLabel7.setText("Rating");
        pnl_contrast.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 50, 30));

        jLabel3.setFont(new java.awt.Font("Glass Antiqua", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(251, 251, 251));
        jLabel3.setText("Genre");
        pnl_contrast.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 50, 30));

        lb_genre.setFont(new java.awt.Font("Glass Antiqua", 0, 18)); // NOI18N
        lb_genre.setForeground(new java.awt.Color(255, 255, 255));
        lb_genre.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lb_genre.setText("Thriller");
        pnl_contrast.add(lb_genre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 110, 20));

        btn_return.setBackground(new java.awt.Color(102, 102, 255));
        btn_return.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        btn_return.setForeground(new java.awt.Color(255, 255, 255));
        btn_return.setText("Return");
        btn_return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_returnActionPerformed(evt);
            }
        });
        pnl_contrast.add(btn_return, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 120, 50));

        add(pnl_contrast, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 420));

        img_cover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/book_cover(default).png"))); // NOI18N
        img_cover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                img_coverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                img_coverMouseExited(evt);
            }
        });
        add(img_cover, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 420));
    }// </editor-fold>//GEN-END:initComponents

    private void img_coverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_coverMouseEntered
        // TODO add your handling code here:
        unhide_info();
    }//GEN-LAST:event_img_coverMouseEntered

    private void img_coverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_coverMouseExited
        // TODO add your handling code here:
        hide_info();
    }//GEN-LAST:event_img_coverMouseExited

    private void btn_returnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_returnActionPerformed
        // TODO add your handling code here:
        try {
            var con = DBConnection.getConnection();
            String query = "DELETE FROM borrwed_books WHERE book_id=? AND user_id=?";
            var pat = con.prepareStatement(query);
            pat.setInt(1, this.book.book_id);
            pat.setInt(2, Globals.user_id);
            pat.executeUpdate();
            Globals.user_home.userIssuedBooks1.update_list();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_returnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_return;
    private rojerusan.RSLabelImage img_cover;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lb_author;
    private javax.swing.JLabel lb_bookname;
    private javax.swing.JLabel lb_genre;
    private javax.swing.JLabel lb_price;
    private javax.swing.JLabel lb_rating;
    private javax.swing.JLabel lb_year;
    private javax.swing.JPanel pnl_contrast;
    // End of variables declaration//GEN-END:variables
}
