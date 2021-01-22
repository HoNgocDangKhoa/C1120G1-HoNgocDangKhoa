package bai14_thuat_toan_sap_xep.thuchanh;

import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập số phần tử của mảng");
        int num=scanner.nextInt();
        int []list=new int[num];
        for(int i=0;i<list.length;i++){
            System.out.println("nhập phần tử thứ : "+i);
            list[i]=scanner.nextInt();
        }
        System.out.println("mảng mới tạo là :");
        for(int arr:list){
            System.out.print(arr+" ");
        }
        System.out.println();
        bubbleSortByStep(list);
    }
    public static void bubbleSortByStep(int[] list){
        for(int i=1;i<list.length;i++){
            for(int j=0;j<list.length-1;j++){
                if(list[j]>list[j+1]){
                    int temp=list[j];
                    list[j]=list[j+1];
                    list[j+1]=temp;

                }
            }
        }
        System.out.println("mảng sau khi sắp xếp :");
        for(int array:list){
            System.out.print(array +" ");
        }
    }
}
