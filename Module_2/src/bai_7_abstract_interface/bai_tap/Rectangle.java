package bai_7_abstract_interface.bai_tap;

public class Rectangle extends Shape implements Resizeable {
    private double width;
    private double height;

    public Rectangle() {
        width=1.0;
        height=1.0;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        return this.width*this.height;
    }
    public double getPerimeter(){
        return (this.height+this.height)*2;
    }

    @Override
    public String toString() {
        return "A Rectangle"+"\n"+" with  "+ "width"
                +" length "+height+"\n"
                +" which is a subclass of "+super.toString();

    }
    @Override
    public void resize(double percent) {
    setHeight(getHeight()+getHeight()*percent/100);
    setWidth(getWidth()+getWidth()*percent/100);
    }
}
