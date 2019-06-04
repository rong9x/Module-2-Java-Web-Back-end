import java.util.Scanner;

public class CountHighScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.println("Enter a size");
            size = input.nextInt();
            if (size > 30) {
                System.out.println("Size should not exceed 30");
            }
        } while (size > 30);
        array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter mark of student number " + (i + 1));
            int number = input.nextInt();
            array[i] = number;
        }
        int count = 0;
        System.out.println("list of marks: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
            if (array[i] >= 5 && array[i] <= 10) {
                count++;
            }
        }
        System.out.println("The number of student pass exam is: " + count);
    }
}
