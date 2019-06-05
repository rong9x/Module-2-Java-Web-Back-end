import java.util.Scanner;

public class RemoveElementFromArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = {10, 4, 6, 7, 8, 6, 0, 0, 0, 0};
        System.out.println("Enter number you want to delete");
        int number = input.nextInt();
        int indexDel = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                indexDel = i;
                for (int j = indexDel; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
            }
        }
        if (indexDel == 0) {
            System.out.println("Number not found");
        } else {
            for (int i = 0; i < array.length; i++) {
                System.out.println("Element " + (i + 1) + ": " + array[i]);
            }
        }
    }
}
