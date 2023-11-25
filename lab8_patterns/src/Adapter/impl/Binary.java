package Adapter.impl;

public class Binary implements Adapter.interfaces.Binary {
    String value;

    public Binary(String value) {
        this.value = value;
    }
    @Override
    public String getBinary() {
        return value;
    }
}
