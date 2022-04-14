package _10_stack_queue.exercise.check_string_palindrome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi bạn muốn kiểm tra: ");
        String string = input.nextLine();
        String[] array;
        array = string.split("");
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();
        for (int i = 0, j = string.length() - 1; i < string.length(); i++, j--) {
            stack.push(array[i].toLowerCase());
            queue.add(array[j].toLowerCase());
        }
        if (stack.equals(queue)) {
            System.out.println("Đây là chuỗi Palindrome");
        } else {
            System.out.println("Đây không phải là chuỗi Palindrome");
        }

    }
}
