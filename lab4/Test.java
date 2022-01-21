public class Test {
    public static void main(String[] args) {
        Point[] b = new Point[] {
                new Point(1.0, 2.0, 3.1),
                new Point(1.0, 4.0, 3.1),
                new Point(3.2, 4.7, 5.23),
                new Point(4.35, 5.9, 6.5),
                new Point(3.0, 2.0, 3.1)
        };
        Points points = new Points(b);
        for(Double s : points) {
            System.out.println(s);
        }
    }
}

