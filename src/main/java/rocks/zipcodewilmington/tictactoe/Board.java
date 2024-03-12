package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    private Character[][] matrix;
    public Board(Character[][] matrix) {
        this.matrix =matrix;
    }

    public Boolean isInFavorOfX() {
        int xCount = 0;
        boolean xWins = false;


        for (int i = 0; i < matrix.length; i ++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == 'X') {
                    xCount++;
                }

            }
            if (xCount == 3) {
                xWins = true;
                xCount = 0;
            }


            // Diagonals
            if (matrix[0][0] == 'X' && matrix[1][1] == 'X' && matrix[2][2] == 'X') {
                xWins = true;

            }

            if (matrix[2][0] == 'X' && matrix[1][1] == 'X' && matrix[0][2] == 'X') {
                xWins = true;

            }
        }

        return xWins;
    }

    public Boolean isInFavorOfO() {
        int oCount = 0;
        boolean Owins = false;


        for (int i = 0; i < matrix.length; i ++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == 'O') {
                    oCount++;
                }

            }
            if (oCount == 3) {
                Owins = true;
                oCount = 0;
            }


            // Diagonals
            if (matrix[0][0] == 'O' && matrix[1][1] == 'O' && matrix[2][2] == 'O') {
                Owins = true;

            }

            if (matrix[2][0] == 'O' && matrix[1][1] == 'O' && matrix[0][2] == 'O') {
                Owins = true;

            }
        }

        return Owins;
    }

    public Boolean isTie() {
        boolean tie = false;
        if(isInFavorOfX() == isInFavorOfO()){
            tie = true;
        }
        return tie;

    }

    public String getWinner() {
        String winner = "";

        if(isInFavorOfO() && !isInFavorOfX()){
            winner = "O";
        } else if (isInFavorOfX() && !isInFavorOfO()) {
            winner = "X";
        }



        return winner;
    }

}
