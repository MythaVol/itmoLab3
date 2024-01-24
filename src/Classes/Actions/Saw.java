package Classes.Actions;

import AbstrClasses.Action;
import AbstrClasses.Item;
import AbstrClasses.Person;
import AbstrClasses.Place;
import Classes.Items.Trusiki;
import Classes.Places.Room;
import Enums.Description;
import Enums.Status;

public class Saw extends Action {
    public Saw(Person p1,Person p2){
        super(p1,p2);
        this.setName("saw");
    }

    public void action(){
        this.getP1().setStamina(10);
        this.description();
    }

    public String toString(){
        return this.getName();
    }
}
