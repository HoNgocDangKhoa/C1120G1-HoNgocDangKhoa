package bai14_thuat_toan_sap_xep.thuchanh;

public class SelectionSort {
  static   double[] array = {2, 4.5, 89, 6, 6.7, -45, 7};

  public  static void selectionSort(double [] array){
      for(int i=0;i<array.length-1;i++){
          double currentMin=array[i];
          int currentMinIndex = i;
          for(int j=i+1;j<array.length;j++){
              if(currentMin <array[j]){
                  currentMin=array[j];
                  currentMinIndex = j;
              }
          }
          if(currentMinIndex!=i){
              array[currentMinIndex]=array[i];
              array[i]=currentMin;
          }

      }
  }

    public static void main(String[] args) {
        selectionSort(array);
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
