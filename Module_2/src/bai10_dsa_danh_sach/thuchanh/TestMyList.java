package bai10_dsa_danh_sach.thuchanh;

public class TestMyList {
    public static void main(String[] args) {
        MyList<String>myList=new MyList<String>();
        myList.add("van");
        myList.add("khoa");
        myList.add("duc");
        myList.add("dong");
        myList.add("long");
        myList.add("quoang");
        myList.add("khoang");
        myList.add("sang");
        System.out.println("element 3: "+myList.get(3));
        System.out.println("element 5: "+myList.get(5));
        System.out.println("element 5: "+myList.get(5));
        System.out.println(myList.get(-1));
    }
}
