import java.util.Scanner;//Import the Scaner class

public class RectangleProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//Create a Scanner object

        System.out.println("Enter width: ");
        float width = scanner.nextFloat();//read user input

        System.out.println("Enter height: ");
        float height = scanner.nextFloat();//read user input

        float area = width * height;
        System.out.println("Area is: " + area);//output user input
    }
}
