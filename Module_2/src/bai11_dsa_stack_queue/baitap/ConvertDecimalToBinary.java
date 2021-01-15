package bai11_dsa_stack_queue.baitap;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class ConvertDecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số thập phân");
        int num=scanner.nextInt();
        Stack<Integer>stack=new Stack<>();
        while (num!=0){
            int number=num%2;
            stack.push(number);
            num=num/2;

        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
        }

    }

