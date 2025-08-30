package Buoi4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HocSinh hocSinh1 = new HocSinh(null, null, 0, 0, 0, 0);
        Scanner scanner = new Scanner(System.in);

        hocSinh1.nhapThongTin(scanner);
        hocSinh1.hienThiThongTin();
    }
}
