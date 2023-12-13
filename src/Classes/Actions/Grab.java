package Classes.Actions;

import AbstrClasses.Action;
import AbstrClasses.Item;
import AbstrClasses.Person;

public class Grab extends Action {
    public Grab(Person p1, Item i1){
        this.setP1(p1);
        this.setI1(i1);
        this.setName("grab");
        this.setActSpd(this.getP1().getActionSpeed());
    }
    public void action() {
        this.description();
    }


    public void description() {
        try {
            Thread.sleep(3000/ this.getActSpd().getSpeed());
            System.out.println(this.getP1().getName() + " " + this + " " + this.getI1().getName());
        } catch (InterruptedException e){
            System.out.println(e);
        }
    }
    public String toString(){
        return this.getName();
    }
}
