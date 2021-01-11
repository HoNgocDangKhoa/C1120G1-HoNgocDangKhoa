package bai3_array_to_java.bai_tap;

import java.util.Scanner;

public class ThemPhanTu {
    public static void main(String[] args) {

        Scanner them = new Scanner(System.in);

        int[] arr = {25, 51, 16, 3, 21, 14, 47, 48};
        int[] array = new int[9];

        int index;
        System.out.println("nhập số bạn muốn chèn");
        int number = them.nextInt();

        System.out.println("nhập vị trí bạn muốn chèn");
        index = them.nextInt();
        if (index < 0 || index > arr.length) {
            System.out.println("không thêm đc vào mảng");
        }

        for (int i = 0; i < index; i++) {
            array[i] = arr[i];
        }
        array[index] = number;
        for (int i = index; i < arr.length; i++) {
            array[i + 1] = arr[i];
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }

}