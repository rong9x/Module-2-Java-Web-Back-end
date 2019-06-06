public class Cylinder extends Circle {
    private double height;

    public Cylinder() {

    }

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    double getHeight() {
        return height;
    }

    void setHeight(double height) {
        this.height = height;
    }

    double getVolume() {
        return height * getArea();
    }

    @Override
    public String toString() {
        return "Cylinder with "
                + getRadius()
                + " radius, height is "
                + getHeight()
                + ", color is "
                + getColor()
                + ", area is "
                + getArea()
                + " and volume is "
                + getVolume();
    }
}
