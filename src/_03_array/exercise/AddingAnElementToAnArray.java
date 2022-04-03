package _03_array.exercise;

import java.util.Scanner;
//Thêm phần tử vào mảng

public class AddingAnElementToAnArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhập vào kích thước của mảng:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Kích thước mảng lớn hơn 20! Vui lòng nhập lại!!!");
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Nhập phần tử " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.print("Mảng vừa tạo là: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        System.out.print("\n Nhập phần tử cần thêm vào mảng: ");
        int number;
        Scanner scanner1 = new Scanner(System.in);
        number = scanner1.nextInt();
        System.out.print("\n Nhập vị trí cần chèn phần tử vào trong mảng: ");
        int indexDel;
        Scanner scanner2 = new Scanner(System.in);
        indexDel = scanner2.nextInt();
        int[] array2 = new int[array.length + 1];
        if (indexDel <= 1 && indexDel >= array.length - 1) {
            System.out.println("Không chèn được phần tử vào mảng");
        } else {
            for (int j = 0; j < indexDel; j++) {
                array2[j] = array[j];
            }
            array2[indexDel] = number;
            for (int j = indexDel; j < array.length - 1; j++) {
                array2[j + 1] = array[j];
            }
            System.out.println("Mảng sau khi thêm phần tử là: ");
            for (int j = 0; j < array2.length; j++) {
                System.out.print(array2[j] + "\t");
            }
        }
    }
}