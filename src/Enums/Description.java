package Enums;

public enum Description {
    BAD("bad"),
    LONG("long"),
    RED("red");
    private String descr;
    private Description(String descr){
        this.descr=descr;
    }

    public String getDescr() {
        return descr;
    }
}
