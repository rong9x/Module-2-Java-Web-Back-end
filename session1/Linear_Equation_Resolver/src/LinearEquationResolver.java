import java.util.Scanner;

public class LinearEquationResolver{
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = 0', please enter constants:");

        Scanner myobject = new Scanner(System.in);//create object of class Scanner

        System.out.println("Enter a: ");
        double a = myobject.nextDouble();
        System.out.println("Enter b: ");
        double b = myobject.nextDouble();

        if (a != 0) {
            double x = -b / a;
            System.out.println("x = " + x);
        }
        else {
            if (b == 0) {
                System.out.println("The solution is all x");
            }
            else {
                System.out.println("No solution");
            }
        }
    }
}