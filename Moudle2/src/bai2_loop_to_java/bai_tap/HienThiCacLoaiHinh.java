package bai2_loop_to_java.baitap;

import java.util.Scanner;

public class hienthicacloaijhinh {
    public static void main(String[] args) {
        int number = -1;
        while (number != 0) {

            Scanner draw = new Scanner(System.in);
            System.out.println("menu");
            System.out.println("1.in hình chữ nhật");
            System.out.println("2.in hình tam giac vuông đáy");
            System.out.println("3.in hình tam giac vuông chóp");
            System.out.println("4.in hình tam giác cân");
            System.out.println("5.exit");
            System.out.println("nhập số bạn muốn chọn :");
            number = draw.nextInt();
            switch (number) {
                case 1:
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 7; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for (int i = 1; i < 6; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }

                    break;
                case 3:
                    for (int i = 1; i < 6; i++) {
                        for (int j = 6; j > i; j--) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    for (int i = 0; i < 5; i++) {
                        for (int k = 5; k > i; k--) {
                            System.out.print(" ");
                        }
                        for (int n = 1; n <= i; n++) {
                            System.out.print("*");
                        }
                        for (int j = 0; j <= i; j++) {
                            System.out.print("*");
                        }
                        for (int l = 5; l > i; l--) {
                            System.out.print(" ");
                        }
                        System.out.println();
                    }
                    break;
                case 5:
                    System.exit(4);
                    break;
                default:
                    System.out.println("ko có trong menu");
                    break;
            }
        }
    }
}