package org.example;

import java.util.Arrays;
import java.util.Random;

public class Human {
    private String name;
    private String surname;
    private int year;
    private byte iq;
    private String[][] schedule;
    private Family family;

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }
    public Human(String name, String surname, int year, byte iq, String[][] schedule) {
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

    public String[][] getSchedule() {
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
    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

   public void greetPet() {
        System.out.println("Hello , " + this.family.getPet().getNickname());
    }

    public void describePet() {
        String trickLevel = this.family.getPet().getTrickLevel() >= 50 ? "very sly" : "almost not sly";
        System.out.println("I have an " + this.family.getPet().getSpecies() + " is " + this.family.getPet().getAge() + " years old, he is " + trickLevel);
    }

    public boolean feedPet(boolean isItTimeForFeeding) {
        boolean feedHappened = false;
        if (isItTimeForFeeding = true) {
            feedHappened = true;
        } else {
            Random rand = new Random();
            int randomNumber = rand.nextInt(100) + 1;
            feedHappened = this.family.getPet().getTrickLevel() > randomNumber ? true : false;
        }
        if(feedHappened==true){
            System.out.println("Hm... I will feed Jack's "+this.family.getPet().getNickname());
        }else{
            System.out.println("I think "+this.family.getPet().getNickname()+" is not hungry");
        }
        return feedHappened;
    }

    @Override
    public String toString() {
        return "Human{name=" + this.name + ", surname=" + this.surname + ", year=" + this.year + ", iq=" + this.iq+" schedule= "+Arrays.toString(this.schedule)+"}";
    }
    @Override
    public int hashCode() {
        Random random = new Random();
        int hashCode = random.nextInt(1000);
        return hashCode;
    }

   @Override
   public boolean equals(Object obj) {
       return ((Human)obj).name==this.name && ((Human)obj).surname==this.surname && ((Human)obj).family==this.family;
   }
}
