package Classes.Actions;

import AbstrClasses.Action;
import AbstrClasses.Item;
import AbstrClasses.Person;
import Classes.Items.CloudOfFurious;
import Classes.Items.Mind;
import Enums.ActionDescr;
import Enums.Description;


public class Clouded extends Action {
    public Clouded(){
        super();
        this.setName("clouded");
        this.setActSpd(ActionDescr.FAST);

    }

    public void action(){
        this.setI1(new Mind("Jack`s mind"));
        this.setI2(new CloudOfFurious("cloud of furious", Description.RED));
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
        return this.getI1().toString() + " " + this.getName() + " with " + this.getI2().getDescr().getDescr() + " " + this.getI2();
    }
}
