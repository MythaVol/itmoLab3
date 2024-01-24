package Classes.Actions;

import AbstrClasses.Action;
import AbstrClasses.Item;

public class Closed extends Action {
    public Closed(Item i1, Item i2){
        super(i1, i2);
        this.setName("closed");
    }
    public void action() {
        this.description();
    }



    public String toString() {
        return this.getName();
    }
}
