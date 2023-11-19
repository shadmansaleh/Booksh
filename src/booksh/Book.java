/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package booksh;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;

/**
 *
 * @author shadman
 */
public class Book {
    public int book_id;
    public String isbn;
    public String name;
    public String author;
    public int price;
    public int quantity;
    public String genre;
    public float rating;
    public int year;
    public String desc;
    public ImageIcon cover;

    private void initialize_data(int book_id, String isbn, String name, String author, int price, int quantity,
                String genre, float rating, int year, String desc, ImageIcon cover) {
        this.book_id = book_id;
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
        this.genre = genre;
        this.rating = rating;
        this.year = year;
        this.desc = desc;
        this.cover = cover;

    }

    public Book(int book_id, String isbn, String name, String author, int price, int quantity,
                String genre, float rating, int year, String desc, ImageIcon cover) {
        initialize_data(book_id, isbn, name, author, price, quantity, genre, rating, year, desc, cover);
    }

    public Book(ResultSet rs) throws SQLException {
        try {
            int book_id = rs.getInt("book_id");
            String row_isbn = rs.getString("isbn");
            String row_name = rs.getString("name");
            String row_author = rs.getString("author");
            String row_genre = rs.getString("genre");
            int row_price = rs.getInt("price");
            int row_quantity = rs.getInt("quantity");
            float row_rating = rs.getFloat("rating");
            int row_year = rs.getInt("year");
            String row_desc = rs.getString("description");
            Blob blob = rs.getBlob("cover_photo");
            if (blob != null && blob.length() != 0) {
                cover = new ImageIcon(blob.getBytes(1L, (int) blob.length()));
            } else {
                cover = new ImageIcon(getClass().getResource("/icons/book_cover(default).png"));
            }
            initialize_data(book_id, row_isbn, row_name, row_author, row_price, row_quantity, row_genre, row_rating, row_year, row_desc, cover);
        } catch (SQLException e) {
            throw e;
        }

    }
}
