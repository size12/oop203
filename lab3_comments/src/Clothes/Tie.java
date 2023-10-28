package Clothes;


public class Tie extends Clothes implements MenClothes {
    public Tie(Size size, double cost, Color color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Одеваем мужчину в галстук");
    }
}
