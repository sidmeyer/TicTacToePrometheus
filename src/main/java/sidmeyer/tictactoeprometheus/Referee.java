package sidmeyer.tictactoeprometheus;

/**
 * Created by stas on 21.03.17.
 */
public class Referee {
    public void put(Move move, Board board) {
        board.setPoint(move.getHor(), move.getVert(), move.getFigure());
    }

    // TODO
    public boolean isWin(Move move, Board board) {
        return false;
    }
}
