import java.util.Scanner;

public class CalculateBodyWeightIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Calculate body weight index");
        System.out.println("Enter weight: ");
        double weight = input.nextDouble();
        System.out.println("Enter height (in meter): ");
        double height = input.nextDouble();
        double bmi = weight / Math.pow(height, 2);
        String text = "";
        if (bmi >= 30) {
            text = "Obese";
        } else if (bmi >= 25.0) {
            text = "Overweight";
        } else if (bmi >= 18.5) {
            text = "Normal";
        } else {
            text = "Underweight";
        }
        System.out.println("Your BMI is: " + bmi + " - " + text);
    }
}
