package Items;

import Locations.Location;

public class Water extends Item{
    private boolean isHot;
    public Water(String name, int hp, int v, Location loc) {
        super(name, hp, v, loc);
        isHot = false;
    }

    public void setVolume(int volume){
        if(getVolume() - volume <= 0){
            super.setVolume(0);
        }else super.setVolume(getVolume() - volume);
    }

    public void setIsHot(boolean b){
        isHot = b;
    }

    public boolean isHot() {
        return isHot;
    }
}
