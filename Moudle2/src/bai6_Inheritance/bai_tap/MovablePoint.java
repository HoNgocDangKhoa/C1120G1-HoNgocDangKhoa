package bai6_Inheritance.bai_tap;

import com.sun.org.apache.bcel.internal.generic.MONITORENTER;

import java.util.Arrays;

public class MovablePoint extends Point{
    protected float xSpeed;
    protected float ySpeed;
    protected float[] speed=new  float[2];

    public MovablePoint() {
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed,float ySpeed){
        speed[0]=this.xSpeed;
        speed[1]=this.ySpeed;
    }
    public float[] getSpeed(){
        return speed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + getX() +
                " y=" + getY()+
                ", speed=" + Arrays.toString(speed) +
                '}';
    }
    public MovablePoint move(){
        this.x +=xSpeed;
        this.y+= ySpeed;
        return this;

    }


}
