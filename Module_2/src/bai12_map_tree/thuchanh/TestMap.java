package bai12_map_tree.thuchanh;

import java.util.*;

public class TestMap  {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new TreeMap<>();
        hashMap.put("Khoa", 38);
        hashMap.put("Nghia", 28);
        hashMap.put("Sang", 18);
        hashMap.put("Cong", 15);
        Set<String> keySet = hashMap.keySet();
        for (String string : keySet) {
            System.out.println(string + " = " + hashMap.get(string));
        }
        Map<String,Integer>treeMap=new TreeMap<>(hashMap);
        System.out.println("thu tu sau khi sap sep :");
        System.out.println(treeMap);
        System.out.println();
        Map<String,Integer>linkedHashMap=new LinkedHashMap<>();
        linkedHashMap.put("Long",23);
        linkedHashMap.put("Cong",25);
        linkedHashMap.put("Thong",27);
        linkedHashMap.put("Bong",29);
        System.out.println("tuoi cua Cong la:  "+linkedHashMap.get("Cong"));
        System.out.println(linkedHashMap);

    }

}
