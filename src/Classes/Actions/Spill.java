package Classes.Actions;

import AbstrClasses.Action;
import AbstrClasses.Person;
import Classes.Items.Beer;

public class Spill extends Action {
    public Spill(Person p1){
        super(p1);
        this.setName("spill");
        this.setI1(new Beer("beer"));
    }
    public void action() {
        this.description();
        this.getP1().setStamina(-10);
    }


    public String toString(){
        return this.getName();
    }
}
