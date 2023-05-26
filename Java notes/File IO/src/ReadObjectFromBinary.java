import java.io.*;
import java.util.*;

public class ReadObjectFromBinary{
    private static ArrayList<Player> players = new ArrayList<Player>();
    private final String FILENAME = "player.bin";


    public static void main(String[] args){
        loadPlayer();
        displayPlayers();
    }
    
    public static void loadPlayer(){
        try{
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILENAME));
            Object player;
            while(true){
                try{
                    player = ois.readObject();
                    if(player instanceOf Player){
                        players.add((Player) player);
                    }else{
                        System.err.println("Unexpected object in file");
                    }
                }catch(EOFException e){     //no more object in file
                    break;
                }
            }
        }catch(IOException | ClassNotFoundException e){
            System.out.println("File not found: " + FILENAME);
        }
    }

    public static void displayPlayers(){
        for(Player playerObj : players){
            System.out.println(playerObj.toString());
        }
    }
}