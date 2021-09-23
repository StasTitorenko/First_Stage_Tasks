package Java_Collections.Main_Task.Sweets;

import Java_Collections.Main_Task.FeaturedCategories.Brand;
import Java_Collections.Main_Task.FeaturedCategories.Colour;
import Java_Collections.Main_Task.FeaturedCategories.RawMaterial;
import Java_Collections.Main_Task.FeaturedCategories.Wrapper;

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
