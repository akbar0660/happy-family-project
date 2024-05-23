package org.example;

import java.util.HashSet;

public class Fish extends Pet {
    public Fish(Species species, String nickname) {
        super(species, nickname);
    }

    public Fish(Species species, String nickname, int age, byte trickLevel, HashSet<String> habits) {
        super(species, nickname, age, trickLevel, habits);
    }

    public Fish() {

    }

    @Override
    public void respond() {
        {
            System.out.println("hello, owner.I'am " + this.getNickname() + " .I miss you");
        }
    }
}
