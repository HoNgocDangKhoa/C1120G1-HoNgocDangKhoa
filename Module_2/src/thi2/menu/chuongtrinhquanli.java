package thi2.menu;

import java.util.Scanner;

public class chuongtrinhquanli {
    public static void main(String[] args) {
        displayMainMenu();
    }
    public static void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--CHUONG TRINH QUAN LI DIEN THOAI--" + "\n" +
                "Chon chuc nang theo so (de tiep tuc):" + "\n" +
                "1 .Them moi" + "\n" +
                "2 . Xoa" + "\n" +
                "3 . Xem danh sach dien thoai" + "\n" +
                "4 . Tim kiem" + "\n" +
                "5 . Thoat" + "\n" +
                "Chon chuc nang :");
        int choice = Integer.parseInt(scanner.nextLine());
        do{
        switch (choice) {
            case 1:
                System.out.println("1.dien thoai chinh hang     2.dien thoai xach tay");
                int chon=Integer.parseInt(scanner.nextLine());
                switch (chon){
                    case 1:
                        themMoiChinhhang();
                        break;
                    case 2:
                        themMoiXachTay();
                        break;
                }
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;

    }
}while (true);
    }
public static void themMoiChinhhang(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("nhap Id");
    String Id=scanner.nextLine();
    System.out.println("nhap tenDT");
    String tenDT=scanner.nextLine();
    System.out.println("nhap gia");
    String gia=scanner.nextLine();
    System.out.println("nhap so luong");
    String soluong = scanner.nextLine();
    System.out.println("nhap nha san xuat");
    String nhasanxuat = scanner.nextLine();
    System.out.println("thoi gian bao hanh");
    String thoigian=scanner.nextLine();
    System.out.println("nhap pham vi bao hanh");
    String phamvi=scanner.nextLine();
}
    public static void themMoiXachTay(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap Id");
        String Id=scanner.nextLine();
        System.out.println("nhap tenDT");
        String tenDT=scanner.nextLine();
        System.out.println("nhap gia");
        String gia=scanner.nextLine();
        System.out.println("nhap so luong");
        String soluong = scanner.nextLine();
        System.out.println("nhap nha san xuat");
        String nhasanxuat = scanner.nextLine();
        System.out.println("Quoc gia xach tay");
        String quocgia=scanner.nextLine();
        System.out.println("nhap trang thai");
        String trangthai=scanner.nextLine();
    }
    public static void hienThi(){

    }
}