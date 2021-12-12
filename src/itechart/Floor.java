package itechart;

public class Floor {
    private final double width;
    private final double length;

    public Floor(double width, double length) {
        if (length > 0) {
            this.length = length;
        } else {
            this.length = 0;
        }

        if (width > 0) {
            this.width = width;
        } else {
            this.width = 0;
        }
    }

    public double getArea() {
        return width * length;
    }
}
