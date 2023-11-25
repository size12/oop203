package Adapter.adapters;

import Adapter.interfaces.Binary;
import Adapter.interfaces.Decimal;

public class BinaryAdapter implements Decimal {

    Binary value;

    public BinaryAdapter(Binary value) {
        this.value = value;
    }

    @Override
    public String getDecimal() {

        String binaryString = value.getBinary();
        Integer decimal = Integer.parseInt(binaryString, 2);

        return decimal.toString();
    }
}
