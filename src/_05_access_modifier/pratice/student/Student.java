package _05_access_modifier.pratice.student;

public class Student {
    private final int rollno;
    private final String name;
    private static String college = "BBDIT";

    //hàm khởi tạo để khởi tạo biến
    Student(int r, String n){
        rollno = r ;
        name = n ;
    }
    //phương thức static để thay đổi giá trị của biến static
    static void change(){
        college = "CODEGYM" ;
    }
    //phương thức hiển thị giá trị

    void display(){
        System.out.println(rollno + " " + name + " " + college);
    }
}
