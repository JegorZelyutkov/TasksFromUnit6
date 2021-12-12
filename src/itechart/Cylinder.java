package itechart;

public class Cylinder extends  Circle {

    private final Circle circle;
    private final double height;

    public Cylinder(double height, double radius) {
        super();
        if (height > 0) {
            this.height = height;
        } else {
            this.height = 0;
        }

        circle = new Circle();
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return height * circle.getArea();
    }
}