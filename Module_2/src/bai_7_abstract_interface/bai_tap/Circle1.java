package bai_7_abstract_interface.bai_tap;

public class Circle1 extends Shape implements Resizeable {
    private double darius;

    public Circle1() {
        darius=1.0;
    }

    public Circle1(double darius) {
        this.darius = darius;
    }

    public Circle1(String color, boolean filled, double darius) {
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
        return (getDarius()*getDarius())*Math.PI;
    }
    public double getPerimeter(){

        return getDarius()*2*Math.PI;
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
