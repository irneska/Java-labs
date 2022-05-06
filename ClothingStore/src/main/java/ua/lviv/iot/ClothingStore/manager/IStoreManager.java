package ua.lviv.iot.ClothingStore.manager;

import ua.lviv.iot.ClothingStore.model.Clothes;
import java.util.List;

public interface IStoreManager {
    void addGoods(List<Clothes> solmar, Clothes goods);

    List<Clothes> findFestiveClothes(List<Clothes> solmar, boolean isFestive);

    List<Clothes> getGoodsSortedByBrandGrowing(List<Clothes> solmar, String brand);
    List<Clothes> getGoodsSortedByBrandFallingDown(List<Clothes> solmar, String brand);

    List<Clothes> getGoodsSortedByPriceFallingDown(List<Clothes> solmar);
    List<Clothes> getGoodsSortedByPriceGrowing(List<Clothes> solmar);
}
