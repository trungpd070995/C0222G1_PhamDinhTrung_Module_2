package _03_array.exercise;

import java.util.Arrays;
import java.util.Scanner;
/**Xoá Phần Tử Khỏi Mảng*/

public class RemoveElementFromArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,5,8,9};
        int n = arr.length;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập phần tử muốn xóa: ");
        int num = sc.nextInt();
        System.out.println(Arrays.toString(deleteElement(arr,num)));
    }

    public  static int[] deleteElement(int[] arg, int n){
        int c, i, count = 0;
        for (c = i = 0; i < arg.length; i++) {
            if (arg[i] != n){
                arg[c] = arg[i];
                c++;
            }else {
                count++;
            }
        }
        for (int j = 0; j < count ; j++) {
            arg[arg.length - (j + 1)] = 0;
        }
        return arg;
    }
}