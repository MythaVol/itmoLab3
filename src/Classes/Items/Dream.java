package Classes.Items;

import AbstrClasses.Item;
import Enums.Description;

public class Dream extends Item {
    public Dream(String name, Description descr) {
        super(name, descr);
    }

    public String toString(){
        return this.getName();
    }
}
