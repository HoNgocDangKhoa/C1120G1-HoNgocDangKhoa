package bai1_introduction_to_java.baitap;

import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("enter number");
        int number = read.nextInt();
//        System.out.println(number);
        if (number > 0 && number < 10) {
            switch (number) {
                case 0:
                    System.out.println("zero");
                    break;
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("tow");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println(" four");
                    break;
                case 5:
                    System.out.println("fine");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
            }


        } else if (number < 20) {
            switch (number) {
                case 10:
                    System.out.println("ten");
                case 11:
                    System.out.println("eleven");
                case 12:
                    System.out.println("twelfth");
                case 13:
                    System.out.println("thirteen");
                case 14:
                    System.out.println("fourteen");
                case 15:
                    System.out.println("fifteen");
                case 16:
                    System.out.println("sixteen");
                case 17:
                    System.out.println("seventeen");
                case 18:
                    System.out.println("eighteen");
                case 19:
                    System.out.println("nineteen");
                case 20:
                    System.out.println("twenty");

            }
        }
    }
}
