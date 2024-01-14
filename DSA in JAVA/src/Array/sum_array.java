package Array;

/**
 *
 * @author JANOSH JK
 */
public class sum_array {
    public static void main(String[] args) {
        int[] num_array = {10, 20, 30, 40, 50};
        int sum = 0;
        for (int i = 0; i <= 4; i++) {
            sum += num_array[i];
        }
        System.out.println("Sum of the array elements: " + sum);
    }
}
