package _05_access_modifier.exercise.build_write_only_classes;

public class Main {
    public static void main(String[] args) {
        Student Test = new Student();
        System.out.println(Test.setName("Trung"));
        System.out.println(Test.getName());
    }
}
