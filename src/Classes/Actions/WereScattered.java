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

    public String toString(){
        return this.getName();
    }
}
