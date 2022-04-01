package _02_loop_java.practice;

import java.util.Scanner;

public class TimUocSoChungLonNhat {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a: ");
        a = input.nextInt();

        System.out.println("Enter b: ");
        b = input.nextInt();

        a = Math.abs(a);//Hàm Math.abs () trả về giá trị tuyệt đối của một số
        b = Math.abs(b);

        if( a == 0 || b == 0 )
            System.out.println("No greatest common factor");
        while (a != b){
            if ( a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println("Greatest common factor: " + a);
    }
}
