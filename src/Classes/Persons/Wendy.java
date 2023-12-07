package Classes.Persons;

import AbstrClasses.Person;
import Enums.ActionDescr;
import Enums.Status;

public class Wendy extends Person {
    public Wendy(Status stat, int hp, int stmn, ActionDescr actSpd, String name){
        super(stat, hp, stmn, actSpd, name);
    }
    public Wendy(String name){
        super(name);
    }
}
