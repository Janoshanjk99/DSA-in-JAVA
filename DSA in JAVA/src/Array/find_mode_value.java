package Array;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author JANOSH JK
 */
public class find_mode_value {
    public static void main(String[] args) {
        int[] numbers = {3, 7, 2, 1, 8, 4, 5, 2, 4, 7, 4};

        Map<Integer, Integer> countMap = new HashMap<>();

        for (int number : numbers) {
            countMap.put(number, countMap.getOrDefault(number, 0) + 1);
        }

        int mode = 0;
        int maxCount = 0;

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                mode = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        System.out.println("Mode of the array is: " + mode);
    }
}

