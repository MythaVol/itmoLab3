package Classes.Actions;

import AbstrClasses.Action;
import AbstrClasses.Item;
import Classes.Items.Box;

public class Gap extends Action {
    public Gap(){
        super();
        this.setName("were gapped");
        this.setI1(new Box("boxes"));
    }
    public void action() {
        this.description();
    }



    public String toString(){
        return this.getName();
    }
}
