package Classes.Actions;

import AbstrClasses.Action;
import AbstrClasses.Person;
import Classes.Items.Beer;

public class Sippin extends Action {
    public Sippin(Person p1){
        super(p1);
        this.setName("sippin");
        this.setI1(new Beer("beer"));
    }


    public void action() {
        this.description();
        this.getP1().setHp(-10);
        this.getP1().setStamina(1000000);

    }


    public String toString(){
        return this.getName();
    }
}
