package _02_loop_java.exercise;

public class HienThiSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        String prime = " ";
        boolean check = true;
        for (int i = 2; i < 100; i++) {
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                } else {
                    check = true;
                }
            }
            if (check) {
                prime += i + " ";
            }
        }
        System.out.println("Các số nguyên tố nhỏ hơn 100 là: " + prime);
    }
}
