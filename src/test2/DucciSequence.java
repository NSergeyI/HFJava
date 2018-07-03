package test2;

import java.util.ArrayList;

public class DucciSequence {
    private ArrayList<Integer> input;

    public DucciSequence(ArrayList<Integer> input) {
        this.input = input;
    }

    public void run(){
        changeSequence(input);

        for (int i=0;i<output.size();i++){
            if (output.get(i)!=0){

            } else {
                //out
            }
        }
    }

    public ArrayList<Integer> changeSequence(ArrayList<Integer> sequence){
        ArrayList<Integer> output = new ArrayList<>();
        for (int i=0;i<sequence.size()-1;i++) {
            output.add(Math.abs(sequence.get(i)-sequence.get(i+1)));
        }
        output.add(Math.abs(sequence.get(0)-sequence.get(sequence.size()-1)));
    }
}
