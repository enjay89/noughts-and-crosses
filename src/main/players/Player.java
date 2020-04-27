package main.players;

import main.Board;
import main.Move;

public abstract class Player {

    char counter;                                                       // an O or an X
    public String name;

    protected Player(char counter, String name){
        this.counter = counter;
        this.name = name;
    }

    public abstract Move decideMove(Board board);
}
