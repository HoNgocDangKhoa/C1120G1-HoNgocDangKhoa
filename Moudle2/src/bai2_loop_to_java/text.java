package bai2_loop_to_java;

import java.util.Scanner;

public class text {
    public static void main(String[] args) {
     double tien;
     int thang;
     double laisuat;
     Scanner sr=new Scanner(System.in);
     System.out.println("nhập số tiền");
     tien=sr.nextDouble();
        System.out.println("nhập số tháng");
        thang=sr.nextInt();
        System.out.println("nhập số lãi xuất");
        laisuat=sr.nextDouble();
        double tienlai=0;
        for(int i=0;i<thang;i++){
            tienlai+=tien*(laisuat/100)/12*thang;
        }
        System.out.println("tiền lãi là : "+tienlai);
}
}