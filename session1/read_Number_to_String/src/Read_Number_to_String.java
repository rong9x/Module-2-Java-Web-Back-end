import java.util.Scanner;

public class Read_Number_to_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to read: ");
        int number = scanner.nextInt();
        if (number < 0 || number >= 1000) {
            System.out.println("out of ability");
        }
        else if (number < 10) {
            switch (number) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
        }
        else if (number < 20) {
            int mod = number % 10;
            switch (mod) {
                case 0:
                    System.out.println("Ten");
                    break;
                case 1:
                    System.out.println("Eleven");
                    break;
                case 2:
                    System.out.println("Twelfth");
                    break;
                case 3:
                    System.out.println("Thirteen");
                    break;
                case 4:
                    System.out.println("Fourteen");
                    break;
                case 5:
                    System.out.println("Fifteen");
                    break;
                case 6:
                    System.out.println("Sixteen");
                    break;
                case 7:
                    System.out.println("Seventeen");
                    break;
                case 8:
                    System.out.println("Eighteen");
                    break;
                case 9:
                    System.out.println("Nineteen");
                    break;
            }
        }
        else if (number < 100) {
            String str = "";
            int tens = number /10;
            int ones = number % 10;
            switch (tens) {
                case 2:
                    str += "Twenty";
                    break;
                case 3:
                    str += "Thirty";
                    break;
                case 4:
                    str += "Forty";
                    break;
                case 5:
                    str += "Fifty";
                    break;
                case 6:
                    str += "Sixty";
                    break;
                case 7:
                    str += "Seventy";
                    break;
                case 8:
                    str += "Eighty";
                    break;
                case 9:
                    str += "Ninety";
                    break;
            }
            switch (ones) {
                case 0:
                    str += "";
                    break;
                case 1:
                    str += " One";
                    break;
                case 2:
                    str += " Two";
                    break;
                case 3:
                    str += " Three";
                    break;
                case 4:
                    str += " Four";
                    break;
                case 5:
                    str += " Five";
                    break;
                case 6:
                    str += " Six";
                    break;
                case 7:
                    str += " Seven";
                    break;
                case 8:
                    str += " Eight";
                    break;
                case 9:
                    str += " Nine";
                    break;
            }
            System.out.println(str);
        }
        else if (number < 1000) {
            String str = "";
            int hundreds = number / 100;
            int tens = number / 10 % 10;
            int ones = number % 10;
            if (tens == 0 && ones ==0) {
                switch (hundreds) {
                    case 1:
                        str += "One hundred";
                        break;
                    case 2:
                        str += "Two hundred";
                        break;
                    case 3:
                        str += "Three hundred";
                        break;
                    case 4:
                        str += "Four hundred";
                        break;
                    case 5:
                        str += "Five hundred";
                        break;
                    case 6:
                        str += "Six hundred";
                        break;
                    case 7:
                        str += "Seven hundred";
                        break;
                    case 8:
                        str += "Eight hundred";
                        break;
                    case 9:
                        str += "Nine hundred";
                        break;
                }
            }
            else {
                switch (hundreds) {
                    case 1:
                        str += "One hundred and ";
                        break;
                    case 2:
                        str += "Two hundred and ";
                        break;
                    case 3:
                        str += "Three hundred and ";
                        break;
                    case 4:
                        str += "Four hundred and ";
                        break;
                    case 5:
                        str += "Five hundred and ";
                        break;
                    case 6:
                        str += "Six hundred and ";
                        break;
                    case 7:
                        str += "Seven hundred and ";
                        break;
                    case 8:
                        str += "Eight hundred and ";
                        break;
                    case 9:
                        str += "Nine hundred and ";
                        break;
                }
                switch (tens) {
                    case 2:
                        str += "twenty";
                        break;
                    case 3:
                        str += "thirty ";
                        break;
                    case 4:
                        str += "forty";
                        break;
                    case 5:
                        str += "fifty";
                        break;
                    case 6:
                        str += "sixty";
                        break;
                    case 7:
                        str += "seventy";
                        break;
                    case 8:
                        str += "eighty";
                        break;
                    case 9:
                        str += "ninety";
                        break;
                }
                switch (ones) {
                    case 0:
                        str += "";
                        break;
                    case 1:
                        str += " one";
                        break;
                    case 2:
                        str += " two";
                        break;
                    case 3:
                        str += " three";
                        break;
                    case 4:
                        str += " four";
                        break;
                    case 5:
                        str += " five";
                        break;
                    case 6:
                        str += " six";
                        break;
                    case 7:
                        str += " seven";
                        break;
                    case 8:
                        str += " eight";
                        break;
                    case 9:
                        str += " nine";
                        break;
                }
            }
            System.out.println(str);
        }
    }
}
