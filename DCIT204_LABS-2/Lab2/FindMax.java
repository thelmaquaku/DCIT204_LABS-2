import java.util.Scanner;

public class FindMax {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Step 1: Get array size
        System.out.print("Enter number of elements: ");
        int size = input.nextInt();

        int[] numbers = new int[size];

        // Step 2: Input array elements
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        // Step 3: Assume first element is max
        int max = numbers[0];
        int maxIndex = 0;

        // Step 4: Find max value
        for (int i = 1; i < size; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                maxIndex = i;
            }
        }

        // Step 5: Output result
        System.out.println("\nMaximum Value: " + max);
        System.out.println("Index: " + maxIndex);

        input.close();
    }
}
