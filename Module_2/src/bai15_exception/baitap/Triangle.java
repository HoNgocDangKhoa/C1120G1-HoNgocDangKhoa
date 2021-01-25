package bai15_exception.baitap;

public class Triangle {
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) throws IllegalTriangleException {
        if (a < 0 || b < 0 || c < 0) {
            throw new IllegalTriangleException("canh ko ddc be hon khong");
        } else if ((a + b) <= c || (b + c) <= a || (c + a) <= b) {
            throw new IllegalTriangleException("tong hai canh phai lowns hon canh con lai ");
        } else {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
