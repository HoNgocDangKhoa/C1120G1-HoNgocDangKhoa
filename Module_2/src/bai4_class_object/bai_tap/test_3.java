package bai4_class_object.bai_tap;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class test_3 {
    private double a;
    private double b;
    private  double c;
    public test_3(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    public double getDiscriminant(){
        return (b*b)-4*a*c;
    }
    public double getRoot1(){
        return (-b+Math.sqrt(getDiscriminant()))/(2*a);
    }
    public double getRoot2(){
        return (-b-Math.sqrt(getDiscriminant()))/(2*a);
    }
    public double getRoot3(){
        return -b/(2*a);
    }

    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        System.out.println("nhap so a : ");
        double a=sr.nextDouble();
        System.out.println("nhap so b : ");
        double b=sr.nextDouble();
        System.out.println("nhap so c :");
        double c=sr.nextDouble();
        test_3 test3=new test_3(a,b,c);
        if(test3.getDiscriminant()>0){
            System.out.println("cos hai nghiem");
            System.out.println("nghiem thu nhat la : "+test3.getRoot1());
            System.out.println("nghiem thu hai la : "+test3.getRoot2());
        }else if(test3.getDiscriminant()==0){
            System.out.println("co mot nghiem do la : " + test3.getRoot3());
        }else {
            System.out.println("vo nghiem");
        }
    }
}
