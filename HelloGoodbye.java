public class HelloGoodbye {
    public static void main(String[] args){  
        String name1 = args[0];
        String name2 = args[1];
    
        System.out.println("Hello " + name1 + " and " + name2);
        String temp = name1;
        name1 = name2;
        name2 = temp;
        System.out.println("Goodbye " + name1 + " and " + name1);
    }
}