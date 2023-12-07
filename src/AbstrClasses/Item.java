package AbstrClasses;

import Enums.Description;

public abstract class Item {
    private String name;
    private Description descr;
    public Item(String name){
        this.name=name;
    }
    public Item(String name, Description descr){
        this.name=name;
        this.descr=descr;
    }

    public String getName() {
        return name;
    }

    public Description getDescr() {
        return descr;
    }

    public String toString(){
        return this.name;
    }
}
