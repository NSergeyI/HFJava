package OpenEduLab.lab4;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Lab4 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("input.txt");
        Scanner scanner = new Scanner(fileReader);
        int n = Integer.parseInt(scanner.nextLine());
        FileWriter fileWriter = new FileWriter("output.txt");
        StringBuilder out = new StringBuilder();
        if (scanner.hasNextLine()) {
            String[] input = scanner.nextLine().split(" ");
            ArrayList<Float> a = new ArrayList<Float>();
            ArrayList<Float> b = new ArrayList<Float>();
            for (int i = 0; i < n; i++) {
                a.add(Float.parseFloat(input[i]));
                b.add(Float.parseFloat(input[i]));
            }
            Collections.sort(a);
            out.append(b.indexOf(a.get(0))+1+" ");
            out.append(b.indexOf(a.get(n/2))+1+" ");
            out.append(b.indexOf(a.get(n-1))+1);
        }
        fileWriter.write(String.valueOf(out));
        fileReader.close();
        fileWriter.close();
    }
}
