package ua.lviv.iot.ClothingStore;

import ua.lviv.iot.ClothingStore.model.*;

public class Main {
    public static void main(String[] args) {
        Clothes firstOne = new Shorts(500, "S", false);
        Clothes secondOne = new Trousers(800, "M",  true, "cotton", "straight");
        Clothes thirdOne = new Blouse(600, "white", "S", true, true);
        Clothes fourthOne = new Dress(800, "S", false, "oversize", true);

        System.out.println(firstOne);
        System.out.println(secondOne);
        System.out.println(thirdOne);
        System.out.println(fourthOne);
    }
}
