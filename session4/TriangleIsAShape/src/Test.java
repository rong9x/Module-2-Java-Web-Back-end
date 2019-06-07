public class Test {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(2.0, 3.0, 4.0, "red", true);
        System.out.println(triangle);

        triangle.setColor("blue");
        triangle.setFilled(false);
        System.out.println(triangle);
    }
}
