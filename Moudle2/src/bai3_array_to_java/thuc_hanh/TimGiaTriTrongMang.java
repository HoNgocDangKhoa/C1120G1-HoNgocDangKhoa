package bai3_array_to_java.thuc_hanh;

import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        String[] students={"đông","đức","sang","vân","quang","bảo","thuần"};
        Scanner sr=new Scanner(System.in);
        System.out.println("nhập tên bạn muốn tìm kiếm");
        String inputName=sr.nextLine();
        boolean check=false;
        for(int i=1;i<students.length;i++){
            if(students[i].equals(inputName)){
                System.out.println("vị trí của sinh viên trong danh sách  la :"+ (i+1) +" tên "+inputName);
                check=true;
                break;
            }

        }if(!check){
            System.out.println("tên "+ inputName +" không có trong danh sách");

        }
    }
}
