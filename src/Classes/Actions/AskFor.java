package Classes.Actions;

import AbstrClasses.Action;
import AbstrClasses.Person;

public class AskFor extends Action {
    public AskFor(Person p1, Person p2){
        super(p1, p2);
        this.setName("ask for phone");
    }
    public void action() {
        this.getP1().setStamina(-10);
        this.description();
    }


    public String toString(){
        return this.getName();
    }
}
