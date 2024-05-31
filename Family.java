package org.example;

import java.util.*;

public class Family {
    private Human father;
    private Human mother;
    private List<Human> children;
    private HashSet<Pet> pet;

    static {
        System.out.println(Family.class.getName() + " class is loaded");
    }

    {
        children = new ArrayList<>();
        pet = new HashSet<>();
        System.out.println(Family.class.getName() + " object is created");
    }

    public Family(Human father, Human mother) {
        this.father = father;
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public Human getMother() {
        return mother;
    }

    public List<Human> getChildren() {
        return children;
    }

    public Set<Pet> getPet() {
        return pet;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public void setChild(List<Human> children) {
        this.children = children;
    }

    public void setPet(HashSet<Pet> pet) {
        this.pet = pet;
    }

    public boolean deleteChild(int index) {
        if (!children.isEmpty()) {
            children.remove(index);
            return true;
        }
        return false;
    }
    public void deleteChildren(List<Human> children){
        children.removeAll(children);
    }

    public boolean deleteChild(Human child) {
        return children.remove(child);
    }

    public void addChildren(Human child) {
        if (children.contains(child)) {
            return;
        }
        children.add(child);
    }

    public void addPet(Pet pet){
        this.pet.add(pet);
    }

    public int countFamily() {
        return children.size() + pet.size() + 2;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (Pet pet : pet) {
            sb2 = sb2.append(pet.getNickname()).append(" ");
        }
        if (!children.isEmpty()) {
            for (int i = 0; i < this.children.size(); i++) {
                sb = sb.append(children.get(i).getName()).append(", ");
            }
            if (!pet.isEmpty()) {
                return "Family consists of " + this.countFamily() + " members.Father: " + this.father.getName() + " mother: " + this.mother.getName() + " children: " + sb + " pet: " + sb2;
            } else {
                return "Family consists of " + this.countFamily() + " members.Father: " + this.father.getName() + " mother: " + this.mother.getName() + " children: " + sb + "no pet";
            }
        } else {
            return "Family consists of " + this.countFamily() + " members.Father: " + this.father.getName() + " mother: " + this.mother.getName() + " no children";
        }
    }

    @Override
    public boolean equals(Object obj) {
        return ((Family) obj).father.equals(this.father) && ((Family) obj).mother.equals(this.mother);
    }

    @Override
    public int hashCode() {
        Random random = new Random();
        int hashCode = random.nextInt(1000);
        return hashCode;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("a family object is removed");
    }
}
