package Subclasses;

import Classes.Human;
import Enums.DamageType;

public class Damage {
    public static void DamageToHuman(Human human, DamageType damageType){
        DamageType d = human.getDmgTypeResist();
        if (damageType!= d){
            human.setHp(damageType.getHpLoss());
            human.setStamina(damageType.getStmnLoss());
        }
    }
}
