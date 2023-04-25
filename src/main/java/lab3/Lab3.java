package lab3;

import java.io.*;
import java.util.Scanner;

public class Lab3 {

    public static void main(String[] args) {
        // Writing data to the file
        try (PrintWriter out = new PrintWriter("lab3.txt")) {
            out.println("Hello World!");
            out.println("Welcome to Java");
            out.println("Harry Potter");
            out.println(19);
            out.println(60.5);
            out.println(175.0);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        // Reading data from the file
        try (Scanner scanner = new Scanner(new File("lab3.txt"))) {
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
