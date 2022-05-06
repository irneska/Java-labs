package ua.lviv.iot.ClothingStore.manager.impl;

import ua.lviv.iot.ClothingStore.manager.IStoreManager;
import ua.lviv.iot.ClothingStore.model.Clothes;

import java.util.*;
import java.util.stream.Collectors;

public class StoreManager implements IStoreManager {


    public void addGoods(List<Clothes> solmar, Clothes goods) {
        if (goods.getIsFestive()) {
            solmar.add(goods);
        }
    }

    @Override
    public List<Clothes> findFestiveClothes(List<Clothes> solmar, boolean isFestive) {
        return solmar.stream()
                .filter(clothes -> Objects.equals(clothes.getIsFestive(), isFestive))
                .collect(Collectors.toList());
    }

    @Override
    public List<Clothes> getGoodsSortedByBrandGrowing(List<Clothes> solmar, String brand) {
        return solmar.stream()
                .filter(clothes -> Objects.equals(clothes.getBrand(), brand))
                .sorted(Comparator.comparing(Clothes::getBrand))
                .collect(Collectors.toList());
        }

        @Override
        public List<Clothes> getGoodsSortedByPriceFallingDown(List<Clothes> solmar){
            return solmar.stream()
                    .sorted(Comparator.comparing(Clothes::getPrice).reversed())
                    .collect(Collectors.toList());
        }

    @Override
    public List<Clothes> getGoodsSortedByBrandFallingDown(List<Clothes> solmar, String brand) {
        return solmar.stream()
                .filter(clothes -> Objects.equals(clothes.getBrand(), brand))
                .sorted(Comparator.comparing(Clothes::getBrand).reversed())
                .collect(Collectors.toList());
    }

    @Override
    public List<Clothes> getGoodsSortedByPriceGrowing(List<Clothes> solmar){
        return solmar.stream()
                .sorted(Comparator.comparing(Clothes::getPrice))
                .collect(Collectors.toList());
    }

    }

