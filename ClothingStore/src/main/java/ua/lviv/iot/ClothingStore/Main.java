package ua.lviv.iot.ClothingStore;

import ua.lviv.iot.ClothingStore.model.Blouse;
import ua.lviv.iot.ClothingStore.model.Trousers;
import ua.lviv.iot.ClothingStore.model.Shorts;
import ua.lviv.iot.ClothingStore.model.Dress;
import ua.lviv.iot.ClothingStore.model.Clothes;
import ua.lviv.iot.ClothingStore.manager.impl.StoreWriter;
import ua.lviv.iot.ClothingStore.manager.impl.StoreManager;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        StoreManager solmar = new StoreManager();
        List<Clothes> clothes = new ArrayList<>();

        Shorts shorts1 = new Shorts(500, "S", false, "Nike");
        Shorts shorts2 = new Shorts(550, "M", true, "Zara");

        Trousers trousers1 = new Trousers(800, "M", true, "cotton", "straight", "Reserved");
        Trousers trousers2 = new Trousers(600, "S", false, "jeans", "Mom", "Zara");

        Blouse blouse1 = new Blouse(600, "white", "S", true, true, "Gucci");
        Blouse blouse2 = new Blouse(769, "grey", "M", false, true, "Zara");

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

        solmar.addGoods(clothes, shorts1);
        solmar.addGoods(clothes, shorts2);
        solmar.addGoods(clothes, trousers1);
        solmar.addGoods(clothes, trousers2);
        solmar.addGoods(clothes, blouse1);
        solmar.addGoods(clothes, blouse2);
        solmar.addGoods(clothes, dress1);
        solmar.addGoods(clothes, dress2);

        System.out.println("Clothes suitable for a festive reception:");
        System.out.println(solmar.findFestiveClothes(clothes, true));
        System.out.println();
        System.out.println("Festive clothes is sorted by brand in ascending order:");
        System.out.println(solmar.getGoodsSortedByBrandGrowing(clothes, "Zara"));
        System.out.println();
        System.out.println("Festive clothes is sorted by price in ascending order:");
        System.out.println(solmar.getGoodsSortedByPriceGrowing(clothes));
        System.out.println();
        System.out.println("Festive clothes is sorted by brand in descending order:");
        System.out.println(solmar.getGoodsSortedByBrandFallingDown(clothes, "Zara"));
        System.out.println();
        System.out.println("Festive clothes is sorted by price in descending order:");
        System.out.println(solmar.getGoodsSortedByPriceFallingDown(clothes));

        StoreWriter table = new StoreWriter();

        table.writeCSV(clothes);

    }
}
