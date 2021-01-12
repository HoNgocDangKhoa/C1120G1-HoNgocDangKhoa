package bai_7_abstract_interface.bai_tap;

public class ColorableTest {
    public static void main(String[] args) {
        Rectangle[]rectangles=new Rectangle[1];
        rectangles[0]=new Square1(10);
    Square1 square11=(Square1)rectangles[0];
        System.out.println(square11.getArea());
        System.out.println(square11.getPerimeter());
        System.out.println(square11.getColor());
    }
}
