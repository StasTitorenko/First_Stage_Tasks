package Java_Collections.Main_Task.Sweets;

import Java_Collections.Main_Task.FeaturedCategories.Brand;
import Java_Collections.Main_Task.FeaturedCategories.Jam;
import Java_Collections.Main_Task.FeaturedCategories.Wrapper;

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
