package bai1_introduction_to_java.thuchanh;

import java.util.Scanner;

public class SoNgayTrongThang {
    public static void main(String[] args) {
        Scanner day = new Scanner(System.in);
        System.out.print("thang ban muon dem :");
        int month = day.nextInt();
        switch (month) {
            case 2:
                System.out.println("thang " + month + " cos 28 hoac 29 ngay ");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("thang " + month + " co 31 ngay");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("thang " + month + "co 30 ngay");
        }
    }
}
