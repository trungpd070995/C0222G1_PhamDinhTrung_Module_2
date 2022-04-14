package _02_loop_java.exercise;

import java.util.Scanner;

public class ShowFirst20Primes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int count = 0;
        int n = 2;
        while (count < num){
            int a = 0;
            for (int i = 2; i < n; i++){
                if (n % i == 0){
                    a++;
                }
            }
            if (a == 0){
                System.out.println(n);
                count++;
            }
            n++;
        }
    }
}

