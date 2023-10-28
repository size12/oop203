package Clothes;

import java.util.List;

public class Studio {
    public void dressWomen(Clothes[] clothes) {
        System.out.println("Одежда для женщин:");
        for (Clothes clothing : clothes) {
            if (clothing instanceof WomenClothes) {
                System.out.println("Размер: " + clothing.size);
                System.out.println("Стоимость: " + clothing.cost);
                System.out.println("Цвет: " + clothing.color);
                ((WomenClothes) clothing).dressWoman();
                System.out.println();
            }
        }
    }

    public void dressMen(Clothes[] clothes) {
        System.out.println("Одежда для мужчин:");
        for (Clothes clothing : clothes) {
            if (clothing instanceof MenClothes) {
                System.out.println("Размер: " + clothing.size);
                System.out.println("Стоимость: " + clothing.cost);
                System.out.println("Цвет: " + clothing.color);
                ((MenClothes) clothing).dressMan();
                System.out.println();
            }
        }
    }
}
