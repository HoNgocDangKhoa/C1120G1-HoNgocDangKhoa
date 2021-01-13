package bai10_dsa_danh_sach.baitap;

import java.util.Arrays;

public class MyList<E> {
    public int element;
    private int size = 0;
    private static final int DEFAUT_CAPACITY = 10;
    public Object elements [];

    public MyList() {
        elements=new Object[DEFAUT_CAPACITY];
    }

    public MyList(int capacity) {
        if(capacity>=0){
        elements=new Object[capacity];
    }
        throw  new IndexOutOfBoundsException();
    }
    //phướng thúc tăng kích thước của mảng
    public void ensureCapacity(int minCapacity){
        if(size==elements.length){
            int newSize=this.elements.length+minCapacity;
            elements=Arrays.copyOf(elements,newSize);
        }
    }
    //phương thức thêm một phần tử vào mảng tại vị trí chỉ định (index)
    public void add(int index,E element){
        if(index>elements.length||index<0){
            throw new IndexOutOfBoundsException();
        }else if(elements.length==size){
            ensureCapacity(5);
        }
        if(elements[index]==null){
            elements[index]=element;
            size++;
        }else {
            for (int i=size+1;i>=index-1;i--){
                elements[index]=elements[index-1];
            }
            elements[index]=element;
            size++;
        }
    }

    //phương thức thêm một phần tử vào mảng
    public void add(E element){
        if(elements.length==size){
            ensureCapacity(5);
        }
            elements[size]=element;
        size++;
        }


    //phương trả về số lượng phần tử trong mảng
    public int size(){
        return this.size;
    }

    //phương thức clear Mylist
    public void clear(){
        size=0;
        for (int i=0;i<elements.length;i++){
            elements[1]=null;
    }
}
}