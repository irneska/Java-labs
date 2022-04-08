package ua.lviv.iot.ClothingStore.model;

public abstract class Clothes {
    int price;
    String size;
    boolean isFestive;
    public Clothes(int price, String size, boolean isFestive){
        this.price = price;
        this.size = size;
        this.isFestive = isFestive;
    }

}
