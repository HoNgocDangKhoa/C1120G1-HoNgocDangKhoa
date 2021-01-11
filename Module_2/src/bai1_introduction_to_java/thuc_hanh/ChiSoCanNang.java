package bai1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class ChiSoCanNang {
    public static void main(String[] args) {
        float weight;
        float height;
        Scanner boy = new Scanner(System.in);

        System.out.println("nhap can nang :");
        weight = boy.nextFloat();
        System.out.println("nhap chieu cao :");
        height = boy.nextFloat();

       float bmi = weight /(height*height);

        if (bmi >= 30) {
            System.out.println("chỉ số cơ thể quá mức tưởng tượng");

        } else if (bmi >= 25) {
            System.out.println("chỉ số cơ thể cao hơn bình thường");

        } else if (bmi >= 18.5) {
            System.out.println("ờ mây zing gút chóp");

        } else {
            System.out.println("đùng ra khỏi nhà gió thổi bay xác");
        }
    }
}
