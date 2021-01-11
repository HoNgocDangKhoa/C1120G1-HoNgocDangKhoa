package bai3_array_to_java.bai_tap;

import java.util.Scanner;

public class GiaTriMaxArray2Chieu {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("nhap so hang ban muon :");
        int number=sr.nextInt();
        System.out.println("nhap so cot trong hang :");
        int num=sr.nextInt();
        System.out.println("mang ban muon tao co :"+number+" hang va "+num+ " cot");
        System.out.println("nhap cac phan tu trong hang va cot :");
        int[][] arr = new int[number][num];
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
               arr[i][j] = sr.nextInt();
            }
        }
        System.out.println("mang moi tao la : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println(" GTLN= "+ max);
    }
}
