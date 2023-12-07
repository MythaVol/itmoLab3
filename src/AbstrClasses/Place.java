package AbstrClasses;

import java.util.ArrayList;

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

}
