package Classes.Actions;

import AbstrClasses.Action;
import AbstrClasses.Person;

public class AskFor extends Action {
    public AskFor(Person p1, Person p2){
        super(p1, p2);
        this.setName("ask");
    }
    public void action() {
        this.getP1().setStamina(-10);
        this.description();
    }


    public void description() {
        try {
            Thread.sleep(3000/ this.getActSpd().getSpeed());
            System.out.println(this);
        } catch (InterruptedException e){
            System.out.println(e);
        }
    }

    public String toString(){
        return this.getP1().getName() + " " + this.getName() + " " + this.getP2().getName() + " for phone";
    }
}
