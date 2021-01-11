package bai_7_abstract_interface.bai_tap;

import bai6_Inheritance.thuc_hanh.Shape;

public class Circle extends Shape implements Resizeable {
    private double darius;

    public Circle() {
        darius=1.0;
    }

    public Circle(double darius) {
        this.darius = darius;
    }

    public Circle(String color, boolean filled, double darius) {
        super(color, filled);
        this.darius = darius;
    }

    public double getDarius() {
        return darius;
    }

    public void setDarius(double darius) {
        this.darius = darius;
    }
    public double getArea(){
        return getDarius()*2*Math.PI;
    }
    public double getPerimeter(){
        return (getDarius()*getDarius())*Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius= "
                +getDarius()+"\n"
                +" which is a subclass of "
                +super.toString();
    }

    @Override
    public void resize(double percent) {
        setDarius(getDarius() + getDarius()*percent/100);
    }
}
