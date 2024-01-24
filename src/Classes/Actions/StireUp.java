package Classes.Actions;

import AbstrClasses.Action;
import AbstrClasses.Person;
import Classes.Items.Box;

public class StireUp extends Action {
    public StireUp(Person p1){
        super(p1);
        this.setName("stire up");
        this.setI1(new Box("boxes"));
    }
    public void action() {
        this.getP1().setStamina(-20);
        this.description();
    }

    public String toString(){
        return this.getName();
    }
}
