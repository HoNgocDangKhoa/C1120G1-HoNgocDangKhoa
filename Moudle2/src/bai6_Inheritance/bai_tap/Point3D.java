package bai6_Inheritance.bai_tap;

import java.util.Arrays;

public class Point3D extends Point2D {
    private float z;
    private float[] xyz = new float[3];

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }
    public void setXyz(){
        xyz[0]=getX();
        xyz[1]=getY();
        xyz[2]=this.z;
    }
    public float[]getXyz(){
        return xyz;
    }

    @Override
    public String toString() {
        return "Point3D: " +
                "z=" + z +"\n"+
                " xyz=" + Arrays.toString(xyz) ;
    }

    public static void main(String[] args) {
        Point3D point3D=new Point3D(9,45,2);
        point3D.setXyz();
        System.out.println(point3D);
    }
}
