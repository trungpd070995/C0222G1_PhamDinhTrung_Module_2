package _10_stack_queue.exercise.decimal_to_binary;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.println(" Nhập số hệ thập phân muốn chuyển đổi sang hệ nhị phân: ");
        int decimal = input.nextInt();
        while (decimal != 0) {
            int a = (decimal % 2);
            stack.push(a);
            decimal = decimal / 2;

        }
        while (!(stack.isEmpty())) {
            System.out.print(stack.pop());

        }
    }
}
