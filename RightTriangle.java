public class RightTriangle {
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        double a2 = Math.pow(a, 2);
        double b2 = Math.pow(b, 2);
        double c2 = Math.pow(c, 2);
        boolean rightAngleTriangle = (a2 == b2 + c2) || (b2 == a2 + c2) || (c2 == a2 + b2);
        rightAngleTriangle = rightAngleTriangle && a > 0 && b > 0 && c > 0;
        System.out.println(rightAngleTriangle);
    }
}