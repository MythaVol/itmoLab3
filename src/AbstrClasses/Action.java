package AbstrClasses;

import Enums.ActionDescr;
import Enums.Description;

import java.util.Objects;

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
        this.actSpd=ActionDescr.FAST;
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

    public void setP1(Person p1) {
        this.p1 = p1;
    }

    public void setActSpd(ActionDescr actSpd) {
        this.actSpd = actSpd;
    }

    public abstract void action();
    public void description(){
        try{
            Thread.sleep(3000/ this.getActSpd().getSpeed());
            if (this.p1 == null){
                if(this.i1==null){
                    System.out.println("This action doesn`t exist");
                }
                else{
                    if(this.i2==null && this.p2==null){
                        System.out.println(this.getI1() + " " + this.getName());
                    }
                    else if(this.p2==null){
                        System.out.println(this.getI1() + " " + this.getName() + " " + this.getI2());
                    }
                    else{
                        System.out.println(this.getI1() + " " + this.getName() + " " + this.getP2());
                    }
                }
            }
            else {
                if(this.i1==null && this.p2==null){
                    System.out.println(this.getP1() + " " + this.getName());
                }
                else if(this.p2==null){
                    System.out.println(this.getP1() + " " + this.getName() + " " + this.getI1().getName());
                }
                else{
                    System.out.println(this.getP1() + " " + this.getName() + " " + this.getP2());
                }
            }
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Action action)) return false;
        return descr == action.descr && Objects.equals(p1, action.p1) && Objects.equals(p2, action.p2) && Objects.equals(place, action.place) && actSpd == action.actSpd && Objects.equals(name, action.name) && Objects.equals(i1, action.i1) && Objects.equals(i2, action.i2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(descr, p1, p2, place, actSpd, name, i1, i2);
    }
}
