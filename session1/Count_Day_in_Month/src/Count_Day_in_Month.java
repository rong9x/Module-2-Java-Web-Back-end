import java.util.Scanner;

public class Count_Day_in_Month {
    public static void main(String[] args) {
        System.out.println("Count day in month, please enter a month");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        String daysinmonth;
        switch (month) {
            case 2:
                daysinmonth = "28 or 29";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysinmonth = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysinmonth = "30";
                break;
            default:
                daysinmonth = "";
        }

        if (daysinmonth != "") {
            System.out.printf("The month '%d' has %s days!", month, daysinmonth);
        }
        else {
            System.out.println("Invalid input");
        }
    }
}
