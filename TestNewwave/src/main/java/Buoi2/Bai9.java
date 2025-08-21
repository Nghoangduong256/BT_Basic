package Buoi2;

import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        System.out.println("Nhập số nguyên: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();

        int giaiThua = 1;
        for (int i = 1; i <= num; i++){
            giaiThua *= i;
        }

        System.out.println("!" + num + " = " +giaiThua);
    }
}
