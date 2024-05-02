package org.example;

public class RoboCat extends Pet{
    public RoboCat(Species species, String nickname) {
        super(species, nickname);
    }

    public RoboCat(Species species, String nickname, int age, byte trickLevel, String[] habits) {
        super(species, nickname, age, trickLevel, habits);
    }
    public RoboCat(){

    }

    @Override
    public void respond() {

    }
}
