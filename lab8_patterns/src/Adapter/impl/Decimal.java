package Adapter.impl;

public class Decimal implements Adapter.interfaces.Decimal {
    String value;
    public Decimal(String value) {
        this.value = value;
    }
    @Override
    public String getDecimal() {
        return value;
    }
}
