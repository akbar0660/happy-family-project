package org.example;

import java.util.*;

public class Human {
    private String name;
    private String surname;
    private int year;
    private byte iq;
    private HashMap<DaysOfWeek, String> schedule;
    private Family family;

    static {
        System.out.println(Human.class.getName() + " class is loaded");
    }

    {
        System.out.println(Human.class.getName() + " object is created");
    }

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, byte iq, HashMap<DaysOfWeek, String> schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.schedule = schedule;
    }

    public Human() {

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getYear() {
        return year;
    }

    public byte getIq() {
        return iq;
    }

    public Map<DaysOfWeek, String> getSchedule() {
        return schedule;
    }

    public Family getFamily() {
        return family;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setIq(byte iq) {
        this.iq = iq;
    }

    public void setSchedule(HashMap<DaysOfWeek, String> schedule) {
        this.schedule = schedule;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public void greetPet() {
        System.out.println("Hello , " + ((Pet) (this.family.getPet().toArray()[0])).getNickname());
    }

    public void describePet() {
        String trickLevel = ((Pet) (this.family.getPet().toArray()[0])).getTrickLevel() >= 50 ? "very sly" : "almost not sly";
        System.out.println("I have an " + ((Pet) (this.family.getPet().toArray()[0])).getSpecies() + " is " + ((Pet) this.family.getPet().toArray()[0]).getAge() + " years old, he is " + trickLevel);
    }

    public boolean feedPet(boolean isItTimeForFeeding) {
        boolean feedHappened = false;
        if (isItTimeForFeeding) {
            feedHappened = true;
        } else {
            Random rand = new Random();
            int randomNumber = rand.nextInt(100) + 1;
            feedHappened = ((Pet) (this.family.getPet().toArray()[0])).getTrickLevel() > randomNumber ? true : false;
        }
        if (feedHappened) {
            System.out.println("Hm... I will feed Jack's " + ((Pet) (this.family.getPet().toArray()[0])).getNickname());
        } else {
            System.out.println("I think " + ((Pet) (this.family.getPet().toArray()[0])).getNickname() + " is not hungry");
        }
        return feedHappened;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Set<DaysOfWeek> set = schedule.keySet();
        for (DaysOfWeek day : set) {
            sb = sb.append(day).append(" ").append(schedule.get(day)).append(" ");
        }
        return "Human{name=" + this.name + ", surname=" + this.surname + ", year=" + this.year + ", iq=" + this.iq + " schedule= " + sb + "}";
    }

    @Override
    public int hashCode() {
        Random random = new Random();
        int hashCode = random.nextInt(1000);
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        return ((Human) obj).name == this.name && ((Human) obj).surname == this.surname && ((Human) obj).family == this.family;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("a human object is removed");
    }
}
