package main.players;

import main.Board;
import main.Move;

import java.util.Scanner;

public class HumanPlayer extends Player {

    Scanner sc;
    public HumanPlayer(char counter, String name){
        super(counter, name);
        sc = new Scanner(System.in);
    }

    @Override
    public Move decideMove(Board board) {                                   // check for errors
        System.out.println("Make your row move please");
        int row = sc.nextInt();
        System.out.println("Make your column move please");
        int col = sc.nextInt();
        return new Move(row, col, counter);
    }
}
