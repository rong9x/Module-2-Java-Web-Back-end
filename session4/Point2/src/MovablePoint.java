public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint() {
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    float getXSpeed() {
        return xSpeed;
    }

    void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    float getYSpeed() {
        return ySpeed;
    }

    void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    float[] arraySpeed;

    void setSpeed(float xSpeed, float ySpeed) {
        arraySpeed = new float[2];
        arraySpeed[0] = xSpeed;
        arraySpeed[1] = ySpeed;
    }

    float[] getSpeed() {
        return arraySpeed;
    }

    String printSpeed() {
        String arr = "";
        for (int i = 0; i < arraySpeed.length; i++) {
            arr += arraySpeed[i] + " ";
        }
        return arr;
    }

    @Override
    public String toString() {
        return "XY = "
                + printXY()
                + ", speed = "
                + printSpeed();
    }

    MovablePoint move() {
        setX(xSpeed);
        setY(ySpeed);
        return this;
    }
}
