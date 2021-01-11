package bai3_array_to_java.bai_tap;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner gop = new Scanner(System.in);
        int[] arr = new int[4];
        int[] arr1 = new int[4];
        int[] arr2 = new int[8];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("nhap phan tu thu :" + i);
            arr[i] = gop.nextInt();
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("nhap phan tu thu :" + i + "cua mang 2");
            arr1[i] = gop.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        for (int i = 0; i < arr1.length; i++) {
            arr2[i+arr1.length] = arr1[i];
        }
        for (int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+"\t");
        }
    }
}
