package org.example;

import java.util.HashMap;
import java.util.Random;

public final class Woman extends Human implements HumanCreator {
    public Woman(String name, String surname, int year) {
        super(name, surname, year);
    }

    public Woman(String name, String surname, int year, byte iq, HashMap<DaysOfWeek, String> schedule) {
        super(name, surname, year, iq, schedule);
    }

    public Woman() {

    }

    @Override
    public void greetPet() {
        System.out.println("i'ma woman,hello , " + ((Pet) (this.getFamily().getPet().toArray()[0])).getNickname());
    }

    public void makeUp() {
        System.out.println("make up done");
    }

    @Override
    public Human bornChild() {
        String[] names = {"samir", "resad", "tural", "sarkhan", "akbar", "xemid"};
        Random rand = new Random();
        int random = rand.nextInt(2);
        String name = names[rand.nextInt(names.length)];
        Human human;
        if (random == 0) {
            human = new Man();
        } else {
            human = new Woman();
        }
        human.setFamily(this.getFamily());
        human.setName(name);
        human.setIq((byte) ((this.getFamily().getFather().getIq() + this.getIq()) / (byte) 2));
        this.getFamily().addChildren(human);
        return human;
    }
}
