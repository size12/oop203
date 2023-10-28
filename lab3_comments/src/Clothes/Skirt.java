package Clothes;

public class Skirt extends Clothes implements WomenClothes {
    public Skirt(Size size, double cost, Color color) {
        super(size, cost, color);
    }

    @Override
    public void dressWoman() {
        System.out.println("Одеваем женщину в юбку");
    }
}