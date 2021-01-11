package bai4_class_object.thuc_hanh;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Rectangle {

    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double newwidth) {
        this.width = newwidth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double newheigth) {
        this.height = newheigth;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String getDisplay() {
        return  " chiều dài : " + width + " chiều rộng : " + height ;
    }

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("nhập chiều dài");
        double width = sr.nextDouble();
        System.out.println("nhập chiều rộng");
        double height = sr.nextDouble();

    Rectangle rectangle=new Rectangle(width,height);
        System.out.println("hình chữ nhậy của bạn :"+rectangle.getDisplay());
        System.out.println("chu vi hình chữ nhật là : " + rectangle.getPerimeter());
        System.out.println("diện tích hình chữ nhật là :"+ rectangle.getArea());
    }

}


