public class Test {
    public static void main(String[] args) {
        Point point = new Point(2.0f, 3.5f);
        point.setXY(2.0f, 3.5f);
        System.out.println(point);

        MovablePoint movablePoint = new MovablePoint(1.0f, 1.0f, 2.0f, 2.0f);
        movablePoint.setXY(1.0f, 1.0f);
        movablePoint.setSpeed(2.0f, 2.0f);
        System.out.println(movablePoint);
        movablePoint.move();
        //System.out.println(movablePoint);
        System.out.println("New X: " + movablePoint.getX());
        System.out.println("New Y: " + movablePoint.getY());
    }
}