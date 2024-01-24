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
        this.setName("clouded with");
        this.setActSpd(ActionDescr.FAST);

    }

    public void action(){
        this.description();
    }

    public String toString(){
        return this.getName() ;
    }
}
