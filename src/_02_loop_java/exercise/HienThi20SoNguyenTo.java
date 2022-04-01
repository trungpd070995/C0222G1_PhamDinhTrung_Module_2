package _02_loop_java.exercise;

import java.util.Scanner;

public class HienThi20SoNguyenTo {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number:");
            int number = scanner.nextInt();
            int count = 0;
            int n = 2;
            String prime = " ";
            while (count < number) {
                int i;
                boolean check = true;
                for (i = 2; i < n; i++) {
                    if (n % i == 0) {
                        check = false;
                        break;
                    }
                }
                if (check) {
                    prime += n + " ";
                    count++;
                }
                n++;
            }
            System.out.println("Dãy " + number + " số trong dãy 20 số nguyên tố đầu tiên là: " + prime);
        }
    }

