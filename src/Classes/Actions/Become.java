package Classes.Actions;

import AbstrClasses.Action;
import AbstrClasses.Item;
import Enums.ActionDescr;

public class Become extends Action {
    public Become(Item i1){
        this.setI1(i1);
        this.setName("become");
        this.setActSpd(ActionDescr.NORMAL);
    }
    public void action() {
        this.description();
    }

    public void description() {
        try {
            Thread.sleep(3000/ this.getActSpd().getSpeed());
            System.out.println(this.getI1().getName() + " " + this + " " + this.getI1().getDescr().getDescr());
        } catch (InterruptedException e){
            System.out.println(e);
        }
    }

    public String toString() {
        return this.getName();
    }
}
