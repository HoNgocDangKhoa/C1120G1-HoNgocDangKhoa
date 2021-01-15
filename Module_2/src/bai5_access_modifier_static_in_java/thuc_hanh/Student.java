package bai5_access_modifier_static_in_java.thuc_hanh;

public class Student {
    private int num ;
    private String name;
    private static String college ="codegym";

     public Student(int r, String n) {
             num=r;
              name=n;
    }
//    phương thức static để thay đổi giá trị của biến static
    static void change(){
         college="CODEGYM";
    }
//    phương pháp hiển thị giá trị
    void display(){{
        System.out.println(num +" "+name+ " "+ college);}
    }
}
class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();
        Student s1=new Student(111,"Hữu Nghĩa");
        Student s2 =new Student(112,"Hoàng Vân");
        Student s3=new Student(113,"Hoàng Sang");
        s1.display();
        s2.display();
        s3.display();
    }
}