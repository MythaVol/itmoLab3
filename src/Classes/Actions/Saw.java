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
    public Saw(Description descr, Person p1, Person p2, Place place, String name){

        super(descr,p1,p2,place,name);
    }
    public Saw(Person p1,Person p2, Item i1){
        super(p1,p2);
        this.setName("saw");
        this.getP2().addItem(i1);
    }
    public void action(){
        this.getP1().setStamina(10);
        this.getP2().setStatus(Status.SMILING);
        this.description();
    }
    public void description() {
        try {
            Thread.sleep(3000/ this.getActSpd().getSpeed());
            System.out.println(this.getP1().getName() + " " + this + " " + this.getP2().getName() + " in " + this.getP2().getItem(0).toString());
        } catch (InterruptedException e){
            System.out.println(e);
        }

    }

    public String toString(){
        return this.getName();
    }
}
