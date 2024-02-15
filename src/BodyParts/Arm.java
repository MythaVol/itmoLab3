package BodyParts;

import Classes.Human;
import Enums.DamageType;
import Enums.Emotions;
import Interfaces.Grabable;
import Subclasses.Damage;

public class Arm implements Grabable {
    private String name;
    private Human human;
    private boolean isBroken;

    private Arm catchedArm;
    public Arm(Human h){
        this.name= h.getName() + "`s arm";
        this.human=h;
        this.isBroken = false;
    }

    public void beTaken(Human human) {
        human.getArm().setCatchedArm(this);
        if(human.getEmotion() == Emotions.FURIOUS){
            broke();
        }
    }


    public void beReleased(Human human) {
        human.getArm().setCatchedArm(null);
    }

    private void broke(){
        isBroken = true;
        Damage.damageToHuman(human, DamageType.BIG_PHYSICAL);
        Damage.damageToHuman(human, DamageType.BIG_EMOTIONAL);
    }

    public void setCatchedArm(Arm catchedArm) {
        this.catchedArm = catchedArm;
    }

    public boolean isBroken() {
        return isBroken;
    }
}
