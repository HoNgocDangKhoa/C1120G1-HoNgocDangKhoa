package bai8_clean_code_refactoring.thuc_hanh;

import java.util.Scanner;

public class CylinderTest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter radius :");
        int radius=scanner.nextInt();
        System.out.println("enter height :");
        int height=scanner.nextInt();

        System.out.println("The tich la  : "+Cylinder.getVolume(radius,height));
        System.out.println("chu vi la : "+Cylinder.getPerimeter(radius));
        System.out.println("dien tich la : "+ Cylinder.getBaseArea(radius));
    }
}
