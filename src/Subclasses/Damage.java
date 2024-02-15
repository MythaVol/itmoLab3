package Subclasses;

import Classes.Human;
import Enums.DamageType;
import Items.Item;

public class Damage {
    public static void damageToHuman(Human human, DamageType damageType){
        DamageType d = human.getDmgTypeResist();
        if (damageType!= d){
            human.setHp(damageType.getHpLoss());
            human.setStamina(damageType.getStmnLoss());
        }
    }
    public static void damageToItem(Item item, DamageType damageType){
        if (damageType == DamageType.BIG_PHYSICAL || damageType == DamageType.PHYSICAL || damageType == DamageType.SMALL_PHYSICAL) {
            item.setHp(damageType.getHpLoss());
        }else System.out.println("Items immune to emotional damage");
    }
}
