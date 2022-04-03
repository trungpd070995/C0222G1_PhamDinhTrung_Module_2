package _03_array.exercise;

import java.lang.reflect.Array;
import java.util.Scanner;
//gộp mảng
public class MergeArray {
    public static void main(String[] args) {
        int size1;
        int[] array1;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhập vào kích thước của mảng 1:");
            size1 = scanner.nextInt();
            if (size1 > 20)
                System.out.println("Kích thước mảng lớn hơn 20! Vui lòng nhập lại!!!");
        } while (size1 > 20);
        array1 = new int[size1];
        int i = 0;
        while (i < array1.length) {
            System.out.print("Nhập phần tử " + (i + 1) + " : ");
            array1[i] = scanner.nextInt();
            i++;
        }
        System.out.print("Mảng 1 vừa tạo là: ");
        for (int j = 0; j < array1.length; j++) {
            System.out.print(array1[j] + "\t");
        }
        int size2;
        int[] array2;
        Scanner scanner1 = new Scanner(System.in);
        do {
            System.out.print(" \n Nhập vào kích thước của mảng 2:");
            size2 = scanner1.nextInt();
            if (size2 > 20)
                System.out.println("Kích thước mảng lớn hơn 20! Vui lòng nhập lại!!!");
        } while (size2 > 20);
        array2 = new int[size2];
        int n = 0;
        while (n < array2.length) {
            System.out.print("Nhập phần tử " + (n + 1) + " : ");
            array2[n] = scanner1.nextInt();
            n++;
        }
        System.out.print("Mảng 2 vừa tạo là: ");
        for (int k = 0; k < array2.length; k++) {
            System.out.print(array2[k] + "\t");
        }
        int size3 = array1.length + array2.length;
        int[] array3 = new int[size3];
        for (int j = 0; j < array3.length; j++) {
            if (j < size1) {
                array3[j] = array1[j];
            } else {
                array3[j] = array2[j - size1];
            }
        }
        System.out.print("\n Mảng sau khi gộp là: ");
        for (int j = 0; j < array3.length; j++) {
            System.out.print(array3[j] + "\t");
        }
    }
}