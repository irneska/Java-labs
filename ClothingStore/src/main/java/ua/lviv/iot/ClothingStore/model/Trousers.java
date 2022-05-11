package ua.lviv.iot.ClothingStore.model;

public class Trousers extends Clothes {
    String material;
    String model;

    public Trousers(int price, String size, boolean isFestive, String material, String model, String brand) {
        super(price, size, isFestive, brand);
        this.material = material;
        this.model = model;
    }

    public String getMaterial() {
        return material;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Trousers(Material is " + material
                + ", model is " + model
                + ", price = " + price
                + ", size is " + size
                + ", isFestive = " + isFestive
                + ", brand = " + brand
                + ")";
    }

    @Override
    public String getHeaders() {
        return String.format("%s, %s", super.getHeaders(), "material, model");
    }

    @Override
    public String toCSV() {
        return String.format("%s, %s, %s", super.toCSV(), getMaterial(), getModel());
    }

}
