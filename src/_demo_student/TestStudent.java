package _demo_student;

import java.util.Scanner;

public class TestStudent {
    static Scanner sc = new Scanner(System.in);
    static StudentMain[] arr = new StudentMain[10];

    public static void main(String[] args) {
        arr[0] = new StudentMain("Trung", 27, "QBinh", 10);
        arr[1] = new StudentMain("Dung", 26, "QTri", 9);
        arr[2] = new StudentMain("Hung", 25, "Hue", 8);
        arr[3] = new StudentMain("Nam", 24, "DNang", 7);
        arr[4] = new StudentMain("Khanh", 23 , "QuangNam",6);
        arr[5] = new StudentMain("Hoang", 22 ,"QuangNgai", 5);
        arr[6] = new StudentMain("Hung", 21, "BinhDinh", 4);
        arr[7] = new StudentMain("Tuan", 20, "NhaTrang", 3);


        System.out.println("Menu");
        System.out.println("1. Display: ");
        System.out.println("2. Thêm : ");
        System.out.println("3. Xoá: ");

        System.out.println("Enter your choice");

        int choice = -1;
        choice = Integer.parseInt(sc.nextLine());

        switch (choice) {
            case 1:
                display();
                break;
            case 2:
                add();
                break;
            case 3:
                delete();
                break;

        }
    }


    public static void display() {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.println(arr[i]);
            }

        }
    }

    public static void add() {

        System.out.println("Nhập tên học sinh: ");
        String name = sc.nextLine();
        System.out.println("Nhập tuổi: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập địa chỉ: ");
        String address = sc.nextLine();
        System.out.println("Nhập điểm: ");
        int point = Integer.parseInt(sc.nextLine());
        StudentMain newStudent = new StudentMain(name, age, address, point);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                arr[i] = newStudent;
                break;
            }

        }
        display();
    }

    public static void delete() {
        System.out.println(" Nhập vị trí muốn xoá: ");
        int index = sc.nextInt();
        for (int i = index; i < arr.length; i++) {
            if (arr[i] != null) {
                arr[i] = arr[i + 1];
            }

        }
        display();
    }
}
