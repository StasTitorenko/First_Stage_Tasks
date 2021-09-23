package Java_Collections.Main_Task;

import Java_Collections.Main_Task.FeaturedCategories.*;
import Java_Collections.Main_Task.Sweets.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Runner {

    private static void printGift(List<Sweets> sweets){
        for (Sweets sweet :sweets){
            System.out.println(sweet);
        }
    }

    public static void main(String[] args) {
        List <Sweets> sweets = Arrays.asList(
                new Caramel(Brand.AMEDEI, 150, Wrapper.PAPER,15, Jam.APPLE_JAM),
                new ChocolateCandy(Brand.CADBURY, 200,Wrapper.PLASTIC,50,Chocolate.DARK,true),
                new KinderSurprise(Brand.FERRERO_ROCHER,100,Wrapper.PLASTIC,350, Toy.DRAGON),
                new Marmalade(Brand.NESTLE, 70,Wrapper.WITHOUT,99,Colour.MULTICOLORED,true,RawMaterial.PEACH),
                new CandiedFruit(Brand.LINDT,50,Wrapper.WITHOUT,170,RawMaterial.APPLE),
                new Marshmallow(Brand.CADBURY,50,Wrapper.PAPER,90,Colour.GREEN,RawMaterial.PEACH,false)
        );
        NewYearGift newYearGift = new NewYearGift(sweets);

        do {
            Scanner input = new Scanner(System.in);
            System.out.println("1 - Form a gift");
            System.out.println("2 - Find out the weight of the gift");
            System.out.println("3 - Sort gift by Brand");
            System.out.println("4 - Sort gift by Weight");
            System.out.println("5 - Sort gift by Wrapper");
            System.out.println("6 - Sort gift by Sugar");
            System.out.println("7 - Sort gift by user range of sugar");
            System.out.println("8 - Exit");
            System.out.print("Enter number of menu:");
            int chooseNumber = input.nextInt();
            if (chooseNumber > 0 && chooseNumber < 9) {
                switch (chooseNumber) {
                    case 1:
                        System.out.println("New Year Gift:");
                        printGift(newYearGift.getSweets());
                        break;
                    case 2:
                        System.out.println("Total weight of new year gift=" + newYearGift.weightGift());
                        break;
                    case 3:
                        System.out.println("Sorted by brand:");
                        System.out.println(newYearGift.sortByBrand());
                        break;
                    case 4:
                        System.out.println("Sorted by weight:");
                        System.out.println(newYearGift.sortByWeight());
                        break;
                    case 5:
                        System.out.println("Sorted by wrapper:");
                        System.out.println(newYearGift.sortByWrapper());
                        break;
                    case 6:
                        System.out.println("Sorted by sugar:");
                        System.out.println(newYearGift.sortBySugarContains());
                        break;
                    case 7:
                        System.out.println("Enter the minimum amount of sugar");
                        int minAmountOfSugar = input.nextInt();
                        System.out.println("Enter the maximum amount of sugar");
                        int maxAmountOfSugar = input.nextInt();
                        printGift(newYearGift.getSweetsBySugarContainsRange(minAmountOfSugar, maxAmountOfSugar));
                        break;
                    case 8:
                        return;
                }
            } else System.out.println("Wrong number");
        }  while (true);

    }
}
