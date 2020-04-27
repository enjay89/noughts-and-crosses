package main;

public class Board {

    char[][] tiles;                                 // Array of char arrays

    public Board(){
        tiles = new char[3][3];
    }      // 3 arrays of 3 characters

    boolean isValid(Move move){
        // check cell is on the board (index 0, 1, 2)
        if (move.row < 0 || move.row > 2 || move.col < 0 || move.col > 2) {
            return false;
        }
        // Check cell is not occupied
        return tiles[move.row][move.col] == 0;
    }

    void makeMove(Move move){
        tiles[move.row][move.col] = move.counter;
    }

    private String renderCell(char c) {
        return c == '\0' ? "_" : String.valueOf(c);
    }

    void show(){                                        // tidy up with string builder
        System.out.println("");
        for(int row = 0; row < 3; row++){
            String line = "";
            for (int col = 0; col < 3; col++) {
                line += renderCell(tiles[row][col]);
            }
            System.out.println(line);
        }
        System.out.println("");
    }

    boolean isFull(){
        for(char[] row : tiles){
            for(char tile : row){
                if(tile == '\0'){
                    return false;
                }
            }
        }
        return true;
    }

}
