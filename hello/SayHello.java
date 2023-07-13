public class SayHello {
    public static void main(String[] args) {
        int numb = Integer.parseInt(args[0]);
        int count = 1;
        while(count <= numb) {
            System.out.println("hello" + " " + count);
            count = count + 1;
        }
    }
}