package Classes.Actions;

import AbstrClasses.Action;
import AbstrClasses.Item;
import AbstrClasses.Person;

public class Losing extends Action {
    public Losing(Item i1,Item i2){
        super(i1, i2);
        this.setName("losing");
    }
    public void action() {
        this.description();
    }


    public String toString() {
        return this.getName();
    }
}
