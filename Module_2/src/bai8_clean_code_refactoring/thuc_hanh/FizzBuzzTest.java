package bai8_clean_code_refactoring.thuc_hanh;

import java.util.Scanner;

public class FizzBuzzTest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number :");
        int number=scanner.nextInt();
        System.out.println(FizzBuzz.fizzBuzz(number));
    }
}
