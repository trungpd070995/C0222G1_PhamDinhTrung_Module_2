package _11_stack_queue.exercise.check_string_palindrome;

import java.util.*;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi bạn muốn kiểm tra: ");

        String string = input.nextLine();
        string = string.toLowerCase().replaceAll("", "");
        System.out.println(string);

        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();

        String[] array;
        array = string.split("");
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < string.length(); i++) {
            stack.push(array[i]);
            queue.add(array[i]);
        }

        String displayPalindrome = "";
        
        while(!queue.isEmpty()) {
            if ((queue.remove().equals(stack.pop()))) {
                displayPalindrome = "Đây là chuỗi Palindrome";
            } else {
                displayPalindrome = "Đây không phải là chuỗi Palindrome";
            }
        }
        System.out.println(displayPalindrome);
    }
}
