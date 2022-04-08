package _05_access_modifier.exercise.build_write_only_classes;

public class TestStudent {
    public static void main(String[] args) {
        Student student1 = new Student();
        System.out.println(student1.getName() + " " + student1.getClasses());
        Student student2 = new Student("Trung", "C0222G1");
        System.out.println(student2.getName() + " " + student2.getClasses());
    }
}
