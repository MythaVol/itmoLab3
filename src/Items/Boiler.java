package Items;

import Locations.HotelRoom;
import Locations.Location;

public class Boiler extends Item{

    private Water water;
    public Boiler(String name, int hp, int v, Location loc) {
        super(name, hp, v, loc);
    }

    public void boil(){

    }
    private class BoilerStarter{
        public void start(){

        }
    }

    public static class Pipes{
        private Water water;
        public void setWater(Water water){
            this.water=water;
        }
        public void provideWater(HotelRoom hr){
            hr.setHotWater(water);
            water = null;
        }
    }
}
