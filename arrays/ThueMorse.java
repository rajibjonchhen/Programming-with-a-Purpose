public class ThueMorse {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java ThueMorse n");
            return;
        }

        int n = Integer.parseInt(args[0]);
        
        // Create the Thue-Morse sequence
        int[] thueMorseSequence = generateThueMorseSequence(n * n);
        
        // Generate the n-by-n pattern based on the Thue-Morse sequence
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                char patternChar = thueMorseSequence[i * n + j] == 0 ? '+' : '-';
                System.out.print(patternChar + " ");
            }
            System.out.println(); // Move to the next line for the next row
        }
    }

    // Function to generate the Thue-Morse sequence of length 'length'
    private static int[] generateThueMorseSequence(int length) {
        int[] sequence = new int[length];
        sequence[0] = 0;
        
        for (int i = 1; i < length; i++) {
            sequence[i] = sequence[i / 2] ^ (i % 2);
        }
        
        return sequence;
    }
}
