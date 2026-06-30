import java.util.Scanner;

public class PairSum {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Step 1: Array size
        System.out.print("Enter number of elements: ");
        int size = input.nextInt();

        int[] numbers = new int[size];

        // Step 2: Input elements
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        // Step 3: Target sum
        System.out.print("Enter target sum: ");
        int target = input.nextInt();

        boolean found = false;

        // Step 4: Brute force search
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {

                if (numbers[i] + numbers[j] == target) {

                    System.out.println("\nPair Found!");
                    System.out.println("Index " + i + " -> " + numbers[i]);
                    System.out.println("Index " + j + " -> " + numbers[j]);
                    System.out.println(numbers[i] + " + " + numbers[j] + " = " + target);

                    found = true;
                    break;
                }
            }

            if (found) break;
        }

        if (!found) {
            System.out.println("\nNo pair found.");
        }

        input.close();
    }
}
