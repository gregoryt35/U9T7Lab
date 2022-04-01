public class ThreeDPoint extends Point {
    private int z;

    public ThreeDPoint(String label, int x, int y, int z) {
        super(label, x, y);
        this.z = z;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || !(o instanceof ThreeDPoint)) {
            return false;
        }

        ThreeDPoint p = (ThreeDPoint) o;
        return super.equals(p) && this.z == p.z;
    }

    @Override
    public String toString() {
        return super.toString() + ", z = " + z;
    }

}