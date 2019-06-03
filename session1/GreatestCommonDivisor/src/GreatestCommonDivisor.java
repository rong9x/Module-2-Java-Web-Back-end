import  java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = input.nextInt();
        System.out.println("Enter b: ");
        int b = input.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b ==0) {
            System.out.println("Greatest common factor: " + (a + b));
        }
        while (a != b) {
            if (a > b) {
                a = a - b;
            }
            else {
                b = b - a;
            }
        }
        System.out.println("Greatest common factor: " + a);
    }
}
