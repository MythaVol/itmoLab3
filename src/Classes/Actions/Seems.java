package Classes.Actions;

import AbstrClasses.Action;
import AbstrClasses.Item;
import AbstrClasses.Person;
import Classes.Items.Everything;
import Classes.Items.Long;
import Enums.ActionDescr;

public class Seems extends Action {
    public Seems(Item i1, Item i2){
        super(i1, i2);
        this.setName("seems");
        this.setActSpd(ActionDescr.FAST);
    }


    public void action() {
        this.description();
    }


    public void description() {
        try {
            Thread.sleep(3000/ this.getActSpd().getSpeed());
            System.out.println(this.getI1() + " " + this.getName() + " " + this.getI2());
        } catch (InterruptedException e){
            System.out.println(e);
        }
    }
    public String toString(){
        return this.getName();
    }
}
