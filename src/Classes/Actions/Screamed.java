package Classes.Actions;

import AbstrClasses.Action;
import AbstrClasses.Person;

public class Screamed extends Action {
    public Screamed(Person p1){
        super(p1);
        this.setName("screamed");
    }
    public void action() {
        this.description();
        this.getP1().setHp(-10);
    }


    public String toString() {
        return this.getName();
    }
}
