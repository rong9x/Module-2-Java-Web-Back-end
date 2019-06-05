import java.util.Scanner;

public class CalMainDiagonal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = input.nextInt();
        //create array
        double[][] array = new double[size][size];
        //enter element
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("Array[" + i + "][" + j + "]: ");
                int number = input.nextInt();
                array[i][j] = number;
            }
        }

        System.out.println("Print array");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        double sum = 0.0;
        //Calculate sum
        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array[i].length; k++) {
                if (i == k) {
                    sum += array[i][k];
                }
            }
        }
        System.out.println("Sum of main diagonal: " + sum);
    }
}