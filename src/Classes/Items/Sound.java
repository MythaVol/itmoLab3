package Classes.Items;

import AbstrClasses.Item;
import Enums.Description;

public class Sound extends Item {
    public Sound(String name, Description descr) {
        super(name, descr);
        this.setName(name);
    }
    public Sound(String name){
        super(name);
    }
}
