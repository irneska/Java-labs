package ua.lviv.iot.ClothingStore.model;

public abstract class Clothes {
    int price;
    String size;
    boolean isFestive;
    String brand;
    public Clothes(int price, String size, boolean isFestive, String brand){
        this.price = price;
        this.size = size;
        this.isFestive = isFestive;
        this.brand = brand;
    }
    public int getPrice() {
        return this.price;
    }

    public String getSize() {
        return size;
    }

    public boolean getIsFestive() {
        return isFestive;
    }

    public String getBrand() {
        return brand;
    }
}
