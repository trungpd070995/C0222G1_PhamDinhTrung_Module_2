package _01_introduction_to_java.practice;

import java.util.Scanner;

public class KiemTraNamNhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//
        int year;
        System.out.println("Enter a year: ");
        year = scanner.nextInt();//nhận dữ liệu từ bàn phím
        if( year % 4 == 0 ){
            if( year % 100 == 0 ){
                if( year % 400 == 0 ){
                    System.out.printf("%d is a leap year", year);
                }else {
                    System.out.printf("%d is NOT a leap year",year);
                }
            }else {
                System.out.printf("%d is a leap year",year);
            }
        }else {
            System.out.printf("%d is NOT a leap year",year);
        }
    }
}
