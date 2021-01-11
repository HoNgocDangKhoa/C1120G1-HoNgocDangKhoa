package bai2_loop_to_java.bai_tap;

import java.util.Scanner;

public class HienThiSoNguyenTo {
    public static void main(String[] args) {
        Scanner text=new Scanner(System.in);
        System.out.println("nhập số bạn muốn");
        int input=text.nextInt();
        int countPrime=0;
        int number=1;
        while (countPrime<input){

            int count=0;
            for(int i=1;i<=number;i++){
                if(number%i==0){
                    count++;
                }

            }if(count==2){
                System.out.println(number);
                countPrime++;

            }
            number++;
        }

    }
}
