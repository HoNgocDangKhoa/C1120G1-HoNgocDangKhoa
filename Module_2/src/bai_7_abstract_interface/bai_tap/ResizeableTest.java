package bai_7_abstract_interface.bai_tap;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Random;
import java.util.Scanner;

public class ResizeableTest {
    public static void main(String[] args) {

//        Scanner sr = new Scanner(System.in);
//        System.out.println("nhap percent ");
//        double number = sr.nextDouble();
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle1(5);
        shapes[1] = new Rectangle(20, 10);
        shapes[2] = new Square(50);
        Random random=new Random();
            int percent=random.nextInt(99)+1;
            for (Shape shape : shapes) {
            if (shape instanceof Circle1) {
                Circle1 circle1 = (Circle1) shapes[0];
                System.out.println("dien tich c :" +circle1.getArea());
                circle1.resize(percent);
                System.out.println("Percent :"+percent+"%");
                System.out.println("dien tich hinh tron mói : " + circle1.getArea() + "\n");
            } else if (shape instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) shapes[1];
                System.out.println("dien tích cu là :" + rectangle.getArea());
                rectangle.resize(percent);
                System.out.println("Percent :"+percent+"%");
                System.out.println("dien tich moi la : " + rectangle.getArea() + "\n");
            } else {

                Square square = (Square) shapes[2];
                System.out.println("dien tích hình cũ là :" + square.getArea());
                square.resize(percent);
                System.out.println("Percent :"+percent+"%");
                System.out.println("dien tich moi la  : " + square.getArea());

            }
        }


    }
}
//
//        Circle circle = new Circle(5);
//        System.out.println("dien tich hinh tron cu: " +circle.getArea());
//        circle.resize(10);
//        System.out.println("ban kinh moi: " + circle.getDarius());
//        System.out.println("dien tich hinh tron moi: "+ circle.getArea()+"\n");
//
//        System.out.println("Hinh chu nhat la :");
//
//       Rectangle rectangle=new Rectangle(10,20);
//        System.out.println("chiều dài ban đầu : "+rectangle.getHeight());
//        System.out.println("chiều rộng ban đầu : "+rectangle.getWidth());
//        System.out.println("dien tich hinh tron cu :"+ rectangle.getArea());
//        rectangle.resize(50);
//        System.out.println("chièu dài sau khi thay đổi : " +rectangle.getHeight());
//        System.out.println("Chiều rộng sau khi thay đổi :"+rectangle.getWidth());
//        System.out.println("diện tích mới là : "+rectangle.getArea()+"\n");
//        System.out.println("hình vuông có :");
//        Square square=new Square(20);
//        System.out.println("diện tích ban đầu là : "+square.getArea());
//        System.out.println("độ dài mới là :"+square.getSize());
//        System.out.println("diện tích mới là :"+square.getArea());
//    }

//}
