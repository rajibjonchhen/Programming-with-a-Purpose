public class HelloGoodbye {
    public static void main(String[] args){  
        System.out.println("Hello" + " " + args[0] + " " + args[1]);
        String temp = args[0];
        args[0] = args[1];
        args[1] = temp;
        System.out.println("Goodbye" + " " + args[0] + " " + args[1]);
    }
}