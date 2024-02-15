package Locations;

import Classes.Human;
import Items.Item;

import java.util.HashMap;

public abstract class Location {
    private HashMap<String, Human> humans = new HashMap<>();
    private HashMap<String, Item> items = new HashMap<>();
    public void addHuman(Human h){
        humans.put(h.getName(),h);
    }
    public void deleteHuman(Human h){
        humans.remove(h.getName());
    }
    public Human getHuman(String name){
        return this.humans.get(name);
    }
    public Item getItem(String name){
        return this.items.get(name);
    }
    public void addItems(Item ... items){
        for(int i = 0; i<items.length; i++){
            this.items.put(items[i].getName(),items[i]);
        }
    }
    public void deleteItem(Item i){
        items.remove(i.getName());
    }
}
