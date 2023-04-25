package lab1;

import java.io.*;

public class Lab1 {
    public static void main(String[] args) {
        String fileName = "lab1.txt";
        String data1 = "Hello World!\n";
        String data2 = "Welcome to Java\n";

        try (FileWriter fw = new FileWriter(fileName)) {
            fw.write(data1);
            fw.write(data2);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reading a single character
        System.out.println("FileReader1: ");
        try (FileReader fr1 = new FileReader(fileName)) {
            int c;
            while ((c = fr1.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reading characters into an array
        System.out.println("\nFileReader2: ");
        char[] cbuf = new char[data1.length() + data2.length()];
        try (FileReader fr2 = new FileReader(fileName)) {
            fr2.read(cbuf);
            System.out.println(cbuf);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
