package bai6_Inheritance.bai_tap;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
    }

    public Cylinder(double cao) {
        this.height = cao;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getVolume() {
        return Math.PI*(getDarius()*getDarius())*this.height;
    }

    @Override
    public String toString() {
        return "Cylinder " + super.toString()+"\n"+
                "height=" + height +"\n"+
                "volume :" +getVolume();

    }
}
