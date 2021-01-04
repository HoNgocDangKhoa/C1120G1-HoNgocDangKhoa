package bai2_loop_to_java.baitap;

import java.util.Scanner;

public class hienthisonguyentoduoi100 {
    public static void main(String[] args) {
       int number=1;
        int i;
        int count;
        while ( number<100){
            count=0;
            for( i=1;i<=number;i++){
                if(number%i==0){
                    count++;
                }
            }if(count==2){
                System.out.println(number);

            }number++;
        }


    }
}
