package bai5_access_modifier_static_in_java.thuc_hanh;

public class Car {
    private String name;
    private String engine;
    public static int numberOfCars;

    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }
}
 class TestStaticProperty {
    public static void main(String[] args) {
        Car car = new Car("Mazda 3", "yamaha 3");
        System.out.println(Car.numberOfCars);
        Car car1=new Car("Mazda 6","yamaha 6");
        System.out.println(Car.numberOfCars);
    }
}