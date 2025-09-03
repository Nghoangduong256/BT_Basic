package com.vti.Buoi4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HocSinh hocSinh1 = new HocSinh(null, null, 0, 0, 0, 0);
        // Khi có hàm constructor ở class object thì khi khai báo biến thuộc kiểu Object, ta bắt buộc phải khai báo giá trị từng thuộc tính ngay ở câu lệnh khai báo
        // tuy nhiên vì có hàm nhapThongTin() rồi nên ta cho các giá trị về null cho kiểu String, 0 cho kiểu int
        // lý do vì giá trị mặc định của String là null và giá trị mặc định của kiểu int là 0 (xem lại slide bài 2 java)
        Scanner scanner = new Scanner(System.in);
        // vẫn phải khai báo biến scanner kiểu Scanner để truyền tham ố vào hàm nhapThongTin();

        hocSinh1.nhapThongTin(scanner);
        hocSinh1.hienThiThongTin();
    }
}
