package Clothes;

public class Main {
    public static void main(String[] args) {
        Clothes[] clothingArray = new Clothes[3];
        clothingArray[0] = new TShirt(Size.M, 29.99, Color.RED);
        clothingArray[1] = new Trousers(Size.L, 49.99, Color.BROWN);
        clothingArray[2] = new Skirt(Size.S, 39.99, Color.BLACK);

        Studio atelier = new Studio();
        atelier.dressWomen(clothingArray);
        atelier.dressMen(clothingArray);
    }
}