package _15_debug.exercise.Illegal_triangle_exception;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Hãy nhập cạnh a: ");
                int a = Integer.parseInt(scanner.nextLine());
                System.out.println("Hãy nhập cạnh b: ");
                int b = Integer.parseInt(scanner.nextLine());
                System.out.println("Hãy nhập cạnh c: ");
                int c = Integer.parseInt(scanner.nextLine());
                Triangle triangle = new Triangle(a, b, c);
                System.out.println(triangle);
                break;
            } catch (NumberFormatException e) {
                System.err.println(e.getMessage());
                System.err.println("Giá trị nhập vào không phải là số! Mời bạn nhập lại!!!");
            } catch (IllegalRightTriangleException e) {
                System.err.println(e.getMessage());
                System.err.println("Mời bạn nhập lại!!!");
            }
        }
    }
}