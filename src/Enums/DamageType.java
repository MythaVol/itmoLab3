package Enums;

public enum DamageType {
    SMALL_PHYSICAL(10,5),
    PHYSICAL(20, 10),
    BIG_PHYSICAL(30,15),
    SMALL_EMOTIONAL(0,10),
    EMOTIONAL(10,20),
    BIG_EMOTIONAL(20,30);
    private final int HPLOSS;
    private final int STMNLOSS;
    private DamageType(int hpLoss, int stmnLoss){
        this.HPLOSS=hpLoss;
        this.STMNLOSS=stmnLoss;
    }

    public int getHpLoss() {
        return HPLOSS;
    }

    public int getStmnLoss() {
        return STMNLOSS;
    }
}
