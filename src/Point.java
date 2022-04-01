public class Point {

    private String label;
    private int x;
    private int y;

    public Point(String label, int x, int y) {
        this.label = label;
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || !(o instanceof Point)) {
            return false;
        }
        Point p = (Point) o;
        return this.x == p.x && this.y == p.y;
    }

    @Override
    public String toString() {
        return "Point " + label + " is at x = " + x + ", y = " + y;
    }

}