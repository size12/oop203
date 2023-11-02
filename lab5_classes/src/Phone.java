import java.lang.String;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Phone {
    private int number;
    private String model;
    private double weight;

    public int getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }

    public Phone(int number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight=weight;
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {}

    public void receiveCall(String name, int number) {
        System.out.println("Звонит: " + name + "\nНомер:" + number);
    }

    public void sendMessage(int... numbers) {
        System.out.println(Arrays.stream(numbers).mapToObj(a -> "Отправляем СМС на номер:" + a).collect(Collectors.joining("\n")));
    }

    public static void main(String[] args) {

        Phone Samsung = new Phone(1234,"GT-5250",110);
        Phone Pixel = new Phone(2422,"3a",120);
        Phone iPhone = new Phone(53535,"15 Pro Max",130);

        System.out.println("Samsung: " + Samsung);
        System.out.println("Honor: " + Pixel);
        System.out.println("iPhone: " + iPhone);

        Samsung.receiveCall("Mom");
        Samsung.getNumber();

        Pixel.receiveCall("Danya");
        Pixel.getNumber();

        iPhone.receiveCall("Ruslan");
        iPhone.getNumber();

        Pixel.sendMessage(1, 2, 3, 4, 6);

    }
}
