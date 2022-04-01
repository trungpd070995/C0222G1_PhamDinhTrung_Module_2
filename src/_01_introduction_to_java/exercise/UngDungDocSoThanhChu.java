package _01_introduction_to_java.exercise;

import java.util.Scanner;

public class UngDungDocSoThanhChu {
    public static void main(String[] args) {
        System.out.println(" Import number to read ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int units = number % 10; //Hàng đơn vị
        int dozens = (number / 10) % 10; //Hàng trăm
        int hundreds = number / 100; //Hàng chục
        String number1 = ""; // tạo một biến chuỗi = giá trị rỗng
        String number2 = "";

        if (units > 0) {
            //lấy hàng đơn vị
            switch (units) {
                case 1:
                    number1 = " and one";
                    break;
                case 2:
                    number1 = "two";
                    break;
                case 3:
                    number1 = "three";
                    break;
                case 4:
                    number1 = "four";
                    break;
                case 5:
                    number1 = "five";
                    break;
                case 6:
                    number1 = "six";
                    break;
                case 7:
                    number1 = "seven";
                    break;
                case 8:
                    number1 = "eight";
                    break;
                case 9:
                    number1 = "nine";
                    break;
            }
        }
        if (dozens == 1) {
            switch (units) {
                case 0:
                    number2 = "dozens";
                    break;
                case 1:
                    number2 = "eleven";
                    break;
                case 2:
                    number2 = "twelve";
                    break;
                case 3:
                    number2 = "thirteen";
                    break;
                case 4:
                    number2 = "fourteen";
                    break;
                case 5:
                    number2 = "fifteen";
                    break;

            }
        } else {
            switch (dozens) {
                case 2:
                    number2 = "twenty";
                    break;
                case 3:
                    number2 = "thirdty";
                    break;
                case 4:
                    number2 = "fourty";
                    break;
                case 5:
                    number2 = "fifty";
                    break;
                case 6:
                    number2 = "sixty";
                    break;
                case 7:
                    number2 = "seventy";
                    break;
                case 8:
                    number2 = "eighty";
                    break;
                case 9:
                    number2 = "ninety";
                    break;
            }
        }
        if (dozens == 1) {
            System.out.println(number1 + number2 + "hundreds");
        } else if (dozens != 1) {
            System.out.println(number1 + "teen" );
        }else if (hundreds > 1){
            System.out.println();
        }
    }
}

