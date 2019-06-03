import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter USD to convert: ");
        int usd = input.nextInt();
        int rate = 23000;
        int vnd = usd * rate;
        System.out.println(usd + "$ = " + vnd +"VNĐ");
    }
}
