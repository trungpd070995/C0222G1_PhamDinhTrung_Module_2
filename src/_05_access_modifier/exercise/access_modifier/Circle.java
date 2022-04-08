package _05_access_modifier.exercise.access_modifier;

public class Circle {
    private double radius = 1.0;
    private String color = "Red";

    public Circle(){
    }

    public Circle(double radius , String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        return (radius * radius * Math.PI);
    }

    public String getColor() {
        return color;
    }

}
