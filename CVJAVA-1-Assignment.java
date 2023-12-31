import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5, 6, 7};

        System.out.println("Original array: " + arrayToString(array));
        shuffleArray(array);

        System.out.println("Shuffled array: " + arrayToString(array));
    }

    private static void shuffleArray(Integer[] arr) {
        Random random = new Random();
        for (int i = arr.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
    }

    private static String arrayToString(Integer[] arr) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
 }
}
