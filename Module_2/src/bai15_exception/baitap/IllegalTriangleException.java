package bai15_exception.baitap;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IllegalTriangleException extends Exception {
    public IllegalTriangleException(String message) {
        super(message);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập ba cạnh của tam giác");
        Triangle triangle = null;
        try {
            System.out.println("nhập cánh thứ nhất :");
            int a = scanner.nextInt();
            System.out.println("nhập cánh thứ hai :");
            int b = scanner.nextInt();
            System.out.println("nhập cánh thứ ba :");
            int c = scanner.nextInt();
            triangle=new Triangle(a,b,c);
        } catch (IllegalTriangleException e) {
            System.out.println("Exception "+e.getMessage());
        }catch (Exception e){
            System.out.println("khong dc nhap chu :");
        }
        System.out.println(triangle);
    }
}
