package ua.lviv.iot.ClothingStore.manager;

import ua.lviv.iot.ClothingStore.model.Clothes;
import java.util.List;

public interface IStoreManager {
    void addGoods(Clothes goods, boolean isFestive);

    List<Clothes> findFestiveClothes(boolean isFestive);

    List<Clothes> getGoodsSortedByBrandGrowing(String brand, boolean isFestive);
    List<Clothes> getGoodsSortedByBrandFallingDown(String brand, boolean isFestive);

    List<Clothes> getGoodsSortedByPriceFallingDown(int price, boolean isFestive);
    List<Clothes> getGoodsSortedByPriceGrowing( int price, boolean isFestive);
}
