package SeaBatle;

import java.util.ArrayList;

public class DotComBust {
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;

    private void setUpGame() {
        DotCom one = new DotCom();            System.out.println("Заняло: "+numOfGuesses+" ходов");

        DotCom two = new DotCom();
        DotCom three = new DotCom();
        one.setName("Pets.com");
        two.setName("eToys.com");
        three.setName("Go2.com");
        dotComList.add(one);
        dotComList.add(two);
        dotComList.add(three);

        System.out.println("Ваша цель - потопить три сайта");
        System.out.println("Pets.com, eToys.com, Go2.com");
        System.out.println("Попытатесь потопить их за минимальное количество ходов");

        for (DotCom dotCom : dotComList) {
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotCom.setLocationCells(newLocation);
        }

    }

    private void startPlaying() {
        while (!dotComList.isEmpty()) {
            String userGuess = helper.getUserInput("Сделай ход");
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    private void checkUserGuess(String userGuess) {
        numOfGuesses++;
        String result = "Мимо";
        for (DotCom dotCom : dotComList){
            result = dotCom.checkYourself(userGuess);
            if (result.equals("Потопил")){
                break;
            }
            if (result.equals("Потопил")){
                dotComList.remove(dotCom);
                break;
            }
        }
        System.out.println(result);
    }

    private void finishGame() {
        System.out.println("Все сайты ушли ко дну");
        if (numOfGuesses<10){
            System.out.println("Заняло: "+numOfGuesses+" ходов");
        } else {
            System.out.println("Заняло(насмешливо): "+numOfGuesses+" ходов");

            System.out.println("");
        }
    }

    public static void main(String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }
}
