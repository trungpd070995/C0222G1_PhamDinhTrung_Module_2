package _03_array.exercise;

import java.util.Scanner;
//Đếm ký tự trong một chuỗi
public class CountCharactersInAString {
    public static void main(String[] args) {
        String str;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi: ");
        str = scanner.next();
        System.out.println("Nhập vào một kí tự: ");
        char n = scanner.next().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == n) {
                count++;
            }
        }
        System.out.println("Số lần xuất hiện của kí tự trong chuỗi là: " + count);
    }
}