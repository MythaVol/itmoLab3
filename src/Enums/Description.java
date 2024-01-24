package Enums;

public enum Description {
    BAD("bad"),
    LONG("long"),
    RED("red"),
    ELECTRIC("electric"),
    QUIET("quiet"),
    DEAFENING("deafening"),
    BIG("big");
    private String descr;
    private Description(String descr){
        this.descr=descr;
    }

    public String getDescr() {
        return descr;
    }
}
