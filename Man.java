package org.example;

import java.util.HashMap;

public final class Man extends Human {
    public Man(String name, String surname, int year) {
        super(name, surname, year);
    }

    public Man(String name, String surname, int year, byte iq, HashMap<DaysOfWeek, String> schedule) {
        super(name, surname, year, iq, schedule);
    }

    public Man() {

    }

    @Override
    public void greetPet() {
        System.out.println("i'm a man ,hello , " + ((Pet) (this.getFamily().getPet().toArray()[0])).getNickname());
    }

    public void repairCar() {
        System.out.println("car repair done ");
    }
}
