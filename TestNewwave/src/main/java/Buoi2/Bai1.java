package Buoi2;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số nguyên thứ 1");
        int a = scanner.nextInt();
        System.out.println("Nhập số nguyên thứ 2");
        int b = scanner.nextInt();
        scanner.close();

        int sum = a + b;
        System.out.println("Tổng của 2 số: " + sum);

    }
}
