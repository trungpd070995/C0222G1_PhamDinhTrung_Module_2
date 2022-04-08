package _06_inheritance.exercise.circle_class_cylinder_class;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {

    }

    public Cylinder(double height) {
        this.height = height;
    }

    Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return (height * Math.PI * getRadius() * getRadius());
    }

    @Override
    public String toString() {
        return "A Cylinder with height="
                + getHeight()
                + ", and Volume is: "
                + getVolume()
                + ", which is a subclass of "
                + super.toString();
    }

}