package Classes.Actions;

import AbstrClasses.Action;
import AbstrClasses.Person;
import Classes.Items.Foam;

public class Watch extends Action {
    public Watch(Person p1){
        super(p1);
        this.setName("watch");
        this.setI1(new Foam("foam"));

    }
    public void action() {
        this.description();
        this.getP1().setStamina(5);
    }

    public String toString() {
        return this.getName();
    }
}
