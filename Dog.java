package org.example;

public class Dog extends Pet {
    public Dog(Species species, String nickname) {
        super(species, nickname);
    }

    public Dog(Species species, String nickname, int age, byte trickLevel, String[] habits) {
        super(species, nickname, age, trickLevel, habits);
    }

    public Dog() {

    }

    @Override
    public void respond() {

    }
}
