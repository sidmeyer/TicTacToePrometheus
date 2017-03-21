package sidmeyer.tictactoeprometheus;

/**
 * Created by stas on 21.03.17.
 */
public class Move {
    private final int vert, hor;
    private final ActionFigure figure;

    public Move(int vert, int hor, ActionFigure figure) {
        this.vert = vert;
        this.hor = hor;
        this.figure = figure;
    }

    public int getHor() {
        return hor;
    }

    public int getVert() {
        return vert;
    }

    public ActionFigure getFigure() {
        return figure;
    }
}
