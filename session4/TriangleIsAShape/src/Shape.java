public class Shape {
    private String color;
    private boolean filled;

    public Shape() {
        this.color = "green";
        this.filled = true;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    void setColor(String color) {
        this.color = color;
    }

    String getColor() {
        return this.color;
    }

    void setFilled(boolean filled) {
        this.filled = filled;
    }

    boolean isFilled() {
        return this.filled;
    }

    @Override
    public String toString() {
        return "A Shape with color of "
                + this.color
                + " and "
                + (isFilled() ? "filled" : "not filled");
    }
}
