package _01_introduction_to_java.exercise;

import java.util.Scanner;

public class UngDungDocSoThanhChu {

    static String read1To10(int number) {
        String str = "";
        switch(number) {
            case 1:
                str = "one";
                break;
            case 2:
                str = "two";
                break;
            case 3:
                str = "three";
                break;
            case 4:
                str = "four";
                break;
            case 5:
                str = "five";
                break;
            case 6:
                str = "six";
                break;
            case 7:
                str = "seven";
                break;
            case 8:
                str = "eight";
                break;
            case 9:
                str = "nine";
                break;
            case 10:
                str = "ten";
                break;
        }

        return str;
    }

    static String read11to20(int number) {
        String str = "";
        switch (number) {
            case 11:
                str = "eleven";
                break;
            case 12:
                str = "twelve";
                break;
            case 13:
                str="thirteen";
                break;

            case 15:
                str="fifteen";
                break;
            case 14:
            case 16:
            case 17:
            case 18:
            case 19:
                str = read1To10(number%10) + "teen";
        }

        return str;
    }
    static String readTy(int number){
        String str="";

        switch (number){
            case 20:
                str="twenty";
                break;
            case 30:
                str="thrity";
                break;
            case 50:
                str="fifty";
                break;
            case 40:
            case 60:
            case 70:
            case 80:
            case 90:
                str=read1To10((number%100)/10)+"ty";
        }


        return str;

    }


    public static String readOver100(int num){
        String str="";
        str=read1To10(num/100) +" hundred";
        return str;
    }

    public static void main(String[] args) {

        // INPUT
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input number: ");
        int number = scanner.nextInt();
        String result="";
        if (number>=1&&number<=10){
            result=read1To10(number);
        }else if (number<20){
            result=read11to20(number);
        }else if (number<100){
            result=readTy((number/10)*10)+" "+read1To10(number%10);
        }else if (number%100<20&& number%100>10){
            result=readOver100((number/100)*100)+" " +read11to20(number%100);
        }else {
            result=readOver100((number/100)*100) + readTy(((number%100)/10)*10)+" "+read1To10(number%10);
        }
        System.out.println(result);
    }

}
