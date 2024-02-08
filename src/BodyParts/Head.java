package BodyParts;

import Items.Abstraction;
import Classes.Human;

public class Head {
    private String name;
    private Human human;
    private Abstraction abstraction;
    public Head(Human h){
        this.name= h.getName() + "`s arm";
        this.human=h;
    }
}
