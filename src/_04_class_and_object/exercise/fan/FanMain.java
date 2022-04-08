package _04_class_and_object.exercise.fan;

public class FanMain {
    public static void main(String[] args) {
        Fan fan1 = new Fan(Fan.FAST, true, 10, "Yellow");
        Fan fan2 = new Fan(Fan.SLOW, false, 5, "Blue");
        System.out.println(fan1);
        System.out.println(fan2);
    }
}