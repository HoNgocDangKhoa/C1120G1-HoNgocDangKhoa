package bai6_Inheritance.thuc_hanh;

public class Circle extends Shape{
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
}
