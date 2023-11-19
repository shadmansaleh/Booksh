/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package booksh;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JScrollBar;

/**
 *
 * @author shadman
 */
public class UserCart extends javax.swing.JPanel {

    /**
     * Creates new form UserProfile
     */
    public UserCart() {
        initComponents();
        update_list();
        JScrollBar verticalScrollBar = ScrollView.getVerticalScrollBar();
        verticalScrollBar.setUnitIncrement(20);
        verticalScrollBar.setBlockIncrement(200);
    }

    BookView booklist = null;

    public void update_list() {
        var books = new ArrayList<Book>();

        try {
            Connection con = DBConnection.getConnection();
            String query = "SELECT * FROM requests INNER JOIN book_details ON book_details.book_id = requests.book_id WHERE user_id = ?";
            var st = con.prepareStatement(query);
            st.setInt(1, Globals.user);

            var rs = st.executeQuery();
            while (rs.next()) {
                books.add(new Book(rs));
            }
            update_res_panel(new BookView(books));

            query = "SELECT SUM(book_details.price) AS tot_price FROM requests INNER JOIN book_details ON book_details.book_id = requests.book_id WHERE user_id = ? AND requests.type=\"BUY\"";
            st = con.prepareStatement(query);
            st.setInt(1, Globals.user);
            rs = st.executeQuery();
            if (rs.next()) {
                lbl_ammount.setText(String.valueOf(rs.getInt("tot_price")));
            } else {
                lbl_ammount.setText("0.00");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    public void update_res_panel(BookView bv) {
        if (booklist != null) ScrollView.getViewport().remove(booklist);
        ScrollView.getViewport().add(bv);
        this.validate();
        this.repaint();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ScrollView = new javax.swing.JScrollPane();
        jLabel1 = new javax.swing.JLabel();
        lbl_ammount = new javax.swing.JLabel();
        btn_confirm = new necesario.RSMaterialButtonCircle();
        jLabel11 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(ScrollView, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1220, 490));

        jLabel1.setFont(new java.awt.Font("Glass Antiqua", 0, 24)); // NOI18N
        jLabel1.setText("Total");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 590, -1, -1));

        lbl_ammount.setFont(new java.awt.Font("Glass Antiqua", 0, 24)); // NOI18N
        lbl_ammount.setText("0.00");
        add(lbl_ammount, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 600, -1, -1));

        btn_confirm.setText("Confirm");
        add(btn_confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 610, 270, 70));

        jLabel11.setFont(new java.awt.Font("Glass Antiqua", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(101, 101, 101));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-buy-50.png"))); // NOI18N
        jLabel11.setText("Cart");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, -10, 190, 90));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollView;
    private necesario.RSMaterialButtonCircle btn_confirm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel lbl_ammount;
    // End of variables declaration//GEN-END:variables
}
