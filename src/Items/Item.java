package Items;

import Classes.Human;
import Enums.DamageType;
import Enums.Emotions;
import Interfaces.Grabable;
import Locations.Location;
import Subclasses.Damage;

public abstract class Item implements Grabable {
    private String name;
    private int hp;
    private int hpCapacity;
    private boolean isBroken;
    private int volume;
    private Location location;

    public Item(String name, int hp, int v,Location loc){
        this.name=name;
        this.hp=hp;
        this.isBroken=false;
        this.hpCapacity=hp;
        this.volume=v;
        this.location=loc;
        loc.addItems(this);
    }

    public void setHp(int hp) {
        if (this.hp - hp <= 0){
            this.hp = 0;
            this.Break();
        }
        else if (this.hp - hp >= hpCapacity)
            this.hp = hpCapacity;
        else this.hp -= hp;
    }

    public void Break(){
        this.isBroken=true;
    }
    public void beTaken(Human human) {
        human.addItem(this);
        if(Math.random()<0.4 && (human.getEmotion()== Emotions.ANGRY || human.getEmotion()== Emotions.FURIOUS ))
            Damage.damageToItem(this, DamageType.SMALL_PHYSICAL);
    }

    public void beReleased(Human human) {
        human.deleteItem(this);
        if(Math.random()<0.75 && (human.getEmotion()== Emotions.ANGRY || human.getEmotion()== Emotions.FURIOUS ))
            Damage.damageToItem(this, DamageType.PHYSICAL);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getVolume(){
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isBroken() {
        return isBroken;
    }
}
