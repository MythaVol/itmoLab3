package Classes.Actions;

import AbstrClasses.Action;
import AbstrClasses.Item;

public class Swallow extends Action {
    public Swallow(Item i1,Item i2){
        super(i1, i2);
        this.setName("swallow");
    }
    public void action() {
        this.description();
    }


    public String toString() {
        return this.getName();
    }
}
