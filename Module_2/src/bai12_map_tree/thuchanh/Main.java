package bai12_map_tree.thuchanh;

import java.util.*;

public class Main {


    public static void main(String[] args) {
        Students students = new Students("Khoa", 21, "nam");
        Students students1 = new Students("Dong", 28, "nam");
        Students students2 = new Students("Sang", 23, "nu");
        Students students3 = new Students("Van", 29, "nam");
        Students students4 = new Students("Long", 17, "nu");
        Students students6 = new Students("Long1", 17, "nu");
        Students students7 = new Students("Long2", 17, "nu");
        Students students8 = new Students("Long3", 17, "nu");
        Students students9 = new Students("Long4", 17, "nu");
        Students students10 = new Students("Long5", 17, "nu");

        Map<Integer, Students> studentsMap = new HashMap<>();
        studentsMap.put(1, students);
        studentsMap.put(56, students1);
        studentsMap.put(5, students2);
        studentsMap.put(2, students3);
        studentsMap.put(0, students6);

        Set<Integer> studentsSet = studentsMap.keySet();
        System.out.println(studentsMap);
        for (Integer integer : studentsSet) {
            System.out.println(integer + "=" + studentsMap.get(integer));
        }

        System.out.println("......Set");
        Set<Students>studentsSet1=new HashSet<>();
        studentsSet1.add(students);
        studentsSet1.add(students1);
        studentsSet1.add(students2);
        studentsSet1.add(students3);
        studentsSet1.add(students4);

        for(Students students5:studentsSet1){
            System.out.println(students5);
        }
        }
//        Map<Students, String> studentsMap2 = new HashMap<>();
//        studentsMap2.put(students, "5");
//        studentsMap2.put(students4, "2");
//        studentsMap2.put(students3, "7");
//        studentsMap2.put(students2, "21");
//        studentsMap2.put(students1, "9");
//        System.out.println(studentsMap2);
    }
