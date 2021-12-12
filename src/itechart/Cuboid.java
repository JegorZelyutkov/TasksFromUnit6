package itechart;

public class Cuboid extends  Rectangle{
    private final Rectangle rectangle;
    private final double height;

    public Cuboid(double height, double width, double length) {
        super();
        this.rectangle = new Rectangle(width, length);

        if (height > 0) {
            this.height = height;
        } else {
            this.height = 0;
        }
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return height * rectangle.getArea();
    }
}
