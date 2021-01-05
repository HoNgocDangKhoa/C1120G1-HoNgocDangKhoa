package bai3_array_to_java.thuc_hanh;

public class GiaTriNhoNhat {

    public static int minValue(int[] array) {
        int min = array[0];
        int index=1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i + 1;
            }
        }return index;
    }

    public static void main(String[] args) {
        int[] arr = {4, 12, 1, 8, 15, 6, 9};
       int index =minValue(arr);
        System.out.println("giá trị nhỏ nhất là ở vị trí : "+ index) ;
    }
}