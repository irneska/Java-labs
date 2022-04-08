package ua.lviv.iot.ClothingStore.model;

public class Dress extends Clothes{
    boolean withLongSleeve;
    String style;
    public Dress(int price, String size, boolean withLongSleeve, String style, boolean isFestive) {
        super(price, size, isFestive);
        this.withLongSleeve = withLongSleeve;
        this.style = style;
    }

    @Override
    public String toString(){
        return "Dress(withLongSleeve = " + withLongSleeve
                + ", style is " + style
                + ", price = " + price
                + ", size is " + size
                + ", isFestive = " + isFestive
                + ")";
    }

}
