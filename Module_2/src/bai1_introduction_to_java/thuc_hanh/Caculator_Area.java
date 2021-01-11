package bai1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class Caculator_Area {
    public static void main(String[] args) {
    float width;
    float length;
        Scanner area=new Scanner(System.in);
        System.out.println("Enter width: ");
        width = area.nextFloat();
        System.out.println("enter length");
        length = area.nextFloat();
        float s= width*length;
        System.out.println("area la :" +s);
    }
}
