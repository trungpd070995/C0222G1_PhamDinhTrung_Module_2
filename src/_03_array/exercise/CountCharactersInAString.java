package _03_array.exercise;

import java.util.Scanner;
/**Đếm ký tự trong một chuỗi*/

public class CountCharactersInAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = "howareyou";
        System.out.print("Nhập ký tự cần kiểm tra: ");
        char symbols = sc.next().charAt(0);
        System.out.println("Số lần xuất hiện của " + symbols + " là " + countCharacters(str1,symbols) );
    }

    public static int countCharacters(String str, char cha){
        int count = 0;
        for (int i = 0; i < str.length() ; i++) {
            if (str.charAt(i) == cha){
                count++;
            }
        }
        return count;
    }
}