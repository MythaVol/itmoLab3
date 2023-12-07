package AbstrClasses;

import Enums.ActionDescr;
import Enums.Status;

import java.util.ArrayList;

public abstract class Person {
    private Status status;
    private int hp;
    private int stamina;
    private ActionDescr actionSpeed;
    private String name;

    private ArrayList<Item> itemsList = new ArrayList<>();

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

    public void addItem(Item item){
        this.itemsList.add(item);
    }
    public Item getItem(int number){
        return this.itemsList.get(number);
    }

    @Override
    public String toString(){
        return name;
    }


}
