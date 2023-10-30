/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package booksh;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shadman
 */
public class ManageCustomerPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageBooksPanel
     */

    DefaultTableModel model;
    
    public ManageCustomerPanel() {
        initComponents();
        model = (DefaultTableModel)tbl_booklist.getModel();
//        load_customers_from_db();
    }

    public void load_customers_from_db() {
//        model.setRowCount(0);
//        try {
//            Connection con = DBConnection.getConnection();
//            Statement st = con.createStatement();
//            ResultSet rs = st.executeQuery("SELECT * FROM book_details");
//            while (rs.next()) {
//                String bookName = rs.getString("name");
//                String author = rs.getString("author");
//                String isbn = rs.getString("isbn");
//                int quantity = rs.getInt("quantity");
//                int price = rs.getInt("price");
//                Object[] row = {bookName, author, isbn, price, quantity};
//                model.addRow(row);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }

    public boolean addCustomer() {
//        //get values
//        String isbn = txt_bookid.getText();
//        String name = txt_bookname.getText();
//        String author = txt_bookauthor.getText();
//        int quantity = Integer.parseInt(txt_bookquantity.getText());
//        int price = Integer.parseInt(txt_bookprice.getText());
//        String genre = txt_bookgenre.getText();
//        float rating = Float.parseFloat(txt_bookrating.getText());
//        int year = Integer.parseInt(txt_bookyear.getText());
//        String desc = txt_bookdescription.getText();
//        // input validation
//        if (name.equals("")) {
//            JOptionPane.showMessageDialog(this, "Please Enter name");
//            return false;
//        }
//
//        if (isbn.equals("")) {
//            JOptionPane.showMessageDialog(this, "Please Enter ISBN");
//            return false;
//        }
//        if (author.equals("")) {
//            JOptionPane.showMessageDialog(this, "Please Enter Author");
//            return false;
//        }
//        if (quantity == 0) {
//            JOptionPane.showMessageDialog(this, "Please Enter Quantity");
//            return false;
//        }
//        if (price == 0) {
//            JOptionPane.showMessageDialog(this, "Please Enter Price");
//            return false;
//        }
//
//        try {
//            Connection con = DBConnection.getConnection();
//            // check if entry already exists in database
//            String query_seek = "Select * From book_details where isbn = ?";
//            PreparedStatement par = con.prepareStatement(query_seek);
//            par.setString(1, isbn);
//            ResultSet rs = par.executeQuery();
//            if (rs.next()) {
//                JOptionPane.showMessageDialog(this, "Book already exists");
//                return false;
//            }
//           
//            // insert new book into database
//            String query_insert = "INSERT INTO book_details(name, author, isbn, price, quantity, genre, rating, year, description) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?) ";
//            par = con.prepareStatement(query_insert);
//            par.setString(1, name);
//            par.setString(2, author);
//            par.setString(3, isbn);
//            par.setInt(4, price);
//            par.setInt(5, quantity);
//            par.setString(6, genre);
//            par.setFloat(7, rating);
//            par.setInt(8, year);
//            par.setString(9, desc);
//            if (par.executeUpdate() <= 0) return false;
//        } catch (Exception e) {
//            e.printStackTrace();
//            return false;
//        }
//        Object[] row = {name, author, isbn, price, quantity};
//        model.addRow(row);
        return true;
    }

    public boolean updateCustomer() {
//        //get values
//        String isbn = txt_bookid.getText();
//        String name = txt_bookname.getText();
//        String author = txt_bookauthor.getText();
//        int quantity = Integer.parseInt(txt_bookquantity.getText());
//        int price = Integer.parseInt(txt_bookprice.getText());
//        String genre = txt_bookgenre.getText();
//        float rating = Float.parseFloat(txt_bookrating.getText());
//        int year = Integer.parseInt(txt_bookyear.getText());
//        String desc = txt_bookdescription.getText();
//
//        // input validation
//        if (name.equals("")) {
//            JOptionPane.showMessageDialog(this, "Please Enter name");
//            return false;
//        }
//
//        if (isbn.equals("")) {
//            JOptionPane.showMessageDialog(this, "Please Enter ISBN");
//            return false;
//        }
//        if (author.equals("")) {
//            JOptionPane.showMessageDialog(this, "Please Enter Author");
//            return false;
//        }
//        if (quantity == 0) {
//            JOptionPane.showMessageDialog(this, "Please Enter Quantity");
//            return false;
//        }
//        if (price == 0) {
//            JOptionPane.showMessageDialog(this, "Please Enter Price");
//            return false;
//        }
//
//        try {
//            Connection con = DBConnection.getConnection();
//            // check if entry already exists in database
//            String query_seek = "Select * From book_details where isbn = ?";
//            PreparedStatement par = con.prepareStatement(query_seek);
//            par.setString(1, isbn);
//            ResultSet rs = par.executeQuery();
//            if (!rs.next()) {
//                JOptionPane.showMessageDialog(this, "Book doesn't exist");
//                return false;
//            }
//           
//            // insert new book into database
//            String query_insert = "UPDATE book_details SET name = ?, author = ? , price = ?, quantity = ?, genre = ?, rating = ?, year = ?, description = ? WHERE isbn = ?";
//            par = con.prepareStatement(query_insert);
//            par.setString(1, name);
//            par.setString(2, author);
//            par.setInt(3, price);
//            par.setInt(4, quantity);
//            par.setString(5, genre);
//            par.setFloat(6, rating);
//            par.setInt(7, year);
//            par.setString(8, desc);
//            par.setString(9, isbn);
//            if (par.executeUpdate() <= 0) return false;
//        } catch (Exception e) {
//            e.printStackTrace();
//            return false;
//        }
//        load_customers_from_db();
        return true;
    }
    public void deleteCustomer() {
//        //get values
//        int[] rows = tbl_booklist.getSelectedRows();
//        Vector<String> isbns = new Vector<>();
//        if (rows.length == 0) isbns.add(txt_bookid.getText());
//        else for (int i=0; i < rows.length; i++) isbns.add(model.getValueAt(rows[i], 2).toString());
//        for (String isbn: isbns) {
//            try {
//                Connection con = DBConnection.getConnection();
//                String query_insert = "DELETE FROM book_details WHERE isbn = ?";
//                PreparedStatement par = con.prepareStatement(query_insert);
//                par.setString(1, isbn);
//                par.executeUpdate();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//        load_customers_from_db();
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
        btn_remove = new rojerusan.RSMaterialButtonCircle();
        btn_add = new rojerusan.RSMaterialButtonCircle();
        btn_modify = new rojerusan.RSMaterialButtonCircle();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_password = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txt_contact = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_dob = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        btn_clear = new rojerusan.RSMaterialButtonCircle();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_booklist = new rojerusan.RSTableMetro();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_remove.setBackground(new java.awt.Color(250, 51, 51));
        btn_remove.setText("Remove");
        btn_remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_removeActionPerformed(evt);
            }
        });
        jPanel1.add(btn_remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 660, -1, 50));

        btn_add.setBackground(new java.awt.Color(250, 51, 51));
        btn_add.setText("Add");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });
        jPanel1.add(btn_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 660, -1, 50));

        btn_modify.setBackground(new java.awt.Color(250, 51, 51));
        btn_modify.setText("Update");
        btn_modify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modifyActionPerformed(evt);
            }
        });
        jPanel1.add(btn_modify, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 660, -1, 50));

        jScrollPane1.setBackground(new java.awt.Color(102, 102, 255));
        jScrollPane1.setBorder(null);

        jPanel2.setBackground(new java.awt.Color(51, 102, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Glass Antiqua", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Username");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel4.setFont(new java.awt.Font("Glass Antiqua", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddNewBookIcons/icons8_Moleskine_26px.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        txt_username.setBackground(new java.awt.Color(51, 102, 255));
        txt_username.setFont(new java.awt.Font("Glass Antiqua", 0, 18)); // NOI18N
        txt_username.setForeground(new java.awt.Color(255, 255, 255));
        txt_username.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txt_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usernameActionPerformed(evt);
            }
        });
        jPanel2.add(txt_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 230, 30));

        jLabel6.setFont(new java.awt.Font("Glass Antiqua", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddNewBookIcons/icons8_Moleskine_26px.png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jLabel5.setFont(new java.awt.Font("Glass Antiqua", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Email");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        txt_email.setBackground(new java.awt.Color(51, 102, 255));
        txt_email.setFont(new java.awt.Font("Glass Antiqua", 0, 18)); // NOI18N
        txt_email.setForeground(new java.awt.Color(255, 255, 255));
        txt_email.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txt_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emailActionPerformed(evt);
            }
        });
        jPanel2.add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 230, 30));

        jLabel8.setFont(new java.awt.Font("Glass Antiqua", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Password");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jLabel7.setFont(new java.awt.Font("Glass Antiqua", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddNewBookIcons/icons8_Moleskine_26px.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        txt_password.setBackground(new java.awt.Color(51, 102, 255));
        txt_password.setFont(new java.awt.Font("Glass Antiqua", 0, 18)); // NOI18N
        txt_password.setForeground(new java.awt.Color(255, 255, 255));
        txt_password.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txt_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passwordActionPerformed(evt);
            }
        });
        jPanel2.add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 230, 30));

        jLabel14.setFont(new java.awt.Font("Glass Antiqua", 0, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Contact");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        jLabel15.setFont(new java.awt.Font("Glass Antiqua", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddNewBookIcons/icons8_Moleskine_26px.png"))); // NOI18N
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));

        txt_contact.setBackground(new java.awt.Color(51, 102, 255));
        txt_contact.setFont(new java.awt.Font("Glass Antiqua", 0, 18)); // NOI18N
        txt_contact.setForeground(new java.awt.Color(255, 255, 255));
        txt_contact.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txt_contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_contactActionPerformed(evt);
            }
        });
        jPanel2.add(txt_contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 230, 30));

        jLabel9.setBackground(new java.awt.Color(51, 102, 255));
        jLabel9.setFont(new java.awt.Font("Glass Antiqua", 0, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Date of Birth");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, -1, -1));

        jLabel10.setFont(new java.awt.Font("Glass Antiqua", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddNewBookIcons/icons8_Moleskine_26px.png"))); // NOI18N
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, -1));

        txt_dob.setBackground(new java.awt.Color(51, 102, 255));
        txt_dob.setFont(new java.awt.Font("Glass Antiqua", 0, 18)); // NOI18N
        txt_dob.setForeground(new java.awt.Color(255, 255, 255));
        txt_dob.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txt_dob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_dobActionPerformed(evt);
            }
        });
        jPanel2.add(txt_dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 470, 230, 30));

        jLabel12.setFont(new java.awt.Font("Glass Antiqua", 0, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Gender");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, -1, -1));

        jLabel13.setFont(new java.awt.Font("Glass Antiqua", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddNewBookIcons/icons8_Moleskine_26px.png"))); // NOI18N
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, -1, -1));

        jRadioButton2.setBackground(new java.awt.Color(51, 102, 255));
        jRadioButton2.setFont(new java.awt.Font("Glass Antiqua", 0, 18)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Female");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 580, -1, -1));

        jRadioButton1.setBackground(new java.awt.Color(51, 102, 255));
        jRadioButton1.setFont(new java.awt.Font("Glass Antiqua", 0, 18)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Male");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 580, -1, -1));

        jScrollPane1.setViewportView(jPanel2);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 660));

        btn_clear.setBackground(new java.awt.Color(250, 51, 51));
        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });
        jPanel1.add(btn_clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 710, -1, 40));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 760));

        jLabel11.setFont(new java.awt.Font("Glass Antiqua", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(251, 51, 51));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddNewBookIcons/icons8_Student_Male_100px.png"))); // NOI18N
        jLabel11.setText("Manage Customers");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 390, 90));

        tbl_booklist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Email", "Oders", "Issued Books"
            }
        ));
        tbl_booklist.setColorBackgoundHead(new java.awt.Color(51, 102, 255));
        tbl_booklist.setColorBordeFilas(new java.awt.Color(51, 102, 255));
        tbl_booklist.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tbl_booklist.setColorFilasForeground1(new java.awt.Color(102, 102, 102));
        tbl_booklist.setColorFilasForeground2(new java.awt.Color(102, 102, 102));
        tbl_booklist.setColorSelBackgound(new java.awt.Color(102, 102, 102));
        tbl_booklist.setFont(new java.awt.Font("Glass Antiqua", 0, 25)); // NOI18N
        tbl_booklist.setFuenteFilas(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tbl_booklist.setFuenteFilasSelect(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        tbl_booklist.setFuenteHead(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        tbl_booklist.setRowHeight(40);
        tbl_booklist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_booklistMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_booklist);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 850, 650));
    }// </editor-fold>//GEN-END:initComponents

    private void btn_removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_removeActionPerformed
        // TODO add your handling code here:
        deleteCustomer();
    }//GEN-LAST:event_btn_removeActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        // TODO add your handling code here:
        addCustomer();
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_modifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modifyActionPerformed
        // TODO add your handling code here:
        updateCustomer();
    }//GEN-LAST:event_btn_modifyActionPerformed

    private void txt_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usernameActionPerformed

    private void txt_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emailActionPerformed

    private void txt_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_passwordActionPerformed

    private void txt_contactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_contactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_contactActionPerformed

    private void txt_dobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_dobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_dobActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        // TODO add your handling code here:
        txt_username.setText("");
        txt_email.setText("");
        txt_password.setText("");
        txt_contact.setText("");
        txt_dob.setText("");
    }//GEN-LAST:event_btn_clearActionPerformed

    private void tbl_booklistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_booklistMouseClicked
