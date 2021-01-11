package bai6_Inheritance.bai_tap;

public class MovablePointTest {
    public static void main(String[] args) {
        MovablePoint movablePoint=new MovablePoint(2,5,8,9);
        movablePoint.setSpeed(movablePoint.getXSpeed(),movablePoint.getYSpeed());
        System.out.println(movablePoint);
        movablePoint.move();
        System.out.println(movablePoint);
    }
}
