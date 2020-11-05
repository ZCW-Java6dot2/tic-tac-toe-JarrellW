package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    Character[][] ticTacToe;

    public Board(Character[][] matrix) {
        this.ticTacToe = matrix;

    }

    public Boolean isInFavorOfX() {
        if (checkHori('X') || checkVert('X') || checkDiag('X')) {
            return true;
        }

        return false;
    }

    public Boolean isInFavorOfO() {
        if (checkHori('O') || checkVert('O') || checkDiag('O')) {
            return true;
        }
        return false;
    }

    public Boolean isTie() {
        if(!isInFavorOfO() && !isInFavorOfX()) {
            return true;
        }
        return false;
    }

    public String getWinner() {
        String winner = "";
        if (isInFavorOfX()) {
            winner = "X";
        } else if (isInFavorOfO()){
            winner = "O";
        } else {
            winner = "";
        }
        return winner;
    }

    public Boolean checkHori(Character xOrO) {
        for(int i = 0; i < 3; i++){
            if(ticTacToe[i][0] == xOrO && ticTacToe[i][1] == xOrO && ticTacToe[i][2] == xOrO) {
                return true;
            }
        }
        return false;
    }

    public Boolean checkVert(Character xOrO) {
        for(int i = 0; i < 3; i++){
            if(ticTacToe[0][i] == xOrO && ticTacToe[1][i] == xOrO && ticTacToe[2][i] == xOrO) {
                return true;
            }
        }
        return false;
    }

    public Boolean checkDiag(Character xOrO) {
        if(ticTacToe[0][0] == xOrO && ticTacToe[1][1] == xOrO && ticTacToe[2][2] == xOrO ||
        ticTacToe[0][2] == xOrO && ticTacToe[1][1] == xOrO && ticTacToe[2][0] == xOrO) {
            return true;
        }
        return false;
    }

}
