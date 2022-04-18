package _13_searching_algorithms.pratice.calculate_the_complexity;

import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        /**Hàm main cho phép nhập vào chuỗi ký tự*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String inputString = scanner.nextLine();

        /**Tính tần suất xuất hiện của các ký tự trong chuỗi vừa nhập*/
        int[] frequentChar = new int[255];
        for (int i = 0; i < inputString.length() ; i++) {
            /** Tìm ví trí tương ứng của ký tự trong bảng ASCII */
            int ascii = (int) inputString.charAt(i);
            /** Tăng giá trị tần suất */
            frequentChar[ascii] += 1;
        }

        /**Tìm kí tự có tần suất xuất hiện nhiều nhất*/
        int max = 0 ;
        char character = (char) 255;
        for (int j = 0; j < 255 ; j++) {
            if (frequentChar[j] > max){
                max = frequentChar[j];
                character = (char) j;
            }
        }
        System.out.println("The most appearing letter is '" + character + "' with a frequency of " + max + "times");
    }
}
