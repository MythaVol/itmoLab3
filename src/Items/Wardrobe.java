package Items;

import Classes.Human;
import Interfaces.Openable;
import Locations.Location;

public class Wardrobe extends Item implements Openable {
    private boolean isOpen;
    private Item entrail;
    public Wardrobe(String name, int hp, int v,Location loc, Item e) {
        super(name, hp,v, loc);
        if (e.getVolume() < v)
            this.entrail=e;
        isOpen = false;
    }
    public void putItem(String name, Human h){
        if(isOpen) {
            if (entrail == null) {
                entrail = h.getItem(name);
                h.getItem(name).beReleased(h);
            } else {
                System.out.println("there is no place to put item");
            }
        }else System.out.println(this.getName() + " is closed");
    }
    public void open(){
        this.isOpen=true;
    }

    public void takeOut(Human h){
        if(isOpen) {
            if (entrail != null){
                entrail.beTaken(h);
                entrail = null;
            }else System.out.println("there is nothing to take");
        }else System.out.println(this.getName() + " is closed");
    }

}
