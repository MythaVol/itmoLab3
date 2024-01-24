package Classes.Actions;

import AbstrClasses.Action;
import AbstrClasses.Person;

public class Looked extends Action {
    public Looked(Person p1, Person p2){
        super(p1, p2);
        this.setName("looked on");
    }
    public void action() {
        this.description();
    }



    public String toString() {
        return this.getName();
    }
}
