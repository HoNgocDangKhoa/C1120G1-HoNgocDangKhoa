package bai10_dsa_danh_sach.baitap;

import bai5_access_modifier_static_in_java.thuc_hanh.Student;

public class MyListTest {
//    public static class Student {
//        private int id;
//        private String name;
//
//        public Student() {
//        }
//
//        public Student(int id, String name) {
//            this.id = id;
//            this.name = name;
//        }
//
//        public int getId() {
//            return id;
//        }
//
//        public void setId(int id) {
//            this.id = id;
//        }
//
//        public String getName() {
//            return name;
//        }
//
//        public void setName(String name) {
//            this.name = name;
//        }
//    }

    public static void main(String[] args) {
//      Student a=new Student(5,"khoa");
//      Student b=new Student(5,"ngọc ");
//      Student c=new Student(5,"bích");
//      Student d=new Student(5,"ngân");
//      Student e=new Student(5,"quân");

        MyList<Integer> myList = new MyList<>();
        myList.add(5);
        myList.add(6);
        myList.add(7);
        myList.add(8);
        myList.add(9);
        for (int i=0;i<myList.size();i++){
            //chuyển về kiểu dữ liệu Integer
            Integer number=(Integer)myList.elements[i];

            System.out.println(number);
        }

    }
}