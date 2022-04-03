package _03_array.exercise;

import java.util.Scanner;
//Xoá Phần Tử Khỏi Mảng
public class RemoveElementFromArray {
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
        System.out.print("\n Nhập số cần xóa: ");
        int number;
        Scanner scanner1 = new Scanner(System.in);
        number = scanner1.nextInt();
        boolean check = false;
        for (int j = 0; j < array.length; j++) {
            if (array[j] == (number)) {
                System.out.println("Số " + number + " có trong mảng array ");
                System.out.println("Vị trí của phần tử trong mảng array là: " + j);
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("Không có giá trị" + number + " trong mảng array");
        }
        if (check) {
            for (int k = 2; k < array.length - 1; k++) {
                array[k] = array[k + 1];
            }
            System.out.print("Mảng sau khi đã xóa là: ");
            for (int j = 0; j < array.length - 1; j++) {
                System.out.print(array[j] + "\t");
            }
        }
    }
}