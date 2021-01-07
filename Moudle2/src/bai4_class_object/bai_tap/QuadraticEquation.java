package bai4_class_object.bai_tap;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public double getA() {
        return this.a;
    }

    public void setA(double number) {
        this.a = number;
    }

    public double getB() {
        return this.b;
    }

    public void setB(double number1) {
        this.b = number1;
    }

    public double getC() {
        return this.c;
    }

    public void setC(double number2) {
        this.c = number2;
    }

    public double getDiscriminant() {
        return (b * b) - 4 * a * c;
    }

    public double getRoot1() {
        return (-b + Math.sqrt(getDiscriminant())) / (2 * a);
    }

    public double getRoot2() {
        return (-b - Math.sqrt(getDiscriminant())) / (2 * a);
    }

    public double getRoot() {
        return -b / (2 * a);
    }

    public static void main(String[] args) {

        Scanner sr = new Scanner(System.in);
        System.out.println("nhập a : ");
        double a = sr.nextDouble();
        System.out.println("nhâp b");
        double b = sr.nextDouble();
        System.out.println("nhập c");
        double c = sr.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (quadraticEquation.getDiscriminant() > 0) {
            System.out.println("có hai nghiệm :");
            System.out.println(quadraticEquation.getRoot1());
            System.out.println(quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("có một nghiệm :");
            System.out.println(quadraticEquation.getRoot());
        } else {
            System.out.println("phương trình vô nghiệm");
        }
    }
}