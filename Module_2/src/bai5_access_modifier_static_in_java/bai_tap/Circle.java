package bai5_access_modifier_static_in_java.bai_tap;

import bai5_access_modifier_static_in_java.thuc_hanh.Car;

public class Circle {
    static double radius = 1.0;
    static String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

     double getRadius() {
        return radius *2* Math.PI;
    }
     double getArea() {
        return radius * radius * Math.PI;
    }
}

 class TestCircle {
    public static void main(String[] args) {
        System.out.println(Circle.radius);
        System.out.println(Circle.color);
        Circle circle=new Circle(5);
        System.out.println("Dien tich hinh tron:"+ circle.getArea());
        System.out.println("chu vi hinh tron:"+ circle.getRadius());

    }
}