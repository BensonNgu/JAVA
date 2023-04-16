package exception;

import java.util.ArrayList;

public class Main {
    private static ArrayList<Player> players = new ArrayList<Player>();
    private static int num = 1;
    private static int age = 20;
    private static Helper h = new Helper();
    public static void main(String[] args) {
        while(true){
            String title = "Test on own made exception";
            String[] menu = {"Int testing on the range","Test on manipulate player list"};
            int option = h.askForOption(title, menu);
            if(option == 0)break;

        }
    }

    public static void intOnlyTest(){

    }

    public static void testOnPlayer(){
        for(int i = 1;i <= 3;i++){
            Player player = new Player("player" + num, age);
            players.add(player);
            num += 1;   age += 2;
        }
        showPlayers();
        clearPlayers();h.print("Is Empty? ");
        h.printLine(empty());
        showPlayers();
    }

    public static void showPlayers(){
        if(empty() == true){
            h.printLine("No player exist");
        }else{
            for(Player playerObj : players){
                h.printLine(playerObj.toString());
            }
        }
    }

    public static void clearPlayers(){
        players = new ArrayList<Player>();
    }   
    public static int numOfPlayer(){
        return players.size();
    }

    public static boolean empty(){
        boolean empty = false;
        if(numOfPlayer() == 0){empty = true;}
        return empty;
    }
}
