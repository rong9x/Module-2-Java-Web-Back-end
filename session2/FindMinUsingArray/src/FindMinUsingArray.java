public class FindMinUsingArray {
    public static void main(String[] args) {
        int[] myArray = {23, 43432, 58347538, 26351623, -19};
        System.out.println("Min of array is: " + minValue(myArray));
    }

    public static int minValue(int []array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                break;
            }
        }
        return min;
    }
}
