package SeaBatle;

public class SimpleDotComGame {
    public static void main(String[] args) {
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();
        SimpleDotCom simpleDotCom = new SimpleDotCom();
        int randomNum = (int) (Math.random() * 5);
        int[] locationSells = new int[]{randomNum, randomNum + 1, randomNum + 2};
        simpleDotCom.setLocationCells(locationSells);
        boolean isAlive = true;

        while (isAlive) {
            String gues = helper.getUserInput("Введите число:");
            String result = simpleDotCom.checkYourself(gues);
            numOfGuesses++;
            if (result.equals("Потопил")) {
                isAlive = false;
                System.out.println("Вам потребовалось " + numOfGuesses + " попыток(и)");
            }
        }

    }

}
