import java.util.Random;

public class CountTime {
    public static void main(String[] args) {
        System.out.println("Measure the execution time of the sorting algorithm for 100,000 numbers");
        int[] array = new int[100000];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
        StopWatch stopWatch = new StopWatch();
        stopWatch.getStartTime();
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        stopWatch.getEndTime();
        long timeWatch = stopWatch.getElapsedTime();
        System.out.println("Time elapsed is: " + timeWatch / 1000 + " seconds");
    }
}