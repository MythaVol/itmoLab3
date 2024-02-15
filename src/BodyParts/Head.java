package BodyParts;

import Items.Abstraction;
import Classes.Human;

public class Head {
    private String name;
    private Human human;
    private Abstraction abstraction;
    public Head(Human h){
        this.name= h.getName() + "`s head";
        this.human=h;
    }

    public void getThought(Abstraction abstraction){
        this.abstraction=abstraction;
        if(abstraction.getEmotionalStrength() > 50){
            this.human.setEmotion(abstraction.getEmotion());
        }
    }
}
