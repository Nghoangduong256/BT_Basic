package com.vti.buoi1;

import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        System.out.println("Nhập số nguyên: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        
        int sum = 0;
        for (int i = 1; i <= num; i++){
            sum += i;
        }

        System.out.println("Tổng các số từ 1 đến " + num + ": " + sum);
    }
}
