package Adapter;

import Adapter.adapters.BinaryAdapter;
import Adapter.adapters.DecimalAdapter;
import Adapter.interfaces.Binary;
import Adapter.interfaces.Decimal;
import Singleton.Server;

public class Main {
    public static void main(String[] args) {

        Binary binary = new Adapter.impl.Binary("101");
        System.out.println(binary.getBinary());

        Decimal decimal = new Adapter.impl.Decimal("100");
        System.out.println(decimal.getDecimal());

        BinaryAdapter decimalByAdapter = new BinaryAdapter(binary);
        System.out.println(decimalByAdapter.getDecimal());

        DecimalAdapter binaryByAdapter = new DecimalAdapter(decimal);
        System.out.println(binaryByAdapter.getBinary());

    }
}
