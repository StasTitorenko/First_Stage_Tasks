package javaCollections.mainTask.sweets;

import javaCollections.mainTask.featuredCategories.Brand;
import javaCollections.mainTask.featuredCategories.Toy;
import javaCollections.mainTask.featuredCategories.Wrapper;

public class KinderSurprise extends Sweets {

    private Toy kindOfToyInside;

    public KinderSurprise(Brand brand, double weight, Wrapper wrapper, double sugarContentIn100Grams, Toy kindOfToyInside) {
        super(brand, weight, wrapper, sugarContentIn100Grams);
        this.kindOfToyInside = kindOfToyInside;
    }

    @Override
    public String toString() {
        return "KinderSurprise{" + super.toString() +
                "kindOfToyInside=" + kindOfToyInside +
                '}';
    }
}
