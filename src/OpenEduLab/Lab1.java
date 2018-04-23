package OpenEduLab;

import java.io.*;
import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("input.txt");
        Scanner scanner = new Scanner(fileReader);
        int n = Integer.parseInt(scanner.nextLine());
        FileWriter fileWriter = new FileWriter("output.txt");
        if (scanner.hasNextLine()) {
            String[] input = scanner.nextLine().split(" ");
            for (int i = 1; i < n; i++) {
                int j = i;
                while (true) {
                    long a = Long.parseLong(input[0]);
                    long b = Long.parseLong(input[1]);
                }
            }
            fileWriter.write("");
            fileReader.close();
            fileWriter.close();
        }
    }
}

