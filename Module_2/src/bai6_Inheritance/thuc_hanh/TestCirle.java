package bai6_Inheritance.thuc_hanh;

public class TestCirle {
    public static void main(String[] args) {
        Circle circle=new Circle();
        System.out.println(circle);
        Circle circle2=new Circle(3.5);
        System.out.println(circle2);
        Circle circle1=new Circle("red",false,2.0);
        System.out.println(circle1);
    }

}
