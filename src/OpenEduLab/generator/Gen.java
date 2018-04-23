package OpenEduLab.generator;

import java.io.FileWriter;
import java.io.IOException;

public class Gen {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("/home/winnie/IdeaProjects/HFJava/src/OpenEduLab/input.txt");
        for (int i=0; i<4000;i++){
            fileWriter.write(" "+ (int) (Math.random()*10000));
        }
        fileWriter.close();

    }
}
