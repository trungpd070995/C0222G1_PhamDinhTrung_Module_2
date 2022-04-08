package _04_class_and_object.exercise.quadratic_equation;

import java.util.Scanner;

public class QuadraticEquationMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the a : ");
        double a = scanner.nextDouble();
        System.out.println("Enter the b :");
        double b = scanner.nextDouble();
        System.out.println("Enter the c :");
        double c = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        quadraticEquation.display();
    }
}
