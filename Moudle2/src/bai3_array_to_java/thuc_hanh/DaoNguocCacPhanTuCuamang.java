package bai3_array_to_java.thuc_hanh;

import java.util.Scanner;

public class DaoNguocCacPhanTuCuamang {
    public static void main(String[] args) {
        int size;
            int[] array;
            Scanner sr = new Scanner(System.in);
            do {
                System.out.print("Enter a size:");
                size = sr.nextInt();
                if(size>20){
                    System.out.println("size does not exceed 20");
                }
            }while (size>20);
            array=new int [size];
            int i=0;
            while (i<array.length){
            System.out.print("nhập phàn tử thứ  "+(i+1)+":");
            array[i]=sr.nextInt();
            i++;
        }
        System.out.println("các phần tử trong mảng là : ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j]+"\t");
        }
        System.out.println();
        for(int j=0;j<array.length/2;j++){
            int temp=array[j];
            array[j]=array[size-1-j];
            array[size-1-j]=temp;
        }
        System.out.println("mảng mới là : ");
        for (int j=0;j<array.length;j++){
            System.out.print(array[j] +"\t");
        }
    }
}
