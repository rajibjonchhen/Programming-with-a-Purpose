public class BandMatrix {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);
        for (int i = 0; i < n; i++) {
            String a = "";
            for (int j = 0; j < n; j++) {
                if ((i - (j + width)) > 0 || j > (i + width)) {
                    a += "0" + "  ";
                } else {
                    a += "*" + "  ";
                }
            }
            System.out.println(a);
        }
    }
}