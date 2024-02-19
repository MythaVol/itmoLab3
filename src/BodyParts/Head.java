package BodyParts;

import Classes.Abstraction;
import Classes.Human;
import Enums.DamageType;
import Subclasses.Damage;

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
        if(human.getDrunkScale()>=30){
            abstraction.setEmotionalStrength(abstraction.getEmotionalStrength()*2);
        }
        if(abstraction.getEmotionalStrength() > 50){
            this.human.setEmotion(abstraction.getEmotion());
        }
        if(abstraction.getEmotionalStrength() > 50){
            Damage.damageToHuman(human, DamageType.EMOTIONAL);
        }
    }
}
