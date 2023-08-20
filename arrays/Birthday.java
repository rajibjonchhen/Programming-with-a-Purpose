public class Birthday {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java Birthday n trials");
            return;
        }

        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);

        int[] count = new int[n + 2]; // One more for counting values greater than or equal to n + 1

        for (int t = 0; t < trials; t++) {
            boolean[] birthdays = new boolean[n]; // Each index represents a day

            int people = 0;

            while (true) {
                int newBirthday = (int) (Math.random() * n); // Choose a birthday from 0 to n-1

                if (birthdays[newBirthday]) {
                    // If the birthday is already present in the room, break the loop
                    break;
                }

                birthdays[newBirthday] = true;
                people++;
            }

            count[Math.min(people, n + 1)]++;
        }

        double fractionSum = 0.0;
        int i = 1;

        System.out.println("People\tCount\tFraction");

        while (fractionSum < 0.5) {
            fractionSum += (double) count[i] / trials;
            System.out.printf("%d\t%d\t%.4f%n", i, count[i], fractionSum);
            i++;
        }
    }
}
