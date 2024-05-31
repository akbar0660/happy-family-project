package org.example;

import java.util.List;
import java.util.Set;

public class FamilyController {
    private FamilyService familyService;

    FamilyController(FamilyService service) {
        this.familyService = service;
    }

    public List<Family> getAllFamilies() {
        return familyService.getAllFamilies();
    }

    public void displayAllFamilies() {
        familyService.displayAllFamilies();
    }

    public List<Family> getFamiliesBiggerThan(int count) {
        return familyService.getFamiliesBiggerThan(count);
    }

    public List<Family> getFamiliesLessThan(int count) {
        return familyService.getFamiliesLessThan(count);
    }

    public Family createNewFamily(Human father, Human mother) {
        return familyService.createNewFamily(father, mother);
    }

    public void deleteFamilyByIndex(int index) {
        familyService.deleteFamilByIndex(index);
    }

    public Family adoptChild(Family family, Human human) {
        return familyService.adoptChild(family, human);
    }

    public void deleteChildrenOlderThan(int age) {
        familyService.deleteAllChildrenOlderThan(age);
    }

    public int count() {
        return familyService.count();
    }

    public Family getFamilyById(int id) {
        return familyService.getFamilyById(id);
    }

    public void addFamily(Family family) {
        familyService.addFamily(family);
    }

    public Set<Pet> getPets(int index) {
        return familyService.getPets(index);
    }

    public void addPets(int index, Pet pet) {
        familyService.addPet(index, pet);
    }

    public int getFamiliesWithTheMemberNumber(int num){
        return familyService.countFamiliesWithTheMemberNumber(num);
    }

    public Family bornChild(Family family, String type){
        return familyService.bornChild(family,type);
    }

}

