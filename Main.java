package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashSet<String> habits = new HashSet<>();
        habits.add("run");
        habits.add("eat");
        habits.add("walk");
        habits.add("bark");

        HashMap<DaysOfWeek, String> schedule = new HashMap<>();
        schedule.put(DaysOfWeek.Tuesday, "wake up");
        schedule.put(DaysOfWeek.Thursday, "get up");
        schedule.put(DaysOfWeek.Wednesday, "run");
        schedule.put(DaysOfWeek.Sunday, "walk");
        Pet pet = new Dog(Species.Dog, "maks");
        Pet pet1 = new DomesticCat(Species.DomesticCat, "mestan", 3, (byte) 55, habits);
        Pet pet2 = new Fish();
        Pet pet3 = new RoboCat(null, "efefe");
        Human father = new Man("samir", "aliyev", 1969, (byte) 98, schedule);
        Woman mother = new Woman("aygun", "aliyeva", 1970, (byte) 95, schedule);
        Human child = new Man("resad", "aliyev", 2000, (byte) 93, schedule);
        Human child1 = new Woman("ajdjs", "aliyfdsfev", 435, (byte) 34, schedule);
        Human child2 = new Man("dgg", "bgbg", 435, (byte) 34, schedule);
        Human brother = new Man("ilqar", "aliyev", 2005);
        Human grandFather = new Man();
        Family family = new Family(father, mother);
        mother.setFamily(family);
        father.setFamily(family);
        Human newChild = mother.bornChild();

        System.out.println(child.getName());
        System.out.println(child);

        family.addChildren(child);
        family.addChildren(child1);
        family.addChildren(child2);
        family.addChildren(child2);
        System.out.println(family);
        System.out.println(family.deleteChild(2));
        System.out.println(family);
        System.out.println(family.deleteChild(child));
        System.out.println(family);
        System.out.println(family.getFather());
        System.out.println(father.getFamily().getMother());
        System.out.println(mother.getFamily());
    }
}