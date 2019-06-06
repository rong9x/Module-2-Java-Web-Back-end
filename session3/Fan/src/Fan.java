public class Fan {
    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {

    }

    int getSpeed() {
        return this.speed;
    }

    void setSpeed(int speed) {
        this.speed = speed;
    }

    double getRadius() {
        return this.radius;
    }

    void setRadius(double radius) {
        this.radius = radius;
    }

    String getColor() {
        return this.color;
    }

    void setColor(String color) {
        this.color = color;
    }

    void turnOn() {
        this.on = true;
    }

    void turnOff() {
        this.on = false;
    }

    public String toString() {
        String message;
        if (on) {
            message = "Speed: " + getSpeed() + ", color: " + getColor() + ", radius: " + getRadius() +
                    ". Fan is on";
        } else {
            message = "Color: " + getColor() + ", radius: " + getRadius() + ". Fan is off";
        }
        return message;
    }
}