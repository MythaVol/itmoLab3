package Classes.Actions;

import AbstrClasses.Action;
import AbstrClasses.Person;

public class WasStanding extends Action {
    public WasStanding(Person p1){
        super(p1);
        this.setName("was standing");
    }
    public void action() {
        this.description();
    }
}
