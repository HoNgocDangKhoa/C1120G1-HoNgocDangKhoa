package bai13_thuat_toan_tim_kiem.baitap;

import java.util.LinkedList;
import java.util.Scanner;

public class MaxLength1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        LinkedList<Character> max=new LinkedList();
        LinkedList<Character> linkedList=new LinkedList();
        System.out.println("enter string  :");
        String string=scanner.nextLine();

        for(int i=0;i<string.length();i++){
           if(linkedList.size()>1 && string.charAt(i)<=linkedList.getLast()&&
                   linkedList.contains(string.charAt(i))){
               linkedList.clear();
           }
           linkedList.add(string.charAt(i));
            if(linkedList.size()>max.size()){
                max.clear();
                max.addAll(linkedList);
            }
        }
        for(Character character:max){
            System.out.print(character);
        }


    }
}
