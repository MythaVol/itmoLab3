package Classes.Actions;

import AbstrClasses.Action;
import AbstrClasses.Person;
import Classes.Items.Door;

public class Open extends Action {
    public Open(Person p1){
        super(p1);
        this.setName("opened");
        this.setI1(new Door("door"));
    }
    public void action() {
        this.getP1().setStamina(-10);
        this.description();
    }

    public String toString(){
        return this.getName();
    }
}
