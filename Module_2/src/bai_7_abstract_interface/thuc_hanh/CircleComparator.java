package bai_7_abstract_interface.thuc_hanh;

import bai6_Inheritance.thuc_hanh.Circle;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {


    @Override
    public int compare(Circle o1, Circle o2) {
        if(o1.getDarius()>o2.getDarius()) return 1;
        else if(o1.getDarius()<o2.getDarius())return -1;
        else return 0;
    }
}
