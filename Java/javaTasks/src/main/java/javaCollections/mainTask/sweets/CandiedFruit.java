package javaCollections.mainTask.sweets;

import javaCollections.mainTask.featuredCategories.Brand;
import javaCollections.mainTask.featuredCategories.RawMaterial;
import javaCollections.mainTask.featuredCategories.Wrapper;

public class CandiedFruit extends Sweets {

    private RawMaterial rawMaterial;

    public CandiedFruit(Brand brand, double weight, Wrapper wrapper, double sugarContentIn100Grams, RawMaterial rawMaterial) {
        super(brand, weight, wrapper, sugarContentIn100Grams);
        this.rawMaterial = rawMaterial;
    }

    @Override
    public String toString() {
        return "CandiedFruit{" + super.toString() +
                "rawMaterial=" + rawMaterial +
                '}';
    }
}
