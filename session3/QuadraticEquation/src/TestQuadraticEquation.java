import java.util.Scanner;

public class TestQuadraticEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a");
        double a = input.nextDouble();
        System.out.println("Enter b");
        double b = input.nextDouble();
        System.out.println("Enter c");
        double c = input.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        double delta = quadraticEquation.getDiscriminant();
        double root1 = quadraticEquation.getRoot1();
        double root2 = quadraticEquation.getRoot2();
        System.out.println("Delta is: " + delta);
        if (delta > 0) {
            System.out.println("Root 1 is: " + root1);
            System.out.println("Root 2 is: " + root2);
        } else if (delta == 0) {
            System.out.println("Root is: " + root1);
        } else {
            System.out.println("The equation has no roots");
        }
    }
}