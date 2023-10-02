/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package booksh;

import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.JScrollBar;

/**
 *
 * @author shadman
 */
public class ManageBooksPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageBooksPanel
     */

    DefaultTableModel model;
    public ManageBooksPanel() {
        initComponents();
        model = (DefaultTableModel)tbl_booklist.getModel();
        load_books_from_db();
        JScrollBar verticalScrollBar = jScrollPane1.getVerticalScrollBar();
        verticalScrollBar.setUnitIncrement(20);
        verticalScrollBar.setBlockIncrement(200);
    }

    public void load_books_from_db() {
        model.setRowCount(0);
        try {
            Connection con = DBConnection.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM book_details");
            while (rs.next()) {
                String bookName = rs.getString("name");
                String author = rs.getString("author");
                String isbn = rs.getString("isbn");
                int quantity = rs.getInt("quantity");
                int price = rs.getInt("price");
                Object[] row = {bookName, author, isbn, price, quantity};
                model.addRow(row);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean addBook() {
        //get values
        String isbn = txt_bookid.getText();
        String name = txt_bookname.getText();
        String author = txt_bookauthor.getText();
        int quantity = Integer.parseInt(txt_bookquantity.getText());
        int price = Integer.parseInt(txt_bookprice.getText());
        String genre = txt_bookgenre.getText();
        float rating = Float.parseFloat(txt_bookrating.getText());
        int year = Integer.parseInt(txt_bookyear.getText());
        String desc = txt_bookdescription.getText();
        // input validation
        if (name.equals("")) {
            JOptionPane.showMessageDialog(this, "Please Enter name");
            return false;
        }

        if (isbn.equals("")) {
            JOptionPane.showMessageDialog(this, "Please Enter ISBN");
            return false;
        }
        if (author.equals("")) {
            JOptionPane.showMessageDialog(this, "Please Enter Author");
            return false;
        }
        if (quantity == 0) {
            JOptionPane.showMessageDialog(this, "Please Enter Quantity");
            return false;
        }
        if (price == 0) {
            JOptionPane.showMessageDialog(this, "Please Enter Price");
            return false;
        }

        try {
            Connection con = DBConnection.getConnection();
            // check if entry already exists in database
            String query_seek = "Select * From book_details where isbn = ?";
            PreparedStatement par = con.prepareStatement(query_seek);
            par.setString(1, isbn);
            ResultSet rs = par.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(this, "Book already exists");
                return false;
            }
           
            // insert new book into database
            String query_insert = "INSERT INTO book_details(name, author, isbn, price, quantity, genre, rating, year, description) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?) ";
            par = con.prepareStatement(query_insert);
            par.setString(1, name);
            par.setString(2, author);
            par.setString(3, isbn);
            par.setInt(4, price);
            par.setInt(5, quantity);
            par.setString(6, genre);
            par.setFloat(7, rating);
            par.setInt(8, year);
            par.setString(9, desc);
            if (par.executeUpdate() <= 0) return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        Object[] row = {name, author, isbn, price, quantity};
        model.addRow(row);
        return true;
    }

    public boolean updateBook() {
        //get values
        String isbn = txt_bookid.getText();
        String name = txt_bookname.getText();
        String author = txt_bookauthor.getText();
        int quantity = Integer.parseInt(txt_bookquantity.getText());
        int price = Integer.parseInt(txt_bookprice.getText());
        String genre = txt_bookgenre.getText();
        float rating = Float.parseFloat(txt_bookrating.getText());
        int year = Integer.parseInt(txt_bookyear.getText());
        String desc = txt_bookdescription.getText();

        // input validation
        if (name.equals("")) {
            JOptionPane.showMessageDialog(this, "Please Enter name");
            return false;
        }

        if (isbn.equals("")) {
            JOptionPane.showMessageDialog(this, "Please Enter ISBN");
            return false;
        }
        if (author.equals("")) {
            JOptionPane.showMessageDialog(this, "Please Enter Author");
            return false;
        }
        if (quantity == 0) {
            JOptionPane.showMessageDialog(this, "Please Enter Quantity");
            return false;
        }
        if (price == 0) {
            JOptionPane.showMessageDialog(this, "Please Enter Price");
            return false;
        }

        try {
            Connection con = DBConnection.getConnection();
            // check if entry already exists in database
            String query_seek = "Select * From book_details where isbn = ?";
            PreparedStatement par = con.prepareStatement(query_seek);
            par.setString(1, isbn);
            ResultSet rs = par.executeQuery();
            if (!rs.next()) {
                JOptionPane.showMessageDialog(this, "Book doesn't exist");
                return false;
            }
           
            // insert new book into database
            String query_insert = "UPDATE book_details SET name = ?, author = ? , price = ?, quantity = ?, genre = ?, rating = ?, year = ?, description = ? WHERE isbn = ?";
            par = con.prepareStatement(query_insert);
            par.setString(1, name);
            par.setString(2, author);
            par.setInt(3, price);
            par.setInt(4, quantity);
            par.setString(5, genre);
            par.setFloat(6, rating);
            par.setInt(7, year);
            par.setString(8, desc);
            par.setString(9, isbn);
            if (par.executeUpdate() <= 0) return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        load_books_from_db();
        return true;
    }
    public void deleteBook() {
        //get values
        int[] rows = tbl_booklist.getSelectedRows();
        Vector<String> isbns = new Vector<>();
        if (rows.length == 0) isbns.add(txt_bookid.getText());
        else for (int i=0; i < rows.length; i++) isbns.add(model.getValueAt(rows[i], 2).toString());
        for (String isbn: isbns) {
            try {
                Connection con = DBConnection.getConnection();
                String query_insert = "DELETE FROM book_details WHERE isbn = ?";
                PreparedStatement par = con.prepareStatement(query_insert);
                par.setString(1, isbn);
                par.executeUpdate();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        load_books_from_db();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_bookid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_bookname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_bookauthor = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_bookprice = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txt_bookquantity = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_bookgenre = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt_bookrating = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txt_bookyear = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txt_bookdescription = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_booklist = new rojerusan.RSTableMetro();

        setBackground(new java.awt.Color(220, 240, 240));
        setPreferredSize(new java.awt.Dimension(1200, 760));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
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

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Glass Antiqua", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ISBN");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Glass Antiqua", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddNewBookIcons/icons8_Moleskine_26px.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        txt_bookid.setBackground(new java.awt.Color(102, 102, 255));
        txt_bookid.setFont(new java.awt.Font("Glass Antiqua", 0, 18)); // NOI18N
        txt_bookid.setForeground(new java.awt.Color(255, 255, 255));
        txt_bookid.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txt_bookid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_bookidActionPerformed(evt);
            }
        });
        jPanel2.add(txt_bookid, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 230, 30));

        jLabel3.setFont(new java.awt.Font("Glass Antiqua", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Name");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Glass Antiqua", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddNewBookIcons/icons8_Moleskine_26px.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        txt_bookname.setBackground(new java.awt.Color(102, 102, 255));
        txt_bookname.setFont(new java.awt.Font("Glass Antiqua", 0, 18)); // NOI18N
        txt_bookname.setForeground(new java.awt.Color(255, 255, 255));
        txt_bookname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txt_bookname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_booknameActionPerformed(evt);
            }
        });
        jPanel2.add(txt_bookname, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 230, 30));

        jLabel6.setFont(new java.awt.Font("Glass Antiqua", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddNewBookIcons/icons8_Moleskine_26px.png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jLabel5.setFont(new java.awt.Font("Glass Antiqua", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Author");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        txt_bookauthor.setBackground(new java.awt.Color(102, 102, 255));
        txt_bookauthor.setFont(new java.awt.Font("Glass Antiqua", 0, 18)); // NOI18N
        txt_bookauthor.setForeground(new java.awt.Color(255, 255, 255));
        txt_bookauthor.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txt_bookauthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_bookauthorActionPerformed(evt);
            }
        });
        jPanel2.add(txt_bookauthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 230, 30));

        jLabel8.setFont(new java.awt.Font("Glass Antiqua", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Price");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        jLabel7.setFont(new java.awt.Font("Glass Antiqua", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddNewBookIcons/icons8_Moleskine_26px.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        txt_bookprice.setBackground(new java.awt.Color(102, 102, 255));
        txt_bookprice.setFont(new java.awt.Font("Glass Antiqua", 0, 18)); // NOI18N
        txt_bookprice.setForeground(new java.awt.Color(255, 255, 255));
        txt_bookprice.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txt_bookprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_bookpriceActionPerformed(evt);
            }
        });
        jPanel2.add(txt_bookprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 230, 30));

        jLabel14.setFont(new java.awt.Font("Glass Antiqua", 0, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Quantity");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));

        jLabel15.setFont(new java.awt.Font("Glass Antiqua", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddNewBookIcons/icons8_Moleskine_26px.png"))); // NOI18N
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, -1, -1));

        txt_bookquantity.setBackground(new java.awt.Color(102, 102, 255));
        txt_bookquantity.setFont(new java.awt.Font("Glass Antiqua", 0, 18)); // NOI18N
        txt_bookquantity.setForeground(new java.awt.Color(255, 255, 255));
        txt_bookquantity.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txt_bookquantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_bookquantityActionPerformed(evt);
            }
        });
        jPanel2.add(txt_bookquantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, 230, 30));

        jLabel9.setFont(new java.awt.Font("Glass Antiqua", 0, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Genre");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, -1, -1));

        jLabel10.setFont(new java.awt.Font("Glass Antiqua", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddNewBookIcons/icons8_Moleskine_26px.png"))); // NOI18N
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, -1, -1));

        txt_bookgenre.setBackground(new java.awt.Color(102, 102, 255));
        txt_bookgenre.setFont(new java.awt.Font("Glass Antiqua", 0, 18)); // NOI18N
        txt_bookgenre.setForeground(new java.awt.Color(255, 255, 255));
        txt_bookgenre.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txt_bookgenre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_bookgenreActionPerformed(evt);
            }
        });
        jPanel2.add(txt_bookgenre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 530, 230, 30));

        jLabel12.setFont(new java.awt.Font("Glass Antiqua", 0, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Rating");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, -1, -1));

        jLabel13.setFont(new java.awt.Font("Glass Antiqua", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddNewBookIcons/icons8_Moleskine_26px.png"))); // NOI18N
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 620, -1, -1));

        txt_bookrating.setBackground(new java.awt.Color(102, 102, 255));
        txt_bookrating.setFont(new java.awt.Font("Glass Antiqua", 0, 18)); // NOI18N
        txt_bookrating.setForeground(new java.awt.Color(255, 255, 255));
        txt_bookrating.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txt_bookrating.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_bookratingActionPerformed(evt);
            }
        });
        jPanel2.add(txt_bookrating, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 620, 230, 30));

        jLabel16.setFont(new java.awt.Font("Glass Antiqua", 0, 20)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Published");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 670, -1, -1));

        jLabel17.setFont(new java.awt.Font("Glass Antiqua", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddNewBookIcons/icons8_Moleskine_26px.png"))); // NOI18N
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 710, -1, -1));

        txt_bookyear.setBackground(new java.awt.Color(102, 102, 255));
        txt_bookyear.setFont(new java.awt.Font("Glass Antiqua", 0, 18)); // NOI18N
        txt_bookyear.setForeground(new java.awt.Color(255, 255, 255));
        txt_bookyear.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txt_bookyear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_bookyearActionPerformed(evt);
            }
        });
        jPanel2.add(txt_bookyear, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 710, 230, 30));

        jLabel18.setFont(new java.awt.Font("Glass Antiqua", 0, 20)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Description");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 770, -1, -1));

        jLabel19.setFont(new java.awt.Font("Glass Antiqua", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddNewBookIcons/icons8_Moleskine_26px.png"))); // NOI18N
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 810, -1, -1));

        txt_bookdescription.setBackground(new java.awt.Color(102, 102, 255));
        txt_bookdescription.setFont(new java.awt.Font("Glass Antiqua", 0, 18)); // NOI18N
        txt_bookdescription.setForeground(new java.awt.Color(255, 255, 255));
        txt_bookdescription.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txt_bookdescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_bookdescriptionActionPerformed(evt);
            }
        });
        jPanel2.add(txt_bookdescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 810, 230, 30));

        jScrollPane1.setViewportView(jPanel2);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 660));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 750));

        jLabel11.setFont(new java.awt.Font("Glass Antiqua", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(251, 51, 51));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddNewBookIcons/icons8_Books_52px_1.png"))); // NOI18N
        jLabel11.setText("Manage Books");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 270, 90));

        tbl_booklist.setBackground(new java.awt.Color(220, 240, 240));
        tbl_booklist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Author", "ISBN", "Price", "Quantity"
            }
        ));
        tbl_booklist.setColorBackgoundHead(new java.awt.Color(102, 102, 255));
        tbl_booklist.setColorBordeFilas(new java.awt.Color(102, 102, 255));
        tbl_booklist.setColorFilasBackgound1(new java.awt.Color(220, 240, 240));
        tbl_booklist.setColorFilasBackgound2(new java.awt.Color(220, 240, 240));
        tbl_booklist.setColorFilasForeground1(new java.awt.Color(102, 102, 102));
        tbl_booklist.setColorFilasForeground2(new java.awt.Color(102, 102, 102));
        tbl_booklist.setColorSelBackgound(new java.awt.Color(102, 102, 102));
        tbl_booklist.setColorSelForeground(new java.awt.Color(220, 240, 240));
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

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 850, 660));
    }// </editor-fold>//GEN-END:initComponents

    private void txt_bookidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_bookidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_bookidActionPerformed

    private void txt_booknameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_booknameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_booknameActionPerformed

    private void txt_bookauthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_bookauthorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_bookauthorActionPerformed

    private void txt_bookpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_bookpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_bookpriceActionPerformed

    private void txt_bookgenreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_bookgenreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_bookgenreActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        // TODO add your handling code here:
        addBook();
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_modifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modifyActionPerformed
        // TODO add your handling code here:
        updateBook();
    }//GEN-LAST:event_btn_modifyActionPerformed

    private void btn_removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_removeActionPerformed
        // TODO add your handling code here:
        deleteBook();
    }//GEN-LAST:event_btn_removeActionPerformed

    private void tbl_booklistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_booklistMouseClicked
        int rowNo = tbl_booklist.getSelectedRow();
        String isbn = model.getValueAt(rowNo, 2).toString();
        try {
            Connection con = DBConnection.getConnection();
            // check if entry already exists in database
            String query_seek = "Select * From book_details where isbn = ?";
            PreparedStatement par = con.prepareStatement(query_seek);
            par.setString(1, isbn);
            ResultSet rs = par.executeQuery();
            if (rs.next()) {
                txt_bookname.setText(rs.getString("name"));
                txt_bookauthor.setText(rs.getString("author"));
                txt_bookid.setText(rs.getString("isbn"));
                txt_bookprice.setText(String.valueOf(rs.getInt("price")));
                txt_bookquantity.setText(String.valueOf(rs.getInt("quantity")));
                txt_bookgenre.setText(rs.getString("genre"));
                txt_bookrating.setText(String.valueOf(rs.getFloat("rating")));
                txt_bookyear.setText(String.valueOf(rs.getInt("year")));
                txt_bookdescription.setText(rs.getString("description"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_tbl_booklistMouseClicked

    private void txt_bookratingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_bookratingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_bookratingActionPerformed

    private void txt_bookdescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_bookdescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_bookdescriptionActionPerformed

    private void txt_bookyearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_bookyearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_bookyearActionPerformed

    private void txt_bookquantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_bookquantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_bookquantityActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonCircle btn_add;
    private rojerusan.RSMaterialButtonCircle btn_modify;
    private rojerusan.RSMaterialButtonCircle btn_remove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private rojerusan.RSTableMetro tbl_booklist;
    private javax.swing.JTextField txt_bookauthor;
    private javax.swing.JTextField txt_bookdescription;
    private javax.swing.JTextField txt_bookgenre;
    private javax.swing.JTextField txt_bookid;
    private javax.swing.JTextField txt_bookname;
    private javax.swing.JTextField txt_bookprice;
    private javax.swing.JTextField txt_bookquantity;
    private javax.swing.JTextField txt_bookrating;
    private javax.swing.JTextField txt_bookyear;
    // End of variables declaration//GEN-END:variables
}
