package bai6_Inheritance.bai_tap;

import java.util.Arrays;

public class Point2D {
    private float x=0.0f;
    private float y=0.0f;
    private float [] xy =new float[2];


    public Point2D() {
    }

    public Point2D(float x, float y) {
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
    public  void setXY(float x,float y){
        this.x=x;
        this.y=y;
    }
//    public float [] getXY(){
////        float[] XY=new float[2];
////        XY[0]=x;
////        XY[1]=y;
//        return XY;
//    }
public void setXy(){
        xy[0]= this.x;
        xy[1]= this.y;
}
public float[] getXy(){
        return xy;
}

    @Override
    public String toString() {
        return "Point2D: "+
                "x=" + x +
                " y=" + y +"\n"+
                " xy=" + Arrays.toString(xy) ;
    }


}
