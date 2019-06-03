import java.util.Scanner;

public class Print20PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to print: ");
        int number = input.nextInt();
        int count = 0;
        for (int i = 2; i <= 100; i++) {
            boolean check = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
            }
            if (check && count < number) {
                System.out.println(i);
                count++;
            }
        }
    }
}
