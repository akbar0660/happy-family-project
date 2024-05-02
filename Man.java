package org.example;

public final class Man extends Human{
    public Man(String name, String surname, int year) {
        super(name, surname, year);
    }

    public Man(String name, String surname, int year, byte iq, String[][] schedule) {
        super(name, surname, year, iq, schedule);
    }
    public Man(){

    }

    @Override
    public void greetPet() {
        System.out.println("i'm a man ,hello , " + this.getFamily().getPet().getNickname());
    }
    public void repairCar(){
        System.out.println("car repair done ");
    }
}
