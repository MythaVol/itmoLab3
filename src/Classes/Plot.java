package Classes;

import AbstrClasses.Action;
import Classes.Actions.*;
import Classes.Items.*;
import Classes.Items.Long;
import Classes.Persons.Denny;
import Classes.Persons.Jack;
import Classes.Persons.Wendy;
import Enums.Description;

import java.util.ArrayList;

public class Plot {

    ArrayList<Action> actList = new ArrayList<>();
    Jack jack = new Jack("Jack");
    Denny denny = new Denny("Denny");
    Wendy wendy =new Wendy("Wendy");

    public void addAction(Action ... act) {
        for(int i =0; i<act.length; i++ ){
            actList.add(act[i]);
        }
    }

    
    public void run() {
        addAction(
                new Comeback(jack),
                new Saw(jack,denny),
                new Clouded(new Mind("Jack`s mind"), new CloudOfFurious("cloud of furious", Description.RED)),
                new Seems(new Everything("Everything"),new Long("long")),
                new Seems(new Dream("dream", Description.BAD),new Dream("Dream", Description.LONG)),
                new StireUp(denny),
                new Open(denny),
                new Gap(),
                new WereScattered(),
                new AskFor(wendy,jack),
                new Fix(jack),
                new Sippin(jack),
                new Spill(denny),
                new Watch(denny),
                new Sounded(new Word("Word"), new Mind("Jack`s mind")),
                new Closed(new Word("Word"), new ChainOfFurious("chain of furious", Description.ELECTRIC)),
                new Stepped(jack,denny),
                new Looked(denny,jack),
                new Started(denny,new Talking()),
                new Grab(jack,new Arm("Denny`s arm")),
                new Bent(jack,new Arm("Denny`s arm")),
                new Screamed(denny),
                new Drown(new Voice("Voice"),new Mist("mist")),
                new Turned(jack,denny),
                new DugIn(new Fingers("Jack`s fingers"), new Arm("Denny`s arm")),
                new Was(new Sound("sound",Description.QUIET)),
                new Was(new Sound("sound",Description.DEAFENING))
        );
        for(int i =0; i<actList.size(); i++ ){
            actList.get(i).action();
            if(actList.get(i).getP1()!=null)
                if(!actList.get(i).getP1().isAlive())
                    System.out.println(actList.get(i).getP1().getName() + " accidently died(((  This is the end of the story. ");


        }
    }
}
