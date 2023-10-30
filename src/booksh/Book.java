/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package booksh;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author shadman
 */
public class Book {
//    public int book_id;
    public String isbn;
    public String name;
    public String author;
    public int price;
    public int quantity;
    public String genre;
    public float rating;
    public int year;
    public String desc;

    private void initialize_data(String isbn, String name, String author, int price, int quantity,
                String genre, float rating, int year, String desc) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
        this.genre = genre;
        this.rating = rating;
        this.year = year;
        this.desc = desc;
    }

    public Book(String isbn, String name, String author, int price, int quantity,
                String genre, float rating, int year, String desc) {
        initialize_data(isbn, name, author, price, quantity, genre, rating, year, desc);
    }

    public Book(ResultSet rs) throws SQLException {
        try {
            String row_isbn = rs.getString("isbn");
            String row_name = rs.getString("name");
            String row_author = rs.getString("author");
            String row_genre = rs.getString("genre");
            int row_price = rs.getInt("price");
            int row_quantity = rs.getInt("quantity");
            float row_rating = rs.getFloat("rating");
            int row_year = rs.getInt("year");
            String row_desc = rs.getString("description");
            initialize_data(row_isbn, row_name, row_author, row_price, row_quantity, row_genre, row_rating, row_year, row_desc);
        } catch (SQLException e) {
            throw e;
        }

    }
}
