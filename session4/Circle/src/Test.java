public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5, "blue");
        System.out.println(circle);

        Cylinder cylinder = new Cylinder(10, 1, "red");
        System.out.println(cylinder);

        cylinder.setHeight(5);
        cylinder.setColor("gray");
        System.out.println(cylinder);
    }
}
