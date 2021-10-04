package javaCollections.mainTask.sweets;

import javaCollections.mainTask.featuredCategories.Brand;
import javaCollections.mainTask.featuredCategories.Colour;
import javaCollections.mainTask.featuredCategories.RawMaterial;
import javaCollections.mainTask.featuredCategories.Wrapper;

public class Marshmallow extends Sweets {

    private Colour color;
    private RawMaterial rawMaterial;
    private boolean chocolateGlaze;

    public Marshmallow(Brand brand, double weight, Wrapper wrapper, double sugarContentIn100Grams, Colour color, RawMaterial rawMaterial, boolean chocolateGlaze) {
        super(brand, weight, wrapper, sugarContentIn100Grams);
        this.color = color;
        this.rawMaterial = rawMaterial;
        this.chocolateGlaze = chocolateGlaze;
    }

    @Override
    public String toString() {
        return "Marshmallow{" + super.toString() +
                "color=" + color +
                ", rawMaterial=" + rawMaterial +
                ", chocolateGlaze=" + chocolateGlaze +
                '}';
    }
}
