package by.epam.pretraining.task5.exercise1;

import java.io.*;

public class Text {

    public void createText(String text){
        try(FileOutputStream fileOutputStream = new FileOutputStream("D://trainingFolder//directory//text.txt")){
            byte[] buffer = text.getBytes();
            fileOutputStream.write(buffer,0,buffer.length);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        System.out.println("File recorded");
    }

    public void printText(){
        try (FileInputStream fileInputStream = new FileInputStream("D://trainingFolder//directory//text.txt")){
            int i;
            while ((i = fileInputStream.read()) != -1){
                System.out.print((char)i);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void refactorText(){
        String text = "Fifty years ago, NASA Apollo 11 mission changed our world.";
        try {
            FileWriter fileWriter = new FileWriter("D://trainingFolder//directory//text.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(text);
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
