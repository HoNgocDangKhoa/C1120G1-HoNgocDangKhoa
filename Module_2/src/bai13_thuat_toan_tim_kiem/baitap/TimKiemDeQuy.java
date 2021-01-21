package bai13_thuat_toan_tim_kiem.baitap;

public class TimKiemDeQuy {
    public int timKiem(int []arr,int x,int low,int high){
        if(high>=low){
            int mid=(high+low)/2;

          if(x==arr[mid]){
              return mid;
          }
          if(x<arr[mid]){
              return timKiem(arr,x,low,mid-1);
          }else {
              return timKiem(arr,x,mid+1,high);
          }
        }
        return -1;
    }

    public static void main(String[] args) {
        TimKiemDeQuy timkiem=new TimKiemDeQuy();
        int array[]={3,6,87,98,78,90};
        int n=array.length;
        int x=7;
        int result=timkiem.timKiem(array,x,0,n-1);
        if(result==-1){
            System.out.println("not fount");
        }else {
            System.out.println("vij tris timf kieems  : "+result);
        }
    }
}