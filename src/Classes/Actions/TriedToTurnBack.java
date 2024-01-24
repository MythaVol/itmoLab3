package Classes.Actions;

import AbstrClasses.Action;
import AbstrClasses.Item;

public class TriedToTurnBack extends Action {
    public TriedToTurnBack(Item i1,Item i2){
        super(i1, i2);
        this.setName("tried to turn back");
    }
    public void action() {
        this.description();
    }


    public String toString() {
        return this.getName();
    }
}
