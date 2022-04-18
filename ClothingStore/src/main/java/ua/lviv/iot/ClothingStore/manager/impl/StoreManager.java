package ua.lviv.iot.ClothingStore.manager.impl;

import ua.lviv.iot.ClothingStore.manager.IStoreManager;
import ua.lviv.iot.ClothingStore.model.Clothes;

import java.util.*;
import java.util.stream.Collectors;

public class StoreManager implements IStoreManager {

    private final List<Clothes> clothes = new LinkedList<>();

    @Override
    public void addGoods(Clothes goods, boolean isFestive) {
        if (isFestive) {
            clothes.add(goods);
        }
    }

    @Override
    public List<Clothes> findFestiveClothes(boolean isFestive) {
        return clothes.stream()
                .filter(clothes -> Objects.equals(clothes.getIsFestive(), isFestive))
                .collect(Collectors.toList());
    }

    @Override
    public List<Clothes> getGoodsSortedByBrandGrowing(String brand, boolean isFestive) {
        return clothes.stream()
                .sorted(Comparator.comparing(Clothes::getBrand).reversed())
                .collect(Collectors.toList());
        }

        @Override
        public List<Clothes> getGoodsSortedByPriceFallingDown( int price, boolean isFestive){
            return clothes.stream()
                    .sorted(Comparator.comparing(Clothes::getPrice).reversed())
                    .collect(Collectors.toList());
        }

    @Override
    public List<Clothes> getGoodsSortedByBrandFallingDown(String brand, boolean isFestive) {
        return clothes.stream()
                .sorted(Comparator.comparing(Clothes::getBrand))
                .collect(Collectors.toList());
    }

    @Override
    public List<Clothes> getGoodsSortedByPriceGrowing( int price, boolean isFestive){
        return clothes.stream()
                .sorted(Comparator.comparing(Clothes::getPrice))
                .collect(Collectors.toList());
    }

    }

