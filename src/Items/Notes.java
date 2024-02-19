package Items;

import Classes.Abstraction;
import Classes.Human;
import Enums.Emotions;
import Locations.Location;

public class Notes extends Item{
    private Abstraction thought;
    public Notes(String name, int hp, int v,Location loc, Abstraction thought) {
        super(name, hp, v, loc);
        this.thought = thought;
    }

    public void read(Human h){
        if(!this.isBroken()){
            h.getHead().getThought(thought);
        }else h.getHead().getThought(new Abstraction("negative thought", Emotions.ANGRY, 20));
    }

}
