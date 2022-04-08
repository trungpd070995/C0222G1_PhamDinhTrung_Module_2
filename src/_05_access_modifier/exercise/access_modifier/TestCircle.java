package _05_access_modifier.exercise.access_modifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("Radius is : " + circle.getRadius() + circle.getArea() + circle.getColor());
        Circle circle1 = new Circle(2,"Green");
        System.out.println("Radius is : " + circle1.getRadius() + circle1.getArea() + circle1.getColor());

    }
}
