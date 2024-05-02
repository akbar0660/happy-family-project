package org.example;

enum Species {
    Dog(false, (short) 4, true),
    DomesticCat(false, (short) 4, true),
    Fish(false, (short) 0, false),
    RoboCat(false, (short) 4, true),
    Unknown(false,(short) 0,false);
    private boolean canFly;
    private short numberOfLegs;
    private boolean hasFur;

    private Species(boolean canFly, short numberOfLegs, boolean hasFur) {
        this.canFly = canFly;
        this.numberOfLegs = numberOfLegs;
        this.hasFur = hasFur;
    }
}