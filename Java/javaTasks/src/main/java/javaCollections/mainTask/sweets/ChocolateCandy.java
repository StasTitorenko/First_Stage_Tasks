package javaCollections.mainTask.sweets;

import javaCollections.mainTask.featuredCategories.Brand;
import javaCollections.mainTask.featuredCategories.Chocolate;
import javaCollections.mainTask.featuredCategories.Wrapper;

public class ChocolateCandy extends Sweets {

    private Chocolate kindOfChocolate;
    private boolean waferInterlayer;

    public ChocolateCandy(Brand brand, double weight, Wrapper wrapper, double sugarContentIn100Grams, Chocolate kindOfChocolate, boolean waferInterlayer) {
        super(brand, weight, wrapper, sugarContentIn100Grams);
        this.kindOfChocolate = kindOfChocolate;
        this.waferInterlayer = waferInterlayer;
    }

    @Override
    public String toString() {
        return "ChocolateCandy{" + super.toString() +
                "kindOfChocolate=" + kindOfChocolate +
                ", waferInterlayer=" + waferInterlayer +
                '}';
    }
}
