package bai3_array_to_java.bai_tap;

public class GiaTriMin {
    public static void main(String[] args) {
        int [] arr={4,6,1,46,89,57,43};
        int min=arr[0];
        int index=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
                index=i;
            }
        }
        System.out.println("giá trị nhở nhất là : "+min+ " ở vị trí : "+index);
    }
}
