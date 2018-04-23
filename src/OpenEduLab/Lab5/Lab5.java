package OpenEduLab.Lab5;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Lab5 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("/home/winnie/IdeaProjects/HFJava/src/OpenEduLab/input.txt");
//        FileReader fileReader = new FileReader("input.txt");
        Scanner scanner = new Scanner(fileReader);
        int n = Integer.parseInt(scanner.nextLine());
        FileWriter fileWriter = new FileWriter("/home/winnie/IdeaProjects/HFJava/src/OpenEduLab/output.txt");
//        FileWriter fileWriter = new FileWriter("output.txt");
        if (scanner.hasNextLine()) {
            String[] input = new String[n];
                    input = scanner.nextLine().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(input[i]);
//                System.out.println(Integer.parseInt(input[i]));
            }
            for (int j = 1; j < n; j++) {
                int i = j - 1;
                while ((i > -1) && (a[i] > a[i + 1])) {
                    int tmp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = tmp;
                    fileWriter.write("Swap elements at indices " + (i + 1) + " and " + (i + 2) + ".\n");
                    i--;
                }
            }
            fileWriter.write("No more swaps needed.\n");
            for (int i = 0; i < n; i++) {
                fileWriter.write(a[i]+" ");
                System.out.println(i);
            }
        }
        fileReader.close();
        fileWriter.close();
    }
}
