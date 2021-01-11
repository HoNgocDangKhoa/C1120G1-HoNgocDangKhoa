package bai_7_abstract_interface.bai_tap;

public class Square extends Rectangle implements Resizeable {
    public Square() {
    }

    public Square(double size) {
        super(size, size);
    }

    public Square(String color, boolean filled, double size) {
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
    public void resize(double percent) {
        setSize(getSize() + getSize() * percent / 100);
    }
}
