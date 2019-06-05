import java.util.Scanner;

public class CombineArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Size of array1: ");
        int size1 = input.nextInt();
        System.out.println("Size of array2: ");
        int size2 = input.nextInt();
        int[] array1 = new int[size1];
        int[] array2 = new int[size2];

        for (int i = 0; i < array1.length; i++) {
            System.out.println("Enter element " + (i + 1) + " of array1: ");
            int number = input.nextInt();
            array1[i] = number;
        }

        for (int i = 0; i < array2.length; i++) {
            System.out.println("Enter element " + (i + 1) + " of array2: ");
            int number = input.nextInt();
            array2[i] = number;
        }

        int[] array3 = new int[array1.length + array2.length];

        for (int j = 0; j < array1.length; j++) {
            array3[j] = array1[j];
        }
        for (int k = array1.length; k < array3.length; k++) {
            array3[k] = array2[k - array1.length];
        }
        for (int g = 0; g < array3.length; g++) {
            System.out.println("Element " + (g + 1) + " of array3: " + array3[g]);
        }
    }
}
