package Classes.Actions;

import AbstrClasses.Action;
import AbstrClasses.Item;

public class Sounded extends Action {
    public Sounded(Item i1, Item i2){
        super(i1, i2);
        this.setName("sounded in");
    }
    public void action() {
        this.description();
    }

    public String toString(){
        return this.getName();
    }


}
