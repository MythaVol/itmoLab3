import Classes.Abstraction;
import Classes.Human;
import Enums.DamageType;
import Enums.Emotions;
import Items.*;
import Locations.Cabinet;
import Locations.Location;
import Locations.OtherRoom;

public class Main {
    public static void main(String[] args) {
        Location otherLocation = new OtherRoom();
        Location cabinet = new Cabinet();
        Human jack = new Human("jack", 100, 100, cabinet, DamageType.PHYSICAL);
        Human denny = new Human("denny",100,100,otherLocation,DamageType.SMALL_PHYSICAL);
        Human wendy = new Human("wendy", 100, 100, otherLocation, DamageType.SMALL_EMOTIONAL);
        Notes notes = new Notes("notes", 20,2, cabinet, new Abstraction("clever thoughts", Emotions.HAPPY, 10));
        Wardrobe wardrobe = new Wardrobe("wardrobe", 50, 50,cabinet , notes);
        Abstraction redCloudOfFurious = new Abstraction("red cloud of furious", Emotions.FURIOUS,60);
        Abstraction darkMist = new Abstraction("dark mist", Emotions.STUNNED, 70);
        Beer beer = new Beer("beer", 30,10, cabinet);

        beer.sip(jack);
        notes.read(jack);
        beer.sip(jack);
        wendy.callSomeone(jack);
        denny.goTo(cabinet);
        denny.openSomething(wardrobe);
        wardrobe.takeOut(denny);
        notes.beReleased(denny);
        beer.beTaken(denny);
        beer.pourOn(denny,notes);
        jack.goTo(cabinet);
        notes.beTaken(jack);
        notes.read(jack);
        jack.getHead().getThought(redCloudOfFurious);
        notes.beReleased(jack);
        jack.catchSomeone(denny);




    }
    }