/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package booksh;

import lib.WrapLayout;
import java.awt.Rectangle;
import java.util.ArrayList;

/**
 *
 * @author shadman
 */
public class BookView extends javax.swing.JPanel {

    /**
     * Creates new form BookView
     */
    ArrayList<Book> books;
    int rows = 0;
    static final Rectangle pnl = new Rectangle(280, 400);

    public BookView(ArrayList<Book> books) {
        initComponents();
        this.books = books;
        rows = Math.ceilDiv(books.size(), 3);
        this.setLayout(new WrapLayout(WrapLayout.LEADING, 80, 80));
        var grid = this;
        this.setBackground(Cl.bgp);
        for (Book bk: books) {
            this.add(new book_rect_view(bk));
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

        setBackground(new java.awt.Color(220, 240, 240));
        setLayout(new java.awt.BorderLayout());
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}