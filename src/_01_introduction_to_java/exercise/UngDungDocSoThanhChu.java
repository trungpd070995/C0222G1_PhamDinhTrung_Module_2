package _01_introduction_to_java.exercise;

import java.util.Scanner;

public class UngDungDocSoThanhChu {
    public static void main(String[] args) {
        System.out.println(" Import number to read ");
        Scanner scanner=new Scanner(System.in);
        int number = scanner.nextInt();
        int hangdonvi = number%10;
        int hangchuc = (number/10)%10;
        int hangtram=number/100;
        String number1="";
        String number2="";
        String number3="";
        if (hangdonvi>0){
            switch (hangdonvi){
                case 1:
                    number1=" and one";
                    break;
                case 2:
                    number1="two";
                    break;
                case 3:
                    number1="three";
                    break;
                case 4:
                    number1="four";
                    break;
                case 5:
                    number1="five";
                    break;
                case 6:
                    number1="six";
                    break;
                case 7:
                    number1="seven";
                    break;
                case 8:
                    number1="eight";
                    break;
                case 9:
                    number1="nine";
                    break;
            }}
        if (hangchuc == 1){
            switch (hangdonvi){
                case 0:
                    number2="hangchuc";
                    break;
                case 1:
                    number2="eleven";
                    break;
                case 2:
                    number2="twelve";
                    break;
                case 3:
                    number2="thirteen";
                    break;
                case 4:
                    number2="fourteen";
                    break;
                case 5:
                    number2="fifteen";
                    break;
                case 6:
                    number2="sixteen";
                    break;
                case 7:
                    number2="seventeen";
                    break;
                case 8:
                    number2="eighteen";
                    break;
                case 9:
                    number2="nineteen";
                    break;
            }
        } else {
            switch (hangchuc){
                case 2:
                    number2="twenty";
                    break;
                case 3:
                    number2="thirty";
                    break;
                case 4:
                    number2="forty";
                    break;
                case 5:
                    number2="fifty";
                    break;
                case 6:
                    number2="sixty";
                    break;
                case 7:
                    number2="seventy";
                    break;
                case 8:
                    number2="eighty";
                    break;
                case 9:
                    number2="ninety";
                    break;
            }
        }
        if (hangtram>0){
            switch (hangtram){
                case 1:
                    number3="one hangtram";
                    break;
                case 2:
                    number3="two hangtram";
                    break;
                case 3:
                    number3="three hangtram ";
                    break;
                case 4:
                    number3="four hangtram";
                    break;
                case 5:
                    number3="five hangtram ";
                    break;
                case 6:
                    number3="six hangtram ";
                    break;
                case 7:
                    number3="seven hangtram";
                    break;
                case 8:
                    number3="eight hangtram";
                    break;
                case 9:
                    number3="nine hangtram ";
                    break;
            }
        }if (hangchuc == 1){
            System.out.println(number3  + " and " +  number2);
        }else if (hangchuc != 1) {
            System.out.println(number3  +  number2  + number1);
        }else if (hangtram >1){
            System.out.println(number3);
        }else if (number < 0){
            System.out.println(" Enter again");
        }

    }
}
