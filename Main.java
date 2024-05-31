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
        Human father = new Man("samir", "aliyev", 1969, (byte) 98, schedule);
        Woman mother = new Woman("aygun", "aliyeva", 1970, (byte) 95, schedule);
        Human child = new Man("resad", "aliyev", 2000, (byte) 93, schedule);
        Human child1 = new Woman("ajdjs", "aliyfdsfev", 435, (byte) 34, schedule);
        Human child2 = new Man("dgg", "bgbg", 435, (byte) 34, schedule);
        Family family = new Family(father,mother);
        mother.setFamily(family);
        father.setFamily(family);

        family.addChildren(child);
        family.addChildren(child1);
        family.addChildren(child2);
        family.addChildren(child2);
        System.out.println(family.deleteChild(2));
        System.out.println(family.deleteChild(child));


        FamilyDAO dao = new CollectionFamilyDAO();
        FamilyService service = new FamilyService(dao);
        FamilyController controller = new FamilyController(service);
        controller.addFamily(family);
        controller.displayAllFamilies();
        Human mother1 = new Woman("Filankes","Filankesova",1980);
        Human father1 = new Man("Filankes","Filankesov",1981);
        Family family2 = controller.createNewFamily(father1,mother1);
        controller.bornChild(family2,"masculine");
        controller.displayAllFamilies();
    }
}