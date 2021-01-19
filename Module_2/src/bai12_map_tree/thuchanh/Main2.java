package bai12_map_tree.thuchanh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        Student student=new Student("Khoa",21,"Hue");
        Student student1=new Student("Bich",32,"DN");
        Student student2=new Student("Duc",23,"HN");
        Student student3=new Student("Sang",18,"HCM");
        Student student4=new Student("Dong",11,"HN");
        List<Student>list=new ArrayList<>();
        list.add(student);
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        Collections.sort(list);
        for(Student student5:list){
            System.out.println(student5.toString());
        }
        System.out.println();
        AgeComparator ageComparator=new AgeComparator();
        Collections.sort(list,ageComparator);
        System.out.println("so sanh theo tuoi");
        for(Student student5:list){
            System.out.println(student5.toString());
        }
    }
}
