package Classes.Actions;

import AbstrClasses.Action;
import AbstrClasses.Item;
import AbstrClasses.Person;

public class Losing extends Action {
    public Losing(Item i1,Item i2){
        super(i1, i2);
        this.setName("losing");
    }
    public void action() {
        this.description();
    }

    public void description() {
        try {
            Thread.sleep(3000/ this.getActSpd().getSpeed());
            System.out.println(this.getI1().getName() + " " + this + " " + this.getI2().getName());
        } catch (InterruptedException e){
            System.out.println(e);
        }
    }

    public String toString() {
        return this.getName();
    }
}
