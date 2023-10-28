package Clothes;

public class TShirt extends Clothes implements MenClothes, WomenClothes {
    public TShirt(Size size, double cost, Color color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Одеваем мужчину в футболку");
    }

    @Override
    public void dressWoman() {
        System.out.println("Одеваем женщину в футболку");
    }
}
