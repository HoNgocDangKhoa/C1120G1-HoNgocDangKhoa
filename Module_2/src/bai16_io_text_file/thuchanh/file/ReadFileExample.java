package bai16_io_text_file.thuchanh.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFileExample {
    public void readFiles(String string) {

        try {
            File file = new File(string);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            bufferedReader.close();
            System.out.println("tổng  : "+ sum);
        } catch (Exception e) {
            System.out.println("file ko tồn tại hoặc file có lổi :");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập dường dẫn : ");
        String string = scanner.nextLine();
        ReadFileExample readFileExample = new ReadFileExample();
        readFileExample.readFiles(string);
    }
}

