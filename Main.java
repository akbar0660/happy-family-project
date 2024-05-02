package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pet pet = new Dog(Species.Dog, "maks");
        Pet pet1 = new DomesticCat(Species.DomesticCat, "mestan", 3, (byte) 55, new String[]{"icir", "yeyir", "yatir"});
        Pet pet2 = new Fish();
        Pet pet3 = new RoboCat(null,"efefe");

        Human father = new Man("samir", "aliyev", 1969,(byte)98,new String[][]{{DaysOfWeek.Friday.name(), DaysOfWeek.Wednesday.name()}, {"wake up", "get up"}});
        Woman mother = new Woman("aygun", "aliyeva", 1970,(byte)95,new String[][]{{DaysOfWeek.Tuesday.name(), DaysOfWeek.Thursday.name()}, {"wake up", "get up"}});
        Human child = new Man("resad", "aliyev", 2000, (byte) 93, new String[][]{{DaysOfWeek.Tuesday.name(), DaysOfWeek.Thursday.name()}, {"wake up", "get up"}});
        Human child1 = new Woman("ajdjs", "aliyfdsfev", 435, (byte) 34, new String[][]{{DaysOfWeek.Friday.name(), DaysOfWeek.Wednesday.name()}, {"wake up", "get up"}});
        Human child2 = new Man("dgg", "bgbg", 435, (byte) 34, new String[][]{{DaysOfWeek.Sunday.name(), DaysOfWeek.Monday.name()}, {"wake up", "get up"}});
        Human brother = new Man("ilqar", "aliyev", 2005);
        Human grandFather = new Man();
        Family family = new Family(father,mother);
        mother.setFamily(family);
        father.setFamily(family);
        Human newChild = mother.bornChild();

        System.out.println(child.getName());
        System.out.println(child);
        family.addChildren(newChild);

        family.addChildren(child);
        family.addChildren(child1);
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