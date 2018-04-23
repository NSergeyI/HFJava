package SerializationSave;

import java.io.*;

public class GameSaverTest {
    public static void main(String[] args) {
        GameCharacter one = new GameCharacter(50, "Эльф", new String[]{"лук", "меч", "кастет"});
        GameCharacter two = new GameCharacter(200, "Троль", new String[]{"голые руки", "большой топор"});
        GameCharacter three = new GameCharacter(120, "Маг", new String[]{"заклинание", "невидимость"});


        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("game"));
            os.writeObject(one);
            os.writeObject(two);
            os.writeObject(three);
            os.close();
        } catch (Exception e) {
            e.printStackTrace();

        }

        one = null;
        two = null;
        three = null;

        try{
            ObjectInputStream is = new ObjectInputStream(new FileInputStream("game"));
            GameCharacter oneRestore = (GameCharacter) is.readObject();
            GameCharacter twoRestore = (GameCharacter) is.readObject();
            GameCharacter threeRestore = (GameCharacter) is.readObject();

            System.out.println(" 1 :"+oneRestore.getType());
            System.out.println(" 2 :"+twoRestore.getType());
            System.out.println(" 3 :"+threeRestore.getType());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
