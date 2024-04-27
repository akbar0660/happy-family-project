package org.example;

import java.util.Arrays;
import java.util.Random;

public class Family {
    private Human father;
    private Human mother;
    private Human[] children;
    private Pet pet;
    static{
        System.out.println(Family.class.getName()+" class is loaded");
    }
    {
        System.out.println(Family.class.getName()+" object is created");
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

    public Human[] getChildren() {
        return children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public void setChild(Human[] children) {
        this.children = children;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public boolean deleteChild(int index) {
        if(index>children.length-1){
            return false;
        }else {
            int k = 0;
            Human[] childrenNew = new Human[children.length - 1];
            children[index] = null;
            for (int i = 0; i < children.length; i++) {
                if (children[i] != null) {
                    childrenNew[i] = children[i];
                    k++;
                }
            }
            this.children = childrenNew;
            return true;
        }
    }
    public boolean deleteChild(Human child){
        int i;
        for(i=0;i<children.length;i++){
            if(child.equals(children[i])){
                children[i]=null;
                break;
            }
        }
        if(i== children.length){
            return false;
        }else {
            int k = 0;
            Human[] childrenNew = new Human[children.length - 1];
            for (int d = 0; d < children.length; d++) {
                if (children[d] != null) {
                    childrenNew[k] = children[d];
                    k++;
                }
            }
            this.children = childrenNew;
            return true;
        }
    }

    public void addChildren(Human child) {
        if(children==null){
            Human[] children0 = new Human[1];
            children0[0] = child;
            children = children0;
        }else{
            Human[] childrenNew = new Human[children.length+1];
            for(int i = 0;i<children.length;i++){
                childrenNew[i]=children[i];
            }
            childrenNew[childrenNew.length-1]=child;
            this.children = childrenNew;
            System.out.println(Arrays.toString(this.children));
        }
    }
    public int countFamily(){
        int count;
        if(pet!=null){
            count = 3;
        }else{
            count = 2;
        }
        if(children!=null) {
            for (int i = 0; i < this.children.length; i++) {
                if (children[i] != null) {
                    count++;
                }
            }
        }
        return count;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if(this.children!=null){
            for (int i = 0; i < this.children.length; i++) {
                sb = sb.append(children[i].getName()).append(", ");
            }
            if(pet!=null) {
                return "Family consists of " + this.countFamily() + " members.Father: " + this.father.getName() + " mother: " + this.mother.getName() + " children: " + sb + " pet: " + this.pet.getNickname();
            }else{
                return "Family consists of " + this.countFamily() + " members.Father: " + this.father.getName() + " mother: " + this.mother.getName() + " children: " + sb;
            }
        }
        else{
            return "Family consists of "+this.countFamily()+" members.Father: " + this.father.getName() + " mother: " + this.mother.getName();
        }
    }

    @Override
    public boolean equals(Object obj) {
        return ((Family)obj).father.equals(this.father) && ((Family)obj).mother.equals(this.mother);

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
