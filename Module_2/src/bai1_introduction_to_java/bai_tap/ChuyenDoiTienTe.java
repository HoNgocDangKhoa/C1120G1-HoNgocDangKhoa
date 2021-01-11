package bai1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner qd=new Scanner(System.in);
        double vnd=23000;
        double usd;
        System.out.println("nhập mệnh giá usd");
        usd=qd.nextInt();
       double convert=usd*vnd;
       System.out.println("số tiền quy đổi là : "+convert+ "vnd");
    }
}
