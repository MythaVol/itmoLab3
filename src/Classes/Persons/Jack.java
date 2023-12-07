package Classes.Persons;

import AbstrClasses.Person;
import Enums.ActionDescr;
import Enums.Status;

public class Jack extends Person {
    public Jack(String name){
        super(name);
    }
    public Jack(Status stat, int hp, int stmn, ActionDescr actSpd, String name){
        super(stat, hp, stmn, actSpd, name);
    }
}
