package _03_array.exercise;

import java.util.Scanner;
//Tìm giá trị nhỏ nhất
public class FindTheSmallestValue {
        public static void main(String[] args) {
            int size;
            int[] array;
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập vào kích thước của mảng:");
            size = scanner.nextInt();
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
            int min = array[0];
            for (int j = 0; j < array.length; j++) {
                if (min > array[j]) {
                    min = array[j];
                }
            }
            System.out.println("\n Phần tử nhỏ nhất trong mảng là: " + min);
        }
    }

