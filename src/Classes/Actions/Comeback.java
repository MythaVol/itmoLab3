package Classes.Actions;

import AbstrClasses.Action;
import AbstrClasses.Person;
import Classes.Places.Room;
import Enums.Description;
import AbstrClasses.Place;



public class Comeback extends Action {
    public Comeback(Description descr, Person p1, Person p2,Place place,String name){

        super(descr,p1,p2,place,name);
    }
    public Comeback(Person p1){
        super(p1);
        this.setName("Comeback");
        this.setPlace(new Room("Room"));
    }

    public void action(){
        this.getP1().setStamina(-10);
        this.getPlace().addP(this.getP1());
        this.description();

    }
    public void description() {
        try {
            Thread.sleep(3000/ this.getActSpd().getSpeed());
            System.out.println(this.getP1().getName() + this + this.getPlace().getName());
        } catch (InterruptedException e){
            System.out.println(e);
        }

    }

    public String toString(){
        return " comeback in ";
    }
}
