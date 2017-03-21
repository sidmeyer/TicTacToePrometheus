package sidmeyer.tictactoeprometheus;

/**
 * Created by stas on 21.03.17.
 */
public class Move {
    private int hor, vert;
    private ActionFigure figure;

    public Move(int hor, int vert, ActionFigure figure) {
        this.hor = hor;
        this.vert = vert;
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
