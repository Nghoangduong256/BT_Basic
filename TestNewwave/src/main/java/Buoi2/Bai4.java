package Buoi2;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        System.out.println("Nhập số nguyên: ");
        Scanner scanner = new Scanner(System.in);
        int anInt = scanner.nextInt();
        scanner.close();

        kiemTraChanLe(anInt);
    }

    public static void kiemTraChanLe(int a){
        if (a % 2 == 0){
            System.out.println("a là số chẵn");
        } else if (a == 0){
            System.out.println("a là số 0");
        } else {
            System.out.println("a là số lẻ");
        }
    }
}
