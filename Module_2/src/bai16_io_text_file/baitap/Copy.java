package bai16_io_text_file.baitap;

import java.io.*;

public class Copy {

    public static final String SOURCE_PATH = "src/bai16_io_text_file/baitap/source.txt";
    public static final String TARGET_PATH = "src/bai16_io_text_file/baitap/target.txt";

    public static void writeFile() {
        try {
            File file = new File(SOURCE_PATH);
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("ho\n");
            bufferedWriter.write("ngoc\n");
            bufferedWriter.write("dang\n");
            bufferedWriter.write("khoa\n");


            bufferedWriter.close();
        } catch (Exception e) {
            System.out.println("File loi");
        }

    }

    public static void readFile() {
        try {
            File file = new File(SOURCE_PATH);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("File loi");
        }
    }

    public static void copy() {
        try {
            // đọc file source cần copy
            File file = new File(SOURCE_PATH);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // ghi file target copy từ file source
            File file1 = new File(TARGET_PATH);
            FileWriter fileWriter = new FileWriter(file1);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }

            bufferedWriter.close();
        } catch (Exception e) {
            System.out.println("File loi");
        }

    }

    public static void main(String[] args) {
        writeFile();
        readFile();
        copy();
    }
}
