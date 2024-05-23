package org.example;

import java.util.HashSet;

public class RoboCat extends Pet {
    public RoboCat(Species species, String nickname) {
        super(species, nickname);
    }

    public RoboCat(Species species, String nickname, int age, byte trickLevel, HashSet<String> habits) {
        super(species, nickname, age, trickLevel, habits);
    }

    public RoboCat() {

    }

    @Override
    public void respond() {

    }
}