package Proxy;

import Proxy.entity.Person;
import Proxy.entity.Room;
import Proxy.impl.Bathroom;
import Proxy.impl.Door;
import Proxy.impl.RoomAccessor;

public class Main {

    public static void main(String[] args){
        Person me = new Person("Alexey");

        Room bathroom = new Bathroom();
        Door door = new Door();

        Room privateBathroom = new RoomAccessor(bathroom, door);

        privateBathroom.come(me);
        door.lock();
        privateBathroom.come(me);
    }
}
