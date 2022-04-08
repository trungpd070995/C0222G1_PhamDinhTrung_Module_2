package _06_inheritance.exercise.circle_class_cylinder_class;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(3, "Pink");
        System.out.println(circle);

        Cylinder cylinder = new Cylinder(2, "Yellow", 6);
        System.out.println(cylinder);
    }
}
