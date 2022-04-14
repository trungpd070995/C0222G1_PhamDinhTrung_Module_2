package _10_stack_queue.exercise.reverse_stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập chuỗi kí tự bất kỳ tuỳ chọn: ");
        String key1 = input.nextLine();
        String key2 = " ";
        String[] charArray = new String[key1.length()];

        charArray = key1.split("");
        System.out.println(Arrays.toString(charArray));
        Stack<String> stackString = new Stack<>();

        for (int i = 0; i < charArray.length; i++) {
            stackString.push(charArray[i]);
        }

        for (int i = 0; i < charArray.length; i++) {
            key2 += stackString.pop();
            key2 += " ";
        }
        System.out.println(key2);
    }
}
