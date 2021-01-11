package bai3_array_to_java.bai_tap;

import java.util.Scanner;

public class TotalNumberColumn {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("nhập số hàng :");
        int row=sr.nextInt();
        System.out.println("nhập số cột:");
        int column=sr.nextInt();


//        for (int column = 0; column < matrix[0].length; column++) {
//            int total = 0;
//            for (int row = 0; row < matrix.length; row++)
//                total += matrix[row][column];
//            System.out.println("Sum for column " + column + " is "
//                    + total);
//        }

       int [][] arr=new int[row][column];
        int total = 0;
        System.out.println();
        System.out.println("mảng mới tạo có "+row+" hàng và "+column+ "cột");
        System.out.println("nhập hàng đầu tiên");
       for(int i=0;i<arr.length;i++){
           for(int j=0;j<arr[i].length;j++){
               arr[i][j]=sr.nextInt();
           }
           System.out.println("nhập các phàn tử của hàng thứ " +(i+1));
       }

       System.out.println("mảng mới tạo là :");
       for (int i=0;i<arr.length;i++){
           for(int j=0;j<arr[i].length;j++){
               System.out.print(arr[i][j]+"\t");
           }
           System.out.println();
       }

        System.out.println("bạn muốn tính tổng các số ở cọt bao nhiêu :");
        int input=sr.nextInt();


        for (int j=0;j<arr.length;j++){
            for(int i=0;i<arr.length;i++){
                if(input==i){
                    total+=arr[j][i];
                }
            }
        }
        System.out.println("tổng là  :"+total);

    }
}

