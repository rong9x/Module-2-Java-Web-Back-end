import java.util.Scanner;

public class FindMinInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        int i = 0;
        do {
            System.out.println("Enter size of array");
            size = input.nextInt();
            if (i < 0) {
                System.out.println("Size should lager than 0");
            }
        } while (i < 0);
        int[] array = new int[size];

        for (int j = 0; j < array.length; j++) {
            System.out.println("Enter element " + (j + 1) + ": ");
            int element = input.nextInt();
            array[j] = element;
        }

        for (int j = 0; j < array.length; j++) {
            System.out.println("Element " + (j + 1) + ": " + array[j]);
        }

        System.out.println("Min of array is: " + minValue(array));
    }

    public static int minValue(int []array) {
        int min = array[0];
        for (int k = 1; k < array.length; k++) {
            if (array[k] < min) {
                min = array[k];
            }
        }
        return min;
    }
}
