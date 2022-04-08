package ua.lviv.iot.ClothingStore;

import ua.lviv.iot.ClothingStore.model.*;

public class Main {
    public static void main(String[] args) {
        Shorts shorts1 = new Shorts(500, "S", false);
        Shorts shorts2 = new Shorts(550, "M", true);

        Trousers trousers1 = new Trousers(800, "M",  true, "cotton", "straight");
        Trousers trousers2 = new Trousers(680, "S", false, "jeans", "Mom");

        Blouse blouse1 = new Blouse(600, "white", "S", true, true);
        Blouse blouse2 = new Blouse(769, "grey", "M", false, false);

        Dress dress1 = new Dress(800, "S", false, "oversize", true);
        Dress dress2 = new Dress(1199, "S", true, "evening gown", true);

        System.out.println(shorts1);
        System.out.println(shorts2);
        System.out.println();
        System.out.println(trousers1);
        System.out.println(trousers2);
        System.out.println();
        System.out.println(blouse1);
        System.out.println(blouse2);
        System.out.println();
        System.out.println(dress1);
        System.out.println(dress2);
    }
}
