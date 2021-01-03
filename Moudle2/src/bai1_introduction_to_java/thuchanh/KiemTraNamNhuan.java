package bai1_introduction_to_java.thuchanh;

import java.util.Scanner;

public class KiemTraNamNhuan {
    public static void main(String[] args) {
        Scanner kiemta=new Scanner(System.in);
        int year;
        System.out.println("nhap nam ban muon kiem tra :");
        year=kiemta.nextInt();
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("nam "+ year+ " la nam nhuan");
                }else {
                    System.out.println("nam " + year+ " khong phai nam nhuan");
                }
            }else {
                System.out.println("nam " + year+" la nam nhuan");
            }
        }else {
            System.out.println("nam "+ year+ " ko phai la nam nhuan");
        }
    }
}
