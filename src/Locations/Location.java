package Locations;

import Classes.Human;
import Items.Item;

import java.util.HashMap;

public class Location {
    private HashMap<String, Human> humans = new HashMap<>();
    private HashMap<String, Item> items = new HashMap<>();
    public void addHuman(Human h){
        humans.put(h.getName(),h);
    }
    public void deleteHuman(Human h){
        humans.remove(h.getName());
    }
}
