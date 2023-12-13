package Classes.Actions;

import AbstrClasses.Action;
import AbstrClasses.Person;
import Enums.ActionDescr;

public class Stepped extends Action {
    public Stepped(Person p1, Person p2){
        super(p1, p2);
        this.setName("stepped to");
        this.setActSpd(ActionDescr.SLOW);
    }
    public void action() {
        this.description();
    }


    public void description() {
        try {
            Thread.sleep(3000/ this.getActSpd().getSpeed());
            System.out.println(this.getP1().getName() + " " + this + " " + this.getP2().getName());
        } catch (InterruptedException e){
            System.out.println(e);
        }
    }
    public String toString(){
        return this.getName();
    }
}
