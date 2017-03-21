package sidmeyer.tictactoeprometheus;

/**
 * Created by stas on 21.03.17.
 */
public class Board {
    private int size = 3;
    private ActionFigure[] points = new ActionFigure[size*size];

    public void print() {
        for (int i=0; i<points.length; i++) {
            if (points[i] != null) {
                System.out.print(points[i].toString());
            } else {
                System.out.print("_____");
            }
            if ((i+1)%size == 0) {
                System.out.println();
            }
        }
    }

    // TODO
    public boolean hasMoreSpace() {
        int freeCount = 0;
        for (ActionFigure point:points     ) {
            if(point == null) {
                freeCount++;
            }
        }
        return freeCount >= 2;
    }

    public boolean isPointFree(int hor, int vert) {
        if(getPoint(hor, vert) == null) {
            return true;
        }
        return false;
    }

    public int getSize() {
        return size;
    }

    public void setPoint(int hor, int vert, ActionFigure figure) {
        ActionFigure point = getPoint(hor, vert);
        point = figure;
    }

    private ActionFigure getPoint(int hor, int vert) {
        int i = hor*size + vert;
        return points[i];
    }
}
