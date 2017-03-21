package sidmeyer.tictactoeprometheus;

import java.util.Scanner;

/**
 * Created by stas on 21.03.17.
 */
public class Player {
    private final ActionFigure figure;

    Player(ActionFigure figure) {
        this.figure = figure;
    }

    public ActionFigure getFigure() {
        return figure;
    }

    public Move turn(Board board) {
        while(true) {
            Scanner scn = new Scanner(System.in);
            int vert = scn.nextInt();
            int hor = scn.nextInt();
            if (vert > 0 && vert <= board.getSize() && hor > 0 && hor <= board.getSize() && board.isPointFree(vert, hor)) {
                return new Move(vert, hor, figure);
            } else {
                System.out.println("Invalid move. Repeat.");
            }
        }
    }
}
