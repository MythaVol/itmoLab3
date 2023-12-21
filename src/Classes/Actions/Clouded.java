package Classes.Actions;

import AbstrClasses.Action;
import AbstrClasses.Item;
import AbstrClasses.Person;
import Classes.Items.CloudOfFurious;
import Classes.Items.Mind;
import Enums.ActionDescr;
import Enums.Description;


public class Clouded extends Action {
    public Clouded(Item i1, Item i2, Person p1){
        this.setI2(i2);
        this.setP1(p1);
        this.getP1().addItem(i1);
        this.setName("clouded");
        this.setActSpd(ActionDescr.FAST);

    }

    public void action(){
        this.description();

    }

    public void description() {
        try {
            Thread.sleep(3000/ this.getActSpd().getSpeed());
            System.out.println(this.getP1().getItem(0) + " " + this + " with " + this.getI2().getDescr().getDescr() + " " + this.getI2());
        } catch (InterruptedException e){
            System.out.println(e);
        }
    }
    public String toString(){
        return this.getName() ;
    }
}
