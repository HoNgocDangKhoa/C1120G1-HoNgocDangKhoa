package bai6_Inheritance.bai_tap;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle=new Circle();
        circle.getPerimeter();
        circle.getArea();
        System.out.println(circle);
        Circle circle1=new Circle(5.0,"blue");
        circle1.getArea();
        circle1.getPerimeter();
        System.out.println(circle1);
    }
}
