import java.util.Scanner;

public class FindLargestElementIn2DimensionalArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of row");
        int rowOfArray = input.nextInt();
        System.out.println("Enter number of column");
        int colOfArray = input.nextInt();

        int[][] myArray = new int[rowOfArray][colOfArray];
        //enter value into array
        for (int r = 0; r < myArray.length; r++) {
            for (int c = 0; c < myArray[r].length; c++) {
                System.out.print("Array["+r+"]["+c+"]: ");
                int number = input.nextInt();
                myArray[r][c] = number;
            }
        }
        //print array
        for (int r = 0; r < myArray.length; r++) {
            for (int c = 0; c < myArray[r].length; c++) {
                System.out.print(myArray[r][c] + "\t");
            }
            System.out.println();
        }
        //find max value
        int maxValue = myArray[0][0];
        int rowOfMax = 0, colOfMax = 0;

        for (int row = 0; row < myArray.length; row++) {
            for (int column = 0; column < myArray[row].length; column++) {
                if (maxValue < myArray[row][column]) {
                    maxValue = myArray[row][column];
                    rowOfMax = row;
                    colOfMax = column;
                }
            }
        }
        System.out.println("Max value is: " + maxValue + " at row: " + rowOfMax + ", col: " + colOfMax);
    }
}
