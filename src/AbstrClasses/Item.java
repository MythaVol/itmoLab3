package AbstrClasses;

import Enums.Description;

import java.util.Objects;

public abstract class Item {
    private String name;
    private Description descr;
    public Item(String name){
        this.name=name;
    }
    public Item(String name, Description descr){
        this.name=descr.getDescr() + " " + name;
        this.descr=descr;
    }

    public String getName() {
        return name;
    }

    public Description getDescr() {
        return descr;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return this.getName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item item)) return false;
        return Objects.equals(name, item.name) && descr == item.descr;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, descr);
    }
}
