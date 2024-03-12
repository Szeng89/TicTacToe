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
        boolean rows = false;

        for (int i = 0; i < matrix.length; i ++){
            for(int j = 0; j < matrix.length; j++){
                if(matrix[i][j] == 'X') {
                    xCount++;
                }

            }
            if (xCount == 3){
                rows = true;
            }
        }
        return rows;
    }

    public Boolean isInFavorOfO() {
        int oCount = 0;
        boolean rows = false;

        for (int i = 0; i < matrix.length; i ++){
            for(int j = 0; j < matrix.length; j++){
                if(matrix[i][j] == 'O') {
                    oCount++;
                }

            }
            if (oCount == 3){
                rows = true;
            }
        }
        return rows;
    }

    public Boolean isTie() {
        return null;
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
