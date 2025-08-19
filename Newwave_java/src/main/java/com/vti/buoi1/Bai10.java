package com.vti.buoi1;

import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        System.out.println("Nhập năm: ");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        scanner.close();

        kiemTraNamNhuan(year);
    }

    public static void kiemTraNamNhuan (int year) {
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
            System.out.println(year + " là năm nhuận");
        } else
            System.out.println(year + " là năm không nhuận");
    }
}
