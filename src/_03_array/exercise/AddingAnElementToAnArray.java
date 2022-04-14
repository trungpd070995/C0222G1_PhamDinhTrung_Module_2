package _03_array.exercise;

import java.util.Arrays;
import java.util.Scanner;
/**Thêm phần tử vào mảng*/

public class AddingAnElementToAnArray {
    public static void main(String[] args) {
        int[] arg = createArray();
        System.out.println(Arrays.toString(arg));
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số muốn thêm: ");
        int num = sc.nextInt();
        System.out.println("Nhập vị trí muốn thêm: ");
        int k = sc.nextInt();
        System.out.println(Arrays.toString(insertElement(arg, num, k)));

    }
    public static int[] createArray(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập kích thước mảng: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size ; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int[] insertElement(int[] array, int n, int index){
        for (int i = array.length - 1; i > index ; i--) {
            array[i] = array[i - 1];
        }
        array[index] = n;
        return array;
    }
}