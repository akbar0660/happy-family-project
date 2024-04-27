package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pet pet = new Pet(Species.Dog, "maks");
        Pet pet1 = new Pet(Species.Cat, "mestan", 3, (byte) 55, new String[]{"icir", "yeyir", "yatir"});
        Pet pet2 = new Pet();

        Human father = new Human("samir", "aliyev", 56);
        Human mother = new Human("aygun", "aliyeva", 55);
        Human child = new Human("resad", "aliyev", 2000, (byte) 93, new String[][]{{DaysOfWeek.Tuesday.name(), DaysOfWeek.Thursday.name()}, {"wake up", "get up"}});
        Human child1 = new Human("ajdjs", "aliyfdsfev", 435, (byte) 34, new String[][]{{DaysOfWeek.Friday.name(), DaysOfWeek.Wednesday.name()}, {"wake up", "get up"}});
        Human child2 = new Human("dgg", "bgbg", 435, (byte) 34, new String[][]{{DaysOfWeek.Sunday.name(), DaysOfWeek.Monday.name()}, {"wake up", "get up"}});
        Human brother = new Human("ilqar", "aliyev", 2005);
        Human grandFather = new Human();

        System.out.println(child.getName());
        System.out.println(child);
        Family family = new Family(father,mother);

        family.addChildren(child);
        family.addChildren(child1);
        family.addChildren(child2);
        System.out.println(family.toString());
        System.out.println(family.deleteChild(2));
        System.out.println(family);
        System.out.println(family.deleteChild(child));
        System.out.println(family);
    }
}