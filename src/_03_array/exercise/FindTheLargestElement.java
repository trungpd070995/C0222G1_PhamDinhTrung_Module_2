package _03_array.exercise;

import java.util.Scanner;
public class FindTheLargestElement {
    public static void main(String[] args) {
        int soDong;
        int soCot;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số dòng của mảng: ");
        soDong = scanner.nextInt();
        System.out.println("Nhập vào số cột của mảng: ");
        soCot = scanner.nextInt();
        int[][] arr = new int[soDong][soCot];
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.println("Nhập phần tử thứ [" + i + " , " + j + " ]: ");
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Mảng vừa nhập: ");
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("\n");
        }
        int max = arr[0][0];
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Giá trị lớn nhất trong mảng là: " + max);
    }
}