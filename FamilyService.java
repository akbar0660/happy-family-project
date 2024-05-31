package org.example;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class FamilyService {
    private FamilyDAO dao;

    FamilyService(FamilyDAO dao) {
        this.dao = dao;
    }

    public List<Family> getAllFamilies() {
        return dao.getAllFamilies();
    }

    public void displayAllFamilies() {
        List<Family> families = dao.getAllFamilies();
        for (int i = 0; i < families.size(); i++) {
            System.out.println("Family " + i + ": " + families.get(i));
        }
    }

    public List<Family> getFamiliesBiggerThan(int count) {
        return dao.getAllFamilies()
                .stream().filter(x -> x.countFamily() > count)
                .collect(Collectors.toList());
    }

    public List<Family> getFamiliesLessThan(int count) {
        return dao.getAllFamilies().stream().filter(x -> x.countFamily() < count).toList();
    }

    public Family createNewFamily(Human father, Human mother) {
        Family newFamily = new Family(father, mother);
        dao.saveFamily(newFamily);
        return newFamily;
    }

    public boolean deleteFamilByIndex(int index) {
        return dao.deleteFamily(index);
    }

    public Family adoptChild(Family family, Human child) {
        family.addChildren(child);
        dao.saveFamily(family);
        return family;
    }

    public void deleteAllChildrenOlderThan(int age) {
        dao.getAllFamilies().stream()
                .forEach(x -> x.deleteChildren
                        (x.getChildren().stream()
                                .filter(y -> (2024 - y.getYear()) > age)
                                .toList()));
    }

    public int count() {
        return dao.getAllFamilies().size();
    }

    public Family getFamilyById(int id) {
        return dao.getFamilyByIndex(id);
    }

    public Set<Pet> getPets(int index) {
        return dao.getFamilyByIndex(index).getPet();
    }

    public void addPet(int familyIndex, Pet pet) {
        dao.getFamilyByIndex(familyIndex).addPet(pet);
    }

    public void addFamily(Family family) {
        dao.saveFamily(family);
    }

    public int countFamiliesWithTheMemberNumber(int num) {
        return (int) dao.getAllFamilies().stream().filter(x -> x.countFamily() == num).count();
    }

    public Family bornChild(Family family, String type) {
        String[] names = {"samir", "resad", "tural", "sarkhan", "akbar", "xemid"};
        Random rand = new Random();
        String name = names[rand.nextInt(names.length)];
        Human child;
        child = type.equalsIgnoreCase("masculine") ? new Man() : new Woman();
        child.setYear(LocalDate.now().getYear());
        child.setFamily(family);
        child.setName(name);
        child.setSurname(family.getFather().getSurname());
        child.setIq((byte)((family.getFather().getIq()+family.getMother().getIq())/2));
        family.addChildren(child);
        dao.saveFamily(family);
        return family;
    }

}
