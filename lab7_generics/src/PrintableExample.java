public class PrintableExample {

    interface Printable {
        void print(String msg);
    }

    public static void main(String[] args) {
        Printable printable = new Printable() {
            @Override
            public void print(String msg) {
                System.out.println("Printing message:" + msg);
            }
        };

        printable.print("hello world!");
    }
}
