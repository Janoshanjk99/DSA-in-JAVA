package Array;
import java.util.Scanner;
/**
 *
 * @author JANOSH JK
 */
public class remove_a_specific_element {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the element to remove: ");
        int elementToRemove = scanner.nextInt();

        boolean elementFound = false;
        int newSize = 0;

        for (int i = 0; i < size; i++) {
            if (array[i] == elementToRemove) {
                elementFound = true;
            } else {
                array[newSize++] = array[i];
            }
        }

        if (elementFound) {
            System.out.println("Element removed successfully.");

            System.out.println("Array after removal:");
            for (int i = 0; i < newSize; i++) {
                System.out.print(array[i] + " ");
            }
        } else {
            System.out.println("Element not found in the array.");
        }

        scanner.close();
    }
}

