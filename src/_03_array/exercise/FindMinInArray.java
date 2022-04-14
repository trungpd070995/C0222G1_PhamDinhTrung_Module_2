package _03_array.exercise;

import java.util.Arrays;
import java.util.Scanner;
/**Tìm giá trị nhỏ nhất*/
public class FindMinInArray {
    private static AddingAnElementToAnArray InsertElement;

    public static void main(String[] args) {
        int[] arr = AddingAnElementToAnArray.createArray();
        System.out.println(Arrays.toString(arr));
        System.out.println("Phần tử nhỏ nhất trong mảng là: " + findMinInArray(arr));
    }

    public static int findMinInArray(int[] arg){
        int min = arg[0];
        for (int i = 0; i < arg.length ; i++) {
            if (min > arg[i]){
                min = arg[i];
            }
        }
        return min;
    }
}
