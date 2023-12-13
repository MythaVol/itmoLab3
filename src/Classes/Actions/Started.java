package Classes.Actions;

import AbstrClasses.Action;
import AbstrClasses.Person;

public class Started extends Action {
    private Action act;
    public Started(Person p1,Action a1){
        this.act=a1;
        this.setP1(p1);
        this.setName("started");
        this.setActSpd(this.getP1().getActionSpeed());
    }
    public void action() {
        this.description();
    }


    public void description() {
        try {
            Thread.sleep(3000/ this.getActSpd().getSpeed());
            System.out.println(this.getP1().getName() + " " + this + " " + this.act.getName());
        } catch (InterruptedException e){
            System.out.println(e);
        }
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
