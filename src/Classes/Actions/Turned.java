package Classes.Actions;

import AbstrClasses.Action;
import AbstrClasses.Person;

public class Turned extends Action {
    public Turned(Person p1,Person p2){
        super(p1, p2);
        this.setName("turned");
    }
    public void action() {
        this.description();
    }


    public String toString() {
        return this.getName();
    }
}
