package bai2_loop_to_java.thuchanh;

import java.util.Scanner;

public class kiemtrasonguyento {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("enter number");
        int number = sr.nextInt();
        if (number < 2) {
            System.out.println(number + "not í prime");
        } else {
            int count = 0;
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(number + "is prime");
            } else {
                System.out.println(number + "not is prime");
            }
        }
    }
}
