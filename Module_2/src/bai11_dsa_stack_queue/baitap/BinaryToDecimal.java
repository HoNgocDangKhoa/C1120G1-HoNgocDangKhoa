package bai11_dsa_stack_queue.baitap;

import java.util.ArrayList;

public class BinaryToDecimal {
    public static void convertBinaryToDecimal(String binary){
        int sum=0;
        ArrayList<Character>arrayList=new ArrayList<>();
        for(int i=0;i<binary.length();i++){
           arrayList.add(binary.charAt(i));
           if(arrayList.get(i).equals('1')){
               sum+=Math.pow(2,binary.length()-1-i);
           }

        }
        System.out.println(sum);
        }

 


    public static void main(String[] args) {
        convertBinaryToDecimal("1001010");
    }
}
