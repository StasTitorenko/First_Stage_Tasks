package javaCollections.mainTask.sweets;

import javaCollections.mainTask.featuredCategories.Brand;
import javaCollections.mainTask.featuredCategories.Wrapper;

public class Sweets {

    private Brand brand;
    private double weight;
    private Wrapper wrapper;
    private double sugarContentIn100Grams;

    public Sweets(Brand brand, double weight, Wrapper wrapper, double sugarContentIn100Grams) {
        this.brand = brand;
        this.weight = weight;
        this.wrapper = wrapper;
        this.sugarContentIn100Grams = sugarContentIn100Grams;
    }

    public Brand getBrand() {
        return brand;
    }

    public double getWeight() {
        return weight;
    }

    public Wrapper getWrapper() {
        return wrapper;
    }

    public double getSugarContentIn100Grams() {
        return sugarContentIn100Grams;
    }

    @Override
    public String toString() {
        return  "Brand=" + brand +
                ", Weight=" + weight +
                ", Wrapper=" + wrapper +
                ", SugarContentIn100Grams=" + sugarContentIn100Grams +" ";
    }
}
