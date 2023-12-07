package Classes.Actions;

import AbstrClasses.Action;
import AbstrClasses.Person;
import Classes.Items.Box;

public class StireUp extends Action {
    public StireUp(Person p1){
        super(p1);
        this.setName("stire up");
        this.setI1(new Box("boxes"));
    }
    public void action() {
        this.getP1().setStamina(-20);
        this.description();
    }


    public void description() {
        try {
            Thread.sleep(3000/ this.getActSpd().getSpeed());
            System.out.println(this.getP1().getName() +" "+ this + " " + this.getI1().getName());
        } catch (InterruptedException e){
            System.out.println(e);
        }
    }
    public String toString(){
        return this.getName();
    }
}
