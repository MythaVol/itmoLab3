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
        Human jack = new Human("jack", 100, 100, otherLocation, DamageType.PHYSICAL);
        Human denny = new Human("denny",100,100,cabinet,DamageType.SMALL_PHYSICAL);
        Notes notes = new Notes("notes", 20,2, cabinet, new Abstraction("clever thoughts", Emotions.HAPPY, 10));
        Wardrobe wardrobe = new Wardrobe("wardrobe", 50, 50,cabinet , notes);
        Abstraction redCloudOfFurious = new Abstraction("red cloud of furious", Emotions.FURIOUS,60);
        Abstraction darkMist = new Abstraction("dark mist", Emotions.STUNNED, 70);
        Beer beer = new Beer("beer", 30,10, cabinet);

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