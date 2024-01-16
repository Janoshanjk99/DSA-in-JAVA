package Array;

/**
 *
 * @author JANOSH JK
 */
public class min_max_value {
    public static void main(String[] args){
        int[] numbers={12, 34, 5, 123, 45, 65};
        
        int min = numbers[0];
        int max = numbers[0];
        
        for (int i=1; i<6; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Minimum value in the array: " + min);
        System.out.println("Maximum value in the array: " + max);
    }
}

