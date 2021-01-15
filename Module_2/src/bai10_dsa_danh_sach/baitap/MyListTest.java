package bai10_dsa_danh_sach.baitap;

import bai5_access_modifier_static_in_java.thuc_hanh.Student;

import java.util.Iterator;

public class MyListTest {
    public static class Student {
        private int id;
        private String name;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
      Student a=new Student(5,"khoa");
      Student b=new Student(6,"ngọc ");
      Student c=new Student(7,"bích");
      Student d=new Student(8,"ngân");
      Student e=new Student(9,"quân");
      Student f=new Student(4,"anh");

        MyList<Student> myList = new MyList<>();
        myList.add(a);
        myList.add(b);
        myList.add(c);
        myList.add(d);
        myList.add(e);
        myList.add(f,2);
        for (int i=0;i<myList.size();i++){

            Student number=(Student) myList.elements[i];

            System.out.print(number.getName());
            System.out.print(number.getId());
        }

        }
    }
