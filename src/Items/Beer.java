package Items;

import Classes.Human;
import Enums.DamageType;
import Locations.Location;
import Subclasses.Damage;

public class Beer extends Item{
    private boolean isFull;
    public Beer(String name, int hp, int v, Location loc) {
        super(name, hp, v, loc);
        isFull = true;
    }

    public void pourOn(Human h, Item i){
        if(isFull){
            this.beReleased(h);
            Damage.damageToItem(i, DamageType.BIG_PHYSICAL);
            isFull = false;
        }else System.out.println("Beer is already poured");
    }
}
