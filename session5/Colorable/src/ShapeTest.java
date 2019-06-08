public class ShapeTest {
    public static void main(String[] args) {
        //Shape shape = new Shape();
        //System.out.println(shape);

        //shape = new Shape("red", false);
        //System.out.println(shape);

        Shape[] shapes = new Shape[3];
        shapes[0] = new Square(2, "red", true);
        shapes[1] = new Circle();
        shapes[2] = new Rectangle();

        for (Shape sha: shapes) {
            if (sha instanceof Colorable) {
                System.out.println(sha);
                ((Square) sha).howToColor();
            }
            else {
                System.out.println(sha);
            }
        }
    }
}