public class Triangle extends Shape {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3, String color, boolean filled) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    void setSide1(double side1) {
        this.side1 = side1;
    }

    double getSide1() {
        return this.side1;
    }

    void setSide2(double side2) {
        this.side2 = side2;
    }

    double getSide2() {
        return this.side2;
    }

    void setSide3(double side3) {
        this.side3 = side3;
    }

    double getSide3() {
        return this.side3;
    }

    private double p;//chu vi
    double getPerimeter() {
        return p = (this.side1 + this.side2 + this.side3);
    }

    private double s;//diện tích
    double getArea() {
        double s = Math.sqrt(p / 2 * (p / 2 - this.side1) * (p / 2 - this.side2) * (p / 2 - this.side3));
        return s;
    }

    @Override
    public String toString() {
        return "Triangle with side 1: "
                + this.side1
                + ", side 2: "
                + this.side2
                + ", side 3: "
                + this.side3
                + ", color: "
                + super.getColor()
                + ", fill: "
                + (super.isFilled() ? "filled" : "not filled")
                + ", perimeter: "
                + this.getPerimeter()
                + ", and area: "
                + this.getArea();
    }
}