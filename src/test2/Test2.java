package test2;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        String inputString = "(0, 653, 1854, 4063)";
        ArrayList<Integer> input = new ArrayList<>();
        inputString = inputString.substring(1, inputString.length() - 2);
        String[] strings = inputString.split(", ");
        for (String s : strings) {
            input.add(Integer.parseInt(s));
        }

    }
}
