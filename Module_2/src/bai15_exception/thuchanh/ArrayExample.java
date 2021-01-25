package bai15_exception.thuchanh;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] creatRandom(){
        Random random=new Random();
        Integer[]arr=new Integer[100];
        System.out.println("phần tử ngẩu nhiên trong mảng là :");
        for(int i=0;i<arr.length;i++){
            arr[i]=random.nextInt(100);
            System.out.print(arr[i]+ " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample=new ArrayExample();
        Integer[]arr=arrayExample.creatRandom();
        Scanner scanner =new Scanner(System.in);
        System.out.println();


        try{
            System.out.println("nhập chỉ số bạn muốn : ");
            int x=scanner.nextInt();
            System.out.println("phần tử có chỉ số : "+x +"có giá trị là:  "+arr[x]);
        }catch (IndexOutOfBoundsException e){
            System.out.println("quá đô dài của mảng");
            System.out.println("nhập chỉ số bạn muốn : ");
            int x=scanner.nextInt();
            System.out.println("phần tử có chỉ số : "+x +"có giá trị là:  "+arr[x]);
        }catch (InputMismatchException e){
            System.out.println("ko đc nhập chữ ");
        }finally {
            System.out.println("nhập chỉ số bạn muốn : ");
            int x=scanner.nextInt();
            System.out.println("phần tử có chỉ số : "+x +"có giá trị là:  "+arr[x]);

        }

    }


}
