package _02_loop_java.exercise;

import java.util.Scanner;

class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("List");
            System.out.println("1. Draw the the rectangle");
            System.out.println("2. Draw the triangle");
            System.out.println("3. Draw ");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 7; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }break;
                case 2 :
                    for (int i = 1; i <=5; i++) {
                        for (int j = 0; j <i ; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 3 :
                    for (int i = 7; i >=1 ; i--) {
                        for (int j = 1; j <=i ; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }break;
            }
        }

    }
}