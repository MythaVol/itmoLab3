package AbstrClasses;

import Enums.ActionDescr;
import Enums.Status;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public abstract class Person {
    private Status status;
    private int hp;
    private int stamina;
    private ActionDescr actionSpeed;
    private String name;


    private HashMap<String,Item> itemMap = new HashMap<>();

    private boolean isalive = true;

    public Person( String name){
        this.status=Status.NORMAL;
        this.hp=100;
        this.stamina=100;
        this.actionSpeed=ActionDescr.FAST;
        this.name=name;
    }
    public Person(Status stat,int hp,int stmn,ActionDescr actSpd, String name){
        this.status = stat;
        this.stamina = stmn;
        this.hp = hp;
        this.actionSpeed=actSpd;
        this.name=name;
    }

    private void death(){
        this.isalive=false;
    }

    public boolean isAlive(){
        return isalive;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if (this.hp + hp <=0)
            this.death();
        else if (this.hp + hp >=100)
            this.hp = 100;
        else{ this.hp += hp;}

    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        if (this.stamina + stamina <=0){
            this.stamina = 0;
            this.actionSpeed=ActionDescr.SLOW;
        }
        else if (this.stamina + stamina >=100){
            this.stamina = 100;
            this.actionSpeed=ActionDescr.FAST;
        }
        else if(this.stamina + stamina <=50){
            this.actionSpeed=ActionDescr.SLOW;
            this.stamina += stamina;
        }
        else if(this.stamina + stamina <=99){
            this.stamina += stamina;
            this.actionSpeed=ActionDescr.NORMAL;
        }
    }


    public ActionDescr getActionSpeed() {
        return actionSpeed;
    }

    public Item getItem(String name){
        return this.itemMap.get(name);
    }

    @Override
    public String toString(){
        return name;
    }
    public void addItem(String name, Item item){
        this.itemMap.put(name, item);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return hp == person.hp && stamina == person.stamina && isalive == person.isalive && status == person.status && actionSpeed == person.actionSpeed && Objects.equals(name, person.name) && Objects.equals(itemMap, person.itemMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, hp, stamina, actionSpeed, name, itemMap, isalive);
    }
}