//        int rowNo = tbl_booklist.getSelectedRow();
//        String isbn = model.getValueAt(rowNo, 2).toString();
//        try {
//            Connection con = DBConnection.getConnection();
//            // check if entry already exists in database
//            String query_seek = "Select * From book_details where isbn = ?";
//            PreparedStatement par = con.prepareStatement(query_seek);
//            par.setString(1, isbn);
//            ResultSet rs = par.executeQuery();
//            if (rs.next()) {
//                txt_username.setText(rs.getString("name"));
//                txt_email.setText(rs.getString("author"));
//                txt_bookid.setText(rs.getString("isbn"));
//                txt_password.setText(String.valueOf(rs.getInt("price")));
//                txt_contact.setText(String.valueOf(rs.getInt("quantity")));
//                txt_dob.setText(rs.getString("genre"));
//                txt_bookrating.setText(String.valueOf(rs.getFloat("rating")));
//                txt_bookyear.setText(String.valueOf(rs.getInt("year")));
//                txt_bookdescription.setText(rs.getString("description"));
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }//GEN-LAST:event_tbl_booklistMouseClicked

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonCircle btn_add;
    private rojerusan.RSMaterialButtonCircle btn_clear;
    private rojerusan.RSMaterialButtonCircle btn_modify;
    private rojerusan.RSMaterialButtonCircle btn_remove;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private rojerusan.RSTableMetro tbl_booklist;
    private javax.swing.JTextField txt_contact;
    private javax.swing.JTextField txt_dob;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_password;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
