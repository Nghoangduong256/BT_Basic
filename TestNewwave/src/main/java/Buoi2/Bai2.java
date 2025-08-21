package Buoi2;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập chiều dài: ");
        int chieuDai = scanner.nextInt();
        System.out.println("Nhập chiều rộng: ");
        int chieuRong = scanner.nextInt();
        scanner.close();

        int dienTichHinhChuNhat = dienTich(chieuDai, chieuRong);
        System.out.println("Tổng của 2 số: " + dienTichHinhChuNhat);

    }

    public static int dienTich (int a, int b){
        return a * b;
    }
}
