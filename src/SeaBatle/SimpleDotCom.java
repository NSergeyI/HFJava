package SeaBatle;

public class SimpleDotCom {
    private int[] locationCells;
    private int numOfHits;
    public String checkYourself(String stringGuess){
     String result = "Мимо";
        int gues = Integer.parseInt(stringGuess);
        for (int cell:locationCells){
            if (gues==cell){
                result = "Попал";
                numOfHits++;
                break;
            }
        }
        if (numOfHits == locationCells.length){
            result = "Потопил";
        }
        System.out.println(result);
        return result;
    }

    public void setLocationCells(int[] locationCells) {
        this.locationCells = locationCells;
    }
}
