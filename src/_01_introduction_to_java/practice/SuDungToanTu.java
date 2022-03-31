package _01_introduction_to_java.practice;

import java.util.Scanner;

public class SuDungToanTu {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner scanner = new Scanner(System.in);//Khai báo đối tượng Scanner

        System.out.println("Enter width: ");
        width = scanner.nextFloat(); //Nhập chiều rộng

        System.out.println("Enter height: "); //Nhập chiều dài
        height = scanner.nextFloat();
        float arena = width * height;

        System.out.println("Arena is: " + arena);
    }
}
