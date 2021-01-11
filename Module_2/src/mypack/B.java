package mypack;

import pack.A;

class B extends A {

    public  void msg() {
        System.out.println(this.num);
    }

    public static void main(String[] args) {

        B obj = new B();
        obj.msg();

    }

    public static class NhanVien {
        public void getThuNhap() {
            System.out.println("Nhan viên");
        }

    }

    public static class TruongPhong extends NhanVien {
        public void getThuNhap() {
            System.out.println("Truỏng phòng");
        }
        public void getTen() {
            System.out.println("khoa");
        }


    }
}