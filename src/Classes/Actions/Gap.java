package Classes.Actions;

import AbstrClasses.Action;
import AbstrClasses.Item;
import Classes.Items.Box;

public class Gap extends Action {
    public Gap(){
        super();
        this.setName("gapped");
        this.setI1(new Box("boxes"));
    }
    public void action() {
        this.description();
    }


    public void description() {
        try {
            Thread.sleep(3000/ this.getActSpd().getSpeed());
            System.out.println(this.getI1().getName() + " were " + this);
        } catch (InterruptedException e){
            System.out.println(e);
        }
    }

    public String toString(){
        return this.getName();
    }
}
