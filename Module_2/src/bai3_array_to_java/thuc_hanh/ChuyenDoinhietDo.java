package bai3_array_to_java.thuc_hanh;

import java.util.Scanner;

public class ChuyenDoinhietDo {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        double c;
        double f;
        int number;
        do {
            System.out.println("Menu");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("3.Exit");
            number = sr.nextInt();
            switch (number) {
                case 1:
                    System.out.println("nhập độ F: ");
                    f = sr.nextDouble();
                    System.out.println("độ F sang độ C là : " + ToFahrenheitcelsius(f));
                    break;
                case 2:
                    System.out.println("nhập độ C");
                    c=sr.nextDouble();
                    System.out.println("độ C sang độ F là :"+celsiusToFahrenheit(c));
                    break;
                case 3:
                    System.exit(3);
                    break;
            }
        } while (number != 0);

    }


    public static double celsiusToFahrenheit(double c) {
        double f = (9.0 / 5) * c + 32;
        return f;
    }

    public static double ToFahrenheitcelsius(double f) {
        double c = (5.0 / 9) * (f - 32);
        return c;
    }
}


