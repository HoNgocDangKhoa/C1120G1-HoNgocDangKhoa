package bai10_dsa_danh_sach.thuchanh;

public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("test");
        MyLinkedList myLinkedList=new MyLinkedList(5);

        myLinkedList.addFirst(11);
        myLinkedList.addFirst(45);
        myLinkedList.add(1,6);
        myLinkedList.add(2,6);
        myLinkedList.add(3,98);
        myLinkedList.get(3);
        myLinkedList.printList();

    }
}
