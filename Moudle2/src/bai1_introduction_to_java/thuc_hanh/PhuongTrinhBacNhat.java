package bai1_introduction_to_java.thuchanh;

import java.util.Scanner;

public class Phuong_Trinh_Bac_Nhat {
    public static void main(String[] args) {
        Scanner pt = new Scanner(System.in);
        double a, b, c;
        System.out.print("a :");
        a = pt.nextDouble();
        System.out.print("b :");
        b = pt.nextDouble();
        System.out.print(" c :");
        c = pt.nextDouble();
        if (a != 0) {
            double answer = -b / a;
            System.out.print("phuong trinh co nghiem la : " + answer);
        } else {
            if (b == 0) {
                System.out.print("phuong trinh vo nghiem");
            } else {
                System.out.print("ko ton tai");
            }
        }
    }
}