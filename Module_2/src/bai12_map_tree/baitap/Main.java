package bai12_map_tree.baitap;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ProductManager productManager=new ProductManager();
        do {
            System.out.println("----------------------------------MENU-----------------------------------");
            System.out.print("1.Thêm Sản phẩm"+"                   ");
            System.out.print("2.Sửa thông tin san phẩm"+"          ");
            System.out.println("3.Xoá sản phẩm");
            System.out.print("4.Hiện thị danh sách sản phẩm"+"    ");
            System.out.print("5.Tìm kiếm thông tin sản phẩm"+"    ");
            System.out.println("6.Sắp xếp sản phẩm theo thứ tự tăng và giảm theo giá"+"    ");
            System.out.println("7.Thoát");
            int number =Integer.parseInt(scanner.nextLine());
            switch (number){
                case 1:
                    productManager.add();
                    break;
                case 2:
                    productManager.edit();
                    break;
                case 3:
                   productManager.remove();
                        break;
                case 4:
                    productManager.display();
                    break;
                case 5:
                  productManager.search();
                    break;
                case 6:
                    productManager.sort();
                    break;
                case 7:
                   System.exit(7);
                    break;
            }

    }while(true);


    }
}