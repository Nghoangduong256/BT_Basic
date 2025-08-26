package Buoi3;

public class Main {
    public static void main(String[] args) {
       Book book1 = new Book("Kinh Thánh - Tân Ước", "Linh mục Nguyễn Thế Thuấn", 466500);
       Book book2 = new Book("Khái Lược Văn Minh Luận", "Fukuzawa Yukichi", 159000);
       Book book3 = new Book("Lịch Sử Việt Nam Từ Nguồn Gốc Đến Giữa Thế Kỷ XX", "Lê Thành Khôi", 191200);

       book1.thongTinSach(book1);
        book2.thongTinSach(book2);
        book3.thongTinSach(book3);
    }
}
