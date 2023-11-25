package Proxy.impl;

public class Door {
    private boolean locked = false;

    public boolean canEnter() {
        return !locked;
    }

    public void lock() {
        this.locked = true;
    }

    public void unlock() {
        this.locked = false;
    }
}
