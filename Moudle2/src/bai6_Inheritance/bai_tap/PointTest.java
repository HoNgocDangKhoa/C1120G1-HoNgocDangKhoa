package bai6_Inheritance.bai_tap;

public class PointTest {
    public static void main(String[] args) {
        Point point=new Point(5,8);
        point.setXy(point.getX(),point.getY());
        System.out.println(point);
    }

    public static class Point3DTest {
    }
}
