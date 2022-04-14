package ua.lviv.iot.ClothingStore;

import ua.lviv.iot.ClothingStore.model.*;
import ua.lviv.iot.ClothingStore.manager.impl.*;

public class Main {
    public static void main(String[] args) {

        StoreManager solmar = new StoreManager();

        Shorts shorts1 = new Shorts(500, "S", false, "Nike");
        Shorts shorts2 = new Shorts(550, "M", true, "Zara");

        Trousers trousers1 = new Trousers(800, "M",  true, "cotton", "straight","Reserved" );
        Trousers trousers2 = new Trousers(600, "S", false, "jeans", "Mom", "Zara");

        Blouse blouse1 = new Blouse(600, "white", "S", true, true, "Gucci");
        Blouse blouse2 = new Blouse(769, "grey", "M", false, false, "Zara");

        Dress dress1 = new Dress(600, "S", false, "oversize", true, "Reserved");
        Dress dress2 = new Dress(1199, "S", true, "evening gown", true, "H&M");

        System.out.println(shorts1);
        System.out.println(shorts2);
        System.out.println();
        System.out.println(trousers1);
        System.out.println(trousers2);
        System.out.println();
        System.out.println(blouse1);
        System.out.println(blouse2);
        System.out.println();
        System.out.println(dress1);
        System.out.println(dress2);
        System.out.println();

        solmar.addGoods(shorts1, false);
        solmar.addGoods(shorts2, true);
        solmar.addGoods(trousers1, true);
        solmar.addGoods(trousers2, false);
        solmar.addGoods(blouse1, true);
        solmar.addGoods(blouse2, false);
        solmar.addGoods(dress1, false);
        solmar.addGoods(dress2, true);

        System.out.println("Clothes suitable for a festive reception:");
        System.out.println(solmar.findFestiveClothes(true));
        System.out.println();
        System.out.println("Festive clothes is sorted by brand in ascending order:");
        System.out.println(solmar.getGoodsSortedByBrandGrowing( "Zara", true));
        System.out.println();
        System.out.println("Festive clothes is sorted by price in ascending order:");
        System.out.println(solmar.getGoodsSortedByPriceGrowing(600, true));
        System.out.println();
        System.out.println("Festive clothes is sorted by brand in descending order:");
        System.out.println(solmar.getGoodsSortedByBrandFallingDown("Zara", true));
        System.out.println();
        System.out.println("Festive clothes is sorted by price in descending order:");
        System.out.println(solmar.getGoodsSortedByPriceFallingDown(600, true));


    }
}
