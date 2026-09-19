import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        double[] my_array = new double[n];
        double sum = 0;

        System.out.println("Enter the elements (costs): ");
        for (int i=0; i<n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            my_array[i] = scanner.nextDouble();
            sum += my_array[i]; 
        }

        Arrays.sort(my_array);

        double average = (n > 0) ? (sum / n) : 0;

        System.out.println("\n--- RESULTS ---");
        System.out.println("Sorted array: " + Arrays.toString(my_array));
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average of array elements: " + average);

        scanner.close();
    }
}