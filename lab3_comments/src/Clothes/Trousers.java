package Clothes;

public class Trousers extends Clothes implements MenClothes, WomenClothes {
    public Trousers(Size size, double cost, Color color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Одеваем мужчину в брюки");
    }

    @Override
    public void dressWoman() {
        System.out.println("Одеваем женщину в брюки");
    }
}