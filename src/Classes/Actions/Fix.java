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

    public String toString(){
        return this.getName();
    }
}
