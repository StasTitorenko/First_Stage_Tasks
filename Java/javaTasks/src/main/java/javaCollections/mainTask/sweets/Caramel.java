package javaCollections.mainTask.sweets;

import javaCollections.mainTask.featuredCategories.Brand;
import javaCollections.mainTask.featuredCategories.Jam;
import javaCollections.mainTask.featuredCategories.Wrapper;

public class Caramel extends Sweets {

    private Jam typeOfJamInside;

    public Caramel(Brand brand, double weight, Wrapper wrapper, double sugarContentIn100Grams, Jam typeOfJamInside) {
        super(brand, weight, wrapper, sugarContentIn100Grams);
        this.typeOfJamInside = typeOfJamInside;
    }

    @Override
    public String toString() {
        return "Caramel{" + super.toString() +
                "typeOfJamInside=" + typeOfJamInside +
                '}';
    }
}
