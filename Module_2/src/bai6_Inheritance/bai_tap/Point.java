package bai6_Inheritance.bai_tap;

import java.util.Arrays;

public class Point {
    protected float x=0.0f;
    protected float y=0.0f;
    protected float[] xy=new float[2];


    public Point() {
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXy(float x,float y){
        xy[0]=x;
        xy[1]=y;
    }
    public float[] getXy(){
        return xy;

    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                ", xy=" + Arrays.toString(xy) +
                '}';
    }


}
