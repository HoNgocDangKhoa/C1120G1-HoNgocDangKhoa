package bai_7_abstract_interface.bai_tap;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class ResizeableTest {
    public static void main(String[] args) {
//        Scanner sr=new Scanner(System.in);
//        System.out.println("nhap darius ");
//        double number=sr.nextDouble();
//        Resizeable[] tests=new Resizeable[3];
//        tests [0]=new Circle(number);
//        tests[1]=new Rectangle();
//        tests[2]=new Square();



        Circle circle = new Circle(5);
        System.out.println("dien tich hinh tron cu: " +circle.getArea());
        circle.resize(10);
        System.out.println("ban kinh moi: " + circle.getDarius());
        System.out.println("dien tich hinh tron moi: "+ circle.getArea()+"\n");

        System.out.println("Hinh chu nhat la :");

       Rectangle rectangle=new Rectangle(10,20);
        System.out.println("chiều dài ban đầu : "+rectangle.getHeight());
        System.out.println("chiều rộng ban đầu : "+rectangle.getWidth());
        System.out.println("dien tich hinh tron cu :"+ rectangle.getArea());
        rectangle.resize(50);
        System.out.println("chièu dài sau khi thay đổi : " +rectangle.getHeight());
        System.out.println("Chiều rộng sau khi thay đổi :"+rectangle.getWidth());
        System.out.println("diện tích mới là : "+rectangle.getArea()+"\n");
        System.out.println("hình vuông có :");
        Square square=new Square(20);
        System.out.println("diện tích ban đầu là : "+square.getArea());
        System.out.println("độ dài mới là :"+square.getSize());
        System.out.println("diện tích mới là :"+square.getArea());
    }

}
