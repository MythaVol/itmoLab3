package Classes;

import BodyParts.Arm;
import BodyParts.Head;
import Enums.DamageType;
import Enums.Emotions;
import Interfaces.Openable;
import Items.Item;
import Locations.Location;

import java.util.HashMap;
import java.util.Objects;

public class Human {
    private String name;
    private int hp;
    private int stamina;
    private boolean isAlive;
    private DamageType dmgTypeResist;
    private Location location;
    private Head head;
    private Arm arm;
    private int drunkScale;
    private Emotions emotion;

    private HashMap<String, Item> items = new HashMap<>();

    public Human(String name, int hp, int stamina,Location location, DamageType dmgTypeResist){
        this.stamina=stamina;
        this.hp = hp;
        this.name = name;
        this.dmgTypeResist = dmgTypeResist;
        this.location = location;
        location.addHuman(this);
        this.head= new Head(this);
        this.arm = new Arm(this);
        this.isAlive =true;
    }

    public void setHp(int hp) {
        if (this.hp - hp <= 0){
            this.hp = 0;
            this.death();
        }
        else if (this.hp - hp >= 100)
            this.hp = 100;
        else this.hp -= hp;

        if (this.hp < 55){
            scream();
        }
    }

    public void setStamina(int stamina) {
        if (this.stamina - stamina <= 0)
            this.stamina = 0;
        else if (this.stamina - stamina >= 100)
            this.stamina = 100;
        else this.stamina -= stamina;
    }

    public void setDrunkScale(int drunkScale) {
        if (drunkScale <= 0)
            this.drunkScale = 0;
        else if (this.drunkScale + drunkScale >= 100) {
            this.drunkScale = 100;
            death();
        }else this.drunkScale += drunkScale;
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

    public Emotions getEmotion() {
        return emotion;
    }

    public Item getItem(String name){
        return this.items.get(name);
    }

    public void addItem(Item item){
        this.items.put(item.getName(),item);
    }

    private void scream(){
        System.out.println(this.name + ": Aaaaaaaaaaaaaaaaaaaah!!!!!");
    }

    public void deleteItem(Item item){
        this.items.remove(item.getName());
    }

    public void setEmotion(Emotions emotion) {
        this.emotion = emotion;
    }

    public void openSomething(Openable openable){
        openable.open();
    }
    public void catchSomeone(Human h){
        grabArm(h.getArm());
        if(h.getArm().isBroken()){
            h.getArm().beReleased(this);
        }
    }

    public void callSomeone(Human h){
        System.out.println(h.getName() + ", come here");
        if(Math.random()>0.1){
            h.goTo(this.location);
        }else callSomeone(h);
    }

    public void grabArm(Arm a){
        a.beTaken(this);
    }

    public Arm getArm() {
        return arm;
    }

    public int getDrunkScale() {
        return drunkScale;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human human)) return false;
        return hp == human.hp && stamina == human.stamina && isAlive == human.isAlive && Objects.equals(name, human.name) && dmgTypeResist == human.dmgTypeResist && Objects.equals(location, human.location) && Objects.equals(head, human.head) && Objects.equals(arm, human.arm) && Objects.equals(items, human.items);
    }


    public int hashCode() {
        return Objects.hash(name, hp, stamina, isAlive, dmgTypeResist, location, head, arm, items);
    }

    public Head getHead() {
        return head;
    }
}
