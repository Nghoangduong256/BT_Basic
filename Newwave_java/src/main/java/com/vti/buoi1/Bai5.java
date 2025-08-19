package com.vti.buoi1;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        System.out.println("Nhập số nguyên thứ nhất: ");
        Scanner scanner = new Scanner(System.in);
        int soThuNhat = scanner.nextInt();
        System.out.println("Nhập số nguyên thứ hai: ");
        int soThuHai = scanner.nextInt();
        System.out.println("Nhập số nguyên thứ ba: ");
        int soThuBa = scanner.nextInt();
        scanner.close();

        int[] mang = {soThuNhat, soThuHai, soThuBa};

        int max = timSoNguyenLonNhat(mang);
        System.out.println("Số nguyên lớn nhất là: " + max);

    }

    public static int timSoNguyenLonNhat(int[] mang){
        int max = 0;
        for (int i = 0; i < 3; i++){
            if (mang[i] > max){
                max = mang[i];
            }
        }
        return max;
    }
}
