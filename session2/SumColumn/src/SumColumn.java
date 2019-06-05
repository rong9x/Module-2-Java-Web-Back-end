import java.util.Scanner;

public class SumColumn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int row = input.nextInt();//x
        System.out.print("Enter number of columns: ");
        int column = input.nextInt();//y
        //create array
        double[][] array = new double[row][column];
        //enter element
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("Array[" + i + "][" + j + "]: ");
                int element = input.nextInt();
                array[i][j] = element;
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
        System.out.println("You want to count column number? ");
        int number = input.nextInt() - 1;
        //Calculate sum of column
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j == number) {
                    sum += array[i][number];
                }
            }
        }
        System.out.println("Sum of column " + (number + 1) + ": " + sum);
    }
}