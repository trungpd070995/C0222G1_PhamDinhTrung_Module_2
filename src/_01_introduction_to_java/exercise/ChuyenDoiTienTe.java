package _01_introduction_to_java.exercise;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mời bạn nhập số tiền USD: ");
        usd = scanner.nextDouble();

        double quyDoi = usd * 23000;
        System.out.print("Giá trị VND : " + quyDoi);
    }
}
