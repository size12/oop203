package Proxy.impl;

import Proxy.entity.Person;
import Proxy.entity.Room;

public class RoomAccessor implements Room {
    private final Room room;
    private final Door door;
    public RoomAccessor(Room room, Door door) {
        this.room = room;
        this.door = door;
    }

    @Override
    public void come(Person person) {
        if (!door.canEnter()) {
            throw new SecurityException("room is locked, can't come");
        }

        this.room.come(person);
    }
}
