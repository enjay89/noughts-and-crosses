package main;

import main.players.HumanPlayer;
import main.players.JokerPlayer;
import main.players.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Launcher {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 0 to play a human. Press 1 to play a Robot");
        int userChoice = sc.nextInt();
        Player player1 = new HumanPlayer('X', "Player1");
        Player player2;
        if(userChoice == 0){
            player2 = new HumanPlayer('O', "Player 2");
        } else {
            player2 = new JokerPlayer('O',"Player 2");
        }
        Game game = new Game(shufflePlayers(player1, player2));
        game.play();
    }

    private static List<Player> shufflePlayers(Player player1, Player player2){
        Random rand = new Random();
        boolean bleh = rand.nextBoolean();
        List<Player> players = new ArrayList<>();
        if(bleh){
            players.add(player1);
            players.add(player2);
        } else {
            players.add(player2);
            players.add(player1);
        }
        return players;
    }
}