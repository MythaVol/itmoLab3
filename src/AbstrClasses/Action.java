package AbstrClasses;

import Enums.ActionDescr;
import Enums.Description;

public abstract class Action {

    private Description descr;
    private Person p1;
    private Person p2;
    private Place place;
    private ActionDescr actSpd;
    private String name;
    private Item i1;
    private Item i2;
    public Action(Description descr,Person p1, Person p2, Place place, String name){

        this.descr=descr;
        this.p1=p1;
        this.p2=p2;
        this.place=place;
        this.actSpd=this.p1.getActionSpeed();
        this.name=name;

    }
    public Action(Person p1){
        this.p1=p1;
        this.actSpd=this.p1.getActionSpeed();
    }
    public Action(Person p1,Person p2){
        this.p1=p1;
        this.p2=p2;
        this.actSpd=this.p1.getActionSpeed();
    }

    public Action(Item i1, Item i2){
        this.i1=i1;
        this.i2=i2;
    }
    public Action(){
        this.actSpd=ActionDescr.FAST;
    }

    public Person getP1() {
        return p1;
    }

    public Person getP2() {
        return p2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public ActionDescr getActSpd() {
        return actSpd;
    }

    public Item getI1() {
        return i1;
    }

    public Item getI2() {
        return i2;
    }

    public void setI1(Item i1) {
        this.i1 = i1;
    }

    public void setI2(Item i2) {
        this.i2 = i2;
    }



    public void setActSpd(ActionDescr actSpd) {
        this.actSpd = actSpd;
    }

    public abstract void action();
    public abstract void description();

}
