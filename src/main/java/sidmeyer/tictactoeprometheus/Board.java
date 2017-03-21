package sidmeyer.tictactoeprometheus;

/**
 * Created by stas on 21.03.17.
 */
public class Board {
	private final int size = 3;
	private final ActionFigure[] points = new ActionFigure[size * size];

	public void print() {
		for (int i = 0; i < points.length; i++) {
			if (points[i] != null) {
				switch (points[i]) {
					case NOUGHT:
						System.out.print(" O ");
						break;
					case CROSS:
						System.out.print(" X ");
						break;
				}
			} else {
				System.out.print("   ");
			}

			if ((i + 1) % size == 0) {
				System.out.println();
				if (i + 1 < points.length) {
					for (int r = 0; r < size; r++) {
						System.out.print("---");
						if (r + 1 < size) {
							System.out.print("-");
						}
					}
					System.out.println();
				}
			} else {
				System.out.printf("|");
			}
		}
	}

	public boolean hasMoreSpace() {
		int freeCount = 0;
		for (ActionFigure point : points) {
			if (point == null) {
				freeCount++;
			}
		}
		return freeCount >= 2;
	}

	public boolean isPointFree(int vert, int hor) {
		if (getPoint(vert, hor) == null) {
			return true;
		}
		return false;
	}

	public int getSize() {
		return size;
	}

	public void setPoint(int vert, int hor, ActionFigure figure) {
		points[(vert - 1) * size + hor - 1] = figure;
	}

	public ActionFigure getPoint(int vert, int hor) {
		int i = (vert - 1) * size + hor - 1;
		return points[i];
	}
}
