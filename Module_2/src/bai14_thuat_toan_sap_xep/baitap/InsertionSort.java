package bai14_thuat_toan_sap_xep.baitap;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhấp độ dài của mảng :");
        int num = scanner.nextInt();
        int[] array = new int[num];
        for (int i = 0; i < array.length; i++) {
            System.out.println("nhập phần tử thứ : " + i);
            array[i] = scanner.nextInt();
        }
        System.out.println("mảng mới tạo là : ");
        for (int arr : array) {
            System.out.print(+arr + " ");
        }
        insertionSort(array);
    }

    public static void insertionSort(int[] arr) {


            int n = arr.length;
            for (int i = 1; i < n; ++i) {
                int key = arr[i];
                int j = i - 1;

                while (j >= 0 && arr[j] > key) {
                    arr[j + 1] = arr[j];
                    j = j - 1;
                }
                arr[j + 1] = key;
            }
        System.out.println();
        System.out.println("mảng mới sắp xếp là  :");
            for(int array:arr){
                System.out.print(array+" ");
            }
        }


    }


