package org.example;

public class DomesticCat extends Pet{
    public DomesticCat(Species species, String nickname) {
        super(species, nickname);
    }

    public DomesticCat(Species species, String nickname, int age, byte trickLevel, String[] habits) {
        super(species, nickname, age, trickLevel, habits);
    }
    public DomesticCat(){

    }

    @Override
    public void respond() {

    }
}
