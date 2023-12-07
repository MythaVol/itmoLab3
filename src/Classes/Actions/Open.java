package Classes.Actions;

import AbstrClasses.Action;
import AbstrClasses.Person;
import Classes.Items.Door;

public class Open extends Action {
    public Open(Person p1){
        super(p1);
        this.setName("opened");
        this.setI1(new Door("door"));
    }
    public void action() {
        this.getP1().setStamina(-10);
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
