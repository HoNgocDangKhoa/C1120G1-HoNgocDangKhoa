package bai1_introduction_to_java.thuchanh;

import java.util.Scanner;

public class namnhuan {
    public static void main(String[] args) {
        Scanner year = new Scanner(System.in);
        int number;
        System.out.println("enter year");
        number = year.nextInt();
        if (number % 4 == 0) {
            if (number % 100 == 0) {
                if (number % 400 == 0) {
                    System.out.println(number + "la nam nhuan");
                } else {
                    System.out.println(number + "khong phai la nam nhuan");
                }
            } else {
                System.out.println(number + "la nam nhuan");
            }
        } else {
            System.out.println(number + "khong phai laf nam nhuan");
        }
    }
}