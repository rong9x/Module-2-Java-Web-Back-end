import java.util.Random;

public class ArrayExample {
    public int[] createRandom() {
        Random rd = new Random();
        int[] arr = new int[100];
        System.out.println("Print array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(100);
            System.out.println(arr[i] + " ");
        }
        return arr;
    }
}