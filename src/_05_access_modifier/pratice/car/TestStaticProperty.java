package _05_access_modifier.pratice.car;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda 3", "Skyactiv 3");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("Mazda 6", "Skyactive 6");
        System.out.println(Car.numberOfCars);
    }
}
