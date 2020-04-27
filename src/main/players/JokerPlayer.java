package main.players;

import main.Board;
import main.Move;

import java.util.Random;

public class JokerPlayer extends Player {

    public JokerPlayer(char counter, String name) {
        super(counter, name);
    }

    @Override
    public Move decideMove(Board board) {
        Random rand = new Random();
        int row = rand.nextInt(3);
        int col = rand.nextInt(3);
        return new Move(row, col, counter);
    }
}
