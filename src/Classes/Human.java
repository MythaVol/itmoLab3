package Classes;

import BodyParts.Arm;
import BodyParts.Head;
import Enums.DamageType;
import Locations.Location;

public class Human {
    private String name;
    private int hp;
    private int stamina;
    private boolean isAlive;
    private DamageType dmgTypeResist;
    private Location location;
    private Head head;
    private Arm arm;

    public Human(String name, int hp, int stamina,Location location, DamageType dmgTypeResist){
        this.stamina=stamina;
        this.hp = hp;
        this.name = name;
        this.dmgTypeResist = dmgTypeResist;
        this.location = location;
        this.head= new Head(this);

    }

    public void setHp(int hp) {
        if (this.hp - hp <= 0){
            this.hp = 0;
            this.death();
        }
        else if (this.hp - hp >= 100)
            this.hp = 100;
        else this.hp -= hp;
    }

    public void setStamina(int stamina) {
        if (this.stamina - stamina <= 0)
            this.stamina = 0;
        else if (this.stamina - stamina >= 100)
            this.stamina = 100;
        else this.stamina -= stamina;
    }

    public void goTo(Location loc){
        location.deleteHuman(this);
        location=loc;
        loc.addHuman(this);
    }

    public boolean isAlive(){
        return isAlive;
    }

    private void death(){
        this.isAlive=false;
    }

    public DamageType getDmgTypeResist() {
        return dmgTypeResist;
    }

    public String getName() {
        return name;
    }
}
