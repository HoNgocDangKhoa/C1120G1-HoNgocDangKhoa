package bai3_array_to_java.bai_tap;

import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        boolean check=false;


         do{  int[] array = {1, 3, 7, 7, 9, 56, 43, 23};
        System.out.println("nhập số bạn muốn xoá : ");
        int number = sr.nextInt();
        for (int i = 0; i < array.length; i++){
            if(number==array[i]){
                check=true;
                for (int j=i;j<array.length-1;j++){
                    array[j]=array[j+1];
                }
                i--;
                array[array.length-1]=0;
            }
        }if(!check){
            System.out.println("Mày không thoát  khỏi được ta đâu con trai à :)) . Nhập lại đi : ");
        }
        for (int num:array){
            System.out.print(num+"\t");
        }
             System.out.println("");

    }while (!check);
}
}