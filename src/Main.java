import Classes.AbstractSimulation;
import Classes.Abstraction;
import Classes.Human;
import Enums.DamageType;
import Enums.Emotions;
import Items.*;
import Locations.Location;

public class Main {
    public static void main(String[] args) {
        Location otherLocation = new Location();
        Location cabinet = new Location();
        Human jack = new Human("jack", 100, cabinet, DamageType.PHYSICAL);
        Human denny = new Human("denny",100,otherLocation,DamageType.SMALL_PHYSICAL);
        Human wendy = new Human("wendy", 100, otherLocation, DamageType.SMALL_EMOTIONAL);
        Notes notes = new Notes("notes", 20,2, cabinet, new Abstraction("clever thoughts", Emotions.HAPPY, 10));
        Wardrobe wardrobe = new Wardrobe("wardrobe", 50, 50,cabinet);
        Abstraction redCloudOfFurious = new Abstraction("red cloud of furious", Emotions.FURIOUS,60);
        Abstraction darkMist = new Abstraction("dark mist", Emotions.STUNNED, 70);
        Abstraction death = new Abstraction("denny`s death", Emotions.SCARED,105);
        Beer beer = new Beer("beer", 30,10, cabinet);
        Phone phone = new Phone("phone", 40, 30, otherLocation);
        AbstractSimulation absSim = new AbstractSimulation(jack);

        beer.sip(jack);
        notes.read(jack);
        beer.sip(jack);
        wardrobe.putItem("notes", jack);
        wendy.callSomeone(jack);
        denny.goTo(cabinet);
        denny.openSomething(wardrobe);
        wardrobe.takeOut(denny);
        notes.beReleased(denny);
        beer.pourOn(denny,notes);
        jack.goTo(cabinet);
        notes.beTaken(jack);
        notes.read(jack);
        jack.getHead().getThought(redCloudOfFurious);
        notes.beReleased(jack);
        jack.catchSomeone(denny);
        jack.getHead().getThought(darkMist);
        wendy.goTo(cabinet);
        wendy.getHead().getThought(death);
        absSim.run();
        wendy.goTo(otherLocation);
        wendy.callAmbulance(phone);



    }
    }