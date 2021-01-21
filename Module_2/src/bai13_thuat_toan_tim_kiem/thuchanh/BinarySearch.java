package bai13_thuat_toan_tim_kiem.thuchanh;

//public class BinarySearch {
////    static int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
//    static int binarySearch(int[]list,int key){
//        int low=0;
//        int high=list.length-1;
//        while (high>=low){
//            int mid=(low+high)/2;
//            if(key<list[mid])
//                high=mid-1;
//            else if(key==list[mid])
//                return mid;
//            else
//                low=mid+1;
//        }
//        return -1;
//    }
//
////    public static void main(String[] args) {
////        System.out.println(binarySearch(list, 2));  /* 0 */
////        System.out.println(binarySearch(list, 11)); /* 4 */
////        System.out.println(binarySearch(list, 79)); /*12 */
////        System.out.println(binarySearch(list, 1));  /*-1 */
////        System.out.println(binarySearch(list, 5));  /*-1 */
////        System.out.println(binarySearch(list, 80)); /*-1 */
////    }
////}

    class BinarySearch {
        int binarySearch(int array[], int x, int low, int high) {

            if (high >= low) {
                int mid = low + (high - low) / 2;

                if (array[mid] == x)
                    return mid;
                if (array[mid] > x) {
                    return binarySearch(array, x, low, mid - 1);
                }
                else{
                    return binarySearch(array, x, mid + 1, high);
                }
            }
            return -1;
        }

        public static void main(String args[]) {
            BinarySearch ob = new BinarySearch();
            int array[] = { 3, 4, 5, 6, 7, 8, 9 };
            int n = array.length;
            int x = 80;
            int result = ob.binarySearch(array, x, 0, n - 1);
            if (result == -1)
                System.out.println("Not found");
            else
                System.out.println("Element found at index " + result);
        }
    }