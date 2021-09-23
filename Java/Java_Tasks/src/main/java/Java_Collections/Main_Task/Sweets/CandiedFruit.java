package Java_Collections.Main_Task.Sweets;

import Java_Collections.Main_Task.FeaturedCategories.Brand;
import Java_Collections.Main_Task.FeaturedCategories.RawMaterial;
import Java_Collections.Main_Task.FeaturedCategories.Wrapper;

public class CandiedFruit extends Sweets{

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
