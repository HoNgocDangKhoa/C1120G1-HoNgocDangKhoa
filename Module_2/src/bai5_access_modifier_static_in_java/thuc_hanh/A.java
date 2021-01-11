package bai5_access_modifier_static_in_java.thuc_hanh;

public class A {
    static int num =9;
    int  duc =8;

   static  void show (){
       System.out.println(num);
       A a=new A();

       System.out.println( a.duc);
    }
     void show1 (){
        System.out.println(num);
        A a=new A();
        show();
        System.out.println( a.duc);
    }

}

class B {
    public static void main(String[] args) {
        System.out.println( A.num);
        A.show();
        A a =new A();
        A b =new A();
        a.show1();
        b.num=12;
        System.out.println(b.num);
    }
}