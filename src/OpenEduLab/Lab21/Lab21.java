package OpenEduLab.Lab21;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Lab21 {

    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("/home/winnie/IdeaProjects/HFJava/src/OpenEduLab/input.txt");
//        FileReader fileReader = new FileReader("input.txt");
        Scanner scanner = new Scanner(fileReader);
        int n = Integer.parseInt(scanner.nextLine());
        FileWriter fileWriter = new FileWriter("/home/winnie/IdeaProjects/HFJava/src/OpenEduLab/output.txt");
//        FileWriter fileWriter = new FileWriter("output.txt");
        ArrayList<Integer> a = new ArrayList<>();
        if (scanner.hasNextLine()) {
            String[] input = new String[n];
            input = scanner.nextLine().split(" ");
            for (int i = 0; i < n; i++) {
                a.add(Integer.parseInt(input[i]));
//                System.out.println(Integer.parseInt(input[i]));
            }

        }

        a = mergeSort(a);
        for (int i = 0; i < n; i++) {
            fileWriter.write(a.get(i)+" ");
            System.out.println(a.get(i));
        }
        fileWriter.close();
        fileReader.close();

    }



    public static ArrayList<Integer> mergeSort(ArrayList<Integer> ab) {

        int n = ab.size();
        if (n == 1) {
            return ab;
        }
        ArrayList<Integer> l = new ArrayList<>();
        ArrayList<Integer> z = new ArrayList<>();
        for (int i = 0; i < (n / 2); i++) {
            l.add(ab.get(i));
        }
        for (int i = 0; i < (n - n / 2); i++) {
            z.add(ab.get(i));
        }
        l = mergeSort(l);
        z = mergeSort(z);
        return merge(l, z);
    }

    public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        int i = 0;
        int j = 0;
        int n = a.size();
        int m = b.size();
        System.out.println("merge n="+n+" m="+m);
        ArrayList<Integer> c = new ArrayList<>();
        while ((i < n) | (j < m)) {
            if ((j == m) | ((i < n) && (a.get(i) <= b.get(j)))) {
                c.add(a.get(i));
                i++;
            }
            else {
                c.add(b.get(j));
                j++;
            }
        }
        return c;
    }
}
