import java.util.Scanner;

public class PushElementIntoArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] myArray = {10, 4, 6, 7, 0};
        System.out.println("Enter a number to insert: ");
        int number = input.nextInt();
        int index;
        do {
            System.out.println("And you want insert it to index number?");
            index = input.nextInt();
            if (index <= 1 || index >= myArray.length-1) {
                System.out.println("Can't insert");
            }
        } while (index <= 1 || index >= myArray.length-1);

        for (int i = myArray.length-1; i > index; i--) {
            myArray[i] = myArray[i - 1];
        }
        myArray[index] = number;

        System.out.println("New array: ");
        for(int i=0; i < myArray.length; i++) {
            System.out.println("Element " + i + ": " + myArray[i]);
        }
    }
}
