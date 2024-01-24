package Classes.Actions;

import AbstrClasses.Action;
import AbstrClasses.Item;

public class LetIn extends Action {
    public LetIn(Item i1,Item i2){
        super(i1, i2);
        this.setName("let in");
    }
    public void action() {
        this.description();
    }



    public String toString() {
        return this.getName();
    }
}
