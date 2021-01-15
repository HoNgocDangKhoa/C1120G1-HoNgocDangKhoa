package mypack;

public class TestLinkedList<E> {
    private class Node {
        private Node next;
        private Object data;

        //phương thúc khởi tạo cho data.
        public Node(Object data) {
            this.data = data;
        }

        //phương thức getData để lấy đa ta ra.
        public Object getData() {
            return this.data;
        }
    }

    //thuộc tính head kiêu dữ liệu Node.
    private Node head;
    //thược tính numNode để trả về số lượng trong LinkedList.
    private int numNode = 0;

    /*
 Phương thức khơi tạo không có tham số.
  */
    public TestLinkedList() {

    }

    // PHƯƠNG THỨC add(int index.E data)THÊM ĐÔI TƯỢNG TẠI VỊ TRÍ INDEX
    public void add(int index, E data) {
        Node temp = head;
        //khai báo node holder.
        Node holder;
        //Cho con trỏ chạy đến vị trí index -1.
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        //holder tham chiếu đến node tại vị tri index
        holder = temp.next;
        //ndoe tại vị trí index -1 trỏ tói node mới.
        temp.next = new Node(data);
        //node mới trỏ tới holder.
        temp.next.next = holder;
        //tăng só lượng phần tử lên một.
        numNode++;

    }

    //PHƯƠNG THỨC THÊM PHẦN TỬ VÀO VỊ TRÍ ĐÀU TIÊN( addFirst(E e)
    public void addFirst(E element) {
        //Khai báo 1 biến temp tham chiếu đến vị trí giá trị của head.
        Node temp = head;
        //head nhannj giá trị là node mới
        head = new Node(element);
        //head trỏ đến bién ttemp là head cũ.
        head.next = temp;
        //Tăng phần tử của danh sách lên 1.
        numNode++;
    }
    //PHƯƠNG THỨC remove(int index) XOÁ ĐỚI TƯỢNG TẠI VỊ TRÍ INDEX
    public E remove(int index){
        //kiểm tra đièu kiện index.
        if(index<0||index>numNode){
            throw new IndexOutOfBoundsException();
        }
        Node temp=head;
        //khai báo mttj đối tượng nhận kiểu dữ liệu trả vê.
        Object data = null;
        //nếu index=0 thì trả về data hiện tai và node mới sẽ là node kế tiếp.
        if(index==0){
            data=temp.data;
            head=head.next;
        }else {
            //nếu index>0 thì cho con trỏ chạy đén vị trí cuối cùng
            if(index>0){
                for (int i=0;i<index-1&&temp.next!=null;i++){
                    temp=temp.next;
                }
                //data trỏ đén node index
                data=temp.next.data;
                //node index trỏ tới index+2
                temp.next=temp.next.next;
            }
        }
        numNode--;
        return  (E) data;
    }


    //PHƯƠNG THỨC THÊM PHẦN TỬ VÀO VỊ TRÍ CUỐI  CÙNG( addLast(E e)
    public void addLast(E element) {
        //khai báo Node trỏ đến Node head.
        Node temp = head;
        //Cho con trỏ chạy đến vị trsi cuối cùng (vị trí cuối cùng lúc này next=null).
        while (temp.next != null) {
            temp = temp.next;
        }
        //Phần tử cuối cùng sẽ trỏ đến node mới.
        temp.next = new Node(element);
        numNode++;

    }


    //Phương thức size: dùng đê trả về số phần tử có trong danh sách.
    public int size() {
        return numNode;
    }

    //phương thúc get(int index) dung để lấy dữ liệu tại vị trí index
    public Object get(int index) {
        //khai báo một biến temp =head (nốt đàu tiên trong LinkedList.
        Node temp = head;
        //chạy vong for từ 0 đến vị trí index(vị trí lấy dũ liệu ra)
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    //Phương thức Contains(E element) dùng để kiểm tra 1 phần tử có tồn tại trong LinkedList hay ko.
    public boolean contians(E element) {
        Node temp = head;
        while (temp.next != null) {
            //kiểm tra dữ liệu của temp hiện tại(temp.data)so sánh với dữ liệu mà ta muốn tìm kiếm
            if (temp.data.equals(element)) {
                return true;

            }
            //nếu ko trùng nhau thì trỏ tới node kế tiếp
            temp = temp.next;
        }
        //temp luc này ở vị trí cuối cùng nếu bằng với element thì return true.nếu ko thì return false.
        if (temp.data.equals(element)) {
            return true;

        }
        return false;
    }

    //PHƯƠNG THỨC TRẢ VỀ MỘT VỊ TRÍ  1 PHẦN TỬ TRONG DANH SÁCH indexOf
    public int indexOf(E element) {
        Node temp = head;
        for (int i = 0; i < numNode; i++) {
            if (temp.getData().equals(element))
                return i;
            temp = temp.next;
        }
        return -1;
    }
}
