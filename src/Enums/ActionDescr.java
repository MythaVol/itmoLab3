package Enums;

public enum ActionDescr {
    SLOW(1),
    NORMAL(2),
    FAST(3);
    private int speed;
    private ActionDescr(int speed){
        this.speed=speed;
    }

    public int getSpeed() {
        return speed;
    }
}
