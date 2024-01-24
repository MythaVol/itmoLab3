package Classes.Actions;

import AbstrClasses.Action;
import AbstrClasses.Item;
import Enums.ActionDescr;

public class DugIn extends Action {
    public DugIn(Item i1,Item i2){
        this.setI1(i1);
        this.setI2(i2);
        this.setName("dug in");
        this.setActSpd(ActionDescr.NORMAL);
    }
    public void action() {
        this.description();
    }

    public String toString() {
        return this.getName();
    }
}
