package _02_loop_java.practice;

import java.util.Scanner;

public class TinhTienLaiChoVay {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        //Tạo đối tượng input thuộc lớp Scanner để thực hiện nhập liệu dữ liệu cho 3 biến đã khai báo từ bàn phím.
        Scanner input = new Scanner(System.in); //
        //Nhập giá trị đầu vào input đầu vào cho các biến
        System.out.println("Enter investerment amount: ");
        money = input.nextDouble();
        System.out.println("Enter number of month: ");
        month = input.nextInt();
        System.out.println("Enter annual interest rate in percentaget");
        interestRate = input.nextDouble();
        double total_Interest = 0;

        //Tính lãi suất nhận được
        for (int i = 0; i < month ; i++) {
            total_Interest = money * (interestRate/100)/12 * month;
        }
        System.out.println("Total of interest: " + total_Interest);
    }
}
