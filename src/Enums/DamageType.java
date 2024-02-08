package Enums;

public enum DamageType {
    SMALL_PHYSICAL(10,5),
    PHYSICAL(20, 10),
    BIG_PHYSICAL(30,15),
    SMALL_EMOTIONAL(0,10),
    EMOTIONAL(5,20),
    BIG_EMOTIONAL(10,30);
    private int hpLoss;
    private int stmnLoss;
    private DamageType(int hpLoss, int stmnLoss){
        this.hpLoss=hpLoss;
        this.stmnLoss=stmnLoss;
    }

    public int getHpLoss() {
        return hpLoss;
    }

    public int getStmnLoss() {
        return stmnLoss;
    }
}
