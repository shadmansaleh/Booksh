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
public class book_view_booklist extends javax.swing.JPanel {

    /**
     * Creates new form book_view_booklist
     * @param book
     */
    Book book;
    public book_view_booklist(Book book) {
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
        ic_boroow = new rojerusan.RSLabelImage();
        ic_buy = new rojerusan.RSLabelImage();
        ic_wishlist = new rojerusan.RSLabelImage();
        img_cover = new rojerusan.RSLabelImage();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(51, 51, 51));
        setFont(new java.awt.Font("Glass Antiqua", 0, 18)); // NOI18N
        setMinimumSize(new java.awt.Dimension(280, 420));
        setPreferredSize(new java.awt.Dimension(280, 420));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_contrast.setBackground(new java.awt.Color(102, 102, 255));
        pnl_contrast.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                pnl_contrastAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        pnl_contrast.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_bookname.setFont(new java.awt.Font("Glass Antiqua", 1, 36)); // NOI18N
        lb_bookname.setForeground(new java.awt.Color(255, 255, 255));
        lb_bookname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_bookname.setText("Book Name");
        pnl_contrast.add(lb_bookname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 230, 50));

        lb_author.setFont(new java.awt.Font("Glass Antiqua", 2, 24)); // NOI18N
        lb_author.setForeground(new java.awt.Color(255, 255, 255));
        lb_author.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lb_author.setText("Author Name ");
        pnl_contrast.add(lb_author, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 210, 60));

        jLabel5.setFont(new java.awt.Font("Glass Antiqua", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(251, 251, 251));
        jLabel5.setText("Published");
        pnl_contrast.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 90, 30));

        lb_rating.setFont(new java.awt.Font("Glass Antiqua", 0, 18)); // NOI18N
        lb_rating.setForeground(new java.awt.Color(251, 251, 251));
        lb_rating.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lb_rating.setText("4.2");
        pnl_contrast.add(lb_rating, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 120, 20));

        lb_price.setBackground(new java.awt.Color(255, 255, 255));
        lb_price.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lb_price.setForeground(new java.awt.Color(251, 251, 251));
        lb_price.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lb_price.setText("250");
        pnl_contrast.add(lb_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 120, 30));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(251, 251, 251));
        jLabel6.setText("Price");
        pnl_contrast.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 50, 30));

        lb_year.setFont(new java.awt.Font("Glass Antiqua", 0, 18)); // NOI18N
        lb_year.setForeground(new java.awt.Color(251, 251, 251));
        lb_year.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lb_year.setText("2017");
        pnl_contrast.add(lb_year, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 110, 20));

        jLabel7.setFont(new java.awt.Font("Glass Antiqua", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(251, 251, 251));
        jLabel7.setText("Rating");
        pnl_contrast.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 50, 30));

        jLabel3.setFont(new java.awt.Font("Glass Antiqua", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(251, 251, 251));
        jLabel3.setText("Genre");
        pnl_contrast.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 50, 30));

        lb_genre.setFont(new java.awt.Font("Glass Antiqua", 0, 18)); // NOI18N
        lb_genre.setForeground(new java.awt.Color(255, 255, 255));
        lb_genre.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lb_genre.setText("Thriller");
        pnl_contrast.add(lb_genre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 110, 20));

        ic_boroow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Sell_white_50px.png"))); // NOI18N
        ic_boroow.setToolTipText("Borrow");
        ic_boroow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ic_boroowMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ic_boroowMouseEntered(evt);
            }
        });
        pnl_contrast.add(ic_boroow, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 50, 40));

        ic_buy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-buy-white-50.png"))); // NOI18N
        ic_buy.setToolTipText("Buy");
        ic_buy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ic_buyMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ic_buyMouseEntered(evt);
            }
        });
        pnl_contrast.add(ic_buy, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 50, 40));

        ic_wishlist.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ic_wishlist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-love-(white)-50.png"))); // NOI18N
        ic_wishlist.setToolTipText("Add to Wishlist");
        ic_wishlist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ic_wishlistMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ic_wishlistMouseEntered(evt);
            }
        });
        pnl_contrast.add(ic_wishlist, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 50, 40));

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

    private void ic_boroowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ic_boroowMouseClicked
        // TODO add your handling code here:
        try {
            var con = DBConnection.getConnection();
            {
                // check
                String query = "SELECT book_id FROM requests WHERE book_id=? AND user_id=? AND type=?";
                var pat = con.prepareStatement(query);
                pat.setInt(1, this.book.book_id);
                pat.setInt(2, Globals.user_id);
                pat.setString(3, "BRW");
                if (pat.executeQuery().next()) {
                    JOptionPane.showMessageDialog(this, this.book.name + " already in cart");
                    return;
                }
            }
            String query = "INSERT INTO requests (book_id, user_id, type) VALUES (?, ?, ?)";
            var pat = con.prepareStatement(query);
            pat.setInt(1, this.book.book_id);
            pat.setInt(2, Globals.user_id);
            pat.setString(3, "BRW");
            if (pat.executeUpdate() > 0)
                JOptionPane.showMessageDialog(this, this.book.name + " added to cart");

        } catch (Exception e) {
            e.printStackTrace();
        }
        JOptionPane.showMessageDialog(this, this.book.name + " asked to borrow");
    }//GEN-LAST:event_ic_boroowMouseClicked

    private void ic_buyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ic_buyMouseClicked
        // TODO add your handling code here:
        try {
            var con = DBConnection.getConnection();
            {
                // check
                String query = "SELECT book_id FROM requests WHERE book_id=? AND user_id=? AND type=?";
                var pat = con.prepareStatement(query);
                pat.setInt(1, this.book.book_id);
                pat.setInt(2, Globals.user_id);
                pat.setString(3, "BUY");
                if (pat.executeQuery().next()) {
                    JOptionPane.showMessageDialog(this, this.book.name + " already in cart");
                    return;
                }
            }
            String query = "INSERT INTO requests (book_id, user_id, type) VALUES (?, ?, ?)";
            var pat = con.prepareStatement(query);
            pat.setInt(1, this.book.book_id);
            pat.setInt(2, Globals.user_id);
            pat.setString(3, "BUY");
            if (pat.executeUpdate() > 0)
                JOptionPane.showMessageDialog(this, this.book.name + " asked to buy");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_ic_buyMouseClicked

    private void ic_wishlistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ic_wishlistMouseClicked
        // TODO add your handling code here:
        try {
            var con = DBConnection.getConnection();
            String query = "INSERT INTO wishlist (book_id, user_id) VALUES (?, ?)";
            var pat = con.prepareStatement(query);
            pat.setInt(1, this.book.book_id);
            pat.setInt(2, Globals.user_id);
            if (pat.executeUpdate() > 0)
                JOptionPane.showMessageDialog(this, this.book.name + " added to wishlist");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_ic_wishlistMouseClicked

    private void img_coverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_coverMouseEntered
        // TODO add your handling code here:
        unhide_info();
    }//GEN-LAST:event_img_coverMouseEntered

    private void img_coverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_coverMouseExited
        // TODO add your handling code here:
        hide_info();
    }//GEN-LAST:event_img_coverMouseExited

    private void ic_boroowMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ic_boroowMouseEntered
        // TODO add your handling code here:
        unhide_info();
    }//GEN-LAST:event_ic_boroowMouseEntered

    private void ic_buyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ic_buyMouseEntered
        // TODO add your handling code here:
        unhide_info();
    }//GEN-LAST:event_ic_buyMouseEntered

    private void ic_wishlistMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ic_wishlistMouseEntered
        // TODO add your handling code here:
        unhide_info();
    }//GEN-LAST:event_ic_wishlistMouseEntered

    private void pnl_contrastAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_pnl_contrastAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_pnl_contrastAncestorAdded


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSLabelImage ic_boroow;
    private rojerusan.RSLabelImage ic_buy;
    private rojerusan.RSLabelImage ic_wishlist;
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
