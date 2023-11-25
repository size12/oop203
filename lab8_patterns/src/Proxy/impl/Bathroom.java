package Proxy.impl;

import Proxy.entity.Person;
import Proxy.entity.Room;

public class Bathroom implements Room {
    @Override
    public void come(Person person) {
        System.out.println("User " + person.getName() + " came to bathroom");
    }
}
