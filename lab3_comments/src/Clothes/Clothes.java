package Clothes;

public abstract class Clothes {
    public Size size;
    public Double cost;
    public Color color;

    public Clothes(Size size, double cost, Color color) {
        this.size = size;
        this.cost = cost;
        this.color = color;
    }
}
