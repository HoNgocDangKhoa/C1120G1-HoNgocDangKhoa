package bai6_Inheritance.bai_tap;

import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
     Triangle triangle=new Triangle();
        System.out.println(triangle);
        Scanner sr=new Scanner(System.in);
        System.out.println("nhập màu sắc :");
        String color=sr.nextLine();
        System.out.println("nhâp kiểu true ,false");
        boolean filled =sr.nextBoolean();
        System.out.println("nhập side1 :");
        double side1=sr.nextDouble();
        System.out.println("nhập side2 :");
        double side2=sr.nextDouble();
        System.out.println("nhập side 3:");
        double side3=sr.nextDouble();

        Triangle triangle1=new Triangle( color,filled,side1,side2,side3);
        System.out.println(triangle1);




    }
}
