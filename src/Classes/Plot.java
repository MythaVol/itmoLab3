package Classes;

import AbstrClasses.Action;
import AbstrClasses.Item;
import AbstrClasses.Place;
import Classes.Actions.*;
import Classes.Items.*;
import Classes.Items.Long;
import Classes.Persons.Denny;
import Classes.Persons.Jack;
import Classes.Persons.Wendy;
import Classes.Places.Room;
import Enums.Description;

import java.util.ArrayList;

public class Plot {

    private ArrayList<Action> actList = new ArrayList<>();
    private Jack jack = new Jack("Jack");
    private Denny denny = new Denny("Denny");
    private Wendy wendy =new Wendy("Wendy");
    private Place p =new Room("room");
    private Item jackMind = new Mind("Jack`s mind");

    public void addAction(Action ... act) {
        for(int i =0; i<act.length; i++ ){
            actList.add(act[i]);
        }
    }

    
    public void run() {
        addAction(
                new Comeback(jack,p),
                new Saw(jack,denny,new Trusiki("trusiki")),
                new Clouded(jackMind, new CloudOfFurious("cloud of furious", Description.RED),jack),
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
                new Was(new Sound("sound",Description.DEAFENING)),
                new LetIn(new Sound("sound"), new CloudsOfDarkness("clouds of darkness")),
                new Losing(new Face("face"), new Colors("colors"))
        );
        for(int i =0; i<actList.size(); i++ ){
            actList.get(i).action();
            if(actList.get(i).getP1()!=null)
                if(!actList.get(i).getP1().isAlive()) {
                    System.out.println(actList.get(i).getP1().getName() + " accidently died(((  This is the end of the story. ");
                    break;
                }
        }
    }
}
