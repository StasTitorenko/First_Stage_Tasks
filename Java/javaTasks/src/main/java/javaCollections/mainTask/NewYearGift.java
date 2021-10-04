package javaCollections.mainTask;

import javaCollections.mainTask.sweets.Sweets;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import static java.util.Comparator.comparingDouble;

public class NewYearGift {

    private List <Sweets> sweets;

    public int weightGift() {
        int totalWeight = 0;
        for (Sweets sweets : sweets ) {
            totalWeight += sweets.getWeight();
        }
        return  totalWeight;
    }

    public List<Sweets> getSweetsBySugarContainsRange(int minAmountOfSugar, int maxAmountOfSugar) {
        List <Sweets> giftRangedBySugar = new ArrayList<>();
        for (Sweets sweets : sweets) {
            if((sweets.getSugarContentIn100Grams() >= minAmountOfSugar) &&
                    (sweets.getSugarContentIn100Grams() <= maxAmountOfSugar)) {
                giftRangedBySugar.add(sweets);
            }
        }
        return giftRangedBySugar;
    }

    public NewYearGift sortByBrand() {
        sweets.sort(Comparator.comparing(o -> o.getBrand().toString()));
        return this;
    }

    public NewYearGift sortByWeight() {
        sweets.sort(comparingDouble(o -> o.getWeight()));
        return this;
    }

    public NewYearGift sortByWrapper() {
        sweets.sort(Comparator.comparing(o -> o.getWrapper()));
        return this;
    }

    public NewYearGift sortBySugarContains() {
        sweets.sort(comparingDouble(o -> o.getSugarContentIn100Grams()));
        return this;
    }

    public NewYearGift(List<Sweets> sweets) {
        this.sweets = sweets;
    }

    public List<Sweets> getSweets() {
        return sweets;
    }

    @Override
    public String toString() {
        return "NewYearGift{" +
                "sweets=" + sweets +
                '}';
    }
}
