package Items;

import Classes.Human;
import Locations.Location;

public class Phone extends Item{
    public Phone(String name, int hp, int v, Location loc) {
        super(name, hp, v, loc);
    }

    public void call(Human h, int number){
        switch (number){
            case 911:
                System.out.println(h.getName()+" called ambulance");
                break;
            case 777:
                System.out.println(h.getName()+" called to God");
                break;
            default:
                System.out.println(h.getName() + " picked wrong number");
                break;
        }
    }
}
