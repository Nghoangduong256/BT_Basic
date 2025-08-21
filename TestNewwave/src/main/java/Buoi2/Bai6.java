package Buoi2;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        System.out.println("Nhập điểm trung bình: ");
        Scanner scanner = new Scanner(System.in);
        float diemTrungBinh = scanner.nextFloat();
        scanner.close();

        if (diemTrungBinh < 5) {
            System.out.println("Học sinh yếu");
        } else if (diemTrungBinh >= 5 && diemTrungBinh <= 6.5) {
            System.out.println("Học sinh trung bình");
        } else if (diemTrungBinh > 6.5 && diemTrungBinh <= 8) {
            System.out.println("Học sinh khá");
        } else {
            System.out.println("Học sinh giỏi");
        }
    }
}
