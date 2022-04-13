package ua.lviv.iot.ClothingStore.manager;

import ua.lviv.iot.ClothingStore.model.Clothes;
import java.util.List;

/*Магазин одягу. Сформувати ієрархію товарів, присутніх в магазині одягу. Реалізувати
пошук одягу, необхідного для урочистого прийому. Відсортувати результат пошуку по брендах
Реалізувати можливість  сортування знайдених товарів за ще одним типом параметру (на вибір,
реалізовано як окремий метод) Реалізація сортування має передбачати можливість
сортувати як за спаданням, так і за зростанням*/
public interface IStoreManager {


    void addGoods(Clothes goods, boolean isFestive);

    List<Clothes> findFestiveClothes(boolean isFestive);

    List<Clothes> getGoodsSortedByBrandGrowing(String brand, boolean isFestive);
    List<Clothes> getGoodsSortedByBrandFallingDown(String brand, boolean isFestive);

    List<Clothes> getGoodsSortedByPriceFallingDown(int price, boolean isFestive);
    List<Clothes> getGoodsSortedByPriceGrowing( int price, boolean isFestive);
}
