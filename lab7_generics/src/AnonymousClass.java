import java.awt.*;

public class AnonymousClass {
    public static void main(String[] args) {

        interface Printable {
            void print();
        }

        Printable printer = new Printable() {
            @Override
            public void print() {
                System.out.println("Hello, World!");
            }
        };

        printer.print();
    }
}
