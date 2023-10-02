/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package booksh;

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
    public Book(String isbn, String name, String author, int price, int quantity,
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
}
