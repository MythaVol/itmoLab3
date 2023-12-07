package Classes.Actions;

import AbstrClasses.Action;
import AbstrClasses.Person;
import Classes.Items.Act;

public class Fix extends Action {
    public Fix(Person p1){
        super(p1);
        this.setI1(new Act("second act"));
        this.setName("fix");
    }
    public void action() {
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
        return this.getP1().getName() + " " + this.getName() + " " + this.getI1().getName();
    }
}
