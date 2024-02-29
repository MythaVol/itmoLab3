package Items;

import Classes.Human;
import Enums.DamageType;
import Locations.Location;
import Subclasses.Damage;

public class Beer extends Item{

    private  int quantity;
    private boolean isFull;
    public Beer(String name, int hp, int v, Location loc) {
        super(name, hp, v, loc);
        isFull = true;
        quantity = 100;
    }
    private void setQuantity(int q){
        if(q<=0){
            System.out.println("Quantity must be more than 0");
        }else if (quantity - q < 0) {
            quantity=0;
            isFull = false;
        }else quantity -=q;
    }
    public void pourOn(Human h, Item i){
        this.beTaken(h);
        if(isFull){
            this.beReleased(h);
            Damage.damageToItem(i, DamageType.BIG_PHYSICAL);
            setQuantity(quantity);
        }else System.out.println("Beer is already poured");
    }

    public void sip(Human h){
        h.setDrunkScale(15);
        setQuantity(20);
    }


}
