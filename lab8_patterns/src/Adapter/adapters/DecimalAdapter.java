package Adapter.adapters;

import Adapter.interfaces.Binary;
import Adapter.interfaces.Decimal;

public class DecimalAdapter implements Binary {

    Decimal value;

    public DecimalAdapter(Decimal value) {
        this.value = value;
    }

    @Override
    public String getBinary() {

        String decimalString = value.getDecimal();
        Integer decimal = Integer.parseInt(decimalString);

        return Integer.toBinaryString(decimal);
    }
}
