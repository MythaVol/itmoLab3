package Subclasses;

import Classes.Human;
import Enums.DamageType;
import Items.Item;

public class Damage {
    public static void damageToHuman(Human human, DamageType damageType){
        DamageType d = human.getDmgTypeResist();
        if (damageType!= d){
            human.setHp(damageType.getHpLoss());
        }
    }
    public static void damageToItem(Item item, DamageType damageType){
            item.setHp(damageType.getHpLoss());
    }
}
