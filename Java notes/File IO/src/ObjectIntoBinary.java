import java.io.*;
import java.util.*;

public class ObjectIntoBinary{
    private static ArrayList<Player> players = new ArrayList<Player>();
    private final String FILENAME = "player.bin";

    public static void main(String[] args){
        init();
        savePlayer();
    }

    public static void init(){
        Player p1 = new Player("Benson",21);
        Player p2 = new Player("John",22);
        players.add(p1);
        players.add(p2);
    }

    public static void savePlayer(){
        try{
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILENAME));
            for(Player playerObj : players){
                oos.writeObject(playerObj);
            }
            oos.close;
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}