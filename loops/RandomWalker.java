public class RandomWalker {
    public static void main(String[] args) {
        int distance = Integer.parseInt(args[0]);
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
            System.out.println("(" + x + "," + y + ")");
        }
        System.out.println("steps = " + steps);
    }
}