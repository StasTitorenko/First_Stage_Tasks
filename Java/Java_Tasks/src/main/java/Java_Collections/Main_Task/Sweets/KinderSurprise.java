package Java_Collections.Main_Task.Sweets;

import Java_Collections.Main_Task.FeaturedCategories.Brand;
import Java_Collections.Main_Task.FeaturedCategories.Toy;
import Java_Collections.Main_Task.FeaturedCategories.Wrapper;

public class KinderSurprise extends Sweets{

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
