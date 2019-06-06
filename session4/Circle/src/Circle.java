public class Circle {
    private double radius;
    private String color;

    public Circle() {

    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    double getRadius() {
        return radius;
    }

    void setRadius(double radius) {
        this.radius = radius;
    }

    String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }

    double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle with "
                + getRadius()
                + " radius, color is "
                + getColor()
                + " and area is "
                + getArea();
    }
}
