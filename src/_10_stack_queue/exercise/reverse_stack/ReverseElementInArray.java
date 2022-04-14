package _10_stack_queue.exercise.reverse_stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stackInteger = new Stack<>();
        System.out.println("Nhập số lượng phần tử:");
        int n = sc.nextInt();
        int integer[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phẩn từ vào mảng: ");
            stackInteger.push(sc.nextInt());
        }
        System.out.println("Mảng số ban đầu chưa đảo ngược là: " + stackInteger);

        for (int i = 0; i < n; i++) {
            integer[i] = stackInteger.pop();
        }
        System.out.println(" Mảng số nguyên sau khi được đảo ngược là: " + Arrays.toString(integer));
    }

}
