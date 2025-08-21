package Buoi2;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        System.out.println("Nhập bán kính hình tròn");
        Scanner scanner = new Scanner(System.in);
        int banKinh = scanner.nextInt();
        scanner.close();

        double chuViHinhTron = chuVi(banKinh);
        double dienTichHinhTron = dienTich(banKinh);

        System.out.println("Chu vi hình tròn: " + chuViHinhTron);
        System.out.println("Diện tích hình tròn: " + dienTichHinhTron);
    }

    public static double chuVi(int a){
        return (2 * 3.14 * a);
    }

    public static double dienTich(int a){
        return (3.14 * a * a);
    }
}
