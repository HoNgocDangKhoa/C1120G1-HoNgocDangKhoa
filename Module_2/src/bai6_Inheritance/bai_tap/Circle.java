package bai6_Inheritance.bai_tap;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
        radius=2.0;
    color="red";
}


    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getDarius() {
        return radius;
    }

    public void setDarius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return (getDarius()*getDarius())*Math.PI;
    }
    public double getPerimeter(){
        return 2*Math.PI*getDarius();
    }

    @Override
    public String toString() {
        return "Circle " +
                "darius= " + radius +"\n"+
                " Color= " + color + '\n'+
                "Area "+getArea()+"\n"+
                "Perimeter "+getPerimeter()
                ;
    }
}
