package ua.lviv.iot.ClothingStore.model;

public class Trousers extends Clothes{
    String material;
    String model;
    public Trousers(int price, String size, boolean isFestive, String material, String model) {
        super(price, size, isFestive);
        this.material = material;
        this.model = model;
    }

    @Override
    public String toString(){
        return "Trousers(Material is " + material
                + ", model is " + model
                + ", price = " + price
                + ", size is " + size
                + ", isFestive = " + isFestive
                + ")";
    }
}
