package Buoi3;

public class Book {
    String title;
    String author;
    int price;

    //Constructor
    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    //Method
    public void thongTinSach (Book book){
        System.out.println("==============");
        System.out.println("Thông tin sách: ");
        System.out.println("Tên sách: " + this.title);
        System.out.println("Tác giả: " + this.author);
        System.out.println("Giá: " + this.price + "VND");
    }
}
