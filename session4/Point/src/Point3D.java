public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D() {

    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    float getZ() {
        return z;
    }

    void setZ(float z) {
        this.z = z;
    }

    float[] arrayXYZ;

    void setXYZ(float x, float y, float z) {
        arrayXYZ = new float[3];
        arrayXYZ[0] = x;
        arrayXYZ[1] = y;
        arrayXYZ[2] = z;
    }

    String getXYZ() {
        String arr = "";
        for (int i = 0; i < arrayXYZ.length; i++) {
            arr += arrayXYZ[i] + " ";
        }
        return arr;
    }

    @Override
    public String toString() {
        return "X = "
                + getX()
                + ",Y = "
                + getY()
                + ", Z = "
                + getZ()
                + ", XYZ = "
                + getXYZ();
    }
}