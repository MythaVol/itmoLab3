package Items;

import Classes.Human;
import Interfaces.Openable;
import Locations.Location;

public class Wardrobe extends Item implements Openable {
    private boolean isOpen;
    private Item entrail;
    public Wardrobe(String name, int hp, int v,Location loc) {
        super(name, hp,v, loc);
        isOpen = false;
    }
    public void putItem(String name, Human h){
        if(isOpen) {
            if (entrail == null && h.getItem(name).getVolume()<getVolume()) {
                entrail = h.getItem(name);
                h.getItem(name).beReleased(h);
            } else {
                System.out.println("there is no place to put item");
            }
            close();
        }else {
            System.out.println(this.getName() + " is closed");
            open();
            putItem(name,h);
        }
    }
    public void open(){
        this.isOpen=true;
    }
    public void close(){this.isOpen = false;}

    public void takeOut(Human h){
        if(isOpen) {
            if (entrail != null){
                entrail.beTaken(h);
                entrail = null;
            }else System.out.println("there is nothing to take");
        }else {
            System.out.println(this.getName() + " is closed");
            open();
            takeOut(h);
        }
    }

}
