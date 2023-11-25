public class Calculator {
    public static <T extends Number> double sum(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }

    public static <T extends Number> double mult(T a, T b) {
        return a.doubleValue() * b.doubleValue();
    }

    public static <T extends Number> double div(T a, T b) {
        return a.doubleValue() / b.doubleValue();
    }

    public static <T extends Number> double sub(T a, T b) {
        return a.doubleValue() - b.doubleValue();
    }

    public static void main(String[] args) {
        System.out.println("Sum: " + Calculator.sum(1, 2));
        System.out.println("Sub: " + Calculator.sub(1.0, 2.5));
        System.out.println("Mult: " + Calculator.mult(1.3, 6.7));
        System.out.println("Div: " + Calculator.sum(1, 2.0));
    }
}
