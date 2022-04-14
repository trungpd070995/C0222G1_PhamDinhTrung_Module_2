package _02_loop_java.exercise;

import java.util.Scanner;

public class ShowImageStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Draw the rectangle");
        System.out.println("2. Draw the triangle top left");
        System.out.println("3. Draw the triangle bottom left");
        System.out.println("4. Draw the triangle top right");
        System.out.println("5. Draw the isosceles triangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        while (true){
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Draw the rectangle");
                    for (int i = 1; i <= 3 ; i++) {
                        for (int j = 1; j <= 7 ; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    System.out.println("Draw the triangle top left");
                    for (int i = 1; i <= 5 ; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                case 3:
                    System.out.println("Draw the triangle botton left");
                    for (int i = 7; i >= 1 ; i--) {
                        for (int j = 1; j <= i ; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                case 4:
                    System.out.println("Draw the triangle top right");
                    for (int i = 1; i <= 5 ; i++) {
                        for (int j = 5; j > i ; j--) {
                            System.out.print("  ");
                        }
                        for (int k = 1; k <= i * 2 - 1 ; k++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                case 5:
                    System.out.println("Draw the isosceles triangle");
                    for (int i = 1; i <= 5 ; i++) {
                        for (int j = 5; j > i ; j--) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= i * 2 - 1 ; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice");
                    break;
            }
        }
    }
}
