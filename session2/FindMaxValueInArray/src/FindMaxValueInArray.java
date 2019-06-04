import java.util.Scanner;

public class FindMaxValueInArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner input = new Scanner(System.in);
        //check size of array
        do {
            System.out.println("Enter a size: ");
            size = input.nextInt();
            if (size > 20) {
                System.out.println("Size should not exceed 20");
            }
        } while (size > 20);
        //Enter element
        array = new int[size];//create array with size
        int i = 0;
        while (i < array.length) {
            System.out.println("Enter element " + (i + 1) + ":");
            array[i] = input.nextInt();
            i++;
        }
        //Print array
        System.out.println("Property list: ");
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j] + "\t");
        }
        //Find max value
        int max = array[0];
        int index = 0;
        for (int k = 0; k < array.length; k++) {
            if (max < array[k]) {
                max = array[k];
                index = k + 1;
                break;
            }
        }
        System.out.println("Max value is: " + max + " at position: " + index);
    }
}
