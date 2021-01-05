package bai2_loop_to_java.thuchanh;

import java.util.Scanner;

public class uocchunglonnhat {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner sr = new Scanner(System.in);
        System.out.println("nhập số a");
        a = sr.nextInt();
        System.out.println("nhập số b");
        b = sr.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 && b != 0) {
            System.out.println(" UCLN : " + b);
        } else if (b == 0 && a != 0) {
            System.out.println(" UCLN : " + a);
        } else if (a != 0 && b != 0) {
            int ucln = 0;
            if (a > b) {

                for (int i = 1; i <= b; i++) {
                    if (b % i == 0 && a % i == 0) {
                        ucln = i;
                    }
                }
                System.out.println("UCLN la :" + ucln);
            } else {
                for (int i = 1; i <= a; i++) {
                    if (a % i == 0 && b % i == 0) {
                        ucln = i;
                    }
                }
                System.out.println("UCLN : " + ucln);
            }
        }
    }
}