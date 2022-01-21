/*50 Последовтельность точек в трёхмерном
пространстве с итератором по длинам отрезков,
соединяющих соседние точки.*/

import java.util.Iterator;

public class Points implements Iterable<Double> {
    Point[] array;
    int len;

    public Points(Point[] a) {
        this.array = a;
        len = a.length;
    }

    public Iterator<Double> iterator() {
        return new PointsIterator();
    }

    private class PointsIterator implements Iterator<Double> {
        private int pos;

        public PointsIterator() {
            pos = 0;
        }

        public boolean hasNext() {
            return pos < len;
        }

        public Double next() {
            pos++;
            if (hasNext()) {
                return Math.sqrt(Math.pow(array[pos].x - array[pos - 1].x, 2) +
                        Math.pow(array[pos].y - array[pos - 1].y, 2) +
                        Math.pow(array[pos].z - array[pos - 1].z, 2));
            }
            else {
                return Math.sqrt( Math.pow(array[pos - 1].x - array[0].x, 2) +
                        Math.pow(array[pos - 1].y - array[0].y, 2) +
                        Math.pow(array[pos - 1].z - array[0].z, 2) );
            }
        }
    }
}
