package bai_7_abstract_interface.bai_tap;

public class Square1 extends Rectangle implements Colorable {
    public Square1() {
    }

    public Square1(double size) {
        super(size, size);
    }

    public Square1(String color, boolean filled, double size) {
        super(color, filled, size, size);
    }

    public double getSize() {
        return getWidth();
    }

    public void setSize(double size) {
        setWidth(size);
        setHeight(size);
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSize() + "\n"
                + " which is a subclass of "
                + super.toString();
    }
    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }


}
