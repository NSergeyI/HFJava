package OpenEduLab.Lab3;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("input.txt");
        Scanner scanner = new Scanner(fileReader);
        int n = Integer.parseInt(scanner.nextLine());
        FileWriter fileWriter = new FileWriter("output.txt");
        StringBuilder out1 = new StringBuilder("1 ");
        StringBuilder out = new StringBuilder();
        if (scanner.hasNextLine()) {
            String[] input = scanner.nextLine().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(input[i]);
            }
            for (int j = 1; j < n; j++) {
                int i = j - 1;
                while ((i >= 0) && (a[i] > a[i + 1])) {
                    int tmp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = tmp;
                    i--;
                }
                out1.append(i+2+" ");

            }
            out1.deleteCharAt(out1.length()-1);
            for (int i =0;i<n;i++ ){
                out.append(a[i]+" ");
            }
            out.deleteCharAt(out.length()-1);
        }
        fileWriter.write(String.valueOf(out1));
        fileWriter.write("\n");
        fileWriter.write(String.valueOf(out));
        fileReader.close();
        fileWriter.close();
    }
}
