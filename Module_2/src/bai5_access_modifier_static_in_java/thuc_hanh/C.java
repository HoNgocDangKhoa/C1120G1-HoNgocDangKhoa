package bai5_access_modifier_static_in_java.thuc_hanh;

public class C {
    static int b;
    private String name;
    protected int c;

    public C() {
    }

    public C(String name) {
        this.name = name;
    }

    public C(String name, int c) {
        this.name = name;
        this.c = c;
    }

    public static int getB() {
        return b;
    }

    public static void setB(int b) {
        C.b = b;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "C{" +
                "name='" + name + '\'' +
                ", c=" + c +
                '}';
    }

}
