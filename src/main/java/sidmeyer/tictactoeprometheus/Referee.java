package sidmeyer.tictactoeprometheus;

/**
 * Created by stas on 21.03.17.
 */
public class Referee {
	public void put(Move move, Board board) {
		board.setPoint(move.getVert(), move.getHor(), move.getFigure());
	}

	public boolean isWin(Move move, Board board) {
		//horizontal
		int vert = move.getVert();
		for (int h = 1; h <= board.getSize(); h++) {
			ActionFigure moveFigure = move.getFigure();
			ActionFigure currentFigure = board.getPoint(vert, h);
			if (currentFigure == null) {
				break;
			} else if (currentFigure != moveFigure) {
				break;
			} else if (h == board.getSize()) {
				return true;
			}
		}

		//vertical
		int hor = move.getHor();
		for (int v = 1; v <= board.getSize(); v++) {
			ActionFigure moveFigure = move.getFigure();
			ActionFigure currentFigure = board.getPoint(v, hor);
			if (currentFigure == null) {
				break;
			} else if (currentFigure != moveFigure) {
				break;
			} else if (v == board.getSize()) {
				return true;
			}
		}

		//diagonal
		if (move.getHor() == move.getVert() || move.getHor() == (board.getSize() + 1) - move.getVert()) {
			for (int p = 1; p <= board.getSize(); p++) {
				ActionFigure moveFigure = move.getFigure();
				ActionFigure currentFigure = board.getPoint(p, p);
				if (currentFigure == null) {
					break;
				} else if (currentFigure != moveFigure) {
					break;
				} else if (p == board.getSize()) {
					return true;
				}
			}
			for (int p = 1; p <= board.getSize(); p++) {
				ActionFigure moveFigure = move.getFigure();
				ActionFigure currentFigure = board.getPoint((board.getSize() + 1) - p, p);
				if (currentFigure == null) {
					break;
				} else if (currentFigure != moveFigure) {
					break;
				} else if (p == board.getSize()) {
					return true;
				}
			}
		}

		return false;
	}
}
