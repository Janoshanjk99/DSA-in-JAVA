package Array;

/**
 *
 * @author JANOSH JK
 */
public class average_array {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            sum += numbers[i];
        }

        double average = (double) sum / numbers.length;

        System.out.println("Average of the array elements: " + average);
    }
}
