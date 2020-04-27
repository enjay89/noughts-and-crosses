package main;

import main.players.Player;

import java.util.List;

public class Game {

    private Board board;
    private List<Player> players;

    public Game(List<Player> players){
        this.players = players;
        this.board = new Board();
    }

    public void play(){

        boolean playing = true;
        board.show();
        while (playing) {
            for (Player player : players) {
                if(board.isFull()){
                    System.out.println("It's a draw!");
                    playing = false;
                    break;
                }
                System.out.println("It's " + player.name + "'s move\n");
                // Ask for a move until we get a valid one
                while (true) {
                    Move move = player.decideMove(board);
                    // If the move is valid, make it
                    if (board.isValid(move)) {
                        board.makeMove(move);
                        break;
                    }
                }
                // render new view
                board.show();
                // check for win
                if(Judge.hasWon(board.tiles)){
                    System.out.println(player.name + " has won! yay");
                    playing = false;
                    break;
                }
            }
        }
        System.out.println("Game Over");
    }
}