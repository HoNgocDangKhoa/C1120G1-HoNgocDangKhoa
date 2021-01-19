package bai12_map_tree.baitap;

import java.util.*;

public class ProductManager {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Product> arrayList = new ArrayList<>();

    public void add() {
        System.out.print("nhập số lướng sản phẩm : ");
        int num = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < num; i++) {
            System.out.print("tên sản phẩm  : ");
            String name = scanner.nextLine();
            System.out.print("nhập id sản phẩm : ");
            int id = Integer.parseInt(scanner.nextLine());
            System.out.print("nhập giá sản phẩm :");
            int price = Integer.parseInt(scanner.nextLine());
            Product product = new Product(name, id, price);
            arrayList.add(product);
        }
    }

    public void display() {
        for (Product product : arrayList) {
            System.out.println(product.toString());
        }
    }

    public void edit() {
        String newName;
        int newPrice;
        System.out.print("nhập id mà bạn muốn sửa : ");
        int id = Integer.parseInt(scanner.nextLine());
        for (Product product : arrayList) {
            if (id == product.getId()) {
                System.out.println(product.toString());
                System.out.print("1.sửa tên " + "    " + "2.sủa giá ");
                int input = Integer.parseInt(scanner.nextLine());
                switch (input) {
                    case 1:
                        System.out.print("nhập tên muốn sửa : ");
                        newName = scanner.nextLine();
                        product.setName(newName);
                        break;
                    case 2:
                        System.out.print("nhập giá muốn sửa :");
                        newPrice = Integer.parseInt(scanner.nextLine());
                        product.setPrice(newPrice);
                        break;
                }
            }
        }
        display();
    }

    public void remove() {
        System.out.print("nhập id mà bạn muốn xoá :");
        int input = Integer.parseInt(scanner.nextLine());
        for (Product product : arrayList) {
            if (input == product.getId()) {
                arrayList.remove(product.getId() - 1);
                break;
            }
        }
        display();
    }

    public void search() {
        System.out.println("nhập tên bạn muốn tìm kiếm :");
        String name = scanner.nextLine();
        for (Product product : arrayList) {
            if (name.equals(product.getName())) {
                System.out.println(product);
            }
        }
    }
    public void sort() {
        System.out.println("1.sắp xếp sản phẩm tăng dần theo giá" + "    " + "2.sắp xếp sản phẩm giảm dàn theo giá");
        int num = Integer.parseInt(scanner.nextLine());

        switch (num) {
            case 1:
                Collections.sort(arrayList,new TangDanGia());
                for (Product product:arrayList){
                    System.out.println(product);
                }
                break;
            case 2:
                Collections.sort(arrayList, new GiamDanGia());
                for (Product product:arrayList){
                    System.out.println(product);
                }
                break;
        }

    }
}
