package text;

import java.io.*;

public class DocGhiFile {
    public static final String PATH_SOUC = "src/text/souc.txt";
    public static final String PATH_1 = "src/text/target.txt";

    public static void readFile() {
        try {
            File file = new File(PATH_SOUC);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line ="";
            while ((line=bufferedReader.readLine())!=null){
                System.out.println(line);
                bufferedReader.readLine();
            }
            bufferedReader.close();

        } catch (IOException e) {
            System.out.println("file bị lổi : ");
        }
    }
    public static void writeFile(){
       try{ File file = new File(PATH_SOUC);
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter= new BufferedWriter(fileWriter);
           bufferedWriter.write("ho");
           bufferedWriter.write("thi ");
           bufferedWriter.write("hai");
           bufferedWriter.write("hoang");
           bufferedWriter.close();
    }catch (IOException e){
           System.out.println("file bị lổi :");
       }


}
public static void copyFile(){
     try {
         File file = new File(PATH_SOUC);
         FileReader fileReader = new FileReader(file);
         BufferedReader bufferedReader = new BufferedReader(fileReader);

         File file1 = new File(PATH_1);
         FileWriter fileWriter = new FileWriter(file1);
         BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
         String line = "";

         while ((line=bufferedReader.readLine())!=null){
             bufferedWriter.write(line);
         }
         bufferedReader.close();
         bufferedWriter.close();
     }catch (IOException e){
         System.out.println("file bị lổi :");
     }
}

    public static void main(String[] args) {
        writeFile();
        readFile();
        copyFile();
    }
}