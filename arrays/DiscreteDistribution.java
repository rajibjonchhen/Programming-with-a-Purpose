import java.util.Random;

public class DiscreteDistribution {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java DiscreteDistribution m a1 a2 ... an");
            return;
        }

        int m = Integer.parseInt(args[0]);
        int[] probabilities = new int[args.length - 1];

        // Parse the sequence of positive integer command-line arguments
        for (int i = 0; i < probabilities.length; i++) {
            probabilities[i] = Integer.parseInt(args[i + 1]);
            if (probabilities[i] <= 0) {
                System.out.println("All arguments after m must be positive integers.");
                return;
            }
        }

        // Compute the total sum of probabilities
        int totalSum = 0;
        for (int prob : probabilities) {
            totalSum += prob;
        }

        // Create a random number generator
        Random random = new Random();

        // Generate m random indices based on the probabilities
        for (int i = 0; i < m; i++) {
            int randomValue = random.nextInt(totalSum) + 1; // Add 1 to avoid generating 0
            int selectedIndex = -1;

            // Find the index corresponding to the selected value
            for (int j = 0; j < probabilities.length; j++) {
                randomValue -= probabilities[j];
                if (randomValue <= 0) {
                    selectedIndex = j;
                    break;
                }
            }

            System.out.print(selectedIndex + " ");
        }

        System.out.println(); // Print a new line at the end
    }
}
