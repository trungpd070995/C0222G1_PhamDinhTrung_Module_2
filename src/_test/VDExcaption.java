package _test;

import java.util.Scanner;

public class VDExcaption {
    public static void main(String[] args) {
        double a;
        System.out.println("Nhap mot so");
        Scanner input = new Scanner(System.in);

        System.out.println("nhap a");
        a = input.nextDouble();

        /**cho người dùng nhập vào là kiểu số nguyên
         *nhưng nhập vào là chữ cái thì sẽ phát sinh lỗi
         * InputMismatchExcaption*/
    }
}

