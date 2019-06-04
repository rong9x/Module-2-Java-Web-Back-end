import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.println("Enter size of array: ");
            size = input.nextInt();
            if (size > 20) {
                System.out.println("Size should exceed 20");
            }
        } while (size > 20);
        array = new int[size];//create array with size
        int i = 0;
        //push elements into array
        while (i < array.length) {
            System.out.println("Enter element " + (i + 1) + ":");
            array[i] = input.nextInt();
            i++;
        }
        //Print array
        for (i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ": " + array[i]);
        }
        //Reverse array
        for (int k = 0; k < array.length / 2; k++) {
            int temp = array[k];
            array[k] = array[size - 1 - k];
            array[size - 1 - k] = temp;
        }
        //Print reversed array
        System.out.println("Reversed array");
        for (int k = 0; k < array.length; k++) {
            System.out.println("Element " + k + ": " + array[k]);
        }
    }
}