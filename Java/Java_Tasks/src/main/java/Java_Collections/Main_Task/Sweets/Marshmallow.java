package Java_Collections.Main_Task.Sweets;

import Java_Collections.Main_Task.FeaturedCategories.Brand;
import Java_Collections.Main_Task.FeaturedCategories.Colour;
import Java_Collections.Main_Task.FeaturedCategories.RawMaterial;
import Java_Collections.Main_Task.FeaturedCategories.Wrapper;

public class Marshmallow extends Sweets{

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
