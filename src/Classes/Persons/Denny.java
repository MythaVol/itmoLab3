package Classes.Persons;

import AbstrClasses.Person;
import Enums.ActionDescr;
import Enums.Status;

public class Denny extends Person {
    public Denny(String name){
        super(name);
    }
    public Denny(Status stat, int hp, int stmn, ActionDescr actSpd, String name){
        super(stat, hp, stmn, actSpd, name);
    }
}
