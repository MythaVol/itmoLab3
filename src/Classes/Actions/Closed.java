package Classes.Actions;

import AbstrClasses.Action;
import AbstrClasses.Item;

public class Closed extends Action {
    public Closed(Item i1, Item i2){
        super(i1, i2);
        this.setName("closed");
    }
    public void action() {
        this.description();
    }


    public void description() {
        try {
            Thread.sleep(3000/ this.getActSpd().getSpeed());
            System.out.println(this.getI1().toString() + " " + this + " " + this.getI2().getDescr().getDescr() + " " + this.getI2());
        } catch (InterruptedException e){
            System.out.println(e);
        }
    }


    public String toString() {
        return this.getName();
    }
}
