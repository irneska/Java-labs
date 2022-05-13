package ua.lviv.iot.ClothingStore.model;

public class Shorts extends Clothes {

    public Shorts(int price, String size, boolean isFestive, String brand) {
        super(price, size, isFestive, brand);
    }


    @Override
    public String toString() {
        return "Shorts(Price = " + price
                + ", size is " + size
                + ", isFestive = " + isFestive
                + ", brand = " + brand
                + ")";
    }
}
