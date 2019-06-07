public class Point {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point() {

    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    float getX() {
        return x;
    }

    void setX(float x) {
        this.x = x;
    }

    float getY() {
        return y;
    }

    void setY(float y) {
        this.y = y;
    }

    float[] arrayXY;

    void setXY(float x, float y) {
        arrayXY = new float[2];
        arrayXY[0] = x;
        arrayXY[1] = y;
    }

    float[] getXY() {
        return arrayXY;
    }

    String printXY() {
        String arr = "";
        for (int i = 0; i < arrayXY.length; i++) {
            arr += arrayXY[i] + " ";
        }
        return arr;
    }

    @Override
    public String toString() {
        return "X = "
                + getX()
                + ",Y = "
                + getY()
                + ", XY = "
                + printXY();
    }
}
