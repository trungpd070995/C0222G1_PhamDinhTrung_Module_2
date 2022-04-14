package _03_array.exercise;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
/**Gộp Mảng */

public class MergeArray {
    public static void main(String[] args) {
        int size1, size2, size3;
        int[] arr1, arr2, arr3;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào độ dài mảng thứ nhất: ");
        size1 = sc.nextInt();
        arr1 = new int[size1];
        for (int i = 0; i < arr1.length ; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            arr1[i] = sc.nextInt();
        }
        System.out.print("Mảng vừa nhập là: ");
        System.out.println(Arrays.toString(arr1));

        System.out.print("Nhập vào độ dài mảng thứ 2:");
        size2 = sc.nextInt();
        arr2 = new int[size2];
        for (int i = 0; i < arr2.length ; i++) {
            System.out.print("Nhập phần tử thứ" + (i + 1) + ": ");
            arr2[i] = sc.nextInt();
        }
        System.out.println("Mảng vừa nhập là: ");
        System.out.println(Arrays.toString(arr2));

        int[] newArr = mergeArray(arr1, arr2);
        System.out.print("Mảng sau khi gộp là: ");
        System.out.println(Arrays.toString(newArr));
    }

    public static int[] mergeArray(int[] arg1, int[] arg2){
        int[] argMerge = new int[arg1.length + arg2.length];
        for (int i = 0; i < arg1.length ; i++) {
            argMerge[i] = arg1[i];
        }
        for (int i = 0; i < arg2.length ; i++) {
            argMerge[i + arg1.length] = arg2[i];
        }
        return argMerge;
    }
}