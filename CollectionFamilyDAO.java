package org.example;

import java.util.ArrayList;
import java.util.List;

public class CollectionFamilyDAO implements FamilyDAO {
    private List<Family> families = new ArrayList<>();

    @Override
    public List<Family> getAllFamilies() {
        return new ArrayList<>(families);
    }

    @Override
    public Family getFamilyByIndex(int index) {
        if (index >= 0 || index < families.size())
            return families.get(index);
        else return null;
    }

    @Override
    public boolean deleteFamily(int index) {
        if (index >= 0 || index < families.size()) {
            families.remove(index);
            return true;
        } else return false;
    }

    @Override
    public boolean deleteFamily(Family family) {
        return families.remove(family);
    }

    @Override
    public void saveFamily(Family family) {
        if (families.contains(family)) {
             int index = families.indexOf(family);
             families.set(index,family);
        }else{
            families.addLast(family);
        }
    }
}
