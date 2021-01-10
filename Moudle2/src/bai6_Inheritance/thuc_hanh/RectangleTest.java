package bai6_Inheritance.thuc_hanh;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle();
        System.out.println(rectangle);
        Rectangle rectangle1=new Rectangle(3.5,4);
        System.out.println(rectangle1);
        Rectangle rectangle2=new Rectangle("blue",true,5,3);
        System.out.println(rectangle2);
    }

}
