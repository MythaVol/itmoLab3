package Classes.Actions;

import AbstrClasses.Action;
import AbstrClasses.Person;

public class Screamed extends Action {
    public Screamed(Person p1){
        super(p1);
        this.setName("screamed");
    }
    public void action() {
        this.description();
        this.getP1().setHp(-10);
    }


    public void description() {
        try {
            Thread.sleep(3000/ this.getActSpd().getSpeed());
            System.out.println(this.getP1().getName() + " " + this);
        } catch (InterruptedException e){
            System.out.println(e);
        }
    }

    public String toString() {
        return this.getName();
    }
}
