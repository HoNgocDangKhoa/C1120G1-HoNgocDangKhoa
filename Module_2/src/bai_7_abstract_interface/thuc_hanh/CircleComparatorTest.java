package bai_7_abstract_interface.thuc_hanh;

import bai6_Inheritance.thuc_hanh.Circle;

import java.util.Arrays;
import java.util.Comparator;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circles=new Circle[3];
        circles[0]=new Circle(8);
        circles[1]=new Circle();
        circles[2]=new Circle("blue",false,7);
        System.out.println("trc sap xep : ");
        for(Circle circle:circles){
            System.out.println(circle);
        }
        Comparator circleComparator =new CircleComparator();
        Arrays.sort(circles,circleComparator);
        System.out.println("sau sap xep :");
        for(Circle circle: circles){
            System.out.println(circle);
        }

    }
}
