package bai10_dsa_danh_sach.thuchanh;

import java.util.Arrays;

public class MyList<E> {
    private int size=0;
    private static final int VAN=10;
    private Object[] elements;

    public MyList() {
        elements=new Object[VAN];
    }
    public void add(E e){
        if(size==elements.length){
            ensurePaca();
        //lấy e ở vị trí 0sau đó mới cộng lên 1
            }
        elements[size++]= e;
    }
    public void ensurePaca(){
          int newSize=elements.length*2;
          elements=Arrays.copyOf(elements,newSize);
      }
      public E get(int index){
        if(index>size||index<0){
     throw new IndexOutOfBoundsException("không nằm trong mảng");
//            System.out.println("không nằm trong mảng");
        }
        return (E) elements[index];
      }
    }

