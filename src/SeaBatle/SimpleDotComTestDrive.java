package SeaBatle;

public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        SimpleDotCom simpleDotCom = new SimpleDotCom();
        simpleDotCom.setLocationCells(new int[]{2, 3, 4});
//        int[] testCells = new int[]{1,2,5,6,7,2,3,3};
        String userGues = "2";
        String result = simpleDotCom.checkYourself(userGues);
        String testResult = "Неудача";
        if (result.equals("Попал")){
            testResult = "Пройден";
        }
        System.out.println(testResult);
    }
}
