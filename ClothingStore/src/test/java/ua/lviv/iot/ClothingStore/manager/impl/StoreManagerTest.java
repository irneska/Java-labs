package ua.lviv.iot.ClothingStore.manager.impl;

import ua.lviv.iot.ClothingStore.model.Clothes;
import ua.lviv.iot.ClothingStore.model.Trousers;
import ua.lviv.iot.ClothingStore.model.Dress;
import ua.lviv.iot.ClothingStore.model.Blouse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StoreManagerTest {
    private final StoreManager storeManager = new StoreManager();
    private List<Clothes> solmar = new ArrayList<>();
    Trousers trousers1 = new Trousers(800, "M",  true, "cotton", "straight","Reserved" );
    Blouse blouse1 = new Blouse(600, "white", "S", true, true, "Gucci");
    Dress dress1 = new Dress(600, "S", false, "oversize", true, "Reserved");

    @org.junit.jupiter.api.Test
    void addGoodsIsFestive() {
        int sizeOfList = solmar.size();
        storeManager.addGoods(solmar, dress1);
        assertEquals(sizeOfList + 1, solmar.size());
    }

    @org.junit.jupiter.api.Test
    void findFestiveClothes() {
        solmar.add(trousers1);
        solmar.add(blouse1);
        solmar.add(dress1);
        solmar = storeManager.findFestiveClothes(solmar, true);
        List<Clothes> testList = Arrays.asList(trousers1, blouse1, dress1);
        assertEquals(testList, solmar);
    }

    @org.junit.jupiter.api.Test
    void getGoodsSortedByBrandGrowing() {
        solmar.add(trousers1);
        solmar.add(blouse1);
        solmar.add(dress1);
        solmar = storeManager.getGoodsSortedByBrandGrowing(solmar, "Reserved");
        List<Clothes> testList = Arrays.asList(trousers1, dress1);
        assertEquals(testList, solmar);

    }

    @org.junit.jupiter.api.Test
    void getGoodsSortedByPriceFallingDown() {
        solmar.add(trousers1);
        solmar.add(blouse1);
        solmar.add(dress1);
        solmar = storeManager.getGoodsSortedByPriceFallingDown(solmar);
        List<Clothes> testList = Arrays.asList(trousers1, blouse1, dress1);
        assertEquals(testList, solmar);
    }

    @org.junit.jupiter.api.Test
    void getGoodsSortedByBrandFallingDown() {
        solmar.add(trousers1);
        solmar.add(blouse1);
        solmar.add(dress1);
        solmar = storeManager.getGoodsSortedByBrandFallingDown(solmar, "Reserved");
        List<Clothes> testList = Arrays.asList(trousers1, dress1);
        assertEquals(testList, solmar);
    }

    @org.junit.jupiter.api.Test
    void getGoodsSortedByPriceGrowing() {
        solmar.add(trousers1);
        solmar.add(blouse1);
        solmar.add(dress1);
        solmar = storeManager.getGoodsSortedByPriceGrowing(solmar);
        List<Clothes> testList = Arrays.asList(blouse1, dress1, trousers1);
        assertEquals(testList, solmar);
    }
}