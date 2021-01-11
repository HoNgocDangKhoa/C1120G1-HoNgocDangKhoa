package bai_7_abstract_interface.thuc_hanh;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle[] circles=new ComparableCircle[3];
        circles[0]=new ComparableCircle(5.0);
        circles[1]=new ComparableCircle();
        circles[2]=new ComparableCircle("red",true,8);
        System.out.println("truoc xep truoc :");
        for (ComparableCircle circle: circles){
            System.out.println(circle);
        }
        Arrays.sort(circles);
        System.out.println("sau sap xep :");
        for (ComparableCircle circle :circles){
            System.out.println(circle);
        }
    }
}
