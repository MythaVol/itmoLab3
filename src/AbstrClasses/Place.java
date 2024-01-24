package AbstrClasses;

import java.util.ArrayList;
import java.util.Objects;

public abstract class Place {
    private String name;
    ArrayList<Person> pList = new ArrayList<>();

    public Place(String name){
        this.name =name;
    }


    public void addP(Person person){
        pList.add(person);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Place place)) return false;
        return Objects.equals(name, place.name) && Objects.equals(pList, place.pList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, pList);
    }
}
