package bai10_dsa_danh_sach.thuchanh;

public class MyLinkedList {
    private Node head;
    private int NumNodes = 0;

    public MyLinkedList(Object data) {
        head = new Node(data);
    }

    private class Node {
        private Node next;
        private Object data;


        public Node(Object data) {
            this.data = data;
        }
        private Object getData(){
            return this.data;
        }
    }
    public void add(int index,Object data){
        Node temp=head;
        Node holder;
        for(int i=0;i<index-1&&temp.next!=null;i++){
            temp=temp.next;
        }
            holder=temp.next;
            temp.next=new Node(data);
            temp.next.next=holder;
            NumNodes++;
    }
    public void addFirst(Object data){
        Node temp=head;
        head=new Node(data);
        head.next=temp;
        NumNodes++;
    }
    public void get(int index) {
        Node temp = head;

        while (temp.next != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }


    }
    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

