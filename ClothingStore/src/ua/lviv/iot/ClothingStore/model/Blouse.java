package ua.lviv.iot.ClothingStore.model;

public class Blouse extends Clothes{
    String colour;
    boolean hasPattern;
    public Blouse(int price, String colour, String size, boolean hasPattern, boolean isFestive, String brand) {
        super(price, size, isFestive, brand);
        this.colour = colour;
        this.hasPattern = hasPattern;
    }


    @Override
    public String toString(){
        return "Blouse(Colour is " + colour
                + ", hasPattern = " + hasPattern
                + ", price = " + price
                + ", size is " + size
                + ", isFestive = " + isFestive
                + ", brand = " + brand
                + ")";
    }

}
