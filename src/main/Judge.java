package main;

public class Judge {

    static boolean hasWon(char[][] board){
        // Check rows
        for(int row = 0; row < 3; row++){
            int xCounters = 0;
            int oCounters = 0;
            for (int col = 0; col < 3; col++) {
                if(board[row][col] == 'X'){
                    xCounters++;
                } else if(board[row][col] == 'O'){
                    oCounters++;
                } else {
                    break;
                }
            }
            if(xCounters == 3 || oCounters == 3){
                return true;
            }
        }

        //Check columns
        for(int col = 0; col < 3; col++) {
            int xCounters = 0;
            int oCounters = 0;
            for (int row = 0; row < 3; row++){
                if(board[row][col] == 'X'){
                    xCounters++;
                } else if(board[row][col] == 'O'){
                    oCounters++;
                } else {
                    break;
                }
            }
            if(xCounters == 3 || oCounters == 3){
                return true;
            }
        }
        // Check diagonally
        if(board[0][0] == board[1][1] && board[0][0] == board[2][2] && board[0][0] != '\0'){
                return true;
            }
        if(board[0][2] == board[1][1] && board[0][2] == board[2][0] && board[0][2] != '\0'){
            return true;
        }
        return false;
    }


}
