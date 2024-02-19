package Classes;

import Enums.Emotions;

import java.util.ArrayList;

public class AbstractSimulation {
    private Human human;
    public AbstractSimulation(Human human){
        this.human = human;
    }
    private ArrayList<Abstraction> abstractions = new ArrayList<>();
    public void addAbstractions(Abstraction ... abs){
        for(int i = 0; i<abstractions.size(); i++){
            abstractions.add(abs[i]);

        }
    }
    public void run(){
        addAbstractions(
                new Abstraction("fear of loneliness", Emotions.SCARED, 40),
                new Abstraction("red mist of shame", Emotions.STUNNED, 50)
        );
        for(int i = 0; i<abstractions.size(); i++){
            human.getHead().getThought(abstractions.get(i));
        }
        human.getHead().getThought(new Abstraction("thinking", Emotions.NETRAL,0));
    }
}
