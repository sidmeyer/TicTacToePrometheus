package sidmeyer.tictactoeprometheus;

import java.util.Scanner;

/**
 * Created by stas on 21.03.17.
 */
public class Player {
    ActionFigure figure;

    Player(ActionFigure figure) {
        this.figure = figure;
    }

    // TODO
    public Move turn(Board board) {
        while(true) {
            Scanner scn = new Scanner(System.in);
            int hor = scn.nextInt();
            int vert = scn.nextInt();
            if (hor > 0 && hor <= board.getSize() && vert > 0 && vert <= board.getSize() && board.isPointFree(hor, vert)) {
                return new Move(hor, vert, figure);
            } else {
                System.out.println("Invalid move. Repeat.");
            }
        }
    }
}
