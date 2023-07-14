public class RandomWalkers {
    public static void main(String[] args) {
        int distance = Integer.parseInt(args[0]);
        int trial = Integer.parseInt(args[1]);
        int count = 0;
        double totalSteps = 0;
        while(count < trial){
            int x = 0;
            int y = 0;
            int steps = 0;
            while(Math.abs(x) + Math.abs(y) != distance){
            double randomPossibility = Math.floor(Math.random()*100);
                if(randomPossibility <= 25){
                    x += 1;
                }else if(randomPossibility <= 50){
                    x -= 1;
                }else if(randomPossibility <= 75){
                    y += 1;
                }else {
                    y -= 1;
                }
                steps++;
            }
            totalSteps += steps;

            count++;
        }
        System.out.println("average number of steps = " + totalSteps/trial);
    }
}