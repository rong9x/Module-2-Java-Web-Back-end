public class Test {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(3.0f, 5.0f);
        point2D.setXY(3.0f, 5.0f);
        System.out.println(point2D);

        Point3D point3D = new Point3D(7.0f, 8.5f, 9.9f);
        point3D.setXYZ(7.0f, 8.5f, 9.9f);
        System.out.println(point3D);
    }
}
