package lab2;

import java.io.*;

public class Lab2 {
    public static void main(String[] args) {
        String fileName = "lab2.txt";
        String line1 = "Hello World!";
        String line2 = "Welcome to Java";

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            writer.write(line1 + "\n");
            writer.write(line2 + "\n");
            writer.close();

            // Read from a file
            System.out.println("Reading from a file: ");
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

            // Reading from console
            System.out.println("\nReading from console: ");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter text: ");
            line = br.readLine();
            System.out.println(line);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
