package javaCollections.mainTask.sweets;

import javaCollections.mainTask.featuredCategories.Brand;
import javaCollections.mainTask.featuredCategories.Colour;
import javaCollections.mainTask.featuredCategories.RawMaterial;
import javaCollections.mainTask.featuredCategories.Wrapper;

public class Marmalade extends Sweets {

    private Colour colour;
    private boolean sugarTopping;
    private RawMaterial rawMaterial;

    public Marmalade(Brand brand, double weight, Wrapper wrapper, double sugarContentIn100Grams, Colour colour, boolean sugarTopping, RawMaterial rawMaterial) {
        super(brand, weight, wrapper, sugarContentIn100Grams);
        this.colour = colour;
        this.sugarTopping = sugarTopping;
        this.rawMaterial = rawMaterial;
    }

    @Override
    public String toString() {
        return "Marmalade{" + super.toString() +
                "colour=" + colour +
                ", sugarTopping=" + sugarTopping +
                ", rawMaterial=" + rawMaterial +
                '}';
    }
}
