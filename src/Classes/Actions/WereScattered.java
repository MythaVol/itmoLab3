package Classes.Actions;

import AbstrClasses.Action;
import Classes.Items.Manuscript;

public class WereScattered extends Action {
    public WereScattered(){
        super();
        this.setName("were scattered");
        this.setI1(new Manuscript("Manuscripts"));
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
        return this.getI1().getName() + " " + this.getName();
    }
}
