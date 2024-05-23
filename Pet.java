package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public abstract class Pet {
    private Species species;
    private String nickname;
    private int age;
    private byte trickLevel;
    private HashSet<String> habits;

    static {
        System.out.println(Pet.class.getName() + " class is loaded");
    }

    {
        System.out.println(Pet.class.getName() + " object is created");
    }

    public Pet(Species species, String nickname) {
        if (species == null) {
            this.species = Species.Unknown;
        } else this.species = species;
        this.nickname = nickname;
    }

    public Pet(Species species, String nickname, int age, byte trickLevel, HashSet<String> habits) {
        if (species == null) {
            this.species = Species.Unknown;
        } else this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public Pet() {

    }

    public Species getSpecies() {
        return species;
    }

    public String getNickname() {
        return nickname;
    }

    public int getAge() {
        return age;
    }

    public byte getTrickLevel() {
        return trickLevel;
    }

    public Set<String> getHabits() {
        return habits;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setTrickLevel(byte trickLevel) {
        this.trickLevel = trickLevel;
    }

    public void setHabits(HashSet<String> habits) {
        this.habits = habits;
    }

    public void eat() {
        System.out.println("i'm eating");
    }

    public abstract void respond();

    public void foul() {
        System.out.println("i need to cover it up");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String s : habits) {
            sb = sb.append(s).append(" ");
        }
        return this.species + "{nickname=" + this.nickname + ", age=" + this.age + ", trickLevel=" + this.trickLevel + ", habits=" + sb + "}";
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        Random random = new Random();
        int hashCode = random.nextInt(1000);
        return hashCode;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("a pet object removed");
    }
}


