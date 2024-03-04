package Items;

import Classes.Human;
import Exceptions.PhoneException;
import Locations.Location;

public class Phone extends Item{
    public Phone(String name, int hp, int v, Location loc) {
        super(name, hp, v, loc);
    }

    public void call(Human h, int number)throws PhoneException{
        switch (number){
            case 911:
                System.out.println(h.getName()+" called ambulance");
                break;
            case 777:
                System.out.println(h.getName()+" called to God");
                break;
            default:
                throw new PhoneException(h.getName()+" picked wrong number");
        }
    }
}
