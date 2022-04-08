package ua.lviv.iot.ClothingStore.model;

public class Clothes {
    int price;
    String size;
    boolean isFestive;
    public Clothes(int price, String size, boolean isFestive){
        this.price = price;
        this.size = size;
        this.isFestive = isFestive;
    }

    @Override
    public String toString() {
        return "Clothes(Total price = " + this.price
                + ", size is " + this.size
                + ")";
    }

}
