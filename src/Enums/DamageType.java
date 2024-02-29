package Enums;

public enum DamageType {
    SMALL_PHYSICAL(10),
    PHYSICAL(20),
    BIG_PHYSICAL(30),
    SMALL_EMOTIONAL(5),
    EMOTIONAL(10),
    BIG_EMOTIONAL(20);
    private final int HPLOSS;
    DamageType(int hpLoss){
        this.HPLOSS=hpLoss;
    }

    public int getHpLoss() {
        return HPLOSS;
    }

}
