package bai_7_abstract_interface.thuc_hanh;

import bai6_Inheritance.thuc_hanh.Circle;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
    public ComparableCircle(){

    }

    public ComparableCircle(double darius) {
        super(darius);
    }

    public ComparableCircle(String color, boolean filled, double darius) {
        super(color, filled, darius);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if(getDarius()>o.getDarius()) return 1;
        else if(getDarius()<o.getDarius())return -1;
        else return 0;
    }
}
