package Classes.Actions;

import AbstrClasses.Action;
import AbstrClasses.Item;
import AbstrClasses.Person;

public class Bent extends Action {
    public Bent(Person p1, Item i1){
        this.setP1(p1);
        this.setI1(i1);
        this.setName("bent");
        this.setActSpd(this.getP1().getActionSpeed());
    }
    public void action() {
        this.description();
    }

    public String toString(){
        return this.getName();
    }
}
